package com.appcombo.ch341p;

import android.content.DialogInterface;
import java.io.File;

final class at implements DialogInterface.OnClickListener {
    final /* synthetic */ aq a;

    at(aq aqVar) {
        this.a = aqVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        String str = this.a.a[i];
        aq aqVar = this.a;
        File parentFile = str.equals("..") ? aqVar.b.getParentFile() : new File(aqVar.b, str);
        if (parentFile.isDirectory()) {
            this.a.a(parentFile);
            dialogInterface.cancel();
            dialogInterface.dismiss();
            this.a.a();
            return;
        }
        this.a.f.a((b) new av(this.a, parentFile));
    }
}
