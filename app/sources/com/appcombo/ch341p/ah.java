package com.appcombo.ch341p;

import android.view.View;

final class ah implements View.OnClickListener {
    final /* synthetic */ ch341ActivityPlus a;

    ah(ch341ActivityPlus ch341activityplus) {
        this.a = ch341activityplus;
    }

    public final void onClick(View view) {
        this.a.M = 0;
        this.a.L.setText("0");
    }
}
