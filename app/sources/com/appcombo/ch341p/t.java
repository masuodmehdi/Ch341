package com.appcombo.ch341p;

import android.content.DialogInterface;

final class t implements DialogInterface.OnClickListener {
    final /* synthetic */ ch341ActivityPlus a;

    t(ch341ActivityPlus ch341activityplus) {
        this.a = ch341activityplus;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.e = 0;
        this.a.f = 0;
        this.a.g = 0;
        this.a.f();
    }
}
