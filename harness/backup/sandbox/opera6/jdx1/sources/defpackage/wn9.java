package defpackage;

import ads_mobile_sdk.pd;
import android.util.Pair;
import android.util.SparseArray;
import java.math.RoundingMode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.UUID;

/* loaded from: classes.dex */
public final class wn9 implements cn8 {
    public static final byte[] O = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    public static final oj9 P;
    public long A;
    public long B;
    public vn9 C;
    public int D;
    public int E;
    public int F;
    public boolean G;
    public boolean H;
    public en8 I;
    public hyl[] J;
    public hyl[] K;
    public boolean L;
    public boolean M;
    public long N;
    public final tnk a;
    public final int b;
    public final List c;
    public final byte[] h;
    public final g1g i;
    public final pql j;
    public final pr o;
    public final bjg p;
    public final yz4 q;
    public csh r;
    public byte s;
    public int t;
    public long u;
    public int v;
    public g1g w;
    public long x;
    public int y;
    public long z;
    public final c37 k = new c37((byte) 16);
    public final g1g l = new g1g(16);
    public final g1g e = new g1g(qyn.d);
    public final g1g f = new g1g(6);
    public final g1g g = new g1g();
    public final ArrayDeque m = new ArrayDeque();
    public final ArrayDeque n = new ArrayDeque();
    public final SparseArray d = new SparseArray();

    static {
        nj9 nj9Var = new nj9();
        nj9Var.m = dzd.p("application/x-emsg");
        P = new oj9(nj9Var);
    }

    public wn9(tnk tnkVar, int i, pql pqlVar, List list, bjg bjgVar) {
        this.a = tnkVar;
        this.b = i;
        this.j = pqlVar;
        this.c = Collections.unmodifiableList(list);
        this.p = bjgVar;
        byte[] bArr = new byte[16];
        this.h = bArr;
        this.i = new g1g(bArr);
        a1b a1bVar = h1b.b;
        this.r = csh.e;
        this.A = -9223372036854775807L;
        this.z = -9223372036854775807L;
        this.B = -9223372036854775807L;
        this.I = en8.Yo;
        this.J = new hyl[0];
        this.K = new hyl[0];
        this.o = new pr((ouh) new bm8(this, (byte) 16));
        this.q = new yz4((byte) 0);
        this.N = -1L;
    }

    public static vl7 f(ArrayList arrayList) {
        int size = arrayList.size();
        ArrayList arrayList2 = null;
        for (int i = 0; i < size; i++) {
            yae yaeVar = (yae) arrayList.get(i);
            if (yaeVar.b == 1886614376) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                byte[] bArr = yaeVar.c.a;
                nse nseVarS = w8h.s(bArr);
                UUID uuid = nseVarS == null ? null : (UUID) nseVarS.b;
                if (uuid == null) {
                    w7d.K("Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList2.add(new ul7(uuid, null, "video/mp4", bArr));
                }
            }
        }
        if (arrayList2 == null) {
            return null;
        }
        return new vl7(null, false, (ul7[]) arrayList2.toArray(new ul7[0]));
    }

    public static void g(g1g g1gVar, int i, dyl dylVar) throws s1g {
        g1gVar.N(i + 8);
        int iM = g1gVar.m();
        byte[] bArr = yr3.a;
        if ((iM & 1) != 0) {
            throw s1g.h("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (iM & 2) != 0;
        int iE = g1gVar.E();
        if (iE == 0) {
            Arrays.fill(dylVar.l, 0, dylVar.e, false);
            return;
        }
        int i2 = dylVar.e;
        g1g g1gVar2 = dylVar.n;
        if (iE != i2) {
            StringBuilder sbO = p3p.o(iE, "Senc sample count ", " is different from fragment sample count");
            sbO.append(dylVar.e);
            throw s1g.d(sbO.toString(), null);
        }
        Arrays.fill(dylVar.l, 0, iE, z);
        g1gVar2.K(g1gVar.a());
        dylVar.k = true;
        dylVar.o = true;
        g1gVar.k(g1gVar2.a, 0, g1gVar2.c);
        g1gVar2.N(0);
        dylVar.o = false;
    }

    public static Pair h(long j, g1g g1gVar) throws s1g {
        long jG;
        long jG2;
        g1g g1gVar2 = g1gVar;
        g1gVar2.N(8);
        int iE = yr3.e(g1gVar2.m());
        g1gVar2.O(4);
        long jC = g1gVar2.C();
        if (iE == 0) {
            jG = g1gVar2.C();
            jG2 = g1gVar2.C();
        } else {
            jG = g1gVar2.G();
            jG2 = g1gVar2.G();
        }
        long j2 = jG2 + j;
        String str = tym.a;
        long jW = tym.W(jG, 1000000L, jC, RoundingMode.DOWN);
        g1gVar2.O(2);
        int iH = g1gVar2.H();
        int[] iArr = new int[iH];
        long[] jArr = new long[iH];
        long[] jArr2 = new long[iH];
        long[] jArr3 = new long[iH];
        long j3 = j2;
        long j4 = jW;
        int i = 0;
        while (i < iH) {
            int iM = g1gVar2.m();
            if ((Integer.MIN_VALUE & iM) != 0) {
                throw s1g.d("Unhandled indirect reference", null);
            }
            long jC2 = g1gVar2.C();
            iArr[i] = iM & Integer.MAX_VALUE;
            jArr[i] = j3;
            jArr3[i] = j4;
            jG += jC2;
            long[] jArr4 = jArr2;
            long[] jArr5 = jArr3;
            long jW2 = tym.W(jG, 1000000L, jC, RoundingMode.DOWN);
            jArr4[i] = jW2 - jArr5[i];
            g1gVar2.O(4);
            j3 += iArr[i];
            i++;
            iH = iH;
            g1gVar2 = g1gVar;
            j4 = jW2;
            jArr2 = jArr4;
            jArr3 = jArr5;
        }
        return Pair.create(Long.valueOf(jW), new xz4(iArr, jArr, jArr2, jArr3));
    }

    @Override // defpackage.cn8
    public final boolean a(dn8 dn8Var) {
        csh cshVarV;
        vuj vujVarW = wyh.W(dn8Var, true, false);
        if (vujVarW != null) {
            cshVarV = h1b.v(vujVarW);
        } else {
            a1b a1bVar = h1b.b;
            cshVarV = csh.e;
        }
        this.r = cshVarV;
        return vujVarW == null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01e8, code lost:
    
        if (r32.G != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01ea, code lost:
    
        r2 = defpackage.qyn.Q(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01fa, code lost:
    
        if ((r21 + r2) > (r32.D - r32.E)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01fc, code lost:
    
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01ff, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0200, code lost:
    
        r23 = r3;
        r24 = r6;
        ((defpackage.lp6) r33).readFully(r11, r14, r21 + r2, false);
        r15.N(0);
        r3 = r15.m();
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0214, code lost:
    
        if (r3 < 0) goto L500;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0216, code lost:
    
        r32.F = r3 - r2;
        r3 = r32.e;
        r3.N(0);
        r9.f(4, r3);
        r32.E += 4;
        r32.D += r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x022f, code lost:
    
        if (r32.K.length <= 0) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0231, code lost:
    
        if (r2 <= 0) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0233, code lost:
    
        r3 = r11[4];
        r6 = defpackage.qyn.I(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x023d, code lost:
    
        if (java.util.Objects.equals(r6, "video/avc") == false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x023f, code lost:
    
        r19 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0244, code lost:
    
        if ((r3 & 31) == 6) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0247, code lost:
    
        r19 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x024d, code lost:
    
        if (java.util.Objects.equals(r6, "video/hevc") == false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0257, code lost:
    
        if (((r19 & 126) >> 1) != 39) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0259, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x025b, code lost:
    
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x025c, code lost:
    
        r32.H = r6;
        r9.f(r2, r15);
        r32.E += r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0266, code lost:
    
        if (r2 <= 0) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x026a, code lost:
    
        if (r32.G != false) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0270, code lost:
    
        if (defpackage.qyn.L(r11, r2, r8) == false) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0272, code lost:
    
        r32.G = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0275, code lost:
    
        r10 = r21;
        r3 = r23;
        r6 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0284, code lost:
    
        throw defpackage.s1g.d("Invalid NAL length", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0285, code lost:
    
        r23 = r3;
        r24 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x028b, code lost:
    
        if (r32.H == false) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x028d, code lost:
    
        r6 = r32.g;
        r6.K(r2);
        r25 = r11;
        ((defpackage.lp6) r33).readFully(r6.a, 0, r32.F, false);
        r9.f(r32.F, r6);
        r2 = r32.F;
        r3 = defpackage.qyn.m0(r6.a, r6.c);
        r6.N(0);
        r6.M(r3);
        r3 = r8.p;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x02b7, code lost:
    
        if (r3 != (-1)) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x02bb, code lost:
    
        if (r7.a == 0) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x02bd, code lost:
    
        r7.D(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x02c3, code lost:
    
        if (r7.a == r3) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x02c5, code lost:
    
        r7.D(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x02c8, code lost:
    
        r7.b(r4, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x02d3, code lost:
    
        if ((r17.a() & 4) == 0) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x02d5, code lost:
    
        r7.m(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x02da, code lost:
    
        r25 = r11;
        r2 = r9.c(r33, r2, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x02e1, code lost:
    
        r32.E += r2;
        r32.F -= r2;
        r10 = r21;
        r3 = r23;
        r6 = r24;
        r11 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x02f5, code lost:
    
        r23 = r3;
        r24 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x02fa, code lost:
    
        r17 = r2;
        r23 = r3;
        r24 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0300, code lost:
    
        r2 = r32.E;
        r3 = r32.D;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0304, code lost:
    
        if (r2 >= r3) goto L507;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0306, code lost:
    
        r32.E += r9.c(r33, r3 - r2, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0312, code lost:
    
        r1 = r17.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0318, code lost:
    
        if (r32.G != false) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x031a, code lost:
    
        r1 = r1 | 67108864;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x031d, code lost:
    
        r12 = r1;
        r1 = r17.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0322, code lost:
    
        if (r1 == null) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0324, code lost:
    
        r15 = r1.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0328, code lost:
    
        r15 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0329, code lost:
    
        r10 = r4;
        r9.a(r10, r12, r32.D, 0, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0334, code lost:
    
        if (r23.isEmpty() != false) goto L505;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0336, code lost:
    
        r1 = (defpackage.un9) r23.removeFirst();
        r32.y -= r1.c;
        r2 = r1.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0347, code lost:
    
        if (r1.b == false) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0349, code lost:
    
        r2 = r2 + r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x034a, code lost:
    
        r6 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x034c, code lost:
    
        if (r24 == null) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x034e, code lost:
    
        r2 = r6.a(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0352, code lost:
    
        r25 = r2;
        r2 = r32.J;
        r3 = r2.length;
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0358, code lost:
    
        if (r4 >= r3) goto L506;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x035a, code lost:
    
        r2[r4].a(r25, 1, r1.c, r32.y, null);
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x036e, code lost:
    
        r24 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0375, code lost:
    
        if (r17.c() != false) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0377, code lost:
    
        r32.C = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x037a, code lost:
    
        r32.s = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x037f, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x06d0, code lost:
    
        throw defpackage.s1g.h("Atom size less than header length (unsupported).");
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c7, code lost:
    
        r9 = r2.a;
        r5 = r2.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d4, code lost:
    
        if (r32.s != 3) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d8, code lost:
    
        if (r2.m != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00da, code lost:
    
        r10 = r2.d.d[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00e3, code lost:
    
        r10 = r5.h[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00e9, code lost:
    
        r32.D = r10;
        r10 = r2.d.a.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f7, code lost:
    
        if (java.util.Objects.equals(r10.n, "video/avc") == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00fb, code lost:
    
        if ((r4 & 64) == 0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0104, code lost:
    
        if (java.util.Objects.equals(r10.n, "video/hevc") == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0108, code lost:
    
        if ((r4 & androidx.core.app.NotificationCompat.FLAG_HIGH_PRIORITY) == 0) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x010a, code lost:
    
        r4 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x010d, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x010e, code lost:
    
        r32.G = !r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0116, code lost:
    
        if (r2.f >= r2.i) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0118, code lost:
    
        ((defpackage.lp6) r33).h(r32.D, false);
        r1 = r2.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0124, code lost:
    
        if (r1 == null) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0126, code lost:
    
        r3 = r5.n;
        r1 = r1.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x012a, code lost:
    
        if (r1 == 0) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x012c, code lost:
    
        r3.O(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x012f, code lost:
    
        r1 = r2.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0133, code lost:
    
        if (r5.k == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0139, code lost:
    
        if (r5.l[r1] == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x013b, code lost:
    
        r3.O(r3.H() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0147, code lost:
    
        if (r2.c() != false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0149, code lost:
    
        r32.C = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x014c, code lost:
    
        r32.s = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0150, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x015a, code lost:
    
        if (r2.d.a.h != r20) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x015c, code lost:
    
        r32.D -= 8;
        ((defpackage.lp6) r33).h(r21, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x016a, code lost:
    
        r4 = "audio/ac4".equals(r2.d.a.g.n);
        r10 = r32.D;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x017a, code lost:
    
        if (r4 == false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x017c, code lost:
    
        r32.E = r2.d(r10, 7);
        defpackage.ic4.t(r32.D, r8);
        r9.f(7, r8);
        r8 = r32.E + 7;
        r32.E = r8;
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0192, code lost:
    
        r4 = 0;
        r8 = r2.d(r10, 0);
        r32.E = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0199, code lost:
    
        r32.D += r8;
        r32.s = 4;
        r32.F = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01a2, code lost:
    
        r4 = r2.d;
        r8 = r4.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01a8, code lost:
    
        if (r2.m != false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01aa, code lost:
    
        r4 = r4.f[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01b1, code lost:
    
        r4 = r5.i[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01b7, code lost:
    
        if (r6 == null) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01b9, code lost:
    
        r4 = r6.a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01bd, code lost:
    
        r10 = r8.k;
        r8 = r8.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01c1, code lost:
    
        if (r10 == 0) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01c3, code lost:
    
        r15 = r32.f;
        r11 = r15.a;
        r11[0] = 0;
        r11[1] = 0;
        r11[r19] = 0;
        r14 = 4 - r10;
        r17 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01d5, code lost:
    
        r21 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01db, code lost:
    
        if (r32.E >= r32.D) goto L498;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01dd, code lost:
    
        r2 = r32.F;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01df, code lost:
    
        if (r2 != 0) goto L499;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01e4, code lost:
    
        if (r32.K.length > 0) goto L102;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0573 A[LOOP:4: B:242:0x0571->B:243:0x0573, LOOP_END] */
    @Override // defpackage.cn8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b(defpackage.dn8 r33, hp2 r34) throws defpackage.s1g, java.io.InterruptedIOException {
        /*
            Method dump skipped, instructions count: 2250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wn9.b(dn8, hp2):int");
    }

    @Override // defpackage.cn8
    public final List c() {
        return this.r;
    }

    @Override // defpackage.cn8
    public final void d(en8 en8Var) {
        int i;
        int i2 = this.b;
        if ((i2 & 32) == 0) {
            en8Var = new h5k(en8Var, this.a);
        }
        this.I = en8Var;
        e();
        hyl[] hylVarArr = new hyl[2];
        this.J = hylVarArr;
        int i3 = 0;
        bjg bjgVar = this.p;
        if (bjgVar != null) {
            hylVarArr[0] = bjgVar;
            i = 1;
        } else {
            i = 0;
        }
        int i4 = 100;
        if ((i2 & 4) != 0) {
            hylVarArr[i] = this.I.track(100, 5);
            i4 = pd.T0;
            i++;
        }
        hyl[] hylVarArr2 = (hyl[]) tym.P(this.J, i);
        this.J = hylVarArr2;
        for (hyl hylVar : hylVarArr2) {
            hylVar.g(P);
        }
        List list = this.c;
        this.K = new hyl[list.size()];
        while (i3 < this.K.length) {
            hyl hylVarTrack = this.I.track(i4, 3);
            hylVarTrack.g((oj9) list.get(i3));
            this.K[i3] = hylVarTrack;
            i3++;
            i4++;
        }
    }

    public final void e() {
        this.s = (byte) 0;
        this.v = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:338:0x07c4, code lost:
    
        e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x07c7, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(long r56) throws defpackage.s1g {
        /*
            Method dump skipped, instructions count: 1992
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wn9.i(long):void");
    }

    @Override // defpackage.cn8
    public final void release() {
    }

    @Override // defpackage.cn8
    public final void seek(long j, long j2) {
        SparseArray sparseArray = this.d;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            ((vn9) sparseArray.valueAt(i)).e();
        }
        this.n.clear();
        this.y = 0;
        ((PriorityQueue) this.o.e).clear();
        this.z = j2;
        this.m.clear();
        e();
    }
}
