package com.appcombo.ch341p;

import android.content.DialogInterface;

final class k implements DialogInterface.OnClickListener {
    final /* synthetic */ ch341ActivityPlus a;

    k(ch341ActivityPlus ch341activityplus) {
        this.a = ch341activityplus;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        ch341ActivityPlus ch341activityplus = this.a;
        ch341activityplus.e--;
        this.a.f();
    }
}
