package com.appcombo.ch341p;

import java.io.File;
import java.io.FilenameFilter;

final class ax implements FilenameFilter {
    final /* synthetic */ aq a;

    ax(aq aqVar) {
        this.a = aqVar;
    }

    public final boolean accept(File file, String str) {
        File file2 = new File(file, str);
        if (!file2.canRead()) {
            return false;
        }
        if (this.a.d) {
            return file2.isDirectory();
        }
        return (this.a.e != null ? str.toLowerCase().endsWith(this.a.e) : true) || file2.isDirectory();
    }
}
