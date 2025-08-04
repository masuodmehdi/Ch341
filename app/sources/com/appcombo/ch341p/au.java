package com.appcombo.ch341p;

import android.content.DialogInterface;
import android.view.KeyEvent;
import java.io.File;

final class au implements DialogInterface.OnKeyListener {
    final /* synthetic */ aq a;

    au(aq aqVar) {
        this.a = aqVar;
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i != 4) {
            return false;
        }
        this.a.f.a((b) new av(this.a, (File) null));
        dialogInterface.cancel();
        return true;
    }
}
