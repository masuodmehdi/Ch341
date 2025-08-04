package com.appcombo.ch341p;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Date;

final class al implements Runnable {
    final /* synthetic */ ak a;
    private Socket b;
    private BufferedReader c;

    public al(ak akVar, Socket socket) {
        this.a = akVar;
        this.b = socket;
        try {
            this.c = new BufferedReader(new InputStreamReader(this.b.getInputStream()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String a(InputStream inputStream) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                bufferedReader.close();
                return sb.toString();
            }
            sb.append(readLine).append("\n");
        }
    }

    public final void run() {
        String str;
        while (!Thread.currentThread().isInterrupted()) {
            try {
                String readLine = this.c.readLine();
                if (readLine == null) {
                    Thread.currentThread().interrupt();
                } else {
                    String[] split = readLine.split(" ");
                    if (split[0].compareToIgnoreCase("get") == 0) {
                        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(this.b.getOutputStream()));
                        File file = new File(split[1]);
                        if (file.exists()) {
                            if (file.length() > 0) {
                                try {
                                    str = a(new FileInputStream(file));
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                                bufferedWriter.write("HTTP/1.1 200 OK\nDate:" + new Date() + "\nServer: Appcombo/1.0(Android)\nContent-Type: text/html; charset=UTF-8\nContent-Length:" + str.length() + "\nAccept-Ranges: bytes\nConnection: close\n\n" + str);
                                bufferedWriter.flush();
                            }
                            str = "<html><body><h1>APPCombo DIY Kit</h1>\n<p>Service: Build up web page.</p>\n<p>Contact with evan@appcombo.tw</p>\n</body></html>\n";
                            bufferedWriter.write("HTTP/1.1 200 OK\nDate:" + new Date() + "\nServer: Appcombo/1.0(Android)\nContent-Type: text/html; charset=UTF-8\nContent-Length:" + str.length() + "\nAccept-Ranges: bytes\nConnection: close\n\n" + str);
                            bufferedWriter.flush();
                        }
                    }
                }
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
    }
}
