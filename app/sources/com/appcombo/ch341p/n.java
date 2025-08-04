package com.appcombo.ch341p;

import android.os.Handler;
import android.os.Message;

final class n extends Handler {
    final /* synthetic */ ch341ActivityPlus a;

    n(ch341ActivityPlus ch341activityplus) {
        this.a = ch341activityplus;
    }

    public final void handleMessage(Message message) {
        switch (message.what) {
            case 1:
                if (this.a.w != null) {
                    ch341ActivityPlus.a(this.a, (String) message.obj);
                    return;
                }
                return;
            case 2:
                this.a.L.setText(new StringBuilder().append(this.a.M).toString());
                return;
            case 3:
                if (this.a.x != null) {
                    ch341ActivityPlus.b(this.a, (String) message.obj);
                    return;
                }
                return;
            default:
                return;
        }
    }
}
