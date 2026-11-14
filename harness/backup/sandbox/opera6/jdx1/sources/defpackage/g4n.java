package defpackage;

import android.os.SystemClock;
import android.os.Trace;

/* loaded from: classes.dex */
public final class g4n {
    public final c37 a;
    public final a4n b;
    public final rr3 c = new rr3();
    public final i1 d = new i1();
    public final i1 e = new i1();
    public final pw7 f;
    public final b4n g;
    public long h;
    public long i;
    public long j;
    public r4n k;
    public long l;

    public g4n(c37 c37Var, a4n a4nVar, b4n b4nVar) {
        this.a = c37Var;
        this.b = a4nVar;
        this.g = b4nVar;
        pw7 pw7Var = new pw7((byte) 1);
        pw7Var.b = 0;
        pw7Var.c = -1;
        pw7Var.d = 0;
        pw7Var.f = new long[16];
        pw7Var.e = 15;
        this.f = pw7Var;
        this.h = -9223372036854775807L;
        this.k = r4n.d;
        this.i = -9223372036854775807L;
        this.j = -9223372036854775807L;
    }

    public final void a(long j, long j2) {
        final c37 c37Var = this.a;
        ay6 ay6Var = (ay6) c37Var.b;
        while (true) {
            pw7 pw7Var = this.f;
            int i = pw7Var.d;
            if (i == 0) {
                return;
            }
            if (i == 0) {
                t3p.y();
                return;
            }
            long j3 = ((long[]) pw7Var.f)[pw7Var.b];
            Long l = (Long) this.e.O(j3);
            a4n a4nVar = this.b;
            if (l != null && l.longValue() != this.l) {
                this.l = l.longValue();
                a4nVar.e(2);
            }
            long j4 = this.l;
            a4n a4nVar2 = this.b;
            rr3 rr3Var = this.c;
            int iA = a4nVar2.a(j3, j, j2, j4, false, false, rr3Var);
            if (iA != 5 && iA != 4) {
                this.g.a(j3, rr3Var.b);
            }
            final byte b = 0;
            if (iA == 0 || iA == 1) {
                this.i = j3;
                boolean z = iA == 0;
                long jD = pw7Var.d();
                r4n r4nVar = (r4n) this.d.O(jD);
                if (r4nVar != null && !r4nVar.equals(r4n.d) && !r4nVar.equals(this.k)) {
                    this.k = r4nVar;
                    nj9 nj9Var = new nj9();
                    nj9Var.t = r4nVar.a;
                    nj9Var.u = r4nVar.b;
                    nj9Var.m = dzd.p("video/raw");
                    c37Var.a = new oj9(nj9Var);
                    ay6Var.i.execute(new fh4(c37Var, r4nVar, (byte) 26));
                }
                long jNanoTime = z ? System.nanoTime() : rr3Var.c;
                b = a4nVar.e == 3 ? (byte) 0 : (byte) 1;
                a4nVar.e = 3;
                a4nVar.l.getClass();
                a4nVar.g = tym.N(SystemClock.elapsedRealtime());
                if (b != 0 && ay6Var.e != null) {
                    ay6Var.i.execute(new Runnable() { // from class: zx6
                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b2 = b;
                            c37 c37Var2 = c37Var;
                            switch (b2) {
                                case 0:
                                    ((ay6) c37Var2.b).h.b();
                                    break;
                                default:
                                    ((ay6) c37Var2.b).h.c();
                                    break;
                            }
                        }
                    });
                }
                oj9 oj9Var = (oj9) c37Var.a;
                ay6Var.j.b(jD, jNanoTime, oj9Var == null ? new oj9(new nj9()) : oj9Var, null);
                zgd zgdVar = (zgd) ay6Var.d.remove();
                zgdVar.c.J0(zgdVar.a, zgdVar.b, jNanoTime);
            } else if (iA == 2 || iA == 3) {
                this.i = j3;
                pw7Var.d();
                ay6Var.i.execute(new Runnable() { // from class: zx6
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b2 = b;
                        c37 c37Var2 = c37Var;
                        switch (b2) {
                            case 0:
                                ((ay6) c37Var2.b).h.b();
                                break;
                            default:
                                ((ay6) c37Var2.b).h.c();
                                break;
                        }
                    }
                });
                zgd zgdVar2 = (zgd) ay6Var.d.remove();
                chd chdVar = zgdVar2.c;
                jgd jgdVar = zgdVar2.a;
                int i2 = zgdVar2.b;
                Trace.beginSection("dropVideoBuffer");
                jgdVar.h(i2);
                Trace.endSection();
                chdVar.O0(0, 1);
            } else {
                if (iA != 4) {
                    if (iA == 5) {
                        return;
                    }
                    qp2.n(String.valueOf(iA));
                    return;
                }
                this.i = j3;
            }
        }
    }
}
