package com.appcombo.ch341p;

import android.content.DialogInterface;

final class q implements DialogInterface.OnClickListener {
    final /* synthetic */ o a;

    q(o oVar) {
        this.a = oVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        ch341ActivityPlus ch341activityplus = this.a.a;
        ch341activityplus.e--;
        this.a.a.f();
    }
}
