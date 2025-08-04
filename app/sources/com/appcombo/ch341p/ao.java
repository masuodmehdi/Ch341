package com.appcombo.ch341p;

import java.io.IOException;
import java.net.ServerSocket;

final class ao implements Runnable {
    final /* synthetic */ ak a;

    ao(ak akVar) {
        this.a = akVar;
    }

    public final void run() {
        try {
            this.a.a = new ServerSocket(8080);
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    new Thread(new al(this.a, this.a.a.accept())).start();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }
}
