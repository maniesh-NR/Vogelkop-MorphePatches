package defpackage;

import android.content.Context;
import android.os.Trace;
import android.util.Pair;
import android.view.Surface;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class xhg implements q4n {
    public h1b a;
    public oj9 b;
    public long c;
    public int d;
    public Executor e;
    public final /* synthetic */ big f;

    public xhg(big bigVar, Context context) {
        this.f = bigVar;
        tym.J(context);
        a1b a1bVar = h1b.b;
        this.a = csh.e;
        this.e = big.q;
    }

    @Override // defpackage.q4n
    public final void a(oj9 oj9Var, long j, int i, List list) {
        z4o.H(false);
        this.a = h1b.s(list);
        this.b = oj9Var;
        nj9 nj9VarA = oj9Var.a();
        ja5 ja5Var = oj9Var.D;
        if (ja5Var == null || !ja5Var.d()) {
            ja5Var = ja5.h;
        }
        nj9VarA.C = ja5Var;
        new oj9(nj9VarA);
        throw null;
    }

    @Override // defpackage.q4n
    public final void b(float f) {
        big bigVar = this.f;
        bigVar.i.c(f);
        bigVar.e.b(f);
    }

    @Override // defpackage.q4n
    public final void c(long j) {
        this.c = j;
    }

    @Override // defpackage.q4n
    public final void d() {
        big bigVar = this.f;
        if (bigVar.o >= -9223372036854775807L) {
            bigVar.e.d();
        }
    }

    @Override // defpackage.q4n
    public final void e(ygd ygdVar) {
        this.e = m97.a;
    }

    @Override // defpackage.q4n
    public final void f(List list) {
        if (this.a.equals(list)) {
            return;
        }
        this.a = h1b.s(list);
        oj9 oj9Var = this.b;
        if (oj9Var == null) {
            return;
        }
        nj9 nj9VarA = oj9Var.a();
        ja5 ja5Var = oj9Var.D;
        if (ja5Var == null || !ja5Var.d()) {
            ja5Var = ja5.h;
        }
        nj9VarA.C = ja5Var;
        new oj9(nj9VarA);
        throw null;
    }

    @Override // defpackage.q4n
    public final boolean g(boolean z) {
        return this.f.e.a.b(false);
    }

    @Override // defpackage.q4n
    public final Surface getInputSurface() {
        z4o.H(false);
        throw null;
    }

    @Override // defpackage.q4n
    public final void h() {
    }

    @Override // defpackage.q4n
    public final void i(Surface surface, zoj zojVar) {
        big bigVar = this.f;
        Pair pair = bigVar.l;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((zoj) bigVar.l.second).equals(zojVar)) {
            return;
        }
        bigVar.l = Pair.create(surface, zojVar);
        int i = zojVar.a;
    }

    @Override // defpackage.q4n
    public final boolean isEnded() {
        return false;
    }

    @Override // defpackage.q4n
    public final boolean isInitialized() {
        return false;
    }

    @Override // defpackage.q4n
    public final void j() {
        big bigVar = this.f;
        if (bigVar.j.U() == 0) {
            bigVar.e.j();
            return;
        }
        i1 i1Var = new i1();
        if (bigVar.j.U() <= 0) {
            bigVar.j = i1Var;
        } else {
            ((aig) bigVar.j.N()).getClass();
            throw null;
        }
    }

    @Override // defpackage.q4n
    public final void k() {
        big bigVar = this.f;
        if (bigVar.d) {
            bigVar.e.k();
        }
    }

    @Override // defpackage.q4n
    public final void l() {
        big bigVar = this.f;
        if (bigVar.d) {
            bigVar.e.l();
        }
    }

    @Override // defpackage.q4n
    public final void m(int i) {
        this.f.e.m(i);
    }

    @Override // defpackage.q4n
    public final void n() {
        int i = zoj.c.a;
        this.f.l = null;
    }

    @Override // defpackage.q4n
    public final boolean o(long j, zgd zgdVar) {
        int i;
        z4o.H(false);
        long j2 = j + this.c;
        big bigVar = this.f;
        b4n b4nVar = bigVar.i;
        long j3 = b4nVar.a == -9223372036854775807L ? -9223372036854775807L : (long) (((j2 - r3) * b4nVar.c) + b4nVar.b);
        if (j3 != -9223372036854775807L) {
            long j4 = bigVar.h;
            if (j4 != -9223372036854775807L && j3 < j4 && (i = this.d) < 2) {
                this.d = i + 1;
                chd chdVar = zgdVar.c;
                jgd jgdVar = zgdVar.a;
                int i2 = zgdVar.b;
                Trace.beginSection("dropVideoBuffer");
                jgdVar.h(i2);
                Trace.endSection();
                chdVar.O0(0, 1);
                return true;
            }
        }
        int i3 = bigVar.p;
        if (i3 == -1 || i3 != 0) {
            return false;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003b  */
    @Override // defpackage.q4n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean p(defpackage.oj9 r10) throws defpackage.p4n {
        /*
            r9 = this;
            java.lang.String r0 = "Color transfer "
            big r9 = r9.f
            byte r1 = r9.n
            r2 = 1
            r3 = 0
            if (r1 != 0) goto Lc
            r1 = r2
            goto Ld
        Lc:
            r1 = r3
        Ld:
            defpackage.z4o.H(r1)
            ja5 r1 = r10.D
            if (r1 == 0) goto L1a
            boolean r4 = r1.d()
            if (r4 != 0) goto L1c
        L1a:
            ja5 r1 = defpackage.ja5.h
        L1c:
            int r1 = r1.c
            java.lang.String r4 = "EGL_EXT_gl_colorspace_bt2020_pq"
            r5 = 33
            r6 = 7
            if (r1 != r6) goto L3b
            int r7 = android.os.Build.VERSION.SDK_INT     // Catch: qy9 -> L8c
            r8 = 34
            if (r7 >= r8) goto L3b
            if (r7 < r5) goto L35
            boolean r7 = defpackage.fr3.P(r4)     // Catch: qy9 -> L8c
            if (r7 == 0) goto L35
            r7 = r2
            goto L36
        L35:
            r7 = r3
        L36:
            if (r7 == 0) goto L3b
            ja5 r10 = new ja5     // Catch: qy9 -> L8c
            goto L76
        L3b:
            r7 = 6
            if (r1 != r7) goto L4a
            int r6 = android.os.Build.VERSION.SDK_INT     // Catch: qy9 -> L8c
            if (r6 < r5) goto L48
            boolean r4 = defpackage.fr3.P(r4)     // Catch: qy9 -> L8c
            if (r4 != 0) goto L52
        L48:
            r2 = r3
            goto L52
        L4a:
            if (r1 != r6) goto L52
            java.lang.String r2 = "EGL_EXT_gl_colorspace_bt2020_hlg"
            boolean r2 = defpackage.fr3.P(r2)     // Catch: qy9 -> L8c
        L52:
            if (r2 == 0) goto L5e
            r0 = 2
            if (r1 == r0) goto L5b
            r0 = 10
            if (r1 != r0) goto L76
        L5b:
            ja5 r10 = defpackage.ja5.h     // Catch: qy9 -> L8c
            goto L76
        L5e:
            java.util.Locale r2 = java.util.Locale.US     // Catch: qy9 -> L8c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: qy9 -> L8c
            r2.<init>(r0)     // Catch: qy9 -> L8c
            r2.append(r1)     // Catch: qy9 -> L8c
            java.lang.String r0 = " is not supported. Falling back to OpenGl tone mapping."
            r2.append(r0)     // Catch: qy9 -> L8c
            java.lang.String r0 = r2.toString()     // Catch: qy9 -> L8c
            defpackage.w7d.K(r0)     // Catch: qy9 -> L8c
            ja5 r10 = defpackage.ja5.h     // Catch: qy9 -> L8c
        L76:
            kzk r10 = r9.f
            android.os.Looper r0 = android.os.Looper.myLooper()
            r0.getClass()
            r1 = 0
            szk r10 = r10.a(r0, r1)
            r9.k = r10
            zhg r9 = r9.b
            r9.a()
            throw r1
        L8c:
            r9 = move-exception
            p4n r0 = new p4n
            r0.<init>(r9, r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xhg.p(oj9):boolean");
    }

    @Override // defpackage.q4n
    public final void q(boolean z) {
        i1 i1Var;
        big bigVar = this.f;
        ay6 ay6Var = bigVar.e;
        if (bigVar.n == 1) {
            bigVar.m++;
            ay6Var.q(z);
            while (true) {
                int iU = bigVar.j.U();
                i1Var = bigVar.j;
                if (iU <= 1) {
                    break;
                } else {
                    i1Var.N();
                }
            }
            if (i1Var.U() == 1) {
                ((aig) bigVar.j.N()).getClass();
                throw null;
            }
            bigVar.o = -9223372036854775807L;
            szk szkVar = bigVar.k;
            szkVar.getClass();
            szkVar.c(new vdf(bigVar, (byte) 27));
        }
    }

    @Override // defpackage.q4n
    public final void r(boolean z) {
        big bigVar = this.f;
        if (bigVar.d) {
            bigVar.e.r(z);
        }
    }

    @Override // defpackage.q4n
    public final void release() {
        big bigVar = this.f;
        if (bigVar.n == 2) {
            return;
        }
        szk szkVar = bigVar.k;
        if (szkVar != null) {
            szkVar.a.removeCallbacksAndMessages(null);
        }
        bigVar.l = null;
        bigVar.n = (byte) 2;
    }

    @Override // defpackage.q4n
    public final void render(long j, long j2) throws p4n {
        this.f.e.render(j + this.c, j2);
    }

    @Override // defpackage.q4n
    public final void s(y3n y3nVar) {
        this.f.e.j = y3nVar;
    }
}
