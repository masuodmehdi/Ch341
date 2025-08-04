package com.appcombo.ch341p;

import android.view.View;

final class ag implements View.OnClickListener {
    final /* synthetic */ ch341ActivityPlus a;

    ag(ch341ActivityPlus ch341activityplus) {
        this.a = ch341activityplus;
    }

    public final void onClick(View view) {
        this.a.c = !this.a.c;
        if (this.a.c) {
            this.a.K.setText(this.a.getString(C0000R.string.Wakeup));
        } else {
            this.a.K.setText(this.a.getString(C0000R.string.Pause));
        }
    }
}
