package com.appcombo.ch341p;

import java.io.File;

final class m implements az {
    final /* synthetic */ ch341ActivityPlus a;

    m(ch341ActivityPlus ch341activityplus) {
        this.a = ch341activityplus;
    }

    public final void a(File file) {
        if (file == null) {
            ch341ActivityPlus ch341activityplus = this.a;
            ch341activityplus.e--;
            this.a.f();
            return;
        }
        this.a.v = file;
        this.a.c("Overwrite " + file.toString()).show();
    }
}
