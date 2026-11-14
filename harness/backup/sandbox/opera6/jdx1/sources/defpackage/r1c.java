package defpackage;

import java.util.Collections;

/* loaded from: classes.dex */
public final class r1c implements dx7 {
    public final String a;
    public final int b;
    public final g1g c;
    public final bq4 d;
    public hyl e;
    public String f;
    public oj9 g;
    public byte h;
    public int i;
    public int j;
    public short k;
    public long l;
    public boolean m;
    public int n;
    public int o;
    public int p;
    public boolean q;
    public long r;
    public int s;
    public long t;
    public int u;
    public String v;

    public r1c(String str, int i) {
        this.a = str;
        this.b = i;
        g1g g1gVar = new g1g(1024);
        this.c = g1gVar;
        byte[] bArr = g1gVar.a;
        this.d = new bq4(bArr, bArr.length);
        this.l = -9223372036854775807L;
    }

    /* JADX WARN: Type inference failed for: r1v31, types: [int, short] */
    @Override // defpackage.dx7
    public final void a(g1g g1gVar) throws s1g {
        int i;
        boolean zH;
        this.e.getClass();
        while (g1gVar.a() > 0) {
            byte b = this.h;
            if (b != 0) {
                if (b != 1) {
                    g1g g1gVar2 = this.c;
                    bq4 bq4Var = this.d;
                    if (b == 2) {
                        int iA = ((this.k & (-225)) << 8) | g1gVar.A();
                        this.j = iA;
                        if (iA > g1gVar2.a.length) {
                            g1gVar2.K(iA);
                            byte[] bArr = g1gVar2.a;
                            bq4Var.p(bArr, bArr.length);
                        }
                        this.i = 0;
                        this.h = (byte) 3;
                    } else {
                        if (b != 3) {
                            h9o.e();
                            return;
                        }
                        int iMin = Math.min(g1gVar.a(), this.j - this.i);
                        g1gVar.k(bq4Var.b, this.i, iMin);
                        int i2 = this.i + iMin;
                        this.i = i2;
                        if (i2 == this.j) {
                            bq4Var.q(0);
                            if (bq4Var.h()) {
                                if (this.m) {
                                }
                                this.h = (byte) 0;
                            } else {
                                this.m = true;
                                int i3 = bq4Var.i(1);
                                int i4 = i3 == 1 ? bq4Var.i(1) : 0;
                                this.n = i4;
                                if (i4 != 0) {
                                    throw s1g.d(null, null);
                                }
                                if (i3 == 1) {
                                    bq4Var.i((bq4Var.i(2) + 1) << 3);
                                }
                                if (!bq4Var.h()) {
                                    throw s1g.d(null, null);
                                }
                                this.o = bq4Var.i(6);
                                int i5 = bq4Var.i(4);
                                int i6 = bq4Var.i(3);
                                if (i5 != 0 || i6 != 0) {
                                    throw s1g.d(null, null);
                                }
                                if (i3 == 0) {
                                    int iG = bq4Var.g();
                                    int iB = bq4Var.b();
                                    o1 o1VarD = c26.D(bq4Var, true);
                                    this.v = o1VarD.b;
                                    this.s = o1VarD.c;
                                    this.u = o1VarD.d;
                                    int iB2 = iB - bq4Var.b();
                                    bq4Var.q(iG);
                                    byte[] bArr2 = new byte[(iB2 + 7) / 8];
                                    bq4Var.j(iB2, bArr2);
                                    nj9 nj9Var = new nj9();
                                    nj9Var.a = this.f;
                                    nj9Var.l = dzd.p("video/mp2t");
                                    nj9Var.m = dzd.p("audio/mp4a-latm");
                                    nj9Var.j = this.v;
                                    nj9Var.E = this.u;
                                    nj9Var.F = this.s;
                                    nj9Var.p = Collections.singletonList(bArr2);
                                    nj9Var.d = this.a;
                                    nj9Var.f = this.b;
                                    oj9 oj9Var = new oj9(nj9Var);
                                    if (!oj9Var.equals(this.g)) {
                                        this.g = oj9Var;
                                        this.t = 1024000000 / oj9Var.G;
                                        this.e.g(oj9Var);
                                    }
                                } else {
                                    int iB3 = bq4Var.b();
                                    o1 o1VarD2 = c26.D(bq4Var, true);
                                    this.v = o1VarD2.b;
                                    this.s = o1VarD2.c;
                                    this.u = o1VarD2.d;
                                    bq4Var.t(bq4Var.i((bq4Var.i(2) + 1) << 3) - (iB3 - bq4Var.b()));
                                }
                                int i7 = bq4Var.i(3);
                                this.p = i7;
                                if (i7 == 0) {
                                    bq4Var.t(8);
                                } else if (i7 == 1) {
                                    bq4Var.t(9);
                                } else if (i7 == 3 || i7 == 4 || i7 == 5) {
                                    bq4Var.t(6);
                                } else {
                                    if (i7 != 6 && i7 != 7) {
                                        h9o.e();
                                        return;
                                    }
                                    bq4Var.t(1);
                                }
                                boolean zH2 = bq4Var.h();
                                this.q = zH2;
                                this.r = 0L;
                                if (zH2) {
                                    if (i3 == 1) {
                                        this.r = bq4Var.i((bq4Var.i(2) + 1) << 3);
                                    } else {
                                        do {
                                            zH = bq4Var.h();
                                            this.r = (this.r << 8) + bq4Var.i(8);
                                        } while (zH);
                                    }
                                }
                                if (bq4Var.h()) {
                                    bq4Var.t(8);
                                }
                            }
                            if (this.n != 0) {
                                throw s1g.d(null, null);
                            }
                            if (this.o != 0) {
                                throw s1g.d(null, null);
                            }
                            if (this.p != 0) {
                                throw s1g.d(null, null);
                            }
                            int i8 = 0;
                            do {
                                i = bq4Var.i(8);
                                i8 += i;
                            } while (i == 255);
                            int iG2 = bq4Var.g();
                            if ((iG2 & 7) == 0) {
                                g1gVar2.N(iG2 >> 3);
                            } else {
                                bq4Var.j(i8 << 3, g1gVar2.a);
                                g1gVar2.N(0);
                            }
                            this.e.f(i8, g1gVar2);
                            z4o.H(this.l != -9223372036854775807L);
                            this.e.a(this.l, 1, i8, 0, null);
                            this.l += this.t;
                            if (this.q) {
                                bq4Var.t((int) this.r);
                            }
                            this.h = (byte) 0;
                        } else {
                            continue;
                        }
                    }
                } else {
                    ?? A = g1gVar.A();
                    if ((A & 224) == 224) {
                        this.k = A;
                        this.h = (byte) 2;
                    } else if (A != 86) {
                        this.h = (byte) 0;
                    }
                }
            } else if (g1gVar.A() == 86) {
                this.h = (byte) 1;
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
        this.e = en8Var.track(s7mVar.d, 1);
        s7mVar.b();
        this.f = s7mVar.e;
    }

    @Override // defpackage.dx7
    public final void d(int i, long j) {
        this.l = j;
    }

    @Override // defpackage.dx7
    public final void seek() {
        this.h = (byte) 0;
        this.l = -9223372036854775807L;
        this.m = false;
    }
}
