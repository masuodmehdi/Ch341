package com.appcombo.ch341p;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbDeviceConnection;
import android.hardware.usb.UsbInterface;
import android.hardware.usb.UsbManager;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Message;
import android.text.Layout;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class ch341ActivityPlus extends Activity implements View.OnClickListener {
    private UsbManager A;
    /* access modifiers changed from: private */
    public UsbDevice B;
    private UsbDeviceConnection C;
    private UsbInterface D;
    /* access modifiers changed from: private */
    public ak E;
    private int F = 0;
    /* access modifiers changed from: private */
    public String G;
    private Button H;
    private Button I;
    private Button J;
    /* access modifiers changed from: private */
    public Button K;
    /* access modifiers changed from: private */
    public TextView L;
    /* access modifiers changed from: private */
    public int M = 0;
    /* access modifiers changed from: private */
    public Spinner N;
    /* access modifiers changed from: private */
    public Spinner O;
    /* access modifiers changed from: private */
    public Spinner P;
    /* access modifiers changed from: private */
    public Spinner Q;
    /* access modifiers changed from: private */
    public Spinner R;
    /* access modifiers changed from: private */
    public Spinner S;
    /* access modifiers changed from: private */
    public boolean T = false;
    private boolean U = true;
    /* access modifiers changed from: private */
    public byte[] V = new byte[256];
    private TextView W;
    public int a = -1;
    byte[] b = new byte[20];
    public boolean c = false;
    int d = -1;
    int e = 0;
    int f = 0;
    int g = 0;
    int h = 0;
    int i = 0;
    boolean j = false;
    boolean k = false;
    TableRow.LayoutParams l = null;
    float m;
    float n;
    long o = 0;
    long[] p;
    int[] q;
    byte[] r;
    BroadcastReceiver s;
    Handler t;
    /* access modifiers changed from: private */
    public long u = 0;
    /* access modifiers changed from: private */
    public File v;
    /* access modifiers changed from: private */
    public TextView w;
    /* access modifiers changed from: private */
    public TextView x;
    /* access modifiers changed from: private */
    public ScrollView y;
    /* access modifiers changed from: private */
    public ScrollView z;

    public class WebAppInterface {
        Context a;

        WebAppInterface(Context context) {
            this.a = context;
        }

        @JavascriptInterface
        public void DetailID(String str) {
            Toast.makeText(this.a, str, 0).show();
        }

        @JavascriptInterface
        public int I2C16R(int i, int i2) {
            byte[] bArr = new byte[4];
            ch341ActivityPlus.this.E.a(i2 | i, 4, bArr);
            return (bArr[1] & 255) | (bArr[0] << 8);
        }

        @JavascriptInterface
        public void I2C16W(int i, int i2, int i3) {
            ch341ActivityPlus.this.E.b(i2 | i, 2, new byte[]{(byte) (i3 >> 8), (byte) (i3 | 255)});
        }

        @JavascriptInterface
        public int I2C32R(int i, int i2) {
            byte[] bArr = new byte[6];
            ch341ActivityPlus.this.E.a(i2 | i, 4, bArr);
            return (bArr[3] & 255) | (((((bArr[0] << 8) | (bArr[1] & 255)) << 8) | (bArr[2] & 255)) << 8);
        }

        @JavascriptInterface
        public void I2C32W(int i, int i2, int i3) {
            byte[] bArr = new byte[6];
            bArr[0] = (byte) (i3 >> 24);
            bArr[1] = (byte) ((i3 >> 16) | 255);
            bArr[2] = (byte) ((i3 >> 8) | 255);
            bArr[3] = (byte) (i3 | 255);
            ch341ActivityPlus.this.E.b(i2 | i, 4, bArr);
        }

        @JavascriptInterface
        public void showToast(String str) {
            Toast.makeText(this.a, str, 0).show();
        }
    }

    public ch341ActivityPlus() {
        long[] jArr = new long[260];
        jArr[1] = 128;
        jArr[2] = 256;
        jArr[3] = 512;
        jArr[4] = 1024;
        jArr[5] = 2048;
        jArr[6] = 4096;
        jArr[7] = 8192;
        jArr[8] = 16384;
        jArr[9] = 32768;
        jArr[10] = 65536;
        jArr[11] = 131072;
        jArr[12] = 262144;
        jArr[13] = 524288;
        jArr[21] = 128;
        jArr[22] = 256;
        jArr[23] = 512;
        jArr[24] = 1024;
        jArr[25] = 2048;
        jArr[26] = 4096;
        jArr[27] = 8192;
        jArr[28] = 16384;
        jArr[29] = 32768;
        jArr[30] = 65536;
        jArr[31] = 131072;
        jArr[32] = 262144;
        jArr[33] = 524288;
        jArr[34] = 1048576;
        jArr[35] = 2097152;
        jArr[36] = 4194304;
        jArr[37] = 8388608;
        jArr[38] = 16777216;
        jArr[39] = 33554432;
        jArr[40] = 67108864;
        jArr[41] = 134217728;
        jArr[42] = 268435456;
        this.p = jArr;
        int[] iArr = new int[39];
        iArr[1] = 1;
        iArr[2] = 2;
        iArr[3] = 3;
        iArr[4] = 4;
        iArr[5] = 5;
        iArr[6] = 6;
        iArr[7] = 7;
        iArr[8] = 8;
        iArr[9] = 9;
        iArr[10] = 10;
        iArr[11] = 11;
        iArr[12] = 12;
        iArr[13] = 13;
        iArr[21] = 1;
        iArr[22] = 2;
        iArr[23] = 3;
        iArr[24] = 4;
        iArr[25] = 5;
        iArr[26] = 6;
        iArr[27] = 7;
        iArr[28] = 8;
        iArr[29] = 9;
        iArr[30] = 10;
        iArr[31] = 11;
        iArr[32] = 12;
        iArr[33] = 13;
        iArr[34] = 14;
        iArr[35] = 15;
        iArr[36] = 16;
        iArr[37] = 17;
        this.q = iArr;
        this.r = null;
        this.s = new c(this);
        this.t = new n(this);
    }

    private static double a(int i2) {
        return (((double) i2) * 5000.0d) / 256.0d;
    }

    private static int a(long j2, long j3) {
        if (j2 >= j3) {
            j2 = j3;
        }
        return (int) j2;
    }

    /* access modifiers changed from: private */
    public UsbInterface a(UsbDevice usbDevice) {
        int interfaceCount = usbDevice.getInterfaceCount();
        int i2 = 0;
        while (i2 < interfaceCount) {
            UsbInterface usbInterface = usbDevice.getInterface(i2);
            if ((usbDevice.getVendorId() == 6790 && usbDevice.getProductId() == 21795) || (usbDevice.getVendorId() == 6790 && usbDevice.getProductId() == 29987)) {
                this.a = 0;
                return usbInterface;
            } else if (usbDevice.getVendorId() == 1659 && usbDevice.getProductId() == 8963) {
                this.a = 1;
                return usbInterface;
            } else if (usbDevice.getVendorId() == 4292 && usbDevice.getProductId() == 60000) {
                this.a = 2;
                return usbInterface;
            } else if (usbDevice.getVendorId() == 6790 && usbDevice.getProductId() == 21778) {
                this.a = 3;
                return usbInterface;
            } else {
                i2++;
            }
        }
        return null;
    }

    private TextView a(String str, int i2) {
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -2, 1.0f);
        layoutParams.setMargins(20, 0, 29, 0);
        this.W = new TextView(this);
        this.W.setLayoutParams(layoutParams);
        this.W.setText(str);
        this.W.setTextColor(i2);
        this.W.setTextSize(15.0f);
        return this.W;
    }

    static /* synthetic */ void a(ch341ActivityPlus ch341activityplus, String str) {
        ch341activityplus.w.append(str);
        int lineCount = ch341activityplus.w.getLineCount();
        if (lineCount > 0) {
            if (ch341activityplus.w.getLayout().getLineStart(lineCount) - ch341activityplus.w.getLayout().getLineStart(lineCount - 1) > 36) {
                ch341activityplus.w.append("\n");
                lineCount++;
            }
            if (lineCount >= 500) {
                Layout layout = ch341activityplus.w.getLayout();
                ch341activityplus.w.setText(ch341activityplus.w.getText().toString().substring(layout.getLineStart(1), layout.getLineEnd(lineCount - 1)));
            }
        }
        ch341activityplus.y.postDelayed(new ai(ch341activityplus), 500);
    }

    private void a(boolean z2, String str) {
        TextView textView = (TextView) findViewById(C0000R.id.tableic_msg);
        ((Button) findViewById(C0000R.id.tableic_next)).setOnClickListener(this);
        ((Button) findViewById(C0000R.id.tableic_back)).setOnClickListener(this);
        ((Button) findViewById(C0000R.id.tableic_fill)).setOnClickListener(this);
        ((Button) findViewById(C0000R.id.tableic_addr)).setOnClickListener(this);
        if (z2) {
            textView.setTextColor(-16711936);
        } else {
            textView.setTextColor(-65536);
        }
        textView.setTextSize(15.0f);
        textView.setText(str);
        this.l = new TableRow.LayoutParams(-2, -2);
        TableRow tableRow = new TableRow(this);
        tableRow.setLayoutParams(this.l);
        tableRow.setGravity(17);
        tableRow.setBackgroundColor(-1);
        tableRow.addView(a("Addr# ", -16777216));
        tableRow.addView(a(String.format("%02X", new Object[]{(byte) 0}), -16777216));
        tableRow.addView(a(String.format("%02X", new Object[]{(byte) 1}), -16777216));
        tableRow.addView(a(String.format("%02X", new Object[]{(byte) 2}), -16777216));
        tableRow.addView(a(String.format("%02X", new Object[]{(byte) 3}), -16777216));
        tableRow.addView(a(String.format("%02X", new Object[]{(byte) 4}), -16777216));
        tableRow.addView(a(String.format("%02X", new Object[]{(byte) 5}), -16777216));
        tableRow.addView(a(String.format("%02X", new Object[]{(byte) 6}), -16777216));
        tableRow.addView(a(String.format("%02X", new Object[]{(byte) 7}), -16777216));
        ((TableLayout) findViewById(C0000R.id.tablehead_part)).addView(tableRow);
        this.o = 0;
        e();
        ((ScrollView) findViewById(C0000R.id.scrollable_tb)).setOnTouchListener(new g(this));
    }

    /* access modifiers changed from: private */
    public boolean a(UsbDevice usbDevice, UsbInterface usbInterface) {
        boolean z2;
        boolean z3;
        boolean z4;
        char c2 = 2;
        if (this.C != null) {
            if (this.D != null) {
                this.C.releaseInterface(this.D);
                this.D = null;
            }
            a("close onnection");
            this.C.close();
            this.B = null;
            this.C = null;
        }
        if (!(usbDevice == null || usbInterface == null)) {
            UsbDeviceConnection openDevice = this.A.openDevice(usbDevice);
            if (openDevice == null) {
                a("open failed");
            } else if (openDevice.claimInterface(usbInterface, this.U)) {
                this.B = usbDevice;
                this.C = openDevice;
                this.D = usbInterface;
                this.E = new ak(this, this.C, usbInterface);
                if (this.E != null) {
                    if (this.a != 0) {
                        if (this.a == 3) {
                            ak akVar = this.E;
                            ak.a(new byte[40], 0, "WCH CH34x Driver Version V0.1".getBytes(), 0, 29);
                            byte[] bArr = new byte[4];
                            if (akVar.s.controlTransfer(192, 95, 0, 0, bArr, 2, 1000) <= 0) {
                                z2 = false;
                            } else {
                                akVar.q = (bArr[1] << 8) | bArr[0];
                                z2 = true;
                            }
                            if (!z2) {
                                akVar.a("CH34x_GetVendorId Error");
                            }
                            StringBuilder sb = new StringBuilder("read fe: 0x");
                            int[] iArr = akVar.e;
                            int a2 = akVar.a(254);
                            iArr[0] = a2;
                            StringBuilder append = sb.append(Integer.toHexString(a2)).append("read ff: 0x");
                            int[] iArr2 = akVar.e;
                            int a3 = akVar.a(255);
                            iArr2[1] = a3;
                            akVar.c = append.append(Integer.toHexString(a3)).toString();
                            if (akVar.e[0] != -1) {
                                akVar.a();
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (z3) {
                                c2 = 1;
                            } else {
                                StringBuilder sb2 = new StringBuilder("temp90614 3c=");
                                int[] iArr3 = akVar.d;
                                int b2 = akVar.b(60);
                                iArr3[0] = b2;
                                StringBuilder append2 = sb2.append(Integer.toHexString(b2)).append(" ");
                                int[] iArr4 = akVar.d;
                                int b3 = akVar.b(61);
                                iArr4[1] = b3;
                                StringBuilder append3 = append2.append(Integer.toHexString(b3)).append(" ");
                                int[] iArr5 = akVar.d;
                                int b4 = akVar.b(62);
                                iArr5[2] = b4;
                                StringBuilder append4 = append3.append(Integer.toHexString(b4)).append(" ");
                                int[] iArr6 = akVar.d;
                                int b5 = akVar.b(63);
                                iArr6[3] = b5;
                                akVar.c = append4.append(Integer.toHexString(b5)).toString();
                                if (akVar.d[0] != 32767) {
                                    akVar.a();
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                if (!z4) {
                                    c2 = 0;
                                }
                            }
                            switch (c2) {
                                case 1:
                                case 2:
                                    if (this.e == 0) {
                                        setContentView(C0000R.layout.temperature);
                                        ((Button) findViewById(C0000R.id.Temp_button1)).setOnClickListener(this);
                                        ((Button) findViewById(C0000R.id.Temp_button2)).setOnClickListener(this);
                                        break;
                                    }
                                    break;
                                default:
                                    f();
                                    break;
                            }
                        }
                    } else {
                        ak akVar2 = this.E;
                        akVar2.y.start();
                        akVar2.z.start();
                        akVar2.A.start();
                        c();
                    }
                }
                return true;
            } else {
                a("claim interface failed");
                openDevice.close();
            }
        }
        if (this.C != null || this.E == null) {
            return false;
        }
        a("call stop");
        ak akVar3 = this.E;
        synchronized (akVar3.y) {
            akVar3.y.a = true;
        }
        synchronized (akVar3.z) {
            akVar3.z.a = true;
        }
        synchronized (akVar3.A) {
            akVar3.A.a = true;
        }
        if (akVar3.b != null) {
            try {
                if (akVar3.a != null) {
                    akVar3.a.close();
                }
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
        this.E = null;
        return false;
    }

    public static byte[] a(byte[] bArr) {
        if (bArr.length % 2 != 0) {
            throw new IllegalArgumentException("hex2byte size 0");
        }
        byte[] bArr2 = new byte[(bArr.length / 2)];
        for (int i2 = 0; i2 < bArr.length; i2 += 2) {
            bArr2[i2 / 2] = (byte) Integer.parseInt(new String(bArr, i2, 2), 16);
        }
        return bArr2;
    }

    static /* synthetic */ void b(ch341ActivityPlus ch341activityplus, String str) {
        ch341activityplus.x.append(str);
        int lineCount = ch341activityplus.x.getLineCount();
        if (lineCount > 0) {
            if (ch341activityplus.x.getLayout().getLineStart(lineCount) - ch341activityplus.x.getLayout().getLineStart(lineCount - 1) > 36) {
                ch341activityplus.x.append("\n");
                lineCount++;
            }
            if (lineCount >= 500) {
                Layout layout = ch341activityplus.x.getLayout();
                ch341activityplus.x.setText(ch341activityplus.x.getText().toString().substring(layout.getLineStart(1), layout.getLineEnd(lineCount - 1)));
            }
        }
        ch341activityplus.z.postDelayed(new d(ch341activityplus), 500);
    }

    private Dialog d(String str) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(str);
        builder.setPositiveButton(getString(C0000R.string.OK), new t(this));
        AlertDialog show = builder.show();
        show.setOnKeyListener(new u(this));
        return show;
    }

    private void g() {
        a();
        View inflate = LayoutInflater.from(this).inflate(C0000R.layout.setup, (ViewGroup) null);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Serial Port Configuration");
        builder.setView(inflate);
        this.N = (Spinner) inflate.findViewById(C0000R.id.spinner1);
        this.O = (Spinner) inflate.findViewById(C0000R.id.spinner2);
        this.P = (Spinner) inflate.findViewById(C0000R.id.spinner3);
        this.Q = (Spinner) inflate.findViewById(C0000R.id.spinner4);
        this.R = (Spinner) inflate.findViewById(C0000R.id.spinner5);
        this.S = (Spinner) inflate.findViewById(C0000R.id.spinner6);
        this.N.setSelection(this.V[0]);
        this.O.setSelection(this.V[1]);
        this.P.setSelection(this.V[2]);
        this.Q.setSelection(this.V[3]);
        this.R.setSelection(this.V[4]);
        this.S.setSelection(this.V[5]);
        c();
    }

    private void h() {
        findViewById(C0000R.id.ic24_textView2);
        ((Button) findViewById(C0000R.id.ic24_back)).setOnClickListener(this);
        ((Button) findViewById(C0000R.id.ic24_button1)).setOnClickListener(this);
        ((Button) findViewById(C0000R.id.ic24_button2)).setOnClickListener(this);
        ((Button) findViewById(C0000R.id.ic24_button3)).setOnClickListener(this);
        ((Button) findViewById(C0000R.id.ic24_button4)).setOnClickListener(this);
        ((Button) findViewById(C0000R.id.ic24_button5)).setOnClickListener(this);
        ((Button) findViewById(C0000R.id.ic24_button6)).setOnClickListener(this);
        ((Button) findViewById(C0000R.id.ic24_button7)).setOnClickListener(this);
        ((Button) findViewById(C0000R.id.ic24_button8)).setOnClickListener(this);
        ((Button) findViewById(C0000R.id.ic24_button9)).setOnClickListener(this);
        ((Button) findViewById(C0000R.id.ic24_button10)).setOnClickListener(this);
        ((Button) findViewById(C0000R.id.ic24_button11)).setOnClickListener(this);
        ((Button) findViewById(C0000R.id.ic24_button12)).setOnClickListener(this);
        ((Button) findViewById(C0000R.id.ic24_button13)).setOnClickListener(this);
    }

    private void i() {
        findViewById(C0000R.id.ic25_textView2);
        ((Button) findViewById(C0000R.id.ic25_back)).setOnClickListener(this);
        ((Button) findViewById(C0000R.id.ic25_button1)).setOnClickListener(this);
        ((Button) findViewById(C0000R.id.ic25_button2)).setOnClickListener(this);
        ((Button) findViewById(C0000R.id.ic25_button3)).setOnClickListener(this);
        ((Button) findViewById(C0000R.id.ic25_button4)).setOnClickListener(this);
        ((Button) findViewById(C0000R.id.ic25_button5)).setOnClickListener(this);
        ((Button) findViewById(C0000R.id.ic25_button6)).setOnClickListener(this);
        ((Button) findViewById(C0000R.id.ic25_button7)).setOnClickListener(this);
        ((Button) findViewById(C0000R.id.ic25_button8)).setOnClickListener(this);
        ((Button) findViewById(C0000R.id.ic25_button9)).setOnClickListener(this);
        ((Button) findViewById(C0000R.id.ic25_button10)).setOnClickListener(this);
        ((Button) findViewById(C0000R.id.ic25_button11)).setOnClickListener(this);
        ((Button) findViewById(C0000R.id.ic25_button12)).setOnClickListener(this);
        ((Button) findViewById(C0000R.id.ic25_button13)).setOnClickListener(this);
        ((Button) findViewById(C0000R.id.ic25_button14)).setOnClickListener(this);
        ((Button) findViewById(C0000R.id.ic25_button15)).setOnClickListener(this);
        ((Button) findViewById(C0000R.id.ic25_button16)).setOnClickListener(this);
        ((Button) findViewById(C0000R.id.ic25_button17)).setOnClickListener(this);
        ((Button) findViewById(C0000R.id.ic25_button18)).setOnClickListener(this);
    }

    private void j() {
        if (Environment.getExternalStorageState().equals("mounted")) {
            File file = new File(String.valueOf(Environment.getExternalStorageDirectory().getAbsolutePath()) + File.separator + "Download" + File.separator + "ROM");
            if (!file.exists()) {
                file.mkdirs();
            }
            aq aqVar = new aq(this, file, ".rom");
            aqVar.a((az) new i(this));
            aqVar.a();
        }
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        for (int i2 = 0; i2 < 256; i2++) {
            this.V[i2] = -1;
        }
        try {
            FileInputStream openFileInput = openFileInput("Config");
            openFileInput.read(this.V);
            openFileInput.close();
        } catch (FileNotFoundException e2) {
            e2.printStackTrace();
        } catch (IOException e3) {
            e3.printStackTrace();
        }
        if (this.V[0] == -1) {
            this.V[0] = 6;
        }
        if (this.V[1] == -1 || this.V[1] > 3) {
            this.V[1] = 3;
        }
        if (this.V[2] == -1) {
            this.V[2] = 2;
        }
        if (this.V[3] == -1) {
            this.V[3] = 0;
        }
        if (this.V[4] == -1) {
            this.V[4] = 0;
        }
        if (this.V[5] == -1) {
            this.V[5] = 0;
        }
    }

    public final void a(String str) {
        Message obtain = Message.obtain(this.t, 1);
        obtain.obj = str;
        this.t.sendMessage(obtain);
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        try {
            FileOutputStream openFileOutput = openFileOutput("Config", 0);
            openFileOutput.write(this.V);
            openFileOutput.close();
        } catch (FileNotFoundException e2) {
            e2.printStackTrace();
        } catch (IOException e3) {
            e3.printStackTrace();
        }
    }

    public final void b(String str) {
        Message obtain = Message.obtain(this.t, 3);
        obtain.obj = str;
        this.t.sendMessage(obtain);
    }

    public final Dialog c(String str) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(str);
        builder.setPositiveButton(getString(C0000R.string.OK), new j(this));
        builder.setNegativeButton(getString(C0000R.string.Cancel), new k(this));
        AlertDialog show = builder.show();
        show.setOnKeyListener(new l(this));
        return show;
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        boolean z2 = true;
        int i2 = String.valueOf(this.P.getSelectedItem()).equals("odd") ? 1 : String.valueOf(this.P.getSelectedItem()).equals("even") ? 2 : String.valueOf(this.P.getSelectedItem()).equals("none") ? 0 : 2;
        this.V[0] = (byte) this.N.getSelectedItemPosition();
        this.V[1] = (byte) this.O.getSelectedItemPosition();
        this.V[2] = (byte) this.P.getSelectedItemPosition();
        this.V[3] = (byte) this.Q.getSelectedItemPosition();
        this.V[4] = (byte) this.R.getSelectedItemPosition();
        this.V[5] = (byte) this.S.getSelectedItemPosition();
        if (this.E != null) {
            this.E.i = this.V[5];
            ak akVar = this.E;
            int intValue = Integer.valueOf(String.valueOf(this.N.getSelectedItem())).intValue();
            int intValue2 = Integer.valueOf(String.valueOf(this.O.getSelectedItem())).intValue();
            int intValue3 = Integer.valueOf(String.valueOf(this.Q.getSelectedItem())).intValue();
            if (String.valueOf(this.R.getSelectedItem()).equals("none")) {
                z2 = false;
            }
            akVar.a(intValue, intValue2, i2, intValue3, z2);
            Toast.makeText(this, "OnClickListener : \nBaudrate : " + String.valueOf(this.N.getSelectedItem()) + "\nDatabits : " + String.valueOf(this.O.getSelectedItem()) + "\nParity   : " + String.valueOf(this.P.getSelectedItem()) + "\nStopbits : " + String.valueOf(this.Q.getSelectedItem()) + "\nFlowCtrl : " + String.valueOf(this.R.getSelectedItem()) + "\nDisplay  : " + String.valueOf(this.S.getSelectedItem()), 0).show();
        }
    }

    public final void d() {
        this.M++;
        this.t.sendMessage(Message.obtain(this.t, 2));
    }

    /* access modifiers changed from: package-private */
    public final void e() {
        TableLayout tableLayout = (TableLayout) findViewById(C0000R.id.tablescrollable_part);
        tableLayout.removeAllViews();
        long j2 = this.o / 8;
        long j3 = 0;
        while (j2 < this.p[this.h] / 8 && j3 < 20) {
            TableRow tableRow = new TableRow(this);
            tableRow.setLayoutParams(this.l);
            tableRow.setGravity(17);
            tableRow.addView(a(String.format("%06X", new Object[]{Long.valueOf(8 * j2)}), -1));
            tableRow.addView(a(String.format("%02X", new Object[]{Byte.valueOf(this.r[(((int) j2) * 8) + 0])}), -1));
            tableRow.addView(a(String.format("%02X", new Object[]{Byte.valueOf(this.r[(((int) j2) * 8) + 1])}), -1));
            tableRow.addView(a(String.format("%02X", new Object[]{Byte.valueOf(this.r[(((int) j2) * 8) + 2])}), -1));
            tableRow.addView(a(String.format("%02X", new Object[]{Byte.valueOf(this.r[(((int) j2) * 8) + 3])}), -1));
            tableRow.addView(a(String.format("%02X", new Object[]{Byte.valueOf(this.r[(((int) j2) * 8) + 4])}), -1));
            tableRow.addView(a(String.format("%02X", new Object[]{Byte.valueOf(this.r[(((int) j2) * 8) + 5])}), -1));
            tableRow.addView(a(String.format("%02X", new Object[]{Byte.valueOf(this.r[(((int) j2) * 8) + 6])}), -1));
            tableRow.addView(a(String.format("%02X", new Object[]{Byte.valueOf(this.r[(((int) j2) * 8) + 7])}), -1));
            tableRow.setId((int) j2);
            tableLayout.addView(tableRow);
            j2++;
            j3++;
        }
    }

    /* access modifiers changed from: package-private */
    public final void f() {
        boolean z2;
        boolean z3;
        boolean z4 = false;
        if (this.e == 0) {
            this.f = 0;
            this.g = 0;
            setContentView(C0000R.layout.procedure1);
            this.w = (TextView) findViewById(C0000R.id.log);
            this.w.setMovementMethod(new ScrollingMovementMethod());
            this.y = (ScrollView) findViewById(C0000R.id.ScrollView02);
            ((Button) findViewById(C0000R.id.button1)).setOnClickListener(this);
            ((Button) findViewById(C0000R.id.button2)).setOnClickListener(this);
            ((Button) findViewById(C0000R.id.button3)).setOnClickListener(this);
            ((Button) findViewById(C0000R.id.button4)).setOnClickListener(this);
            ((Button) findViewById(C0000R.id.button5)).setOnClickListener(this);
            ((Button) findViewById(C0000R.id.button6)).setOnClickListener(this);
        } else if (this.d == 0) {
            switch (this.e) {
                case 1:
                    setContentView(C0000R.layout.entersourceictype);
                    ((Button) findViewById(C0000R.id.sourceic_back)).setOnClickListener(this);
                    ((Button) findViewById(C0000R.id.sourceic_button1)).setOnClickListener(this);
                    ((Button) findViewById(C0000R.id.sourceic_button2)).setOnClickListener(this);
                    ((Button) findViewById(C0000R.id.sourceic_button3)).setOnClickListener(this);
                    return;
                case 2:
                    if (this.f == 1) {
                        setContentView(C0000R.layout.ic24xx_series);
                        h();
                        return;
                    } else if (this.f == 2) {
                        setContentView(C0000R.layout.ic25xxx_series);
                        i();
                        return;
                    } else if (this.f == 3) {
                        j();
                        return;
                    } else {
                        return;
                    }
                case 3:
                    if (this.j) {
                        this.r = new byte[((int) this.p[this.h])];
                        if (this.E == null) {
                            for (int i2 = 0; ((long) i2) < this.p[this.h]; i2++) {
                                this.r[i2] = (byte) i2;
                            }
                        } else {
                            int i3 = 0;
                            while (((long) i3) < this.p[this.h]) {
                                int a2 = a(this.p[this.h] - ((long) i3), 256);
                                System.arraycopy(this.E.j, 0, this.r, i3, a2);
                                i3 += a2;
                            }
                        }
                    } else if (this.f != 3) {
                        this.r = new byte[((int) this.p[this.h])];
                        Arrays.fill(this.r, (byte) -1);
                    }
                    setContentView(C0000R.layout.tablelayout);
                    if (this.j) {
                        this.j = false;
                        z3 = true;
                    } else {
                        if (this.E != null) {
                            if (this.f == 1) {
                                if (this.E.c(this.q[this.h], this.r, (int) this.p[this.h])) {
                                    z3 = true;
                                }
                            } else if (this.f == 2) {
                                if (this.E.a(this.q[this.h], this.r, (int) this.p[this.h])) {
                                    z3 = true;
                                }
                            } else if (this.f == 3) {
                                z3 = true;
                            }
                        }
                        z3 = false;
                    }
                    if (z3) {
                        a(true, "read success");
                        return;
                    } else {
                        a(false, "read failure");
                        return;
                    }
                case 4:
                    setContentView(C0000R.layout.entertargetictype);
                    ((Button) findViewById(C0000R.id.targetic_back)).setOnClickListener(this);
                    ((Button) findViewById(C0000R.id.targetic_button1)).setOnClickListener(this);
                    ((Button) findViewById(C0000R.id.targetic_button2)).setOnClickListener(this);
                    ((Button) findViewById(C0000R.id.targetic_button3)).setOnClickListener(this);
                    return;
                case 5:
                    if (this.g == 1) {
                        setContentView(C0000R.layout.ic24xx_series);
                        h();
                        return;
                    } else if (this.g == 2) {
                        setContentView(C0000R.layout.ic25xxx_series);
                        i();
                        return;
                    } else if (this.g == 3 && Environment.getExternalStorageState().equals("mounted")) {
                        File file = new File(String.valueOf(Environment.getExternalStorageDirectory().getAbsolutePath()) + File.separator + "Download" + File.separator + "ROM");
                        if (!file.exists()) {
                            file.mkdirs();
                        }
                        aq aqVar = new aq(this, file, ".rom");
                        aqVar.a((az) new m(this));
                        aqVar.c.a((Object) new o(this));
                        aqVar.d = true;
                        aqVar.a();
                        return;
                    } else {
                        return;
                    }
                case 6:
                    setContentView(C0000R.layout.summarize);
                    ((Button) findViewById(C0000R.id.Sum_back)).setOnClickListener(this);
                    ((Button) findViewById(C0000R.id.Sum_OK)).setOnClickListener(this);
                    TextView textView = (TextView) findViewById(C0000R.id.SumSrcModel_textView1);
                    TextView textView2 = (TextView) findViewById(C0000R.id.SumDestModel_textView1);
                    textView.setTextColor(-16711936);
                    if (this.f == 3) {
                        textView.setText("src file:" + this.p[this.h] + "bytes");
                    } else {
                        textView.setText("IC:" + this.q[this.h] + ":" + this.p[this.h] + "bytes");
                    }
                    textView2.setTextColor(-16711936);
                    if (this.g == 3) {
                        textView2.setText("dest file:" + this.p[this.i] + "bytes");
                        return;
                    } else {
                        textView2.setText("IC:" + this.q[this.i] + ":" + this.p[this.i] + "bytes");
                        return;
                    }
                case 7:
                    if (this.E != null) {
                        if (this.g == 1) {
                            if (this.E.d(this.q[this.i], this.r, a(this.p[this.h], this.p[this.i]))) {
                                z2 = true;
                            }
                            z2 = false;
                        } else if (this.g == 2) {
                            if (this.E.b(this.q[this.i], this.r, a(this.p[this.h], this.p[this.i]))) {
                                z2 = true;
                            }
                            z2 = false;
                        } else {
                            if (this.g == 3) {
                                z2 = true;
                            }
                            z2 = false;
                        }
                        setContentView(C0000R.layout.finished);
                        TextView textView3 = (TextView) findViewById(C0000R.id.Finish_status);
                        ((Button) findViewById(C0000R.id.Finish_verify)).setOnClickListener(this);
                        ((Button) findViewById(C0000R.id.Finish_again)).setOnClickListener(this);
                        ((Button) findViewById(C0000R.id.Finish_exit)).setOnClickListener(this);
                        if (z2) {
                            textView3.setTextColor(-16711936);
                            textView3.setText("write success");
                        } else {
                            textView3.setTextColor(-65536);
                            textView3.setText("write failure");
                        }
                        textView3.setTextSize(15.0f);
                        return;
                    }
                    return;
                case 8:
                    byte[] bArr = new byte[((int) this.p[this.i])];
                    if (this.E != null) {
                        boolean c2 = this.g == 1 ? this.E.c(this.q[this.i], bArr, a(this.p[this.h], this.p[this.i])) : this.g == 2 ? this.E.a(this.q[this.i], bArr, a(this.p[this.h], this.p[this.i])) : false;
                        if (c2) {
                            int i4 = 0;
                            while (true) {
                                if (i4 >= a(this.p[this.h], this.p[this.i])) {
                                    z4 = c2;
                                } else if (bArr[i4] == this.r[i4]) {
                                    i4++;
                                }
                            }
                            if (z4) {
                                d("Verify OK").show();
                                return;
                            }
                            AlertDialog.Builder builder = new AlertDialog.Builder(this);
                            builder.setTitle("Not equal");
                            builder.setPositiveButton(getString(C0000R.string.OK), new r(this));
                            AlertDialog show = builder.show();
                            show.setOnKeyListener(new s(this));
                            show.show();
                            this.e--;
                            return;
                        }
                        d("Read failure").show();
                        return;
                    }
                    return;
                default:
                    return;
            }
        } else if (this.d == 1) {
            switch (this.e) {
                case 1:
                    setContentView(C0000R.layout.entersourceictype);
                    ((Button) findViewById(C0000R.id.sourceic_back)).setOnClickListener(this);
                    ((Button) findViewById(C0000R.id.sourceic_button1)).setOnClickListener(this);
                    ((Button) findViewById(C0000R.id.sourceic_button2)).setOnClickListener(this);
                    ((Button) findViewById(C0000R.id.sourceic_button3)).setOnClickListener(this);
                    return;
                case 2:
                    if (this.f == 1) {
                        setContentView(C0000R.layout.ic24xx_series);
                        h();
                        return;
                    } else if (this.f == 2) {
                        setContentView(C0000R.layout.ic25xxx_series);
                        i();
                        return;
                    } else if (this.f == 3) {
                        j();
                        return;
                    } else {
                        return;
                    }
                case 3:
                    if (this.E != null) {
                        if (this.f == 1) {
                            this.E.b(this.q[this.h], (int) this.p[this.h]);
                        } else if (this.f == 2) {
                            this.E.a(this.q[this.h], (int) this.p[this.h]);
                        }
                        d("Erase complete").show();
                        return;
                    }
                    return;
                default:
                    return;
            }
        } else if (this.d == 2) {
            switch (this.e) {
                case 1:
                    if (this.E != null) {
                        ak akVar = this.E;
                        byte[] bArr2 = new byte[6];
                        bArr2[0] = -112;
                        bArr2[1] = 0;
                        bArr2[2] = 0;
                        bArr2[3] = 0;
                        this.u = akVar.a(6, bArr2) <= 0 ? 0 : ((long) (bArr2[4] << 8)) | ((long) bArr2[5]);
                        AlertDialog.Builder builder2 = new AlertDialog.Builder(this);
                        builder2.setTitle("Flash ID is " + Integer.toHexString((int) this.u) + ".\nConnect Server for Detail?");
                        builder2.setPositiveButton(getString(C0000R.string.OK), new v(this));
                        builder2.setNegativeButton(getString(C0000R.string.Cancel), new w(this));
                        AlertDialog show2 = builder2.show();
                        show2.setOnKeyListener(new y(this));
                        show2.show();
                        return;
                    }
                    return;
                default:
                    return;
            }
        } else if (this.d == 3) {
            switch (this.e) {
                case 1:
                    setContentView(C0000R.layout.wbview);
                    WebView webView = (WebView) findViewById(C0000R.id.webview);
                    webView.getSettings().setJavaScriptEnabled(true);
                    webView.addJavascriptInterface(new WebAppInterface(this), "Android");
                    webView.setWebViewClient(new WebViewClient());
                    webView.loadUrl(String.valueOf(this.G) + "/service.php");
                    return;
                default:
                    return;
            }
        }
    }

    public void onBackPressed() {
        if (this.e > 0) {
            this.e--;
            f();
            return;
        }
        finish();
    }

    public void onClick(View view) {
        double d2;
        switch (view.getId()) {
            case C0000R.id.sourceic_back:
                this.e--;
                this.f = 0;
                f();
                return;
            case C0000R.id.sourceic_button1:
                this.f = 1;
                this.e++;
                f();
                return;
            case C0000R.id.sourceic_button2:
                this.f = 2;
                this.e++;
                f();
                return;
            case C0000R.id.sourceic_button3:
                this.f = 3;
                this.e++;
                f();
                return;
            case C0000R.id.targetic_back:
                this.g = 0;
                this.e--;
                f();
                return;
            case C0000R.id.targetic_button1:
                this.g = 1;
                this.e++;
                f();
                return;
            case C0000R.id.targetic_button2:
                this.g = 2;
                this.e++;
                f();
                return;
            case C0000R.id.targetic_button3:
                this.g = 3;
                this.e++;
                f();
                return;
            case C0000R.id.Finish_verify:
                this.e++;
                f();
                return;
            case C0000R.id.Finish_again:
                this.e--;
                f();
                return;
            case C0000R.id.Finish_exit:
                this.e = 0;
                this.f = 0;
                this.g = 0;
                f();
                return;
            case C0000R.id.ic24_back:
                if (this.g > 0) {
                    this.g = 0;
                }
                this.e--;
                f();
                return;
            case C0000R.id.ic24_button1:
                if (this.g > 0) {
                    this.i = 1;
                } else {
                    this.h = 1;
                }
                this.e++;
                f();
                return;
            case C0000R.id.ic24_button2:
                if (this.g > 0) {
                    this.i = 2;
                } else {
                    this.h = 2;
                }
                this.e++;
                f();
                return;
            case C0000R.id.ic24_button3:
                if (this.g > 0) {
                    this.i = 3;
                } else {
                    this.h = 3;
                }
                this.e++;
                f();
                return;
            case C0000R.id.ic24_button4:
                if (this.g > 0) {
                    this.i = 4;
                } else {
                    this.h = 4;
                }
                this.e++;
                f();
                return;
            case C0000R.id.ic24_button5:
                if (this.g > 0) {
                    this.i = 5;
                } else {
                    this.h = 5;
                }
                this.e++;
                f();
                return;
            case C0000R.id.ic24_button6:
                if (this.g > 0) {
                    this.i = 6;
                } else {
                    this.h = 6;
                }
                this.e++;
                f();
                return;
            case C0000R.id.ic24_button7:
                if (this.g > 0) {
                    this.i = 7;
                } else {
                    this.h = 7;
                }
                this.e++;
                f();
                return;
            case C0000R.id.ic24_button8:
                if (this.g > 0) {
                    this.i = 8;
                } else {
                    this.h = 8;
                }
                this.e++;
                f();
                return;
            case C0000R.id.ic24_button9:
                if (this.g > 0) {
                    this.i = 9;
                } else {
                    this.h = 9;
                }
                this.e++;
                f();
                return;
            case C0000R.id.ic24_button10:
                if (this.g > 0) {
                    this.i = 10;
                } else {
                    this.h = 10;
                }
                this.e++;
                f();
                return;
            case C0000R.id.ic24_button11:
                if (this.g > 0) {
                    this.i = 11;
                } else {
                    this.h = 11;
                }
                this.e++;
                f();
                return;
            case C0000R.id.ic24_button12:
                if (this.g > 0) {
                    this.i = 12;
                } else {
                    this.h = 12;
                }
                this.e++;
                f();
                return;
            case C0000R.id.ic24_button13:
                if (this.g > 0) {
                    this.i = 13;
                } else {
                    this.h = 13;
                }
                this.e++;
                f();
                return;
            case C0000R.id.ic25_back:
                if (this.g > 0) {
                    this.g = 0;
                }
                this.e--;
                f();
                return;
            case C0000R.id.ic25_button1:
                if (this.g > 0) {
                    this.i = 21;
                } else {
                    this.h = 21;
                }
                this.e++;
                f();
                return;
            case C0000R.id.ic25_button2:
                if (this.g > 0) {
                    this.i = 22;
                } else {
                    this.h = 22;
                }
                this.e++;
                f();
                return;
            case C0000R.id.ic25_button3:
                if (this.g > 0) {
                    this.i = 23;
                } else {
                    this.h = 23;
                }
                this.e++;
                f();
                return;
            case C0000R.id.ic25_button4:
                if (this.g > 0) {
                    this.i = 24;
                } else {
                    this.h = 24;
                }
                this.e++;
                f();
                return;
            case C0000R.id.ic25_button5:
                if (this.g > 0) {
                    this.i = 25;
                } else {
                    this.h = 25;
                }
                this.e++;
                f();
                return;
            case C0000R.id.ic25_button6:
                if (this.g > 0) {
                    this.i = 26;
                } else {
                    this.h = 26;
                }
                this.e++;
                f();
                return;
            case C0000R.id.ic25_button7:
                if (this.g > 0) {
                    this.i = 27;
                } else {
                    this.h = 27;
                }
                this.e++;
                f();
                return;
            case C0000R.id.ic25_button8:
                if (this.g > 0) {
                    this.i = 28;
                } else {
                    this.h = 28;
                }
                this.e++;
                f();
                return;
            case C0000R.id.ic25_button9:
                if (this.g > 0) {
                    this.i = 29;
                } else {
                    this.h = 29;
                }
                this.e++;
                f();
                return;
            case C0000R.id.ic25_button10:
                if (this.g > 0) {
                    this.i = 30;
                } else {
                    this.h = 30;
                }
                this.e++;
                f();
                return;
            case C0000R.id.ic25_button11:
                if (this.g > 0) {
                    this.i = 31;
                } else {
                    this.h = 31;
                }
                this.e++;
                f();
                return;
            case C0000R.id.ic25_button12:
                if (this.g > 0) {
                    this.i = 32;
                } else {
                    this.h = 32;
                }
                this.e++;
                f();
                return;
            case C0000R.id.ic25_button13:
                if (this.g > 0) {
                    this.i = 33;
                } else {
                    this.h = 33;
                }
                this.e++;
                f();
                return;
            case C0000R.id.ic25_button14:
                if (this.g > 0) {
                    this.i = 34;
                } else {
                    this.h = 34;
                }
                this.e++;
                f();
                return;
            case C0000R.id.ic25_button15:
                if (this.g > 0) {
                    this.i = 35;
                } else {
                    this.h = 35;
                }
                this.e++;
                f();
                return;
            case C0000R.id.ic25_button16:
                if (this.g > 0) {
                    this.i = 36;
                } else {
                    this.h = 36;
                }
                this.e++;
                f();
                return;
            case C0000R.id.ic25_button17:
                if (this.g > 0) {
                    this.i = 37;
                } else {
                    this.h = 37;
                }
                this.e++;
                f();
                return;
            case C0000R.id.ic25_button18:
                if (this.g > 0) {
                    this.i = 38;
                } else {
                    this.h = 38;
                }
                this.e++;
                f();
                return;
            case C0000R.id.button1:
                this.d = 0;
                this.e = 1;
                f();
                return;
            case C0000R.id.button2:
                this.d = 1;
                this.e = 1;
                f();
                return;
            case C0000R.id.button3:
                this.d = 2;
                this.e = 1;
                f();
                return;
            case C0000R.id.button4:
                this.d = 3;
                this.e = 1;
                f();
                return;
            case C0000R.id.button5:
                this.d = 4;
                this.e = 1;
                byte[] bArr = new byte[6];
                this.E.a(18436, 4, bArr);
                byte b2 = (bArr[3] & 255) | (((((bArr[0] << 8) | (bArr[1] & 255)) << 8) | (bArr[2] & 255)) << 8);
                double a2 = a((int) b2 & 255);
                a("UV  :" + (a2 < 50.0d ? 0 : a2 < 227.0d ? 1 : a2 < 318.0d ? 2 : a2 < 408.0d ? 3 : a2 < 503.0d ? 4 : a2 < 606.0d ? 5 : a2 < 696.0d ? 6 : a2 < 795.0d ? 7 : a2 < 881.0d ? 8 : a2 < 976.0d ? 9 : a2 < 1079.0d ? 10 : 11) + "(0~11+, 200~370nm)\nTemp:" + a((b2 >> 8) & 255) + " " + Integer.toHexString((b2 >> 8) & 255) + "\nLux :" + a((b2 >> 16) & 255) + " " + Integer.toHexString((b2 >> 16) & 255) + "\nVolt:" + a((b2 >> 24) & 255) + " " + Integer.toHexString((b2 >> 24) & 255) + "\n");
                return;
            case C0000R.id.button6:
                this.d = 5;
                this.e = 1;
                if (Environment.getExternalStorageState().equals("mounted")) {
                    File file = new File(String.valueOf(Environment.getExternalStorageDirectory().getAbsolutePath()) + File.separator + "Download" + File.separator + "HTML");
                    if (!file.exists()) {
                        file.mkdirs();
                    }
                    aq aqVar = new aq(this, file, ".html");
                    aqVar.a((az) new h(this));
                    aqVar.a();
                    return;
                }
                return;
            case C0000R.id.Sum_back:
                this.e--;
                f();
                return;
            case C0000R.id.Sum_OK:
                this.e++;
                f();
                return;
            case C0000R.id.tableic_back:
                this.e--;
                f();
                return;
            case C0000R.id.tableic_next:
                this.e++;
                f();
                return;
            case C0000R.id.tableic_fill:
                this.j = true;
                f();
                return;
            case C0000R.id.tableic_addr:
                View inflate = LayoutInflater.from(this).inflate(C0000R.layout.dialoghex, (ViewGroup) null);
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setTitle("Enter Address(Hex)");
                builder.setView(inflate);
                builder.setPositiveButton(getString(C0000R.string.OK), new e(this, (EditText) inflate.findViewById(C0000R.id.editTextNum1)));
                builder.setNegativeButton(getString(C0000R.string.Cancel), new f(this));
                builder.show();
                return;
            case C0000R.id.Temp_button1:
                break;
            case C0000R.id.Temp_button2:
                this.F = 1 - this.F;
                break;
            default:
                return;
        }
        double a3 = this.E.a();
        TextView textView = (TextView) findViewById(C0000R.id.Temp_textView1);
        TextView textView2 = (TextView) findViewById(C0000R.id.Temp_textView2);
        EditText editText = (EditText) findViewById(C0000R.id.Temp_edittext);
        String editable = editText.getText().toString();
        if (editable == null || editable.isEmpty()) {
            editText.setText("0.9");
            d2 = 0.9d;
        } else {
            d2 = Double.parseDouble(editable);
        }
        textView.setTextColor(-16711936);
        if (this.F == 1) {
            textView.setText(":" + String.format("%.02f", new Object[]{Double.valueOf((1.8d * a3) + 32.0d)}) + "°F");
        } else {
            textView.setText(":" + String.format("%.02f", new Object[]{Double.valueOf(a3)}) + "°C");
        }
        textView2.setTextColor(-16711936);
        double d3 = a3 / d2;
        if (this.F == 1) {
            textView2.setText(":" + String.format("%.02f", new Object[]{Double.valueOf((d3 * 1.8d) + 32.0d)}) + "°F");
        } else {
            textView2.setText(":" + String.format("%.02f", new Object[]{Double.valueOf(d3)}) + "°C");
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("ComboToolPlus");
        getActionBar().setIcon(C0000R.drawable.ship2_3);
        this.G = "http://www.appcombo.tw/20";
        g();
        setContentView(C0000R.layout.ch341);
        this.x = (TextView) findViewById(C0000R.id.msg);
        this.x.setMovementMethod(new ScrollingMovementMethod());
        this.z = (ScrollView) findViewById(C0000R.id.ScrollView01);
        this.H = (Button) findViewById(C0000R.id.Button01);
        this.H.setOnClickListener(new z(this));
        this.I = (Button) findViewById(C0000R.id.Button02);
        this.I.setOnClickListener(new ac(this));
        this.J = (Button) findViewById(C0000R.id.Button03);
        this.J.setOnClickListener(new af(this));
        this.K = (Button) findViewById(C0000R.id.Button04);
        this.K.setOnClickListener(new ag(this));
        this.L = (TextView) findViewById(C0000R.id.intcount);
        this.L.setOnClickListener(new ah(this));
        this.A = (UsbManager) getSystemService("usb");
        PendingIntent broadcast = PendingIntent.getBroadcast(this, 0, new Intent("com.appcombo.ch341p.USB_PERMISSION"), 0);
        IntentFilter intentFilter = new IntentFilter("com.appcombo.ch341p.USB_PERMISSION");
        intentFilter.addAction("android.hardware.usb.action.USB_DEVICE_DETACHED");
        registerReceiver(this.s, intentFilter);
        for (UsbDevice next : this.A.getDeviceList().values()) {
            if (a(next) != null) {
                this.A.requestPermission(next, broadcast);
            }
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C0000R.menu.activity_action, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public void onDestroy() {
        unregisterReceiver(this.s);
        a((UsbDevice) null, (UsbInterface) null);
        super.onDestroy();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case C0000R.id.action_warning:
                setContentView(C0000R.layout.warning);
                ((Button) findViewById(C0000R.id.ButtonWarning)).setOnClickListener(new x(this));
                return true;
            case C0000R.id.action_about:
                setContentView(C0000R.layout.wbview);
                WebView webView = (WebView) findViewById(C0000R.id.webview);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.addJavascriptInterface(new WebAppInterface(this), "Android");
                webView.setWebViewClient(new WebViewClient());
                webView.loadUrl(String.valueOf(this.G) + "/index.php");
                return true;
            case C0000R.id.action_exit:
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(menuItem);
        }
    }
}
