package com.appcombo.ch341p;

import android.content.DialogInterface;
import android.widget.EditText;

final class aa implements DialogInterface.OnClickListener {
    final /* synthetic */ z a;
    private final /* synthetic */ EditText b;
    private final /* synthetic */ EditText c;

    aa(z zVar, EditText editText, EditText editText2) {
        this.a = zVar;
        this.b = editText;
        this.c = editText2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        new byte[20][0] = 0;
        if (this.b.getText().length() > 0) {
            this.a.a.b = this.b.getText().toString().getBytes();
        } else if (this.c.getText().length() > 0) {
            this.a.a.b = ch341ActivityPlus.a(this.c.getText().toString().getBytes());
        }
        if (this.a.a.E != null) {
            ak g = this.a.a.E;
            byte[] bArr = this.a.a.b;
            aj ajVar = new aj();
            if (bArr != null) {
                ajVar.a.put(bArr, 0, bArr.length);
            }
            ajVar.a(g, bArr.length);
        }
    }
}
