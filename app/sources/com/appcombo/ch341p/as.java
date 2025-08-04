package com.appcombo.ch341p;

import android.content.DialogInterface;
import java.io.File;

final class as implements DialogInterface.OnClickListener {
    final /* synthetic */ aq a;

    as(aq aqVar) {
        this.a = aqVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.f.a((b) new av(this.a, (File) null));
    }
}
