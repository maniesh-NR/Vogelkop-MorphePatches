package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class icn extends dgk {
    public pyl n;
    public int o;
    public boolean p;
    public jcn q;
    public oji r;

    @Override // defpackage.dgk
    public final void a(long j) {
        this.g = j;
        this.p = j != 0;
        jcn jcnVar = this.q;
        this.o = jcnVar != null ? jcnVar.e : 0;
    }

    @Override // defpackage.dgk
    public final long b(g1g g1gVar) {
        byte b = g1gVar.a[0];
        if ((b & 1) == 1) {
            return -1L;
        }
        pyl pylVar = this.n;
        pylVar.getClass();
        boolean z = ((l5b[]) pylVar.f)[(b >> 1) & (255 >>> (8 - pylVar.b))].b;
        jcn jcnVar = (jcn) pylVar.c;
        int i = !z ? jcnVar.e : jcnVar.f;
        long j = this.p ? (this.o + i) / 4 : 0;
        byte[] bArr = g1gVar.a;
        int length = bArr.length;
        int i2 = g1gVar.c + 4;
        if (length < i2) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i2);
            g1gVar.L(bArrCopyOf, bArrCopyOf.length);
        } else {
            g1gVar.M(i2);
        }
        byte[] bArr2 = g1gVar.a;
        int i3 = g1gVar.c;
        bArr2[i3 - 4] = (byte) (j & 255);
        bArr2[i3 - 3] = (byte) ((j >>> 8) & 255);
        bArr2[i3 - 2] = (byte) ((j >>> 16) & 255);
        bArr2[i3 - 1] = (byte) ((j >>> 24) & 255);
        this.p = true;
        this.o = i;
        return j;
    }

    @Override // defpackage.dgk
    public final boolean c(g1g g1gVar, long j, qsh qshVar) throws s1g {
        pyl pylVar;
        jcn jcnVar;
        long jFloor;
        if (this.n != null) {
            ((oj9) qshVar.b).getClass();
            return false;
        }
        jcn jcnVar2 = this.q;
        int i = 4;
        if (jcnVar2 == null) {
            jym.B(1, g1gVar, false);
            g1gVar.s();
            int iA = g1gVar.A();
            int iS = g1gVar.s();
            int iO = g1gVar.o();
            int i2 = iO <= 0 ? -1 : iO;
            int iO2 = g1gVar.o();
            int i3 = iO2 <= 0 ? -1 : iO2;
            g1gVar.o();
            int iA2 = g1gVar.A();
            int iPow = (int) Math.pow(2.0d, iA2 & 15);
            int iPow2 = (int) Math.pow(2.0d, (iA2 & 240) >> 4);
            g1gVar.A();
            this.q = new jcn(iA, iS, i2, i3, iPow, iPow2, Arrays.copyOf(g1gVar.a, g1gVar.c));
        } else {
            oji ojiVar = this.r;
            if (ojiVar == null) {
                this.r = jym.y(g1gVar, true, true);
            } else {
                int i4 = g1gVar.c;
                byte[] bArr = new byte[i4];
                System.arraycopy(g1gVar.a, 0, bArr, 0, i4);
                short s = jcnVar2.a;
                int i5 = 5;
                jym.B(5, g1gVar, false);
                int iA3 = g1gVar.A() + 1;
                bq4 bq4Var = new bq4(g1gVar.a);
                int i6 = 3;
                bq4Var.t(g1gVar.b << 3);
                int i7 = 0;
                while (true) {
                    int i8 = 2;
                    int i9 = i6;
                    int i10 = 16;
                    if (i7 >= iA3) {
                        jcn jcnVar3 = jcnVar2;
                        int i11 = 6;
                        int i12 = bq4Var.i(6) + 1;
                        for (int i13 = 0; i13 < i12; i13++) {
                            if (bq4Var.i(16) != 0) {
                                throw s1g.d("placeholder of time domain transforms not zeroed out", null);
                            }
                        }
                        int i14 = 1;
                        int i15 = bq4Var.i(6) + 1;
                        int i16 = 0;
                        while (i16 < i15) {
                            int i17 = bq4Var.i(i10);
                            if (i17 == 0) {
                                int i18 = 8;
                                bq4Var.t(8);
                                bq4Var.t(16);
                                bq4Var.t(16);
                                bq4Var.t(6);
                                bq4Var.t(8);
                                int i19 = bq4Var.i(4) + 1;
                                int i20 = 0;
                                while (i20 < i19) {
                                    bq4Var.t(i18);
                                    i20++;
                                    i18 = 8;
                                }
                            } else {
                                if (i17 != i14) {
                                    throw s1g.d("floor type greater than 1 not decodable: " + i17, null);
                                }
                                int i21 = bq4Var.i(5);
                                int[] iArr = new int[i21];
                                int i22 = -1;
                                for (int i23 = 0; i23 < i21; i23++) {
                                    int i24 = bq4Var.i(4);
                                    iArr[i23] = i24;
                                    if (i24 > i22) {
                                        i22 = i24;
                                    }
                                }
                                int i25 = i22 + 1;
                                int[] iArr2 = new int[i25];
                                int i26 = 0;
                                while (i26 < i25) {
                                    iArr2[i26] = bq4Var.i(i9) + 1;
                                    int i27 = bq4Var.i(i8);
                                    if (i27 > 0) {
                                        bq4Var.t(8);
                                    }
                                    int i28 = i25;
                                    int i29 = 0;
                                    for (int i30 = 1; i29 < (i30 << i27); i30 = 1) {
                                        bq4Var.t(8);
                                        i29++;
                                    }
                                    i26++;
                                    i25 = i28;
                                    i9 = 3;
                                    i8 = 2;
                                }
                                bq4Var.t(i8);
                                int i31 = bq4Var.i(4);
                                int i32 = 0;
                                int i33 = 0;
                                for (int i34 = 0; i34 < i21; i34++) {
                                    i32 += iArr2[iArr[i34]];
                                    while (i33 < i32) {
                                        bq4Var.t(i31);
                                        i33++;
                                    }
                                }
                            }
                            i16++;
                            i9 = 3;
                            i11 = 6;
                            i14 = 1;
                            i8 = 2;
                            i10 = 16;
                        }
                        int i35 = i11;
                        int i36 = bq4Var.i(i35) + 1;
                        int i37 = 0;
                        while (i37 < i36) {
                            if (bq4Var.i(16) > 2) {
                                throw s1g.d("residueType greater than 2 is not decodable", null);
                            }
                            bq4Var.t(24);
                            bq4Var.t(24);
                            bq4Var.t(24);
                            int i38 = bq4Var.i(i35) + 1;
                            bq4Var.t(8);
                            int[] iArr3 = new int[i38];
                            for (int i39 = 0; i39 < i38; i39++) {
                                iArr3[i39] = ((bq4Var.h() ? bq4Var.i(5) : 0) << 3) + bq4Var.i(3);
                            }
                            for (int i40 = 0; i40 < i38; i40++) {
                                for (int i41 = 0; i41 < 8; i41++) {
                                    if ((iArr3[i40] & (1 << i41)) != 0) {
                                        bq4Var.t(8);
                                    }
                                }
                            }
                            i37++;
                            i35 = 6;
                        }
                        int i42 = bq4Var.i(i35) + 1;
                        for (int i43 = 0; i43 < i42; i43++) {
                            int i44 = bq4Var.i(16);
                            if (i44 != 0) {
                                w7d.q("mapping type other than 0 not supported: " + i44);
                            } else {
                                int i45 = bq4Var.h() ? bq4Var.i(4) + 1 : 1;
                                if (bq4Var.h()) {
                                    int i46 = bq4Var.i(8) + 1;
                                    for (int i47 = 0; i47 < i46; i47++) {
                                        int i48 = s - 1;
                                        int i49 = 0;
                                        for (int i50 = i48; i50 > 0; i50 >>>= 1) {
                                            i49++;
                                        }
                                        bq4Var.t(i49);
                                        int i51 = 0;
                                        while (i48 > 0) {
                                            i51++;
                                            i48 >>>= 1;
                                        }
                                        bq4Var.t(i51);
                                    }
                                }
                                if (bq4Var.i(2) != 0) {
                                    throw s1g.d("to reserved bits must be zero after mapping coupling steps", null);
                                }
                                if (i45 > 1) {
                                    for (int i52 = 0; i52 < s; i52++) {
                                        bq4Var.t(4);
                                    }
                                }
                                for (int i53 = 0; i53 < i45; i53++) {
                                    bq4Var.t(8);
                                    bq4Var.t(8);
                                    bq4Var.t(8);
                                }
                            }
                        }
                        int i54 = bq4Var.i(6);
                        int i55 = i54 + 1;
                        l5b[] l5bVarArr = new l5b[i55];
                        for (int i56 = 0; i56 < i55; i56++) {
                            boolean zH = bq4Var.h();
                            bq4Var.i(16);
                            bq4Var.i(16);
                            bq4Var.i(8);
                            l5bVarArr[i56] = new l5b((byte) 12, zH);
                        }
                        if (!bq4Var.h()) {
                            throw s1g.d("framing bit after modes not set as expected", null);
                        }
                        int i57 = 0;
                        while (i54 > 0) {
                            i57++;
                            i54 >>>= 1;
                        }
                        pylVar = new pyl(jcnVar3, ojiVar, bArr, l5bVarArr, i57);
                    } else {
                        if (bq4Var.i(24) != 5653314) {
                            throw s1g.d("expected code book to start with [0x56, 0x43, 0x42] at " + ((bq4Var.d << 3) + bq4Var.e), null);
                        }
                        int i58 = bq4Var.i(16);
                        int i59 = bq4Var.i(24);
                        if (bq4Var.h()) {
                            bq4Var.t(i5);
                            int i60 = 0;
                            while (i60 < i59) {
                                int i61 = 0;
                                for (int i62 = i59 - i60; i62 > 0; i62 >>>= 1) {
                                    i61++;
                                }
                                i60 += bq4Var.i(i61);
                            }
                        } else {
                            boolean zH2 = bq4Var.h();
                            for (int i63 = 0; i63 < i59; i63++) {
                                if (!zH2) {
                                    bq4Var.t(i5);
                                } else if (bq4Var.h()) {
                                    bq4Var.t(i5);
                                }
                            }
                        }
                        int i64 = bq4Var.i(i);
                        if (i64 > 2) {
                            throw s1g.d("lookup type greater than 2 not decodable: " + i64, null);
                        }
                        if (i64 == 1 || i64 == 2) {
                            bq4Var.t(32);
                            bq4Var.t(32);
                            int i65 = bq4Var.i(i) + 1;
                            bq4Var.t(1);
                            if (i64 == 1) {
                                jcnVar = jcnVar2;
                                jFloor = i58 != 0 ? (long) Math.floor(Math.pow(i59, 1.0d / i58)) : 0L;
                            } else {
                                jcnVar = jcnVar2;
                                jFloor = i58 * i59;
                            }
                            bq4Var.t((int) (jFloor * i65));
                        } else {
                            jcnVar = jcnVar2;
                        }
                        i7++;
                        i6 = i9;
                        jcnVar2 = jcnVar;
                        i = 4;
                        i5 = 5;
                    }
                }
            }
        }
        pylVar = null;
        this.n = pylVar;
        if (pylVar == null) {
            return true;
        }
        jcn jcnVar4 = (jcn) pylVar.c;
        ArrayList arrayList = new ArrayList();
        arrayList.add(jcnVar4.g);
        arrayList.add((byte[]) pylVar.e);
        lxd lxdVarV = jym.v(h1b.t((String[]) ((oji) pylVar.d).a));
        nj9 nj9Var = new nj9();
        nj9Var.l = dzd.p("audio/ogg");
        nj9Var.m = dzd.p("audio/vorbis");
        nj9Var.h = jcnVar4.d;
        nj9Var.i = jcnVar4.c;
        nj9Var.E = jcnVar4.a;
        nj9Var.F = jcnVar4.b;
        nj9Var.p = arrayList;
        nj9Var.k = lxdVarV;
        qshVar.b = new oj9(nj9Var);
        return true;
    }

    @Override // defpackage.dgk
    public final void d(boolean z) {
        super.d(z);
        if (z) {
            this.n = null;
            this.q = null;
            this.r = null;
        }
        this.o = 0;
        this.p = false;
    }
}
