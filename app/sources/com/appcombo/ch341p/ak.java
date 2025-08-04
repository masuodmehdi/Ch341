package com.appcombo.ch341p;

import android.hardware.usb.UsbDeviceConnection;
import android.hardware.usb.UsbEndpoint;
import android.hardware.usb.UsbInterface;
import android.hardware.usb.UsbRequest;
import android.widget.Toast;
import java.net.ServerSocket;
import java.util.LinkedList;

public final class ak {
    final am A = new am(this, (byte) 0);
    byte[] B;
    byte C;
    private final int D = 0;
    private final int E = 1;
    private final int F = 2;
    private final int G = 254;
    private final int H = 255;
    private final int I = 0;
    private final int J = 512;
    private final int K = 1024;
    private final int L = 1536;
    private final int M = 2048;
    private double N = 6.0E-14d;
    private final double O = 0.00175d;
    private final double P = -1.678E-5d;
    private final double Q = 298.15d;
    private final double R = -2.94E-5d;
    private final double S = -5.7E-7d;
    private final double T = 4.63E-9d;
    private final double U = 13.4d;
    private final int V = 120;
    private int W = 3;
    private final int X = 1;
    private final int Y = 2;
    private final int Z = 3;
    ServerSocket a = null;
    private final int aA = 11;
    private final int aB = 12;
    private final int aC = 13;
    private final int aD = 32;
    private final int aE = 8;
    private final int aF = 16;
    private final int aG = 4096;
    private final int aH = 1024;
    private final String aI = "WCH CH34x Driver Version V0.1";
    private final int aJ = 200;
    private final int aK = 8;
    private final int aL = 8;
    private final int aM = 32;
    private final int aN = 3;
    private final int aO = 187;
    private final int aP = 59;
    private final int aQ = 32;
    private final int aR = 82;
    private final int aS = 96;
    private final int aT = 2;
    private final int aU = 175;
    private final int aV = 5;
    private final int aW = 80;
    private final int aX = 1;
    private final int aY = 6;
    private final int aZ = 4;
    private final int aa = 4;
    private final int ab = 5;
    private final int ac = 6;
    private final int ad = 7;
    private final int ae = 8;
    private final int af = 9;
    private final int ag = 10;
    private final int ah = 11;
    private final int ai = 12;
    private final int aj = 13;
    private final int ak = 14;
    private final int al = 15;
    private final int am = 16;
    private final int an = 17;
    private final int ao = 18;
    private final int ap = 19;
    private final int aq = 1;
    private final int ar = 2;
    private final int as = 3;
    private final int at = 4;
    private final int au = 5;
    private final int av = 6;
    private final int aw = 7;
    private final int ax = 8;
    private final int ay = 9;
    private final int az = 10;
    Thread b = null;
    private final int bA = 164;
    private final int bB = 165;
    private final int bC = 168;
    private final int bD = 169;
    private final int bE = 170;
    private final int bF = 171;
    private final int bG = 174;
    private final int bH = 0;
    private final int bI = 128;
    private final int bJ = 116;
    private final int bK = 117;
    private final int bL = 128;
    private final int bM = 192;
    private final int bN = 96;
    private final int bO = 64;
    private final int bP = 80;
    private final int bQ = 15;
    private final int bR = 0;
    private final int bS = 0;
    private final int bT = 64;
    private final int bU = 128;
    private final int bV = 192;
    private final int bW = 32;
    private final int bX = 31;
    private final int bY = 255;
    private final int bZ = 149;
    private final int ba = 144;
    private final int bb = 197;
    private final int bc = 200;
    private final int bd = 64;
    private final int be = 192;
    private final int bf = 177;
    private final int bg = 82;
    private final int bh = 83;
    private final int bi = 178;
    private final int bj = 84;
    private final int bk = 94;
    private final int bl = 172;
    private final int bm = 173;
    private final int bn = 166;
    private final int bo = 167;
    private final int bp = 160;
    private final int bq = 161;
    private final int br = 162;
    private final int bs = 163;
    private final int bt = 168;
    private final int bu = 169;
    private final int bv = 170;
    private final int bw = 171;
    private final int bx = 161;
    private final int by = 162;
    private final int bz = 163;
    public String c;
    private final LinkedList cA = new LinkedList();
    private final LinkedList cB = new LinkedList();
    private int cC = 1;
    private int cD = 0;
    private long cE = 0;
    private final byte[] cF;
    private final byte[] cG;
    private final byte[] cH;
    private final int ca = 154;
    private final int cb = 3;
    private final int cc = 195;
    private final int cd = 67;
    private final int ce = 1;
    private final int cf = 3;
    private final int cg = 4;
    private final int ch = 5;
    private final int ci = 6;
    private final int cj = 7;
    private final int ck = 8;
    private final int cl = 9;
    private final int cm = 10;
    private final int cn = 11;
    private final int co = 64;
    private final int cp = 32;
    private final int cq = 4;
    private final int cr = 1;
    private final int cs = 2;
    private final int ct = 4;
    private final int cu = 8;
    private final int cv = 15;
    private final int cw = 1532620800;
    private final int cx = 3;
    private final int cy;
    private String cz;
    int[] d = {-1, -1, -1, -1};
    int[] e = {-1, -1};
    double f;
    double g;
    double h;
    public byte i = 0;
    public byte[] j = new byte[256];
    double[] k = new double[4];
    double[] l = new double[4];
    int m = 120;
    int n = 0;
    int o = 120;
    int p = 0;
    int q;
    final ch341ActivityPlus r;
    final UsbDeviceConnection s;
    final UsbEndpoint t;
    final UsbEndpoint u;
    final UsbEndpoint v;
    final int w;
    final int x;
    final ap y = new ap(this, (byte) 0);
    final an z = new an(this, (byte) 0);

    public ak(ch341ActivityPlus ch341activityplus, UsbDeviceConnection usbDeviceConnection, UsbInterface usbInterface) {
        UsbEndpoint usbEndpoint;
        byte[] bArr = new byte[256];
        bArr[1] = Byte.MIN_VALUE;
        bArr[2] = 64;
        bArr[3] = -64;
        bArr[4] = 32;
        bArr[5] = -96;
        bArr[6] = 96;
        bArr[7] = -32;
        bArr[8] = 16;
        bArr[9] = -112;
        bArr[10] = 80;
        bArr[11] = -48;
        bArr[12] = 48;
        bArr[13] = -80;
        bArr[14] = 112;
        bArr[15] = -16;
        bArr[16] = 8;
        bArr[17] = -120;
        bArr[18] = 72;
        bArr[19] = -56;
        bArr[20] = 40;
        bArr[21] = -88;
        bArr[22] = 104;
        bArr[23] = -24;
        bArr[24] = 24;
        bArr[25] = -104;
        bArr[26] = 88;
        bArr[27] = -40;
        bArr[28] = 56;
        bArr[29] = -72;
        bArr[30] = 120;
        bArr[31] = -8;
        bArr[32] = 4;
        bArr[33] = -124;
        bArr[34] = 68;
        bArr[35] = -60;
        bArr[36] = 36;
        bArr[37] = -92;
        bArr[38] = 100;
        bArr[39] = -28;
        bArr[40] = 20;
        bArr[41] = -108;
        bArr[42] = 84;
        bArr[43] = -44;
        bArr[44] = 52;
        bArr[45] = -76;
        bArr[46] = 116;
        bArr[47] = -12;
        bArr[48] = 12;
        bArr[49] = -116;
        bArr[50] = 76;
        bArr[51] = -52;
        bArr[52] = 44;
        bArr[53] = -84;
        bArr[54] = 108;
        bArr[55] = -20;
        bArr[56] = 28;
        bArr[57] = -100;
        bArr[58] = 92;
        bArr[59] = -36;
        bArr[60] = 60;
        bArr[61] = -68;
        bArr[62] = 124;
        bArr[63] = -4;
        bArr[64] = 2;
        bArr[65] = -126;
        bArr[66] = 66;
        bArr[67] = -62;
        bArr[68] = 34;
        bArr[69] = -94;
        bArr[70] = 98;
        bArr[71] = -30;
        bArr[72] = 18;
        bArr[73] = -110;
        bArr[74] = 82;
        bArr[75] = -46;
        bArr[76] = 50;
        bArr[77] = -78;
        bArr[78] = 114;
        bArr[79] = -14;
        bArr[80] = 10;
        bArr[81] = -118;
        bArr[82] = 74;
        bArr[83] = -54;
        bArr[84] = 42;
        bArr[85] = -86;
        bArr[86] = 106;
        bArr[87] = -22;
        bArr[88] = 26;
        bArr[89] = -102;
        bArr[90] = 90;
        bArr[91] = -38;
        bArr[92] = 58;
        bArr[93] = -70;
        bArr[94] = 122;
        bArr[95] = -6;
        bArr[96] = 6;
        bArr[97] = -122;
        bArr[98] = 70;
        bArr[99] = -58;
        bArr[100] = 38;
        bArr[101] = -90;
        bArr[102] = 102;
        bArr[103] = -26;
        bArr[104] = 22;
        bArr[105] = -106;
        bArr[106] = 86;
        bArr[107] = -42;
        bArr[108] = 54;
        bArr[109] = -74;
        bArr[110] = 118;
        bArr[111] = -10;
        bArr[112] = 14;
        bArr[113] = -114;
        bArr[114] = 78;
        bArr[115] = -50;
        bArr[116] = 46;
        bArr[117] = -82;
        bArr[118] = 110;
        bArr[119] = -18;
        bArr[120] = 30;
        bArr[121] = -98;
        bArr[122] = 94;
        bArr[123] = -34;
        bArr[124] = 62;
        bArr[125] = -66;
        bArr[126] = 126;
        bArr[127] = -2;
        bArr[128] = 1;
        bArr[129] = -127;
        bArr[130] = 65;
        bArr[131] = -63;
        bArr[132] = 33;
        bArr[133] = -95;
        bArr[134] = 97;
        bArr[135] = -31;
        bArr[136] = 17;
        bArr[137] = -111;
        bArr[138] = 81;
        bArr[139] = -47;
        bArr[140] = 49;
        bArr[141] = -79;
        bArr[142] = 113;
        bArr[143] = -15;
        bArr[144] = 9;
        bArr[145] = -119;
        bArr[146] = 73;
        bArr[147] = -55;
        bArr[148] = 41;
        bArr[149] = -87;
        bArr[150] = 105;
        bArr[151] = -23;
        bArr[152] = 25;
        bArr[153] = -103;
        bArr[154] = 89;
        bArr[155] = -39;
        bArr[156] = 57;
        bArr[157] = -71;
        bArr[158] = 121;
        bArr[159] = -7;
        bArr[160] = 5;
        bArr[161] = -123;
        bArr[162] = 69;
        bArr[163] = -59;
        bArr[164] = 37;
        bArr[165] = -91;
        bArr[166] = 101;
        bArr[167] = -27;
        bArr[168] = 21;
        bArr[169] = -107;
        bArr[170] = 85;
        bArr[171] = -43;
        bArr[172] = 53;
        bArr[173] = -75;
        bArr[174] = 117;
        bArr[175] = -11;
        bArr[176] = 13;
        bArr[177] = -115;
        bArr[178] = 77;
        bArr[179] = -51;
        bArr[180] = 45;
        bArr[181] = -83;
        bArr[182] = 109;
        bArr[183] = -19;
        bArr[184] = 29;
        bArr[185] = -99;
        bArr[186] = 93;
        bArr[187] = -35;
        bArr[188] = 61;
        bArr[189] = -67;
        bArr[190] = 125;
        bArr[191] = -3;
        bArr[192] = 3;
        bArr[193] = -125;
        bArr[194] = 67;
        bArr[195] = -61;
        bArr[196] = 35;
        bArr[197] = -93;
        bArr[198] = 99;
        bArr[199] = -29;
        bArr[200] = 19;
        bArr[201] = -109;
        bArr[202] = 83;
        bArr[203] = -45;
        bArr[204] = 51;
        bArr[205] = -77;
        bArr[206] = 115;
        bArr[207] = -13;
        bArr[208] = 11;
        bArr[209] = -117;
        bArr[210] = 75;
        bArr[211] = -53;
        bArr[212] = 43;
        bArr[213] = -85;
        bArr[214] = 107;
        bArr[215] = -21;
        bArr[216] = 27;
        bArr[217] = -101;
        bArr[218] = 91;
        bArr[219] = -37;
        bArr[220] = 59;
        bArr[221] = -69;
        bArr[222] = 123;
        bArr[223] = -5;
        bArr[224] = 7;
        bArr[225] = -121;
        bArr[226] = 71;
        bArr[227] = -57;
        bArr[228] = 39;
        bArr[229] = -89;
        bArr[230] = 103;
        bArr[231] = -25;
        bArr[232] = 23;
        bArr[233] = -105;
        bArr[234] = 87;
        bArr[235] = -41;
        bArr[236] = 55;
        bArr[237] = -73;
        bArr[238] = 119;
        bArr[239] = -9;
        bArr[240] = 15;
        bArr[241] = -113;
        bArr[242] = 79;
        bArr[243] = -49;
        bArr[244] = 47;
        bArr[245] = -81;
        bArr[246] = 111;
        bArr[247] = -17;
        bArr[248] = 31;
        bArr[249] = -97;
        bArr[250] = 95;
        bArr[251] = -33;
        bArr[252] = 63;
        bArr[253] = -65;
        bArr[254] = Byte.MAX_VALUE;
        bArr[255] = -1;
        this.cF = bArr;
        this.B = new byte[10];
        this.C = 0;
        byte[] bArr2 = new byte[256];
        bArr2[1] = -63;
        bArr2[2] = -127;
        bArr2[3] = 64;
        bArr2[4] = 1;
        bArr2[5] = -64;
        bArr2[6] = Byte.MIN_VALUE;
        bArr2[7] = 65;
        bArr2[8] = 1;
        bArr2[9] = -64;
        bArr2[10] = Byte.MIN_VALUE;
        bArr2[11] = 65;
        bArr2[13] = -63;
        bArr2[14] = -127;
        bArr2[15] = 64;
        bArr2[16] = 1;
        bArr2[17] = -64;
        bArr2[18] = Byte.MIN_VALUE;
        bArr2[19] = 65;
        bArr2[21] = -63;
        bArr2[22] = -127;
        bArr2[23] = 64;
        bArr2[25] = -63;
        bArr2[26] = -127;
        bArr2[27] = 64;
        bArr2[28] = 1;
        bArr2[29] = -64;
        bArr2[30] = Byte.MIN_VALUE;
        bArr2[31] = 65;
        bArr2[32] = 1;
        bArr2[33] = -64;
        bArr2[34] = Byte.MIN_VALUE;
        bArr2[35] = 65;
        bArr2[37] = -63;
        bArr2[38] = -127;
        bArr2[39] = 64;
        bArr2[41] = -63;
        bArr2[42] = -127;
        bArr2[43] = 64;
        bArr2[44] = 1;
        bArr2[45] = -64;
        bArr2[46] = Byte.MIN_VALUE;
        bArr2[47] = 65;
        bArr2[49] = -63;
        bArr2[50] = -127;
        bArr2[51] = 64;
        bArr2[52] = 1;
        bArr2[53] = -64;
        bArr2[54] = Byte.MIN_VALUE;
        bArr2[55] = 65;
        bArr2[56] = 1;
        bArr2[57] = -64;
        bArr2[58] = Byte.MIN_VALUE;
        bArr2[59] = 65;
        bArr2[61] = -63;
        bArr2[62] = -127;
        bArr2[63] = 64;
        bArr2[64] = 1;
        bArr2[65] = -64;
        bArr2[66] = Byte.MIN_VALUE;
        bArr2[67] = 65;
        bArr2[69] = -63;
        bArr2[70] = -127;
        bArr2[71] = 64;
        bArr2[73] = -63;
        bArr2[74] = -127;
        bArr2[75] = 64;
        bArr2[76] = 1;
        bArr2[77] = -64;
        bArr2[78] = Byte.MIN_VALUE;
        bArr2[79] = 65;
        bArr2[81] = -63;
        bArr2[82] = -127;
        bArr2[83] = 64;
        bArr2[84] = 1;
        bArr2[85] = -64;
        bArr2[86] = Byte.MIN_VALUE;
        bArr2[87] = 65;
        bArr2[88] = 1;
        bArr2[89] = -64;
        bArr2[90] = Byte.MIN_VALUE;
        bArr2[91] = 65;
        bArr2[93] = -63;
        bArr2[94] = -127;
        bArr2[95] = 64;
        bArr2[97] = -63;
        bArr2[98] = -127;
        bArr2[99] = 64;
        bArr2[100] = 1;
        bArr2[101] = -64;
        bArr2[102] = Byte.MIN_VALUE;
        bArr2[103] = 65;
        bArr2[104] = 1;
        bArr2[105] = -64;
        bArr2[106] = Byte.MIN_VALUE;
        bArr2[107] = 65;
        bArr2[109] = -63;
        bArr2[110] = -127;
        bArr2[111] = 64;
        bArr2[112] = 1;
        bArr2[113] = -64;
        bArr2[114] = Byte.MIN_VALUE;
        bArr2[115] = 65;
        bArr2[117] = -63;
        bArr2[118] = -127;
        bArr2[119] = 64;
        bArr2[121] = -63;
        bArr2[122] = -127;
        bArr2[123] = 64;
        bArr2[124] = 1;
        bArr2[125] = -64;
        bArr2[126] = Byte.MIN_VALUE;
        bArr2[127] = 65;
        bArr2[128] = 1;
        bArr2[129] = -64;
        bArr2[130] = Byte.MIN_VALUE;
        bArr2[131] = 65;
        bArr2[133] = -63;
        bArr2[134] = -127;
        bArr2[135] = 64;
        bArr2[137] = -63;
        bArr2[138] = -127;
        bArr2[139] = 64;
        bArr2[140] = 1;
        bArr2[141] = -64;
        bArr2[142] = Byte.MIN_VALUE;
        bArr2[143] = 65;
        bArr2[145] = -63;
        bArr2[146] = -127;
        bArr2[147] = 64;
        bArr2[148] = 1;
        bArr2[149] = -64;
        bArr2[150] = Byte.MIN_VALUE;
        bArr2[151] = 65;
        bArr2[152] = 1;
        bArr2[153] = -64;
        bArr2[154] = Byte.MIN_VALUE;
        bArr2[155] = 65;
        bArr2[157] = -63;
        bArr2[158] = -127;
        bArr2[159] = 64;
        bArr2[161] = -63;
        bArr2[162] = -127;
        bArr2[163] = 64;
        bArr2[164] = 1;
        bArr2[165] = -64;
        bArr2[166] = Byte.MIN_VALUE;
        bArr2[167] = 65;
        bArr2[168] = 1;
        bArr2[169] = -64;
        bArr2[170] = Byte.MIN_VALUE;
        bArr2[171] = 65;
        bArr2[173] = -63;
        bArr2[174] = -127;
        bArr2[175] = 64;
        bArr2[176] = 1;
        bArr2[177] = -64;
        bArr2[178] = Byte.MIN_VALUE;
        bArr2[179] = 65;
        bArr2[181] = -63;
        bArr2[182] = -127;
        bArr2[183] = 64;
        bArr2[185] = -63;
        bArr2[186] = -127;
        bArr2[187] = 64;
        bArr2[188] = 1;
        bArr2[189] = -64;
        bArr2[190] = Byte.MIN_VALUE;
        bArr2[191] = 65;
        bArr2[193] = -63;
        bArr2[194] = -127;
        bArr2[195] = 64;
        bArr2[196] = 1;
        bArr2[197] = -64;
        bArr2[198] = Byte.MIN_VALUE;
        bArr2[199] = 65;
        bArr2[200] = 1;
        bArr2[201] = -64;
        bArr2[202] = Byte.MIN_VALUE;
        bArr2[203] = 65;
        bArr2[205] = -63;
        bArr2[206] = -127;
        bArr2[207] = 64;
        bArr2[208] = 1;
        bArr2[209] = -64;
        bArr2[210] = Byte.MIN_VALUE;
        bArr2[211] = 65;
        bArr2[213] = -63;
        bArr2[214] = -127;
        bArr2[215] = 64;
        bArr2[217] = -63;
        bArr2[218] = -127;
        bArr2[219] = 64;
        bArr2[220] = 1;
        bArr2[221] = -64;
        bArr2[222] = Byte.MIN_VALUE;
        bArr2[223] = 65;
        bArr2[224] = 1;
        bArr2[225] = -64;
        bArr2[226] = Byte.MIN_VALUE;
        bArr2[227] = 65;
        bArr2[229] = -63;
        bArr2[230] = -127;
        bArr2[231] = 64;
        bArr2[233] = -63;
        bArr2[234] = -127;
        bArr2[235] = 64;
        bArr2[236] = 1;
        bArr2[237] = -64;
        bArr2[238] = Byte.MIN_VALUE;
        bArr2[239] = 65;
        bArr2[241] = -63;
        bArr2[242] = -127;
        bArr2[243] = 64;
        bArr2[244] = 1;
        bArr2[245] = -64;
        bArr2[246] = Byte.MIN_VALUE;
        bArr2[247] = 65;
        bArr2[248] = 1;
        bArr2[249] = -64;
        bArr2[250] = Byte.MIN_VALUE;
        bArr2[251] = 65;
        bArr2[253] = -63;
        bArr2[254] = -127;
        bArr2[255] = 64;
        this.cG = bArr2;
        byte[] bArr3 = new byte[256];
        bArr3[1] = -64;
        bArr3[2] = -63;
        bArr3[3] = 1;
        bArr3[4] = -61;
        bArr3[5] = 3;
        bArr3[6] = 2;
        bArr3[7] = -62;
        bArr3[8] = -58;
        bArr3[9] = 6;
        bArr3[10] = 7;
        bArr3[11] = -57;
        bArr3[12] = 5;
        bArr3[13] = -59;
        bArr3[14] = -60;
        bArr3[15] = 4;
        bArr3[16] = -52;
        bArr3[17] = 12;
        bArr3[18] = 13;
        bArr3[19] = -51;
        bArr3[20] = 15;
        bArr3[21] = -49;
        bArr3[22] = -50;
        bArr3[23] = 14;
        bArr3[24] = 10;
        bArr3[25] = -54;
        bArr3[26] = -53;
        bArr3[27] = 11;
        bArr3[28] = -55;
        bArr3[29] = 9;
        bArr3[30] = 8;
        bArr3[31] = -56;
        bArr3[32] = -40;
        bArr3[33] = 24;
        bArr3[34] = 25;
        bArr3[35] = -39;
        bArr3[36] = 27;
        bArr3[37] = -37;
        bArr3[38] = -38;
        bArr3[39] = 26;
        bArr3[40] = 30;
        bArr3[41] = -34;
        bArr3[42] = -33;
        bArr3[43] = 31;
        bArr3[44] = -35;
        bArr3[45] = 29;
        bArr3[46] = 28;
        bArr3[47] = -36;
        bArr3[48] = 20;
        bArr3[49] = -44;
        bArr3[50] = -43;
        bArr3[51] = 21;
        bArr3[52] = -41;
        bArr3[53] = 23;
        bArr3[54] = 22;
        bArr3[55] = -42;
        bArr3[56] = -46;
        bArr3[57] = 18;
        bArr3[58] = 19;
        bArr3[59] = -45;
        bArr3[60] = 17;
        bArr3[61] = -47;
        bArr3[62] = -48;
        bArr3[63] = 16;
        bArr3[64] = -16;
        bArr3[65] = 48;
        bArr3[66] = 49;
        bArr3[67] = -15;
        bArr3[68] = 51;
        bArr3[69] = -13;
        bArr3[70] = -14;
        bArr3[71] = 50;
        bArr3[72] = 54;
        bArr3[73] = -10;
        bArr3[74] = -9;
        bArr3[75] = 55;
        bArr3[76] = -11;
        bArr3[77] = 53;
        bArr3[78] = 52;
        bArr3[79] = -12;
        bArr3[80] = 60;
        bArr3[81] = -4;
        bArr3[82] = -3;
        bArr3[83] = 61;
        bArr3[84] = -1;
        bArr3[85] = 63;
        bArr3[86] = 62;
        bArr3[87] = -2;
        bArr3[88] = -6;
        bArr3[89] = 58;
        bArr3[90] = 59;
        bArr3[91] = -5;
        bArr3[92] = 57;
        bArr3[93] = -7;
        bArr3[94] = -8;
        bArr3[95] = 56;
        bArr3[96] = 40;
        bArr3[97] = -24;
        bArr3[98] = -23;
        bArr3[99] = 41;
        bArr3[100] = -21;
        bArr3[101] = 43;
        bArr3[102] = 42;
        bArr3[103] = -22;
        bArr3[104] = -18;
        bArr3[105] = 46;
        bArr3[106] = 47;
        bArr3[107] = -17;
        bArr3[108] = 45;
        bArr3[109] = -19;
        bArr3[110] = -20;
        bArr3[111] = 44;
        bArr3[112] = -28;
        bArr3[113] = 36;
        bArr3[114] = 37;
        bArr3[115] = -27;
        bArr3[116] = 39;
        bArr3[117] = -25;
        bArr3[118] = -26;
        bArr3[119] = 38;
        bArr3[120] = 34;
        bArr3[121] = -30;
        bArr3[122] = -29;
        bArr3[123] = 35;
        bArr3[124] = -31;
        bArr3[125] = 33;
        bArr3[126] = 32;
        bArr3[127] = -32;
        bArr3[128] = -96;
        bArr3[129] = 96;
        bArr3[130] = 97;
        bArr3[131] = -95;
        bArr3[132] = 99;
        bArr3[133] = -93;
        bArr3[134] = -94;
        bArr3[135] = 98;
        bArr3[136] = 102;
        bArr3[137] = -90;
        bArr3[138] = -89;
        bArr3[139] = 103;
        bArr3[140] = -91;
        bArr3[141] = 101;
        bArr3[142] = 100;
        bArr3[143] = -92;
        bArr3[144] = 108;
        bArr3[145] = -84;
        bArr3[146] = -83;
        bArr3[147] = 109;
        bArr3[148] = -81;
        bArr3[149] = 111;
        bArr3[150] = 110;
        bArr3[151] = -82;
        bArr3[152] = -86;
        bArr3[153] = 106;
        bArr3[154] = 107;
        bArr3[155] = -85;
        bArr3[156] = 105;
        bArr3[157] = -87;
        bArr3[158] = -88;
        bArr3[159] = 104;
        bArr3[160] = 120;
        bArr3[161] = -72;
        bArr3[162] = -71;
        bArr3[163] = 121;
        bArr3[164] = -69;
        bArr3[165] = 123;
        bArr3[166] = 122;
        bArr3[167] = -70;
        bArr3[168] = -66;
        bArr3[169] = 126;
        bArr3[170] = Byte.MAX_VALUE;
        bArr3[171] = -65;
        bArr3[172] = 125;
        bArr3[173] = -67;
        bArr3[174] = -68;
        bArr3[175] = 124;
        bArr3[176] = -76;
        bArr3[177] = 116;
        bArr3[178] = 117;
        bArr3[179] = -75;
        bArr3[180] = 119;
        bArr3[181] = -73;
        bArr3[182] = -74;
        bArr3[183] = 118;
        bArr3[184] = 114;
        bArr3[185] = -78;
        bArr3[186] = -77;
        bArr3[187] = 115;
        bArr3[188] = -79;
        bArr3[189] = 113;
        bArr3[190] = 112;
        bArr3[191] = -80;
        bArr3[192] = 80;
        bArr3[193] = -112;
        bArr3[194] = -111;
        bArr3[195] = 81;
        bArr3[196] = -109;
        bArr3[197] = 83;
        bArr3[198] = 82;
        bArr3[199] = -110;
        bArr3[200] = -106;
        bArr3[201] = 86;
        bArr3[202] = 87;
        bArr3[203] = -105;
        bArr3[204] = 85;
        bArr3[205] = -107;
        bArr3[206] = -108;
        bArr3[207] = 84;
        bArr3[208] = -100;
        bArr3[209] = 92;
        bArr3[210] = 93;
        bArr3[211] = -99;
        bArr3[212] = 95;
        bArr3[213] = -97;
        bArr3[214] = -98;
        bArr3[215] = 94;
        bArr3[216] = 90;
        bArr3[217] = -102;
        bArr3[218] = -101;
        bArr3[219] = 91;
        bArr3[220] = -103;
        bArr3[221] = 89;
        bArr3[222] = 88;
        bArr3[223] = -104;
        bArr3[224] = -120;
        bArr3[225] = 72;
        bArr3[226] = 73;
        bArr3[227] = -119;
        bArr3[228] = 75;
        bArr3[229] = -117;
        bArr3[230] = -118;
        bArr3[231] = 74;
        bArr3[232] = 78;
        bArr3[233] = -114;
        bArr3[234] = -113;
        bArr3[235] = 79;
        bArr3[236] = -115;
        bArr3[237] = 77;
        bArr3[238] = 76;
        bArr3[239] = -116;
        bArr3[240] = 68;
        bArr3[241] = -124;
        bArr3[242] = -123;
        bArr3[243] = 69;
        bArr3[244] = -121;
        bArr3[245] = 71;
        bArr3[246] = 70;
        bArr3[247] = -122;
        bArr3[248] = -126;
        bArr3[249] = 66;
        bArr3[250] = 67;
        bArr3[251] = -125;
        bArr3[252] = 65;
        bArr3[253] = -127;
        bArr3[254] = Byte.MIN_VALUE;
        bArr3[255] = 64;
        this.cH = bArr3;
        this.r = ch341activityplus;
        this.s = usbDeviceConnection;
        this.cz = usbDeviceConnection.getSerial();
        for (int i2 = 0; i2 < 256; i2++) {
            this.j[i2] = (byte) i2;
        }
        g();
        UsbEndpoint usbEndpoint2 = null;
        UsbEndpoint usbEndpoint3 = null;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        UsbEndpoint usbEndpoint4 = null;
        while (i3 < usbInterface.getEndpointCount()) {
            UsbEndpoint endpoint = usbInterface.getEndpoint(i3);
            if (endpoint.getType() == 2) {
                if (endpoint.getDirection() == 0) {
                    i6 = endpoint.getMaxPacketSize();
                    UsbEndpoint usbEndpoint5 = usbEndpoint3;
                    usbEndpoint = endpoint;
                    endpoint = usbEndpoint5;
                } else {
                    i5 = endpoint.getMaxPacketSize();
                    usbEndpoint = usbEndpoint2;
                }
            } else if (endpoint.getType() != 3) {
                endpoint = usbEndpoint3;
                usbEndpoint = usbEndpoint2;
            } else if (endpoint.getDirection() == 0) {
                endpoint.getMaxPacketSize();
                endpoint = usbEndpoint3;
                usbEndpoint = usbEndpoint2;
            } else {
                i4 = endpoint.getMaxPacketSize();
                usbEndpoint4 = endpoint;
                endpoint = usbEndpoint3;
                usbEndpoint = usbEndpoint2;
            }
            i3++;
            usbEndpoint2 = usbEndpoint;
            usbEndpoint3 = endpoint;
        }
        if (usbEndpoint2 == null || usbEndpoint3 == null) {
            throw new IllegalArgumentException("not all endpoints found");
        }
        this.t = usbEndpoint2;
        this.u = usbEndpoint3;
        this.v = usbEndpoint4;
        this.cy = i6;
        this.w = i5;
        this.x = i4;
        this.b = new Thread(new ao(this));
        if (this.b != null) {
            this.b.start();
        }
    }

    private int a(int i2, byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[1024];
        if (i2 < 8 || i2 > 4104) {
            a(" The length input error");
            return 0;
        }
        int i3 = i2 - 8;
        byte b2 = bArr[i3];
        byte b3 = bArr[i3 + 4];
        if (b2 * b3 > 4096 || b2 == 0 || b3 == 0) {
            return 0;
        }
        if (this.s.bulkTransfer(this.t, bArr, i3, 1000) < 0) {
            return 0;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < b3; i5++) {
            int bulkTransfer = this.s.bulkTransfer(this.u, bArr3, b2, 10000);
            if (bulkTransfer > 0) {
                a(bArr2, i5 * b2, bArr3, 0, bulkTransfer);
                i4 += bulkTransfer;
            }
        }
        return i4;
    }

    static void a(byte[] bArr, int i2, byte[] bArr2, int i3, int i4) {
        System.arraycopy(bArr2, i3, bArr, i2, i4);
    }

    private boolean a(int i2, int i3, byte[] bArr, int i4) {
        byte[] bArr2 = new byte[(this.m + 4)];
        int i5 = 0;
        while (i5 < i4) {
            if (!c()) {
                return false;
            }
            bArr2[0] = 2;
            if (i2 <= 3) {
                bArr2[0] = (byte) (bArr2[0] | ((byte) ((i3 >> 5) & 8)));
                bArr2[1] = (byte) (i3 & 255);
            } else if (i2 <= 7) {
                bArr2[1] = (byte) ((i3 >> 8) & 255);
                bArr2[2] = (byte) (i3 & 255);
            } else if (i2 <= 9) {
                bArr2[1] = (byte) ((i3 >> 8) & 255);
                bArr2[2] = (byte) (i3 & 255);
            } else if (i2 <= 10) {
                bArr2[1] = (byte) ((i3 >> 8) & 255);
                bArr2[2] = (byte) (i3 & 255);
            } else {
                bArr2[1] = (byte) ((i3 >> 16) & 255);
                bArr2[2] = (byte) ((i3 >> 8) & 255);
                bArr2[3] = (byte) (i3 & 255);
            }
            int i6 = this.m > 120 ? 120 : this.m;
            if (i6 > this.m - ((this.m - 1) & i3)) {
                i6 = this.m - ((this.m - 1) & i3);
            }
            int c2 = c(i4 - i5, i6);
            a(bArr2, this.n, bArr, i5, c2);
            if (a(this.n + c2, bArr2) <= 0) {
                return false;
            }
            int i7 = i5 + c2;
            i3 += c2;
            if (!e()) {
                return false;
            }
            i5 = i7;
        }
        return true;
    }

    private boolean a(int i2, byte[] bArr, int i3, byte[] bArr2) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        if (this.q < 32) {
            return false;
        }
        byte[] bArr3 = new byte[4096];
        int i16 = 1;
        bArr3[0] = -86;
        if ((this.W & 3) == 0) {
            bArr3[1] = 74;
            i16 = 3;
            bArr3[2] = 74;
        }
        int i17 = i16 + 1;
        bArr3[i16] = 116;
        if (i2 > 0) {
            i4 = i17;
            int i18 = 0;
            while (i18 < i2) {
                int i19 = 32 - (i4 % 32);
                if (i19 <= 2) {
                    i14 = i4;
                    while (true) {
                        int i20 = i19 - 1;
                        if (i19 <= 0) {
                            break;
                        }
                        bArr3[i14] = 0;
                        i14++;
                        i19 = i20;
                    }
                    i15 = 32;
                } else {
                    i14 = i4;
                    i15 = i19;
                }
                if (i15 >= 32) {
                    bArr3[i14] = -86;
                    i15 = 31;
                    i14++;
                }
                int i21 = (i15 - 1) - 1;
                if (i21 > i2 - i18) {
                    i21 = i2 - i18;
                }
                bArr3[i14] = (byte) (i21 | 128);
                int i22 = i14 + 1;
                int i23 = i18;
                while (true) {
                    int i24 = i21 - 1;
                    if (i21 <= 0) {
                        break;
                    }
                    bArr3[i22] = bArr[i23];
                    i23++;
                    i22++;
                    i21 = i24;
                }
                i18 = i23;
                i4 = i22;
            }
        } else {
            i4 = i17;
        }
        if (i3 > 0) {
            int i25 = 32 - (i4 % 32);
            if (i25 <= 3) {
                int i26 = i25;
                i9 = i4;
                int i27 = i26;
                while (true) {
                    int i28 = i27 - 1;
                    if (i27 <= 0) {
                        break;
                    }
                    bArr3[i9] = 0;
                    i9++;
                    i27 = i28;
                }
                i10 = 32;
            } else {
                int i29 = i25;
                i9 = i4;
                i10 = i29;
            }
            if (i10 >= 32) {
                i11 = i9 + 1;
                bArr3[i9] = -86;
            } else {
                i11 = i9;
            }
            if (i2 > 1) {
                int i30 = i11 + 1;
                bArr3[i11] = 116;
                int i31 = i30 + 1;
                bArr3[i30] = -127;
                i11 = i31 + 1;
                bArr3[i31] = (byte) (bArr[0] | 1);
            } else if (i2 > 0) {
                int i32 = i11 - 1;
                i11 = i32 + 1;
                bArr3[i32] = (byte) (bArr[0] | 1);
            }
            int i33 = 1;
            int i34 = i11;
            while (i33 < i3) {
                int i35 = 32 - (i34 % 32);
                if (i35 <= 1) {
                    if (i35 > 0) {
                        i13 = i34 + 1;
                        bArr3[i34] = 0;
                    } else {
                        i13 = i34;
                    }
                    i34 = i13;
                    i35 = 32;
                }
                if (i35 >= 32) {
                    bArr3[i34] = -86;
                    i34++;
                }
                int i36 = i3 - i33 >= 32 ? 32 : i3 - i33;
                int i37 = i34 + 1;
                bArr3[i34] = (byte) (i36 | 192);
                int i38 = i33 + i36;
                if (i36 >= 32) {
                    bArr3[i37] = 0;
                    i33 = i38;
                    i34 = (32 - (i37 % 32)) + i37;
                } else {
                    i33 = i38;
                    i34 = i37;
                }
            }
            int i39 = 32 - (i34 % 32);
            if (i39 <= 1) {
                if (i39 > 0) {
                    bArr3[i34] = 0;
                    i34++;
                }
                i39 = 32;
            }
            if (i39 >= 32) {
                i12 = i34 + 1;
                bArr3[i34] = -86;
            } else {
                i12 = i34;
            }
            bArr3[i12] = -64;
            i4 = i12 + 1;
        }
        int i40 = 32 - (i4 % 32);
        if (i40 <= 1) {
            if (i40 > 0) {
                bArr3[i4] = 0;
                i4++;
            }
            i5 = i4;
            i6 = 32;
        } else {
            int i41 = i40;
            i5 = i4;
            i6 = i41;
        }
        if (i6 >= 32) {
            i7 = i5 + 1;
            bArr3[i5] = -86;
        } else {
            i7 = i5;
        }
        int i42 = i7 + 1;
        bArr3[i7] = 117;
        int i43 = i42 + 1;
        bArr3[i42] = 0;
        if (i3 > 0) {
            bArr3[i43] = 32;
            bArr3[i43 + 4] = (byte) (((i3 + 32) - 1) / 32);
            i8 = i43 + 8;
        } else {
            i8 = i43;
        }
        if (i3 <= 0) {
            return a(bArr3, i8);
        }
        if (a(i8, bArr3, bArr2) == i3) {
            return true;
        }
        a("Return length is not equal to input length\n");
        return false;
    }

    private boolean a(byte[] bArr, int i2) {
        int i3 = 4096;
        if (i2 <= 4096) {
            i3 = i2;
        }
        if (i3 <= 0) {
            i3 = 0;
        } else {
            this.s.bulkTransfer(this.t, bArr, i3, 100);
        }
        if (i3 != -1) {
            return true;
        }
        a("error in pipe down\n");
        return false;
    }

    private static int c(int i2, int i3) {
        return i2 < i3 ? i2 : i3;
    }

    private boolean c() {
        byte[] bArr = new byte[2];
        bArr[0] = 6;
        return a(1, bArr) > 0;
    }

    private boolean c(int i2) {
        byte[] bArr = new byte[32];
        if (this.q < 32) {
            return false;
        }
        while (i2 > 0) {
            bArr[0] = -86;
            bArr[1] = 85;
            bArr[2] = 0;
            if (!a(bArr, 3)) {
                return false;
            }
            i2 = 0;
        }
        return true;
    }

    private void d(int i2) {
        b(16386, 2, new byte[]{(byte) (i2 >> 8), (byte) (i2 | 255)});
    }

    private boolean d() {
        byte[] bArr = new byte[4];
        if (!c()) {
            return false;
        }
        bArr[0] = 96;
        return a(1, bArr) > 0 && e();
    }

    private boolean e() {
        byte[] bArr = new byte[3];
        do {
            bArr[0] = 5;
            if (a(2, bArr) <= 0) {
                return false;
            }
        } while ((bArr[1] & 1) != 0);
        return true;
    }

    private double f() {
        int i2 = 0;
        while ((a(2) & 128) != 128 && i2 < 10000) {
            i2++;
        }
        if (i2 == 10000) {
            return 0.0d;
        }
        int a2 = a(0);
        if ((a2 >> 15) != 0) {
            this.f = ((double) (-((a2 ^ -1) + 1))) * 1.5625E-7d;
        } else {
            this.f = ((double) a2) * 1.5625E-7d;
        }
        int a3 = a(1);
        if ((a3 >> 15) != 0) {
            this.g = (-0.03125d * ((double) (((a3 ^ -1) >> 2) + 1))) + 273.15d;
        } else {
            this.g = (0.03125d * ((double) (a3 >> 2))) + 273.15d;
        }
        double d2 = this.N * (1.0d + (0.00175d * (this.g - 298.15d)) + (-1.678E-5d * (this.g - 298.15d) * (this.g - 298.15d)));
        double d3 = -2.94E-5d + (-5.7E-7d * (this.g - 298.15d)) + (4.63E-9d * (this.g - 298.15d) * (this.g - 298.15d));
        this.h = Math.sqrt(Math.sqrt(((((this.f - d3) * (13.4d * (this.f - d3))) + (this.f - d3)) / d2) + (this.g * this.g * this.g * this.g)));
        return this.h;
    }

    private void g() {
        if (this.r.a == 1) {
            byte[] bArr = new byte[8];
            this.s.controlTransfer(192, 1, 33924, 0, bArr, 1, 100);
            this.s.controlTransfer(64, 1, 1028, 0, (byte[]) null, 0, 100);
            this.s.controlTransfer(192, 1, 33924, 0, bArr, 1, 100);
            this.s.controlTransfer(192, 1, 33667, 0, bArr, 1, 100);
            this.s.controlTransfer(192, 1, 33924, 0, bArr, 1, 100);
            this.s.controlTransfer(64, 1, 1028, 1, (byte[]) null, 0, 100);
            this.s.controlTransfer(192, 1, 33924, 0, bArr, 1, 100);
            this.s.controlTransfer(192, 1, 33667, 0, bArr, 1, 100);
            this.s.controlTransfer(64, 1, 0, 1, (byte[]) null, 0, 100);
            this.s.controlTransfer(64, 1, 1, 0, (byte[]) null, 0, 100);
            this.s.controlTransfer(64, 1, 2, 68, (byte[]) null, 0, 100);
        } else if (this.r.a == 0) {
            a(115200, 8, 0, 1, false);
        } else if (this.r.a != 3) {
            int i2 = this.r.a;
        }
    }

    /* access modifiers changed from: package-private */
    public final double a() {
        if (this.e[0] != -1) {
            d(29696);
            d(28688);
            a("read cfg: 0x" + Integer.toHexString(a(2)));
            double f2 = f() - 273.15d;
            a("temp006=" + f2);
            return f2;
        } else if (this.d[0] == 32767) {
            return 0.0d;
        } else {
            int b2 = b(7);
            a("read 07: 0x" + Integer.toHexString(b2));
            double d2 = ((((double) b2) * 0.02d) - 0.01d) - 273.15d;
            a("temp90614=" + d2);
            return d2;
        }
    }

    /* access modifiers changed from: package-private */
    public final int a(int i2) {
        byte[] bArr = new byte[4];
        a(i2 | 16384, 2, bArr);
        return (bArr[1] & 255) | (bArr[0] << 8);
    }

    /* access modifiers changed from: package-private */
    public final int a(int i2, byte[] bArr) {
        int i3;
        if (this.q >= 37 && this.q < 48) {
            return 0;
        }
        this.W = 131;
        byte[] bArr2 = new byte[1024];
        if (this.q < 32) {
            a("Not support this device\n");
            return -1;
        }
        byte[] bArr3 = new byte[4100];
        for (int i4 = 0; i4 < 4100; i4++) {
            bArr3[i4] = 0;
        }
        bArr3[0] = -85;
        bArr3[1] = -74;
        bArr3[2] = Byte.MAX_VALUE;
        bArr3[3] = 32;
        int i5 = 32;
        if (i2 > 0) {
            int i6 = 0;
            int i7 = 32;
            while (i6 < i2) {
                int i8 = 31;
                if (31 > i2 - i6) {
                    i8 = i2 - i6;
                }
                int i9 = i7 + 1;
                bArr3[i7] = -88;
                if ((this.W & 128) != 0) {
                    i7 = i9;
                    int i10 = i6;
                    int i11 = i8;
                    i3 = i10;
                    while (true) {
                        int i12 = i11 - 1;
                        if (i11 <= 0) {
                            break;
                        }
                        bArr3[i7] = this.cF[bArr[i3] & 255];
                        i3++;
                        i7++;
                        i11 = i12;
                    }
                } else {
                    int i13 = i9;
                    int i14 = i6;
                    int i15 = i8;
                    int i16 = i14;
                    while (true) {
                        int i17 = i15 - 1;
                        if (i15 <= 0) {
                            break;
                        }
                        bArr3[i7] = bArr[i3];
                        i16 = i3 + 1;
                        i13 = i7 + 1;
                        i15 = i17;
                    }
                }
                if (this.q == 32 && i7 % 32 == 0) {
                    bArr3[i7 + 1] = 0;
                    bArr3[i7] = 0;
                    i7 += 32;
                    i6 = i3;
                } else {
                    i6 = i3;
                }
            }
            i5 = i7;
        }
        bArr3[i5] = 31;
        bArr3[i5 + 4] = (byte) (((i2 + 31) - 1) / 31);
        int a2 = a(i5 + 8, bArr3, bArr);
        bArr2[0] = -85;
        bArr2[1] = -73;
        bArr2[2] = 32;
        if (!a(bArr2, 3)) {
            return 0;
        }
        if (a2 <= 0 || (this.W & 128) == 0) {
            return a2;
        }
        for (int i18 = 0; i18 < i2; i18++) {
            bArr[i18] = this.cF[bArr[i18] & 255];
        }
        return a2;
    }

    /* access modifiers changed from: package-private */
    public final int a(byte[] bArr, int i2, int i3) {
        int i4 = 0;
        byte b2 = -1;
        byte b3 = -1;
        while (true) {
            int i5 = i3 - 1;
            if (i3 <= 0) {
                return (b3 << 8) | b2;
            }
            int i6 = i4 + 1;
            byte b4 = (bArr[i4 + i2] ^ b3) & 255;
            byte b5 = this.cH[b4];
            b3 = (byte) (b2 ^ this.cG[b4]);
            i3 = i5;
            b2 = b5;
            i4 = i6;
        }
    }

    public final UsbRequest a(UsbEndpoint usbEndpoint) {
        UsbRequest usbRequest;
        synchronized (this.cB) {
            if (this.cB.isEmpty()) {
                usbRequest = new UsbRequest();
                usbRequest.initialize(this.s, usbEndpoint);
            } else {
                usbRequest = (UsbRequest) this.cB.removeFirst();
            }
        }
        return usbRequest;
    }

    public final void a(int i2, int i3, int i4, int i5, boolean z2) {
        if (this.r.a != 1 && this.r.a == 0) {
            byte[] bArr = new byte[8];
            this.s.controlTransfer(192, 95, 0, 0, bArr, 2, 1000);
            this.s.controlTransfer(64, 161, 0, 0, (byte[]) null, 0, 1000);
            this.s.controlTransfer(64, 154, 4882, 55682, (byte[]) null, 0, 1000);
            this.s.controlTransfer(64, 154, 3884, 4, (byte[]) null, 0, 1000);
            this.s.controlTransfer(192, 149, 9496, 0, bArr, 2, 1000);
            this.s.controlTransfer(64, 154, 10023, 0, (byte[]) null, 0, 1000);
            this.s.controlTransfer(64, 154, 159, 0, (byte[]) null, 0, 1000);
            char c2 = (char) ((i3 - 5) | 0);
            if (i5 - 1 != 0) {
                c2 = (char) (c2 | 4);
            }
            switch (i4) {
                case 1:
                    c2 = (char) (c2 | 8);
                    break;
                case 2:
                    c2 = (char) (c2 | 24);
                    break;
            }
            char c3 = (char) (c2 | 192);
            if (i2 != 0) {
                long j2 = (long) (1532620800 / i2);
                short s2 = 3;
                while (j2 > 65520 && s2 != 0) {
                    j2 >>= 3;
                    s2 = (short) (s2 - 1);
                }
                if (j2 <= 65520) {
                    this.cE = ((65536 - j2) & 65280) >> 8;
                    this.cD = s2;
                }
            }
            this.s.controlTransfer(64, 161, (c3 << 8) | 156, this.cD | 128 | 0 | ((int) (this.cE << 8)), (byte[]) null, 0, 1000);
            if (z2) {
                this.s.controlTransfer(64, 154, 10023, 257, (byte[]) null, 0, 1000);
            }
        }
    }

    public final void a(UsbRequest usbRequest) {
        synchronized (this.cA) {
            this.cA.add(usbRequest);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(String str) {
        this.r.a(str);
    }

    /* access modifiers changed from: package-private */
    public final boolean a(int i2, int i3) {
        byte[] bArr = new byte[i3];
        if (i2 <= 11) {
            for (int i4 = 0; i4 < i3; i4++) {
                bArr[i4] = -1;
            }
            b(i2, bArr, i3);
            return true;
        } else if (i2 < 12) {
            return true;
        } else {
            d();
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean a(int i2, int i3, byte[] bArr) {
        byte[] bArr2 = new byte[i3];
        byte[] bArr3 = new byte[4];
        int i4 = 0;
        while (i3 > 0) {
            bArr3[0] = (byte) ((i2 >> 7) & 254);
            bArr3[1] = (byte) i2;
            int c2 = c(i3, 1024);
            if (!a(2, bArr3, c2, bArr2)) {
                return false;
            }
            i2 += c2;
            i3 -= c2;
            a(bArr, i4, bArr2, 0, c2);
            i4 += c2;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final boolean a(int i2, byte[] bArr, int i3) {
        if (i2 <= 3) {
            this.p = 2;
            this.o = 8;
        } else if (i2 <= 7) {
            this.p = 3;
            this.o = 32;
        } else if (i2 <= 9) {
            this.p = 3;
            this.o = 64;
        } else if (i2 <= 10) {
            this.p = 3;
            this.o = 128;
        } else {
            this.p = 4;
            this.o = 256;
        }
        byte[] bArr2 = new byte[124];
        int i4 = 0;
        int i5 = 0;
        while (i4 < i3) {
            bArr2[0] = 3;
            if (i2 <= 3) {
                bArr2[0] = (byte) (bArr2[0] | ((i5 >> 5) & 8));
                bArr2[1] = (byte) (i5 & 255);
            } else if (i2 <= 10) {
                bArr2[1] = (byte) ((i5 >> 8) & 255);
                bArr2[2] = (byte) (i5 & 255);
            } else {
                bArr2[1] = (byte) ((i5 >> 16) & 255);
                bArr2[2] = (byte) ((i5 >> 8) & 255);
                bArr2[3] = (byte) (i5 & 255);
            }
            int c2 = c(i3 - i4, 120);
            if (a(this.p + c2, bArr2) <= 0) {
                return false;
            }
            a(bArr, i4, bArr2, this.p, c2);
            i4 += c2;
            i5 += c2;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final int b(int i2) {
        byte[] bArr = new byte[4];
        a(i2 | 23040, 2, bArr);
        return (bArr[0] & 255) | (((bArr[1] & 255) & Byte.MAX_VALUE) << 8);
    }

    public final UsbRequest b() {
        UsbRequest usbRequest;
        synchronized (this.cA) {
            if (this.cA.isEmpty()) {
                usbRequest = new UsbRequest();
                usbRequest.initialize(this.s, this.t);
            } else {
                usbRequest = (UsbRequest) this.cA.removeFirst();
            }
        }
        return usbRequest;
    }

    public final void b(UsbRequest usbRequest) {
        synchronized (this.cB) {
            this.cB.add(usbRequest);
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(String str) {
        this.r.b(str);
    }

    /* access modifiers changed from: package-private */
    public final boolean b(int i2, int i3) {
        byte[] bArr = new byte[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            bArr[i4] = -1;
        }
        d(i2, bArr, i3);
        return true;
    }

    /* access modifiers changed from: package-private */
    public final boolean b(int i2, int i3, byte[] bArr) {
        byte[] bArr2 = new byte[256];
        int i4 = 0;
        int i5 = i3;
        while (i5 > 0) {
            bArr2[0] = (byte) ((i2 >> 7) & 254);
            bArr2[1] = (byte) i2;
            int i6 = 8 - (i2 & 7);
            if (i6 > i5) {
                i6 = i5;
            }
            a(bArr2, 2, bArr, i4, i6);
            if (!a(i6 + 2, bArr2, 0, (byte[]) null)) {
                return false;
            }
            i2 += i6;
            i5 -= i6;
            i4 = i6 + i4;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final boolean b(int i2, byte[] bArr, int i3) {
        boolean z2 = true;
        if (i2 <= 3) {
            this.n = 2;
            this.m = 8;
        } else if (i2 <= 7) {
            this.n = 3;
            this.m = 32;
        } else if (i2 <= 9) {
            this.n = 3;
            this.m = 64;
        } else if (i2 <= 10) {
            this.n = 3;
            this.m = 128;
        } else {
            this.n = 4;
            this.m = 256;
        }
        byte[] bArr2 = new byte[3];
        bArr2[0] = 4;
        if (a(1, bArr2) <= 0) {
            z2 = false;
        } else {
            bArr2[0] = 5;
            if (a(2, bArr2) <= 0) {
                z2 = false;
            } else {
                byte b2 = bArr2[1];
                a("status is:0x" + Integer.toHexString(b2));
                if ((b2 & 60) != 0) {
                    bArr2[0] = 80;
                    if (a(1, bArr2) <= 0) {
                        z2 = false;
                    } else {
                        bArr2[0] = 1;
                        bArr2[1] = (byte) (b2 & -61);
                        if (a(2, bArr2) <= 0) {
                            z2 = false;
                        }
                    }
                }
                bArr2[0] = 5;
                if (a(2, bArr2) <= 0) {
                    z2 = false;
                } else {
                    a("status is:0x" + Integer.toHexString(bArr2[1]));
                }
            }
        }
        if (!z2) {
            Toast.makeText(this.r, "error in flash status\n", 1000).show();
            return false;
        }
        d();
        boolean a2 = a(i2, 0, bArr, i3);
        if (a2) {
            return a2;
        }
        a("error in flash Write\n");
        return false;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0018  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean c(int r12, byte[] r13, int r14) {
        /*
            r11 = this;
            r10 = 128(0x80, float:1.794E-43)
            r9 = 2
            r8 = 5
            r1 = 1
            r0 = 0
            r2 = 1024(0x400, float:1.435E-42)
            byte[] r4 = new byte[r2]
            r2 = 4
            byte[] r5 = new byte[r2]
            if (r12 <= 0) goto L_0x0040
            if (r12 > r8) goto L_0x0040
            r2 = r0
            r3 = r0
        L_0x0013:
            if (r14 > 0) goto L_0x001e
        L_0x0015:
            r2 = r1
        L_0x0016:
            if (r2 != 0) goto L_0x0075
            java.lang.String r1 = "I2C Read Error"
            r11.a((java.lang.String) r1)
        L_0x001d:
            return r0
        L_0x001e:
            int r6 = r3 >> 7
            r6 = r6 & 14
            r6 = r6 | 160(0xa0, float:2.24E-43)
            byte r6 = (byte) r6
            r5[r0] = r6
            byte r6 = (byte) r3
            r5[r1] = r6
            int r6 = c(r14, r10)
            boolean r7 = r11.a((int) r9, (byte[]) r5, (int) r6, (byte[]) r4)
            if (r7 != 0) goto L_0x0036
            r2 = r0
            goto L_0x0016
        L_0x0036:
            int r3 = r3 + r6
            int r14 = r14 - r6
            a((byte[]) r13, (int) r2, (byte[]) r4, (int) r0, (int) r6)
            int r2 = r2 + r6
            r11.c(r8)
            goto L_0x0013
        L_0x0040:
            r2 = 6
            if (r12 < r2) goto L_0x0073
            r2 = 13
            if (r12 > r2) goto L_0x0073
            r2 = r0
            r3 = r0
        L_0x0049:
            if (r14 <= 0) goto L_0x0015
            int r6 = r3 >> 15
            r6 = r6 & 14
            r6 = r6 | 160(0xa0, float:2.24E-43)
            byte r6 = (byte) r6
            r5[r0] = r6
            int r6 = r3 >> 8
            byte r6 = (byte) r6
            r5[r1] = r6
            byte r6 = (byte) r3
            r5[r9] = r6
            int r6 = c(r14, r10)
            r7 = 3
            boolean r7 = r11.a((int) r7, (byte[]) r5, (int) r6, (byte[]) r4)
            if (r7 != 0) goto L_0x0069
            r2 = r0
            goto L_0x0016
        L_0x0069:
            int r3 = r3 + r6
            int r14 = r14 - r6
            a((byte[]) r13, (int) r2, (byte[]) r4, (int) r0, (int) r6)
            int r2 = r2 + r6
            r11.c(r8)
            goto L_0x0049
        L_0x0073:
            r2 = r0
            goto L_0x0016
        L_0x0075:
            r0 = r1
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appcombo.ch341p.ak.c(int, byte[], int):boolean");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0015  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean d(int r13, byte[] r14, int r15) {
        /*
            r12 = this;
            r11 = 3
            r10 = 2
            r9 = 5
            r3 = 1
            r2 = 0
            r0 = 256(0x100, float:3.59E-43)
            byte[] r6 = new byte[r0]
            if (r13 <= 0) goto L_0x004c
            if (r13 > r9) goto L_0x004c
            r4 = r2
            r1 = r15
            r5 = r2
        L_0x0010:
            if (r1 > 0) goto L_0x001c
        L_0x0012:
            r0 = r3
        L_0x0013:
            if (r0 != 0) goto L_0x001b
            java.lang.String r0 = "I2C Write Error"
            r12.a((java.lang.String) r0)
            r0 = r2
        L_0x001b:
            return r0
        L_0x001c:
            int r0 = r5 >> 7
            r0 = r0 & 14
            r0 = r0 | 160(0xa0, float:2.24E-43)
            byte r0 = (byte) r0
            r6[r2] = r0
            byte r0 = (byte) r5
            r6[r3] = r0
            if (r13 < r11) goto L_0x003f
            r0 = r5 & 15
            int r0 = 16 - r0
        L_0x002e:
            if (r0 <= r1) goto L_0x0031
            r0 = r1
        L_0x0031:
            a((byte[]) r6, (int) r10, (byte[]) r14, (int) r4, (int) r0)
            int r7 = r0 + 2
            r8 = 0
            boolean r7 = r12.a((int) r7, (byte[]) r6, (int) r2, (byte[]) r8)
            if (r7 != 0) goto L_0x0044
            r0 = r2
            goto L_0x0013
        L_0x003f:
            r0 = r5 & 7
            int r0 = 8 - r0
            goto L_0x002e
        L_0x0044:
            int r5 = r5 + r0
            int r1 = r1 - r0
            int r0 = r0 + r4
            r12.c(r9)
            r4 = r0
            goto L_0x0010
        L_0x004c:
            r0 = 6
            if (r13 < r0) goto L_0x0098
            r0 = 13
            if (r13 > r0) goto L_0x0098
            r4 = r2
            r1 = r15
            r5 = r2
        L_0x0056:
            if (r1 <= 0) goto L_0x0012
            int r0 = r5 >> 15
            r0 = r0 & 14
            r0 = r0 | 160(0xa0, float:2.24E-43)
            byte r0 = (byte) r0
            r6[r2] = r0
            int r0 = r5 >> 8
            byte r0 = (byte) r0
            r6[r3] = r0
            byte r0 = (byte) r5
            r6[r10] = r0
            r0 = 10
            if (r13 < r0) goto L_0x0082
            r0 = r5 & 127(0x7f, float:1.78E-43)
            int r0 = 128 - r0
        L_0x0071:
            if (r0 <= r1) goto L_0x0074
            r0 = r1
        L_0x0074:
            a((byte[]) r6, (int) r11, (byte[]) r14, (int) r4, (int) r0)
            int r7 = r0 + 3
            r8 = 0
            boolean r7 = r12.a((int) r7, (byte[]) r6, (int) r2, (byte[]) r8)
            if (r7 != 0) goto L_0x0090
            r0 = r2
            goto L_0x0013
        L_0x0082:
            r0 = 8
            if (r13 < r0) goto L_0x008b
            r0 = r5 & 63
            int r0 = 64 - r0
            goto L_0x0071
        L_0x008b:
            r0 = r5 & 31
            int r0 = 32 - r0
            goto L_0x0071
        L_0x0090:
            int r5 = r5 + r0
            int r1 = r1 - r0
            int r0 = r0 + r4
            r12.c(r9)
            r4 = r0
            goto L_0x0056
        L_0x0098:
            r0 = r2
            goto L_0x0013
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appcombo.ch341p.ak.d(int, byte[], int):boolean");
    }
}
