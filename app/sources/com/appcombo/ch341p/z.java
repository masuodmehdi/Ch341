package com.appcombo.ch341p;

import android.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

final class z implements View.OnClickListener {
    /* access modifiers changed from: package-private */
    public final /* synthetic */ ch341ActivityPlus a;

    z(ch341ActivityPlus ch341activityplus) {
        this.a = ch341activityplus;
    }

    public final void onClick(View view) {
        View inflate = LayoutInflater.from(this.a).inflate(C0000R.layout.dialog, (ViewGroup) null);
        AlertDialog.Builder builder = new AlertDialog.Builder(this.a);
        builder.setTitle("WriteCharacter");
        builder.setView(inflate);
        builder.setPositiveButton(this.a.getString(C0000R.string.OK), new aa(this, (EditText) inflate.findViewById(C0000R.id.editTextName), (EditText) inflate.findViewById(C0000R.id.editTextNum)));
        builder.setNegativeButton(this.a.getString(C0000R.string.Cancel), new ab(this));
        builder.show();
    }
}
