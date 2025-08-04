package com.appcombo.ch341p;

import android.content.DialogInterface;
import android.widget.EditText;

final class e implements DialogInterface.OnClickListener {
    final /* synthetic */ ch341ActivityPlus a;
    private final /* synthetic */ EditText b;

    e(ch341ActivityPlus ch341activityplus, EditText editText) {
        this.a = ch341activityplus;
        this.b = editText;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        new byte[20][0] = 0;
        if (this.b.getText().length() > 0) {
            this.a.o = (long) Integer.parseInt(this.b.getText().toString(), 16);
            this.a.e();
        }
    }
}
