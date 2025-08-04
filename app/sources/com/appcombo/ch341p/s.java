package com.appcombo.ch341p;

import android.content.DialogInterface;
import android.view.KeyEvent;

final class s implements DialogInterface.OnKeyListener {
    final /* synthetic */ ch341ActivityPlus a;

    s(ch341ActivityPlus ch341activityplus) {
        this.a = ch341activityplus;
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i != 4) {
            return false;
        }
        dialogInterface.cancel();
        return true;
    }
}
