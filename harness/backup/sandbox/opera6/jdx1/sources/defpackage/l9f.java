package defpackage;

import java.io.InterruptedIOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class l9f implements cn8 {
    public en8 a;
    public dgk b;
    public boolean c;

    @Override // defpackage.cn8
    public final boolean a(dn8 dn8Var) {
        try {
            return e((lp6) dn8Var);
        } catch (s1g unused) {
            return false;
        }
    }

    @Override // defpackage.cn8
    public final int b(dn8 dn8Var, hp2 hp2Var) throws s1g, InterruptedIOException {
        this.a.getClass();
        if (this.b == null) {
            lp6 lp6Var = (lp6) dn8Var;
            if (!e(lp6Var)) {
                throw s1g.d("Failed to determine bitstream type", null);
            }
            lp6Var.f = 0;
        }
        if (!this.c) {
            hyl hylVarTrack = this.a.track(0, 1);
            this.a.endTracks();
            dgk dgkVar = this.b;
            dgkVar.c = this.a;
            dgkVar.b = hylVarTrack;
            dgkVar.d(true);
            this.c = true;
        }
        dgk dgkVar2 = this.b;
        n9f n9fVar = dgkVar2.a;
        g1g g1gVar = (g1g) n9fVar.e;
        dgkVar2.b.getClass();
        String str = tym.a;
        byte b = dgkVar2.h;
        if (b != 0) {
            if (b == 1) {
                ((lp6) dn8Var).h((int) dgkVar2.f, false);
                dgkVar2.h = (byte) 2;
                return 0;
            }
            if (b != 2) {
                if (b == 3) {
                    return -1;
                }
                h9o.e();
                return 0;
            }
            lp6 lp6Var2 = (lp6) dn8Var;
            long jH = dgkVar2.d.h(lp6Var2);
            if (jH >= 0) {
                hp2Var.b = jH;
                return 1;
            }
            if (jH < -1) {
                dgkVar2.a(-(jH + 2));
            }
            if (!dgkVar2.l) {
                twi twiVarCreateSeekMap = dgkVar2.d.createSeekMap();
                twiVarCreateSeekMap.getClass();
                dgkVar2.c.h(twiVarCreateSeekMap);
                dgkVar2.b.e(twiVarCreateSeekMap.getDurationUs());
                dgkVar2.l = true;
            }
            if (dgkVar2.k <= 0 && !n9fVar.b(lp6Var2)) {
                dgkVar2.h = (byte) 3;
                return -1;
            }
            dgkVar2.k = 0L;
            long jB = dgkVar2.b(g1gVar);
            if (jB >= 0) {
                long j = dgkVar2.g;
                if (j + jB >= dgkVar2.e) {
                    dgkVar2.b.f(g1gVar.c, g1gVar);
                    dgkVar2.b.a((j * 1000000) / dgkVar2.i, 1, g1gVar.c, 0, null);
                    dgkVar2.e = -1L;
                }
            }
            dgkVar2.g += jB;
            return 0;
        }
        while (true) {
            lp6 lp6Var3 = (lp6) dn8Var;
            if (!n9fVar.b(lp6Var3)) {
                dgkVar2.h = (byte) 3;
                return -1;
            }
            long j2 = lp6Var3.d;
            long j3 = dgkVar2.f;
            dgkVar2.k = j2 - j3;
            if (!dgkVar2.c(g1gVar, j3, dgkVar2.j)) {
                oj9 oj9Var = (oj9) dgkVar2.j.b;
                dgkVar2.i = oj9Var.G;
                if (!dgkVar2.m) {
                    dgkVar2.b.g(oj9Var);
                    dgkVar2.m = true;
                }
                tr3 tr3Var = (tr3) dgkVar2.j.c;
                if (tr3Var != null) {
                    dgkVar2.d = tr3Var;
                } else {
                    long j4 = ((lp6) dn8Var).c;
                    if (j4 == -1) {
                        dgkVar2.d = new tmj((byte) 2);
                    } else {
                        o9f o9fVar = (o9f) n9fVar.d;
                        dgkVar2.d = new du6(dgkVar2, dgkVar2.f, j4, o9fVar.d + o9fVar.e, o9fVar.b, (o9fVar.a & 4) != 0);
                    }
                }
                dgkVar2.h = (byte) 2;
                byte[] bArr = g1gVar.a;
                if (bArr.length == 65025) {
                    return 0;
                }
                g1gVar.L(Arrays.copyOf(bArr, Math.max(65025, g1gVar.c)), g1gVar.c);
                return 0;
            }
            dgkVar2.f = ((lp6) dn8Var).d;
        }
    }

    @Override // defpackage.cn8
    public final void d(en8 en8Var) {
        this.a = en8Var;
    }

    public final boolean e(lp6 lp6Var) {
        boolean zB;
        o9f o9fVar = new o9f();
        if (o9fVar.a(lp6Var, true) && (o9fVar.a & 2) == 2) {
            int iMin = Math.min(o9fVar.e, 8);
            g1g g1gVar = new g1g(iMin);
            lp6Var.peekFully(g1gVar.a, 0, iMin, false);
            g1gVar.N(0);
            if (g1gVar.a() >= 5 && g1gVar.A() == 127 && g1gVar.C() == 1179402563) {
                this.b = new t69();
                return true;
            }
            g1gVar.N(0);
            try {
                zB = jym.B(1, g1gVar, true);
            } catch (s1g unused) {
                zB = false;
            }
            if (zB) {
                this.b = new icn();
            } else {
                g1gVar.N(0);
                if (zrf.e(g1gVar, zrf.o)) {
                    this.b = new zrf();
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.cn8
    public final void release() {
    }

    @Override // defpackage.cn8
    public final void seek(long j, long j2) {
        dgk dgkVar = this.b;
        if (dgkVar != null) {
            n9f n9fVar = dgkVar.a;
            o9f o9fVar = (o9f) n9fVar.d;
            o9fVar.a = (short) 0;
            o9fVar.b = 0L;
            o9fVar.c = (short) 0;
            o9fVar.d = 0;
            o9fVar.e = 0;
            ((g1g) n9fVar.e).K(0);
            n9fVar.b = -1;
            n9fVar.a = false;
            if (j == 0) {
                dgkVar.d(!dgkVar.l);
                return;
            }
            if (dgkVar.h != 0) {
                long j3 = (dgkVar.i * j2) / 1000000;
                dgkVar.e = j3;
                p9f p9fVar = dgkVar.d;
                String str = tym.a;
                p9fVar.startSeek(j3);
                dgkVar.h = (byte) 2;
            }
        }
    }
}
