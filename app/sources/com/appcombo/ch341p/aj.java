package com.appcombo.ch341p;

import android.hardware.usb.UsbRequest;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class aj {
    final ByteBuffer a = ByteBuffer.allocate(4096);

    public aj() {
        this.a.order(ByteOrder.LITTLE_ENDIAN);
    }

    public final boolean a(UsbRequest usbRequest, int i) {
        usbRequest.setClientData(this);
        return usbRequest.queue(this.a, i);
    }

    public final boolean a(ak akVar, int i) {
        synchronized (akVar) {
            UsbRequest b = akVar.b();
            b.setClientData(this);
            if (i <= 0) {
                akVar.a(b);
                return false;
            } else if (b.queue(this.a, i)) {
                return true;
            } else {
                akVar.a(b);
                return false;
            }
        }
    }
}
