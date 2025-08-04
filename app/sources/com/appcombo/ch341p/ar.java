package com.appcombo.ch341p;

import android.content.DialogInterface;

final class ar implements DialogInterface.OnClickListener {
    final /* synthetic */ aq a;

    ar(aq aqVar) {
        this.a = aqVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        aq aqVar = this.a;
        aqVar.c.a((b) new aw(aqVar, this.a.b));
    }
}
