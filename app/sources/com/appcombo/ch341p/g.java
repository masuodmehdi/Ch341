package com.appcombo.ch341p;

import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

final class g implements View.OnTouchListener {
    final /* synthetic */ ch341ActivityPlus a;

    g(ch341ActivityPlus ch341activityplus) {
        this.a = ch341activityplus;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.a.m = motionEvent.getY();
            Log.d("ch341ActivityPlus", "dy=" + this.a.m);
        } else if (action == 2) {
            Log.d("ch341ActivityPlus", "mx=" + motionEvent.getX() + " " + motionEvent.getY());
        } else if (action == 1) {
            this.a.n = motionEvent.getY();
            Log.d("ch341ActivityPlus", "uy=" + this.a.n);
            if (((double) (this.a.n - this.a.m)) < -5.0d) {
                if (this.a.o + 160 < this.a.p[this.a.h]) {
                    this.a.o += 160;
                }
            } else if (((double) (this.a.n - this.a.m)) > 5.0d && this.a.o > 0) {
                if (this.a.o < 160) {
                    this.a.o = 0;
                } else {
                    this.a.o -= 160;
                }
            }
            this.a.e();
        }
        return true;
    }
}
