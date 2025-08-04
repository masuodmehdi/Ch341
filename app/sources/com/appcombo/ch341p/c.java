package com.appcombo.ch341p;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbInterface;

final class c extends BroadcastReceiver {
    final /* synthetic */ ch341ActivityPlus a;

    c(ch341ActivityPlus ch341activityplus) {
        this.a = ch341activityplus;
    }

    public final void onReceive(Context context, Intent intent) {
        UsbInterface a2;
        String action = intent.getAction();
        if ("com.appcombo.ch341p.USB_PERMISSION".equals(action)) {
            synchronized (this) {
                this.a.T = true;
                UsbDevice usbDevice = (UsbDevice) intent.getParcelableExtra("device");
                if (!(!intent.getBooleanExtra("permission", false) || usbDevice == null || (a2 = this.a.a(usbDevice)) == null)) {
                    boolean unused = this.a.a(usbDevice, a2);
                }
            }
        } else if ("android.hardware.usb.action.USB_DEVICE_ATTACHED".equals(action)) {
            UsbDevice usbDevice2 = (UsbDevice) intent.getParcelableExtra("device");
            UsbInterface a3 = this.a.a(usbDevice2);
            if (a3 != null) {
                boolean unused2 = this.a.a(usbDevice2, a3);
            }
        } else if ("android.hardware.usb.action.USB_DEVICE_DETACHED".equals(action)) {
            String deviceName = ((UsbDevice) intent.getParcelableExtra("device")).getDeviceName();
            if (this.a.B != null && this.a.B.equals(deviceName)) {
                boolean unused3 = this.a.a((UsbDevice) null, (UsbInterface) null);
                this.a.finish();
            }
        }
    }
}
