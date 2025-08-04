package com.appcombo.ch341p;

import android.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import java.io.File;

final class o implements ay {
    final /* synthetic */ ch341ActivityPlus a;

    o(ch341ActivityPlus ch341activityplus) {
        this.a = ch341activityplus;
    }

    public final void a(File file) {
        if (file == null) {
            ch341ActivityPlus ch341activityplus = this.a;
            ch341activityplus.e--;
            this.a.f();
            return;
        }
        this.a.v = file;
        View inflate = LayoutInflater.from(this.a).inflate(C0000R.layout.destfile, (ViewGroup) null);
        AlertDialog.Builder builder = new AlertDialog.Builder(this.a);
        builder.setTitle("new destination file");
        builder.setView(inflate);
        builder.setPositiveButton(this.a.getString(C0000R.string.OK), new p(this, (EditText) inflate.findViewById(C0000R.id.destfileeditTextName)));
        builder.setNegativeButton(this.a.getString(C0000R.string.Cancel), new q(this));
        builder.show();
    }
}
