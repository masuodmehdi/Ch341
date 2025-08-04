package com.appcombo.ch341p;

import android.content.DialogInterface;
import android.view.KeyEvent;

final class y implements DialogInterface.OnKeyListener {
    final /* synthetic */ ch341ActivityPlus a;

    y(ch341ActivityPlus ch341activityplus) {
        this.a = ch341activityplus;
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i != 4) {
            return false;
        }
        this.a.e = 0;
        this.a.f = 0;
        this.a.g = 0;
        this.a.f();
        dialogInterface.cancel();
        return true;
    }
}
