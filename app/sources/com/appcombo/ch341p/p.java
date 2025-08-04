package com.appcombo.ch341p;

import android.content.DialogInterface;
import android.widget.EditText;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

final class p implements DialogInterface.OnClickListener {
    final /* synthetic */ o a;
    private final /* synthetic */ EditText b;

    p(o oVar, EditText editText) {
        this.a = oVar;
        this.b = editText;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (this.b.getText().length() > 0) {
            this.a.a.b = this.b.getText().toString().getBytes();
            String editable = this.b.getText().toString();
            if (!editable.toLowerCase().endsWith(".rom")) {
                editable = String.valueOf(editable) + ".rom";
            }
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(new File(this.a.a.v.toString(), editable));
                fileOutputStream.write(this.a.a.r);
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            this.a.a.e = 0;
            this.a.a.f = 0;
            this.a.a.g = 0;
            this.a.a.f();
            return;
        }
        ch341ActivityPlus ch341activityplus = this.a.a;
        ch341activityplus.e--;
        this.a.a.f();
    }
}
