package com.appcombo.ch341p;

final class ap extends Thread {
    public boolean a;
    final /* synthetic */ ak b;

    private ap(ak akVar) {
        this.b = akVar;
    }

    /* synthetic */ ap(ak akVar, byte b2) {
        this(akVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0039, code lost:
        r6 = r11.b.s.requestWait();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0041, code lost:
        if (r6 == null) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0043, code lost:
        r0 = (com.appcombo.ch341p.aj) r6.getClientData();
        r6.setClientData((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004c, code lost:
        if (r1 != r0) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004e, code lost:
        r1 = r0;
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0050, code lost:
        if (r1 == null) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0052, code lost:
        r11.b.b(r6);
        r0 = new com.appcombo.ch341p.aj();
        r0.a(r11.b.a(r11.b.u), r11.b.w);
        r7 = r11.b;
        r8 = r11.b.w;
        r9 = r1.a;
        r10 = new byte[r8];
        r1 = 0;
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0079, code lost:
        if (r1 < r8) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x007b, code lost:
        r7.a(new java.lang.String(r10));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008b, code lost:
        if (r6.getEndpoint() != r11.b.t) goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x008d, code lost:
        r11.b.a(r6);
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0098, code lost:
        r10[r1] = r9.get(r4);
        r1 = r1 + 1;
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a8, code lost:
        if (r11.b.z != null) goto L_0x00b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00aa, code lost:
        r11.b.b(r6);
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b2, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b5, code lost:
        r0 = r1;
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r11 = this;
            r3 = 0
            r2 = 0
            com.appcombo.ch341p.ak r0 = r11.b
            com.appcombo.ch341p.an r0 = r0.z
            if (r0 == 0) goto L_0x0017
            r1 = r2
        L_0x0009:
            monitor-enter(r11)
            boolean r0 = r11.a     // Catch:{ all -> 0x0095 }
            if (r0 == 0) goto L_0x0038
            com.appcombo.ch341p.ak r0 = r11.b     // Catch:{ all -> 0x0095 }
            java.lang.String r1 = "stop!"
            r0.a((java.lang.String) r1)     // Catch:{ all -> 0x0095 }
            monitor-exit(r11)     // Catch:{ all -> 0x0095 }
        L_0x0016:
            return
        L_0x0017:
            com.appcombo.ch341p.aj r0 = new com.appcombo.ch341p.aj
            r0.<init>()
            com.appcombo.ch341p.ak r1 = r11.b
            com.appcombo.ch341p.ak r4 = r11.b
            android.hardware.usb.UsbEndpoint r4 = r4.u
            android.hardware.usb.UsbRequest r1 = r1.a((android.hardware.usb.UsbEndpoint) r4)
            com.appcombo.ch341p.ak r4 = r11.b
            int r4 = r4.w
            boolean r1 = r0.a((android.hardware.usb.UsbRequest) r1, (int) r4)
            if (r1 != 0) goto L_0x00b8
            com.appcombo.ch341p.ak r0 = r11.b
            java.lang.String r1 = "readcommand queue fail!"
            r0.a((java.lang.String) r1)
            goto L_0x0016
        L_0x0038:
            monitor-exit(r11)
            com.appcombo.ch341p.ak r0 = r11.b
            android.hardware.usb.UsbDeviceConnection r0 = r0.s
            android.hardware.usb.UsbRequest r6 = r0.requestWait()
            if (r6 == 0) goto L_0x0016
            java.lang.Object r0 = r6.getClientData()
            com.appcombo.ch341p.aj r0 = (com.appcombo.ch341p.aj) r0
            r6.setClientData(r2)
            if (r1 != r0) goto L_0x00b5
            r1 = r0
            r0 = r2
        L_0x0050:
            if (r1 == 0) goto L_0x0083
            com.appcombo.ch341p.ak r0 = r11.b
            r0.b((android.hardware.usb.UsbRequest) r6)
            com.appcombo.ch341p.aj r0 = new com.appcombo.ch341p.aj
            r0.<init>()
            com.appcombo.ch341p.ak r4 = r11.b
            com.appcombo.ch341p.ak r5 = r11.b
            android.hardware.usb.UsbEndpoint r5 = r5.u
            android.hardware.usb.UsbRequest r4 = r4.a((android.hardware.usb.UsbEndpoint) r5)
            com.appcombo.ch341p.ak r5 = r11.b
            int r5 = r5.w
            r0.a((android.hardware.usb.UsbRequest) r4, (int) r5)
            com.appcombo.ch341p.ak r7 = r11.b
            com.appcombo.ch341p.ak r4 = r11.b
            int r8 = r4.w
            java.nio.ByteBuffer r9 = r1.a
            byte[] r10 = new byte[r8]
            r1 = r3
            r4 = r3
        L_0x0079:
            if (r1 < r8) goto L_0x0098
            java.lang.String r1 = new java.lang.String
            r1.<init>(r10)
            r7.a((java.lang.String) r1)
        L_0x0083:
            android.hardware.usb.UsbEndpoint r1 = r6.getEndpoint()
            com.appcombo.ch341p.ak r4 = r11.b
            android.hardware.usb.UsbEndpoint r4 = r4.t
            if (r1 != r4) goto L_0x00a4
            com.appcombo.ch341p.ak r1 = r11.b
            r1.a((android.hardware.usb.UsbRequest) r6)
            r1 = r0
            goto L_0x0009
        L_0x0095:
            r0 = move-exception
            monitor-exit(r11)
            throw r0
        L_0x0098:
            int r5 = r4 + 1
            byte r4 = r9.get(r4)
            r10[r1] = r4
            int r1 = r1 + 1
            r4 = r5
            goto L_0x0079
        L_0x00a4:
            com.appcombo.ch341p.ak r1 = r11.b
            com.appcombo.ch341p.an r1 = r1.z
            if (r1 != 0) goto L_0x00b2
            com.appcombo.ch341p.ak r1 = r11.b
            r1.b((android.hardware.usb.UsbRequest) r6)
            r1 = r0
            goto L_0x0009
        L_0x00b2:
            r1 = r0
            goto L_0x0009
        L_0x00b5:
            r0 = r1
            r1 = r2
            goto L_0x0050
        L_0x00b8:
            r1 = r0
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appcombo.ch341p.ap.run():void");
    }
}
