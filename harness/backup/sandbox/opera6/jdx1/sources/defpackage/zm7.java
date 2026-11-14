package defpackage;

import androidx.core.app.NotificationCompat;
import java.math.RoundingMode;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class zm7 implements dx7 {
    public final g1g a;
    public final String c;
    public final int d;
    public String e;
    public hyl f;
    public int h;
    public int i;
    public long j;
    public oj9 k;
    public int l;
    public int m;
    public byte g = 0;
    public long p = -9223372036854775807L;
    public final AtomicInteger b = new AtomicInteger();
    public int n = -1;
    public int o = -1;

    public zm7(String str, int i, int i2) {
        this.a = new g1g(new byte[i2]);
        this.c = str;
        this.d = i;
    }

    @Override // defpackage.dx7
    public final void a(g1g g1gVar) throws s1g {
        int i;
        byte b;
        int i2;
        byte b2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        long jW;
        int i9;
        long jW2;
        int i10;
        int i11;
        int i12;
        this.f.getClass();
        while (g1gVar.a() > 0) {
            byte b3 = this.g;
            g1g g1gVar2 = this.a;
            switch (b3) {
                case 0:
                    while (true) {
                        if (g1gVar.a() > 0) {
                            int i13 = this.i << 8;
                            this.i = i13;
                            int iA = i13 | g1gVar.A();
                            this.i = iA;
                            int iP = j14.P(iA);
                            this.m = iP;
                            if (iP != 0) {
                                byte[] bArr = g1gVar2.a;
                                int i14 = this.i;
                                bArr[0] = (byte) ((i14 >> 24) & 255);
                                bArr[1] = (byte) ((i14 >> 16) & 255);
                                bArr[2] = (byte) ((i14 >> 8) & 255);
                                bArr[3] = (byte) (i14 & 255);
                                this.h = 4;
                                this.i = 0;
                                if (iP != 3 && iP != 4) {
                                    if (iP == 1) {
                                        this.g = (byte) 1;
                                        break;
                                    } else {
                                        this.g = (byte) 2;
                                        break;
                                    }
                                } else {
                                    this.g = (byte) 4;
                                    break;
                                }
                            }
                        }
                    }
                    break;
                case 1:
                    if (!e(g1gVar, g1gVar2.a, 18)) {
                        break;
                    } else {
                        byte[] bArr2 = g1gVar2.a;
                        if (this.k == null) {
                            String str = this.e;
                            bq4 bq4VarS = j14.S(bArr2);
                            bq4VarS.t(60);
                            int i15 = j14.i[bq4VarS.i(6)];
                            int i16 = j14.j[bq4VarS.i(4)];
                            int i17 = bq4VarS.i(5);
                            int i18 = i17 >= 29 ? -1 : (j14.k[i17] * 1000) / 2;
                            bq4VarS.t(10);
                            int i19 = i15 + (bq4VarS.i(2) > 0 ? 1 : 0);
                            nj9 nj9Var = new nj9();
                            nj9Var.a = str;
                            nj9Var.l = dzd.p("video/mp2t");
                            nj9Var.m = dzd.p("audio/vnd.dts");
                            nj9Var.h = i18;
                            nj9Var.E = i19;
                            nj9Var.F = i16;
                            nj9Var.q = null;
                            nj9Var.d = this.c;
                            nj9Var.f = this.d;
                            oj9 oj9Var = new oj9(nj9Var);
                            this.k = oj9Var;
                            this.f.g(oj9Var);
                        }
                        this.l = j14.O(bArr2);
                        byte b4 = bArr2[0];
                        if (b4 != -2) {
                            if (b4 == -1) {
                                i = (bArr2[4] & 7) << 4;
                                b2 = bArr2[7];
                            } else if (b4 != 31) {
                                i = (bArr2[4] & 1) << 6;
                                b = bArr2[5];
                            } else {
                                i = (bArr2[5] & 7) << 4;
                                b2 = bArr2[6];
                            }
                            i2 = b2 & 60;
                            this.j = sgb.l(tym.U(this.k.G, ((i | (i2 >> 2)) + 1) << 5));
                            g1gVar2.N(0);
                            this.f.f(18, g1gVar2);
                            this.g = (byte) 6;
                            break;
                        } else {
                            i = (bArr2[5] & 1) << 6;
                            b = bArr2[4];
                        }
                        i2 = b & 252;
                        this.j = sgb.l(tym.U(this.k.G, ((i | (i2 >> 2)) + 1) << 5));
                        g1gVar2.N(0);
                        this.f.f(18, g1gVar2);
                        this.g = (byte) 6;
                    }
                case 2:
                    if (e(g1gVar, g1gVar2.a, 7)) {
                        bq4 bq4VarS2 = j14.S(g1gVar2.a);
                        bq4VarS2.t(42);
                        this.n = bq4VarS2.i(bq4VarS2.h() ? 12 : 8) + 1;
                        this.g = (byte) 3;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (e(g1gVar, g1gVar2.a, this.n)) {
                        bq4 bq4VarS3 = j14.S(g1gVar2.a);
                        bq4VarS3.t(40);
                        int i20 = bq4VarS3.i(2);
                        if (bq4VarS3.h()) {
                            i3 = 20;
                            i4 = 12;
                        } else {
                            i3 = 16;
                            i4 = 8;
                        }
                        bq4VarS3.t(i4);
                        int i21 = bq4VarS3.i(i3) + 1;
                        boolean zH = bq4VarS3.h();
                        if (zH) {
                            i6 = bq4VarS3.i(2);
                            int i22 = (bq4VarS3.i(3) + 1) << 9;
                            if (bq4VarS3.h()) {
                                bq4VarS3.t(36);
                            }
                            int i23 = bq4VarS3.i(3) + 1;
                            int i24 = bq4VarS3.i(3) + 1;
                            if (i23 != 1 || i24 != 1) {
                                throw s1g.h("Multiple audio presentations or assets not supported");
                            }
                            int i25 = i20 + 1;
                            int i26 = bq4VarS3.i(i25);
                            for (int i27 = 0; i27 < i25; i27++) {
                                if (((i26 >> i27) & 1) == 1) {
                                    bq4VarS3.t(8);
                                }
                            }
                            if (bq4VarS3.h()) {
                                bq4VarS3.t(2);
                                int i28 = (bq4VarS3.i(2) + 1) << 2;
                                int i29 = bq4VarS3.i(2) + 1;
                                for (int i30 = 0; i30 < i29; i30++) {
                                    bq4VarS3.t(i28);
                                }
                            }
                            i5 = i22;
                        } else {
                            i5 = 0;
                            i6 = -1;
                        }
                        bq4VarS3.t(i3);
                        bq4VarS3.t(12);
                        if (zH) {
                            if (bq4VarS3.h()) {
                                bq4VarS3.t(4);
                            }
                            if (bq4VarS3.h()) {
                                bq4VarS3.t(24);
                            }
                            if (bq4VarS3.h()) {
                                bq4VarS3.u(bq4VarS3.i(10) + 1);
                            }
                            bq4VarS3.t(5);
                            int i31 = j14.l[bq4VarS3.i(4)];
                            i7 = bq4VarS3.i(8) + 1;
                            i8 = i31;
                        } else {
                            i7 = -1;
                            i8 = -2147483647;
                        }
                        if (zH) {
                            if (i6 == 0) {
                                i9 = 32000;
                            } else if (i6 == 1) {
                                i9 = 44100;
                            } else {
                                if (i6 != 2) {
                                    throw s1g.d("Unsupported reference clock code in DTS HD header: " + i6, null);
                                }
                                i9 = 48000;
                            }
                            String str2 = tym.a;
                            jW = tym.W(i5, 1000000L, i9, RoundingMode.DOWN);
                        } else {
                            jW = -9223372036854775807L;
                        }
                        f(new o1("audio/vnd.dts.hd;profile=lbr", i7, i8, i21, jW));
                        this.l = i21;
                        this.j = jW == -9223372036854775807L ? 0L : jW;
                        g1gVar2.N(0);
                        this.f.f(this.n, g1gVar2);
                        this.g = (byte) 6;
                        break;
                    } else {
                        continue;
                    }
                case 4:
                    if (e(g1gVar, g1gVar2.a, 6)) {
                        bq4 bq4VarS4 = j14.S(g1gVar2.a);
                        bq4VarS4.t(32);
                        int iD0 = j14.d0(bq4VarS4, j14.q) + 1;
                        this.o = iD0;
                        int i32 = this.h;
                        if (i32 > iD0) {
                            int i33 = i32 - iD0;
                            this.h = i32 - i33;
                            g1gVar.N(g1gVar.b - i33);
                        }
                        this.g = (byte) 5;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (e(g1gVar, g1gVar2.a, this.o)) {
                        byte[] bArr3 = g1gVar2.a;
                        bq4 bq4VarS5 = j14.S(bArr3);
                        int i34 = bq4VarS5.i(32) == 1078008818 ? 1 : 0;
                        int iD02 = j14.d0(bq4VarS5, j14.m);
                        int i35 = iD02 + 1;
                        if (i34 == 0) {
                            jW2 = -9223372036854775807L;
                            i10 = -2147483647;
                        } else {
                            if (!bq4VarS5.h()) {
                                throw s1g.h("Only supports full channel mask-based audio presentation");
                            }
                            int i36 = iD02 - 1;
                            int i37 = ((bArr3[i36] << 8) & 65535) | (bArr3[iD02] & 255);
                            String str3 = tym.a;
                            int i38 = 65535;
                            for (int i39 = 0; i39 < i36; i39++) {
                                int unsignedInt = Byte.toUnsignedInt(bArr3[i39]);
                                int[] iArr = tym.k;
                                int i40 = (((i38 << 4) & 65535) ^ iArr[(((i38 >> 12) & 255) ^ (unsignedInt >> 4)) & 255]) & 65535;
                                i38 = (((i40 << 4) & 65535) ^ iArr[(((i40 >> 12) & 255) ^ (unsignedInt & 15)) & 255]) & 65535;
                            }
                            if (i37 != i38) {
                                throw s1g.d("CRC check failed", null);
                            }
                            int i41 = bq4VarS5.i(2);
                            if (i41 == 0) {
                                i11 = NotificationCompat.FLAG_GROUP_SUMMARY;
                            } else if (i41 == 1) {
                                i11 = 480;
                            } else {
                                if (i41 != 2) {
                                    throw s1g.d("Unsupported base duration index in DTS UHD header: " + i41, null);
                                }
                                i11 = 384;
                            }
                            int i42 = (bq4VarS5.i(3) + 1) * i11;
                            int i43 = bq4VarS5.i(2);
                            if (i43 == 0) {
                                i12 = 32000;
                            } else if (i43 == 1) {
                                i12 = 44100;
                            } else {
                                if (i43 != 2) {
                                    throw s1g.d("Unsupported clock rate index in DTS UHD header: " + i43, null);
                                }
                                i12 = 48000;
                            }
                            if (bq4VarS5.h()) {
                                bq4VarS5.t(36);
                            }
                            int i44 = i12 * (1 << bq4VarS5.i(2));
                            jW2 = tym.W(i42, 1000000L, i12, RoundingMode.DOWN);
                            i10 = i44;
                        }
                        int iD03 = 0;
                        for (int i45 = 0; i45 < i34; i45++) {
                            iD03 += j14.d0(bq4VarS5, j14.n);
                        }
                        AtomicInteger atomicInteger = this.b;
                        if (i34 != 0) {
                            atomicInteger.set(j14.d0(bq4VarS5, j14.o));
                        }
                        int iD04 = iD03 + (atomicInteger.get() != 0 ? j14.d0(bq4VarS5, j14.p) : 0) + i35;
                        o1 o1Var = new o1("audio/vnd.dts.uhd;profile=p2", 2, i10, iD04, jW2);
                        if (this.m == 3) {
                            f(o1Var);
                        }
                        this.l = iD04;
                        this.j = jW2 == -9223372036854775807L ? 0L : jW2;
                        g1gVar2.N(0);
                        this.f.f(this.o, g1gVar2);
                        this.g = (byte) 6;
                        break;
                    } else {
                        continue;
                    }
                case 6:
                    int iMin = Math.min(g1gVar.a(), this.l - this.h);
                    this.f.f(iMin, g1gVar);
                    int i46 = this.h + iMin;
                    this.h = i46;
                    if (i46 != this.l) {
                        break;
                    } else {
                        z4o.H(this.p != -9223372036854775807L);
                        this.f.a(this.p, this.m == 4 ? 0 : 1, this.l, 0, null);
                        this.p += this.j;
                        this.g = (byte) 0;
                        break;
                    }
                default:
                    h9o.e();
                    return;
            }
        }
    }

    @Override // defpackage.dx7
    public final void b(boolean z) {
    }

    @Override // defpackage.dx7
    public final void c(en8 en8Var, s7m s7mVar) {
        s7mVar.a();
        s7mVar.b();
        this.e = s7mVar.e;
        s7mVar.b();
        this.f = en8Var.track(s7mVar.d, 1);
    }

    @Override // defpackage.dx7
    public final void d(int i, long j) {
        this.p = j;
    }

    public final boolean e(g1g g1gVar, byte[] bArr, int i) {
        int iMin = Math.min(g1gVar.a(), i - this.h);
        g1gVar.k(bArr, this.h, iMin);
        int i2 = this.h + iMin;
        this.h = i2;
        return i2 == i;
    }

    public final void f(o1 o1Var) {
        int i = o1Var.c;
        String str = o1Var.b;
        int i2 = o1Var.d;
        if (i == -2147483647 || i2 == -1) {
            return;
        }
        oj9 oj9Var = this.k;
        if (oj9Var != null && i2 == oj9Var.F && i == oj9Var.G && str.equals(oj9Var.n)) {
            return;
        }
        oj9 oj9Var2 = this.k;
        nj9 nj9Var = oj9Var2 == null ? new nj9() : oj9Var2.a();
        nj9Var.a = this.e;
        nj9Var.l = dzd.p("video/mp2t");
        nj9Var.m = dzd.p(str);
        nj9Var.E = i2;
        nj9Var.F = i;
        nj9Var.d = this.c;
        nj9Var.f = this.d;
        oj9 oj9Var3 = new oj9(nj9Var);
        this.k = oj9Var3;
        this.f.g(oj9Var3);
    }

    @Override // defpackage.dx7
    public final void seek() {
        this.g = (byte) 0;
        this.h = 0;
        this.i = 0;
        this.p = -9223372036854775807L;
        this.b.set(0);
    }
}
