package com.appcombo.ch341p;

import android.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Spinner;

final class ac implements View.OnClickListener {
    /* access modifiers changed from: package-private */
    public final /* synthetic */ ch341ActivityPlus a;

    ac(ch341ActivityPlus ch341activityplus) {
        this.a = ch341activityplus;
    }

    public final void onClick(View view) {
        this.a.a();
        View inflate = LayoutInflater.from(this.a).inflate(C0000R.layout.setup, (ViewGroup) null);
        AlertDialog.Builder builder = new AlertDialog.Builder(this.a);
        builder.setTitle("Serial Port Configuration");
        builder.setView(inflate);
        builder.setPositiveButton(this.a.getString(C0000R.string.OK), new ad(this));
        builder.setNegativeButton(this.a.getString(C0000R.string.Cancel), new ae(this));
        this.a.N = (Spinner) inflate.findViewById(C0000R.id.spinner1);
        this.a.O = (Spinner) inflate.findViewById(C0000R.id.spinner2);
        this.a.P = (Spinner) inflate.findViewById(C0000R.id.spinner3);
        this.a.Q = (Spinner) inflate.findViewById(C0000R.id.spinner4);
        this.a.R = (Spinner) inflate.findViewById(C0000R.id.spinner5);
        this.a.S = (Spinner) inflate.findViewById(C0000R.id.spinner6);
        this.a.N.setSelection(this.a.V[0]);
        this.a.O.setSelection(this.a.V[1]);
        this.a.P.setSelection(this.a.V[2]);
        this.a.Q.setSelection(this.a.V[3]);
        this.a.R.setSelection(this.a.V[4]);
        this.a.S.setSelection(this.a.V[5]);
        builder.show();
    }
}
