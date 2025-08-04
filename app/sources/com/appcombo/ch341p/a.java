package com.appcombo.ch341p;

import java.util.ArrayList;
import java.util.List;

final class a {
    private List a = new ArrayList();

    a() {
    }

    public final void a(b bVar) {
        for (Object a2 : new ArrayList(this.a)) {
            bVar.a(a2);
        }
    }

    public final void a(Object obj) {
        this.a.add(obj);
    }
}
