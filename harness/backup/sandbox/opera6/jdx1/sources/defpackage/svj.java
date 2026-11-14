package defpackage;

/* loaded from: classes.dex */
public final class svj {
    public final int a;
    public final int b;
    public final float c;
    public final float d;
    public final float e;
    public final int f;
    public final int g;
    public final int h;
    public final rvj i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public double q;

    public svj(int i, int i2, float f, float f2, int i3, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = f;
        this.d = f2;
        this.e = i / i3;
        this.f = i / 400;
        int i4 = i / 65;
        this.g = i4;
        this.h = i4 << 1;
        this.i = z ? new qvj(this) : new naj(this);
    }

    public final void a(int i, int i2) {
        rvj rvjVar = this.i;
        rvjVar.f(i2);
        Object objM = rvjVar.m();
        int i3 = this.b;
        System.arraycopy(objM, i * i3, rvjVar.n(), this.k * i3, i3 * i2);
        this.k += i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        float f;
        int iJ;
        double d;
        int i;
        int iRound;
        int i2;
        int i3;
        int iRound2;
        int i4;
        int i5;
        long j;
        long j2;
        int i6;
        int i7 = this.k;
        float f2 = this.c;
        float f3 = this.d;
        double d2 = f2 / f3;
        float f4 = this.e * f3;
        int i8 = this.a;
        int i9 = 1;
        rvj rvjVar = this.i;
        int i10 = this.b;
        if (d2 > 1.0000100135803223d || d2 < 0.9999899864196777d) {
            int i11 = this.j;
            int i12 = this.h;
            if (i11 >= i12) {
                int i13 = 0;
                while (true) {
                    int i14 = this.o;
                    if (i14 > 0) {
                        int iMin = Math.min(i12, i14);
                        a(i13, iMin);
                        this.o -= iMin;
                        i13 += iMin;
                        f = f4;
                        d = d2;
                        i2 = i9;
                        i = i12;
                    } else {
                        int i15 = i8 > 4000 ? i8 / 4000 : i9;
                        int i16 = this.g;
                        int i17 = this.f;
                        if (i10 == i9 && i15 == i9) {
                            iJ = rvjVar.e(i13, i17, i16);
                            f = f4;
                        } else {
                            rvjVar.d(i13, i15);
                            f = f4;
                            int iJ2 = rvjVar.j(i17 / i15, i16 / i15);
                            if (i15 != i9) {
                                int i18 = iJ2 * i15;
                                int i19 = i15 << 2;
                                int i20 = i18 - i19;
                                int i21 = i18 + i19;
                                if (i20 >= i17) {
                                    i17 = i20;
                                }
                                if (i21 <= i16) {
                                    i16 = i21;
                                }
                                if (i10 == i9) {
                                    iJ = rvjVar.e(i13, i17, i16);
                                } else {
                                    rvjVar.d(i13, i9);
                                    iJ = rvjVar.j(i17, i16);
                                }
                            } else {
                                iJ = iJ2;
                            }
                        }
                        int i22 = rvjVar.g() ? this.p : iJ;
                        rvjVar.l();
                        this.p = iJ;
                        double d3 = this.q;
                        if (d2 > 1.0d) {
                            if (d2 >= 2.0d) {
                                i3 = i9;
                                double d4 = (i22 / (d2 - 1.0d)) + d3;
                                iRound2 = (int) Math.round(d4);
                                d = d2;
                                this.q = d4 - iRound2;
                                rvjVar = rvjVar;
                            } else {
                                d = d2;
                                i3 = i9;
                                double d5 = (((2.0d - d) * i22) / (d - 1.0d)) + d3;
                                int iRound3 = (int) Math.round(d5);
                                this.o = iRound3;
                                this.q = d5 - iRound3;
                                iRound2 = i22;
                            }
                            rvjVar.f(iRound2);
                            int i23 = i12;
                            int i24 = iRound2;
                            rvjVar.h(i24, this.b, this.k, i13, i13 + i22);
                            this.k += i24;
                            i13 = i22 + i24 + i13;
                            i = i23;
                            i2 = i3;
                        } else {
                            d = d2;
                            int i25 = i9;
                            i = i12;
                            if (d < 0.5d) {
                                double d6 = ((i22 * d) / (1.0d - d)) + d3;
                                iRound = (int) Math.round(d6);
                                this.q = d6 - iRound;
                            } else {
                                double d7 = ((((2.0d * d) - 1.0d) * i22) / (1.0d - d)) + d3;
                                int iRound4 = (int) Math.round(d7);
                                this.o = iRound4;
                                this.q = d7 - iRound4;
                                iRound = i22;
                            }
                            int i26 = i22 + iRound;
                            rvjVar.f(i26);
                            i2 = i25;
                            System.arraycopy(rvjVar.m(), i13 * i10, rvjVar.n(), this.k * i10, i22 * i10);
                            int i27 = i13;
                            rvjVar.h(iRound, this.b, this.k + i22, i22 + i13, i27);
                            this.k += i26;
                            i13 = i27 + iRound;
                        }
                    }
                    if (i13 + i > i11) {
                        break;
                    }
                    i12 = i;
                    f4 = f;
                    i9 = i2;
                    d2 = d;
                }
                int i28 = this.j - i13;
                System.arraycopy(rvjVar.m(), i13 * i10, rvjVar.m(), 0, i28 * i10);
                this.j = i28;
            }
            if (f != 1.0f || this.k == i7) {
            }
            long j3 = (long) (i8 / f);
            long j4 = i8;
            while (j3 != 0 && j4 != 0 && j3 % 2 == 0 && j4 % 2 == 0) {
                j3 /= 2;
                j4 /= 2;
            }
            int i29 = this.k - i7;
            rvjVar.p(i29);
            System.arraycopy(rvjVar.n(), i7 * i10, rvjVar.o(), this.l * i10, i29 * i10);
            this.k = i7;
            this.l += i29;
            int i30 = 0;
            while (true) {
                i4 = this.l - 1;
                if (i30 >= i4) {
                    break;
                }
                while (true) {
                    i5 = this.m + 1;
                    j = i5;
                    long j5 = j * j3;
                    j2 = this.n;
                    i6 = i2;
                    if (j5 <= j2 * j4) {
                        break;
                    }
                    rvjVar.f(i6);
                    rvjVar.k(i30, j4, j3);
                    this.n += i6;
                    this.k += i6;
                }
                this.m = i5;
                if (j == j4) {
                    this.m = 0;
                    z4o.H(j2 == j3 ? i6 : 0);
                    this.n = 0;
                }
                i30++;
                i2 = i6;
            }
            if (i4 != 0) {
                System.arraycopy(rvjVar.o(), i4 * i10, rvjVar.o(), 0, (this.l - i4) * i10);
                this.l -= i4;
                return;
            }
            return;
        }
        a(0, this.j);
        this.j = 0;
        f = f4;
        i2 = 1;
        if (f != 1.0f) {
        }
    }
}
