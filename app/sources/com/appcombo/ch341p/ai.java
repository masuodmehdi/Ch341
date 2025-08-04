package com.appcombo.ch341p;

final class ai implements Runnable {
    final /* synthetic */ ch341ActivityPlus a;

    ai(ch341ActivityPlus ch341activityplus) {
        this.a = ch341activityplus;
    }

    public final void run() {
        this.a.y.fullScroll(130);
    }
}
