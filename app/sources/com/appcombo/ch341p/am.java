package com.appcombo.ch341p;

final class am extends Thread {
    public boolean a;
    final /* synthetic */ ak b;

    private am(ak akVar) {
        this.b = akVar;
    }

    /* synthetic */ am(ak akVar, byte b2) {
        this(akVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0025, code lost:
        if (r5.b.s.bulkTransfer(r5.b.v, r0, r5.b.x, 100) < 0) goto L_0x0004;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002c, code lost:
        if (r0[0] != 16) goto L_0x0004;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002e, code lost:
        r5.b.r.d();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r5 = this;
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r0 = new byte[r0]
        L_0x0004:
            monitor-enter(r5)
            boolean r1 = r5.a     // Catch:{ all -> 0x0036 }
            if (r1 == 0) goto L_0x0012
            com.appcombo.ch341p.ak r0 = r5.b     // Catch:{ all -> 0x0036 }
            java.lang.String r1 = "stop!"
            r0.a((java.lang.String) r1)     // Catch:{ all -> 0x0036 }
            monitor-exit(r5)     // Catch:{ all -> 0x0036 }
            return
        L_0x0012:
            monitor-exit(r5)
            com.appcombo.ch341p.ak r1 = r5.b
            android.hardware.usb.UsbDeviceConnection r1 = r1.s
            com.appcombo.ch341p.ak r2 = r5.b
            android.hardware.usb.UsbEndpoint r2 = r2.v
            com.appcombo.ch341p.ak r3 = r5.b
            int r3 = r3.x
            r4 = 100
            int r1 = r1.bulkTransfer(r2, r0, r3, r4)
            if (r1 < 0) goto L_0x0004
            r1 = 0
            byte r1 = r0[r1]
            r2 = 16
            if (r1 != r2) goto L_0x0004
            com.appcombo.ch341p.ak r1 = r5.b
            com.appcombo.ch341p.ch341ActivityPlus r1 = r1.r
            r1.d()
            goto L_0x0004
        L_0x0036:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appcombo.ch341p.am.run():void");
    }
}
