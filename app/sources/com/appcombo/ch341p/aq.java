package com.appcombo.ch341p;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Environment;
import java.io.File;
import java.util.ArrayList;

public final class aq {
    String[] a;
    File b;
    a c = new a();
    boolean d;
    String e;
    private a f = new a();
    private final Activity g;

    public aq(Activity activity, File file, String str) {
        this.g = activity;
        file = !file.exists() ? Environment.getExternalStorageDirectory() : file;
        this.e = str != null ? str.toLowerCase() : str;
        a(file);
    }

    /* access modifiers changed from: private */
    public void a(File file) {
        this.b = file;
        ArrayList arrayList = new ArrayList();
        if (file.exists()) {
            if (file.getParentFile() != null) {
                arrayList.add("..");
            }
            String[] list = file.list(new ax(this));
            if (list != null) {
                for (String add : list) {
                    arrayList.add(add);
                }
            }
        }
        this.a = (String[]) arrayList.toArray(new String[0]);
    }

    public final void a() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.g);
        builder.setTitle(this.b.getPath());
        if (this.d) {
            builder.setPositiveButton("Select directory", new ar(this));
        }
        builder.setNegativeButton("Cancel", new as(this));
        builder.setItems(this.a, new at(this));
        AlertDialog show = builder.show();
        show.setOnKeyListener(new au(this));
        show.show();
    }

    public final void a(az azVar) {
        this.f.a((Object) azVar);
    }
}
