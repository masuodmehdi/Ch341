package com.appcombo.ch341p;

final class an extends Thread {
    public boolean a;
    final /* synthetic */ ak b;

    private an(ak akVar) {
        this.b = akVar;
    }

    /* synthetic */ an(ak akVar, byte b2) {
        this(akVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002c, code lost:
        if (r7 < 0) goto L_0x000b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0034, code lost:
        if (r12.b.r.c != false) goto L_0x000b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003a, code lost:
        if (r12.b.i != 0) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003c, code lost:
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003d, code lost:
        if (r2 >= r7) goto L_0x000b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003f, code lost:
        r12.b.b(java.lang.String.format("%02X ", new java.lang.Object[]{java.lang.Byte.valueOf(r5[r2])}));
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005e, code lost:
        if (r12.b.i != 1) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0060, code lost:
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0061, code lost:
        if (r2 < r7) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0063, code lost:
        r12.b.b(new java.lang.String(r5, 0, r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0072, code lost:
        if (r5[r2] != 13) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0074, code lost:
        r5[r2] = 10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0078, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0080, code lost:
        if (r12.b.i != 2) goto L_0x000b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0082, code lost:
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0083, code lost:
        if (r4 >= r7) goto L_0x000b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0085, code lost:
        r2 = r0 + 1;
        r6[r0] = r5[r4];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x008d, code lost:
        if (r2 < 256) goto L_0x00f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008f, code lost:
        r12.b.b("*\n");
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0099, code lost:
        r3 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x009d, code lost:
        if ((r2 - r3) < 4) goto L_0x00ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a7, code lost:
        if (r12.b.a(r6, r3, r2 - r3) != 0) goto L_0x00ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a9, code lost:
        r0 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ab, code lost:
        if (r3 < r2) goto L_0x00ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ad, code lost:
        r12.b.b(java.lang.String.valueOf(r0) + "\n");
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00c6, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00ca, code lost:
        r0 = java.lang.String.valueOf(r0) + java.lang.String.format("%02X ", new java.lang.Object[]{java.lang.Byte.valueOf(r6[r3])});
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ee, code lost:
        r0 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00f2, code lost:
        if ((r3 + 4) < r2) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00f4, code lost:
        r0 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00f6, code lost:
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        r7 = r12.b.s.bulkTransfer(r12.b.u, r5, r12.b.w, 100);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r12 = this;
            r11 = 1
            r1 = 0
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r5 = new byte[r0]
            r0 = 512(0x200, float:7.175E-43)
            byte[] r6 = new byte[r0]
            r0 = r1
        L_0x000b:
            monitor-enter(r12)
            boolean r2 = r12.a     // Catch:{ all -> 0x0057 }
            if (r2 == 0) goto L_0x0019
            com.appcombo.ch341p.ak r0 = r12.b     // Catch:{ all -> 0x0057 }
            java.lang.String r1 = "stop!"
            r0.a((java.lang.String) r1)     // Catch:{ all -> 0x0057 }
            monitor-exit(r12)     // Catch:{ all -> 0x0057 }
            return
        L_0x0019:
            monitor-exit(r12)
            com.appcombo.ch341p.ak r2 = r12.b
            android.hardware.usb.UsbDeviceConnection r2 = r2.s
            com.appcombo.ch341p.ak r3 = r12.b
            android.hardware.usb.UsbEndpoint r3 = r3.u
            com.appcombo.ch341p.ak r4 = r12.b
            int r4 = r4.w
            r7 = 100
            int r7 = r2.bulkTransfer(r3, r5, r4, r7)
            if (r7 < 0) goto L_0x000b
            com.appcombo.ch341p.ak r2 = r12.b
            com.appcombo.ch341p.ch341ActivityPlus r2 = r2.r
            boolean r2 = r2.c
            if (r2 != 0) goto L_0x000b
            com.appcombo.ch341p.ak r2 = r12.b
            byte r2 = r2.i
            if (r2 != 0) goto L_0x005a
            r2 = r1
        L_0x003d:
            if (r2 >= r7) goto L_0x000b
            com.appcombo.ch341p.ak r3 = r12.b
            java.lang.String r4 = "%02X "
            java.lang.Object[] r8 = new java.lang.Object[r11]
            byte r9 = r5[r2]
            java.lang.Byte r9 = java.lang.Byte.valueOf(r9)
            r8[r1] = r9
            java.lang.String r4 = java.lang.String.format(r4, r8)
            r3.b((java.lang.String) r4)
            int r2 = r2 + 1
            goto L_0x003d
        L_0x0057:
            r0 = move-exception
            monitor-exit(r12)
            throw r0
        L_0x005a:
            com.appcombo.ch341p.ak r2 = r12.b
            byte r2 = r2.i
            if (r2 != r11) goto L_0x007b
            r2 = r1
        L_0x0061:
            if (r2 < r7) goto L_0x006e
            com.appcombo.ch341p.ak r2 = r12.b
            java.lang.String r3 = new java.lang.String
            r3.<init>(r5, r1, r7)
            r2.b((java.lang.String) r3)
            goto L_0x000b
        L_0x006e:
            byte r3 = r5[r2]
            r4 = 13
            if (r3 != r4) goto L_0x0078
            r3 = 10
            r5[r2] = r3
        L_0x0078:
            int r2 = r2 + 1
            goto L_0x0061
        L_0x007b:
            com.appcombo.ch341p.ak r2 = r12.b
            byte r2 = r2.i
            r3 = 2
            if (r2 != r3) goto L_0x000b
            r4 = r1
        L_0x0083:
            if (r4 >= r7) goto L_0x000b
            int r2 = r0 + 1
            byte r3 = r5[r4]
            r6[r0] = r3
            r0 = 256(0x100, float:3.59E-43)
            if (r2 < r0) goto L_0x00f6
            com.appcombo.ch341p.ak r0 = r12.b
            java.lang.String r2 = "*\n"
            r0.b((java.lang.String) r2)
            r0 = r1
            goto L_0x000b
        L_0x0099:
            r3 = r0
        L_0x009a:
            int r0 = r2 - r3
            r8 = 4
            if (r0 < r8) goto L_0x00ee
            com.appcombo.ch341p.ak r0 = r12.b
            int r8 = r2 - r3
            int r0 = r0.a((byte[]) r6, (int) r3, (int) r8)
            if (r0 != 0) goto L_0x00ee
            java.lang.String r0 = ""
        L_0x00ab:
            if (r3 < r2) goto L_0x00ca
            com.appcombo.ch341p.ak r2 = r12.b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r3.<init>(r0)
            java.lang.String r0 = "\n"
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.String r0 = r0.toString()
            r2.b((java.lang.String) r0)
            r0 = r1
        L_0x00c6:
            int r2 = r4 + 1
            r4 = r2
            goto L_0x0083
        L_0x00ca:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r8.<init>(r0)
            java.lang.String r0 = "%02X "
            java.lang.Object[] r9 = new java.lang.Object[r11]
            byte r10 = r6[r3]
            java.lang.Byte r10 = java.lang.Byte.valueOf(r10)
            r9[r1] = r10
            java.lang.String r0 = java.lang.String.format(r0, r9)
            java.lang.StringBuilder r0 = r8.append(r0)
            java.lang.String r0 = r0.toString()
            int r3 = r3 + 1
            goto L_0x00ab
        L_0x00ee:
            int r0 = r3 + 1
            int r3 = r3 + 4
            if (r3 < r2) goto L_0x0099
            r0 = r2
            goto L_0x00c6
        L_0x00f6:
            r3 = r1
            goto L_0x009a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appcombo.ch341p.an.run():void");
    }
}
