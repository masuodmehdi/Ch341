package com.appcombo.ch341p;

import java.io.File;
import java.io.FileInputStream;

final class i implements az {
    final /* synthetic */ ch341ActivityPlus a;

    i(ch341ActivityPlus ch341activityplus) {
        this.a = ch341activityplus;
    }

    public final void a(File file) {
        int i = 0;
        if (file == null) {
            ch341ActivityPlus ch341activityplus = this.a;
            ch341activityplus.e--;
            this.a.f();
        } else if (this.a.d == 1) {
            file.delete();
            this.a.e = 0;
            this.a.f = 0;
            this.a.g = 0;
            this.a.f();
        } else if (this.a.d == 0) {
            this.a.f = 3;
            this.a.h = 255;
            this.a.p[this.a.h] = file.length();
            this.a.r = new byte[((int) file.length())];
            if (this.a.p[this.a.h] > 0) {
                try {
                    FileInputStream fileInputStream = new FileInputStream(file);
                    do {
                        i += fileInputStream.read(this.a.r, i, ((int) file.length()) - i);
                    } while (((long) i) < file.length());
                    fileInputStream.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                this.a.e++;
                this.a.f();
            }
        }
    }
}
