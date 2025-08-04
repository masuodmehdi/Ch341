package com.appcombo.ch341p;

import android.content.DialogInterface;
import android.view.KeyEvent;

final class l implements DialogInterface.OnKeyListener {
    final /* synthetic */ ch341ActivityPlus a;

    l(ch341ActivityPlus ch341activityplus) {
        this.a = ch341activityplus;
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i != 4) {
            return false;
        }
        ch341ActivityPlus ch341activityplus = this.a;
        ch341activityplus.e--;
        this.a.f();
        dialogInterface.cancel();
        return true;
    }
}
