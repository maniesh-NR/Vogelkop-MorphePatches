package defpackage;

import java.io.InterruptedIOException;

/* loaded from: classes.dex */
public final class u9a implements cn8 {
    public en8 b;
    public lp6 c;
    public yv4 d;
    public bbe e;
    public int g;
    public long h;
    public int i;
    public final g1g a = new g1g(16);
    public long j = -1;
    public byte f = 0;

    @Override // defpackage.cn8
    public final boolean a(dn8 dn8Var) {
        return qbe.P((lp6) dn8Var, true);
    }

    @Override // defpackage.cn8
    public final int b(dn8 dn8Var, hp2 hp2Var) throws s1g, InterruptedIOException {
        while (true) {
            byte b = this.f;
            if (b == 0) {
                int i = this.i;
                g1g g1gVar = this.a;
                if (i == 0) {
                    if (!((lp6) dn8Var).readFully(g1gVar.a, 0, 8, true)) {
                        en8 en8Var = this.b;
                        en8Var.getClass();
                        en8Var.endTracks();
                        this.b.h(new rv2(-9223372036854775807L));
                        this.f = (byte) 4;
                        return -1;
                    }
                    this.i = 8;
                    g1gVar.N(0);
                    this.h = g1gVar.C();
                    this.g = g1gVar.m();
                }
                long jG = this.h;
                if (jG == 1) {
                    ((lp6) dn8Var).readFully(g1gVar.a, 8, 8, false);
                    this.i += 8;
                    jG = g1gVar.G();
                    this.h = jG;
                }
                if (this.g == 1836086884) {
                    long j = ((lp6) dn8Var).d;
                    this.j = j;
                    long j2 = this.i;
                    gae gaeVar = new gae(0L, j - j2, -9223372036854775807L, j, jG - j2);
                    en8 en8Var2 = this.b;
                    en8Var2.getClass();
                    hyl hylVarTrack = en8Var2.track(1024, 4);
                    nj9 nj9Var = new nj9();
                    nj9Var.l = dzd.p("image/heic");
                    nj9Var.k = new lxd(gaeVar);
                    z1m.q(nj9Var, hylVarTrack);
                    this.f = (byte) 2;
                } else {
                    this.f = (byte) 1;
                }
            } else if (b == 1) {
                ((lp6) dn8Var).h((int) (this.h - this.i), false);
                this.i = 0;
                this.f = (byte) 0;
            } else {
                if (b != 2) {
                    if (b != 3) {
                        if (b == 4) {
                            return -1;
                        }
                        h9o.e();
                        return 0;
                    }
                    if (this.d == null || dn8Var != this.c) {
                        lp6 lp6Var = (lp6) dn8Var;
                        this.c = lp6Var;
                        this.d = new yv4(lp6Var, this.j);
                    }
                    bbe bbeVar = this.e;
                    bbeVar.getClass();
                    int iB = bbeVar.b(this.d, hp2Var);
                    if (iB == 1) {
                        hp2Var.b += this.j;
                    }
                    return iB;
                }
                if (this.e == null) {
                    this.e = new bbe(tnk.Ap, 8);
                }
                yv4 yv4Var = new yv4((lp6) dn8Var, this.j);
                this.d = yv4Var;
                if (this.e.a(yv4Var)) {
                    bbe bbeVar2 = this.e;
                    long j3 = this.j;
                    en8 en8Var3 = this.b;
                    en8Var3.getClass();
                    bbeVar2.d(new yv4(j3, en8Var3, (byte) 7));
                    this.f = (byte) 3;
                } else {
                    en8 en8Var4 = this.b;
                    en8Var4.getClass();
                    en8Var4.endTracks();
                    this.b.h(new rv2(-9223372036854775807L));
                    this.f = (byte) 4;
                }
            }
        }
    }

    @Override // defpackage.cn8
    public final void d(en8 en8Var) {
        this.b = en8Var;
    }

    @Override // defpackage.cn8
    public final void release() {
        bbe bbeVar = this.e;
        if (bbeVar != null) {
            bbeVar.getClass();
            this.e = null;
        }
    }

    @Override // defpackage.cn8
    public final void seek(long j, long j2) {
        if (j != 0) {
            if (this.f == 3) {
                bbe bbeVar = this.e;
                bbeVar.getClass();
                bbeVar.seek(j, j2);
                return;
            }
            return;
        }
        this.f = (byte) 0;
        this.i = 0;
        this.j = -1L;
        if (this.e != null) {
            this.e = null;
        }
    }
}
