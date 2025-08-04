package com.appcombo.ch341p;

import android.content.DialogInterface;
import java.io.FileOutputStream;
import java.io.IOException;

final class j implements DialogInterface.OnClickListener {
    final /* synthetic */ ch341ActivityPlus a;

    j(ch341ActivityPlus ch341activityplus) {
        this.a = ch341activityplus;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(this.a.v);
            fileOutputStream.write(this.a.r);
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.a.e = 0;
        this.a.f = 0;
        this.a.g = 0;
        this.a.f();
    }
}
