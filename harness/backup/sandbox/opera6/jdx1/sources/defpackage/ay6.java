package defpackage;

import android.view.Surface;
import java.util.ArrayDeque;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class ay6 implements q4n {
    public final a4n a;
    public final b4n b;
    public final g4n c;
    public final ArrayDeque d;
    public Surface e;
    public oj9 f;
    public long g;
    public o4n h;
    public Executor i;
    public y3n j;

    public ay6(a4n a4nVar, b4n b4nVar, kzk kzkVar) {
        this.a = a4nVar;
        this.b = b4nVar;
        a4nVar.l = kzkVar;
        c37 c37Var = new c37();
        c37Var.b = this;
        this.c = new g4n(c37Var, a4nVar, b4nVar);
        this.d = new ArrayDeque();
        this.f = new oj9(new nj9());
        this.g = -9223372036854775807L;
        this.h = o4n.a;
        this.i = new bx1((byte) 1);
        this.j = new yx6();
    }

    @Override // defpackage.q4n
    public final void a(oj9 oj9Var, long j, int i, List list) {
        z4o.H(list.isEmpty());
        int i2 = oj9Var.u;
        int i3 = oj9Var.v;
        oj9 oj9Var2 = this.f;
        int i4 = oj9Var2.u;
        g4n g4nVar = this.c;
        if (i2 != i4 || i3 != oj9Var2.v) {
            i1 i1Var = g4nVar.d;
            long j2 = g4nVar.h;
            i1Var.f(j2 == -9223372036854775807L ? 0L : j2 + 1, new r4n(i2, i3));
        }
        float f = oj9Var.y;
        if (f != this.f.y) {
            this.a.f(f);
        }
        this.f = oj9Var;
        if (j != this.g) {
            if (g4nVar.f.d == 0) {
                g4nVar.b.e(i);
                g4nVar.l = j;
            } else {
                i1 i1Var2 = g4nVar.e;
                long j3 = g4nVar.h;
                i1Var2.f(j3 == -9223372036854775807L ? -4611686018427387904L : j3 + 1, Long.valueOf(j));
            }
            this.g = j;
        }
    }

    @Override // defpackage.q4n
    public final void b(float f) {
        this.a.h(f);
    }

    @Override // defpackage.q4n
    public final void c(long j) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.q4n
    public final void d() {
        g4n g4nVar = this.c;
        long j = g4nVar.h;
        if (j == -9223372036854775807L) {
            j = Long.MIN_VALUE;
            g4nVar.h = Long.MIN_VALUE;
            g4nVar.i = Long.MIN_VALUE;
        }
        g4nVar.j = j;
    }

    @Override // defpackage.q4n
    public final void e(ygd ygdVar) {
        this.h = ygdVar;
        this.i = m97.a;
    }

    @Override // defpackage.q4n
    public final void f(List list) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.q4n
    public final boolean g(boolean z) {
        return this.a.b(z);
    }

    @Override // defpackage.q4n
    public final Surface getInputSurface() {
        Surface surface = this.e;
        surface.getClass();
        return surface;
    }

    @Override // defpackage.q4n
    public final void h() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.q4n
    public final void i(Surface surface, zoj zojVar) {
        this.e = surface;
        this.a.g(surface);
    }

    @Override // defpackage.q4n
    public final boolean isEnded() {
        g4n g4nVar = this.c;
        long j = g4nVar.j;
        return j != -9223372036854775807L && g4nVar.i == j;
    }

    @Override // defpackage.q4n
    public final boolean isInitialized() {
        return true;
    }

    @Override // defpackage.q4n
    public final void j() {
        a4n a4nVar = this.a;
        if (a4nVar.e == 0) {
            a4nVar.e = 1;
        }
    }

    @Override // defpackage.q4n
    public final void k() {
        this.b.b();
        a4n a4nVar = this.a;
        a4nVar.d = false;
        a4nVar.i = -9223372036854775807L;
        f4n f4nVar = a4nVar.b;
        f4nVar.d = false;
        c4n c4nVar = f4nVar.c;
        if (c4nVar != null) {
            c4nVar.b();
        }
        f4nVar.a();
    }

    @Override // defpackage.q4n
    public final void l() {
        this.b.b();
        this.a.d();
    }

    @Override // defpackage.q4n
    public final void m(int i) {
        f4n f4nVar = this.a.b;
        if (f4nVar.j == i) {
            return;
        }
        f4nVar.j = i;
        f4nVar.d(true);
    }

    @Override // defpackage.q4n
    public final void n() {
        this.e = null;
        this.a.g(null);
    }

    @Override // defpackage.q4n
    public final boolean o(long j, zgd zgdVar) {
        this.d.add(zgdVar);
        g4n g4nVar = this.c;
        pw7 pw7Var = g4nVar.f;
        int i = pw7Var.d;
        long[] jArr = (long[]) pw7Var.f;
        if (i == jArr.length) {
            int length = jArr.length << 1;
            if (length < 0) {
                h9o.e();
                return false;
            }
            long[] jArr2 = new long[length];
            int length2 = jArr.length;
            int i2 = pw7Var.b;
            int i3 = length2 - i2;
            System.arraycopy(jArr, i2, jArr2, 0, i3);
            System.arraycopy((long[]) pw7Var.f, 0, jArr2, i3, i2);
            pw7Var.b = 0;
            int i4 = pw7Var.d;
            pw7Var.c = i4 - 1;
            pw7Var.f = jArr2;
            pw7Var.e = length - 1;
            i = i4;
            jArr = jArr2;
        }
        int i5 = (pw7Var.c + 1) & pw7Var.e;
        pw7Var.c = i5;
        jArr[i5] = j;
        pw7Var.d = i + 1;
        g4nVar.h = j;
        g4nVar.j = -9223372036854775807L;
        this.i.execute(new bl6(this, (byte) 13));
        return true;
    }

    @Override // defpackage.q4n
    public final boolean p(oj9 oj9Var) {
        return true;
    }

    @Override // defpackage.q4n
    public final void q(boolean z) {
        if (z) {
            a4n a4nVar = this.a;
            a4nVar.b.b();
            a4nVar.h = -9223372036854775807L;
            a4nVar.f = -9223372036854775807L;
            a4nVar.e = Math.min(a4nVar.e, 1);
            a4nVar.i = -9223372036854775807L;
        }
        this.b.b();
        g4n g4nVar = this.c;
        i1 i1Var = g4nVar.d;
        pw7 pw7Var = g4nVar.f;
        pw7Var.b = 0;
        pw7Var.c = -1;
        pw7Var.d = 0;
        g4nVar.h = -9223372036854775807L;
        g4nVar.i = -9223372036854775807L;
        g4nVar.j = -9223372036854775807L;
        i1 i1Var2 = g4nVar.e;
        if (i1Var2.U() > 0) {
            z4o.w(i1Var2.U() > 0);
            while (i1Var2.U() > 1) {
                i1Var2.N();
            }
            Object objN = i1Var2.N();
            objN.getClass();
            g4nVar.l = ((Long) objN).longValue();
        }
        if (i1Var.U() > 0) {
            z4o.w(i1Var.U() > 0);
            while (i1Var.U() > 1) {
                i1Var.N();
            }
            Object objN2 = i1Var.N();
            objN2.getClass();
            i1Var.f(0L, (r4n) objN2);
        }
        this.d.clear();
    }

    @Override // defpackage.q4n
    public final void r(boolean z) {
        this.a.c(z);
    }

    @Override // defpackage.q4n
    public final void release() {
    }

    @Override // defpackage.q4n
    public final void render(long j, long j2) throws p4n {
        try {
            this.c.a(j, j2);
        } catch (zh8 e) {
            throw new p4n(e, this.f);
        }
    }

    @Override // defpackage.q4n
    public final void s(y3n y3nVar) {
        this.j = y3nVar;
    }
}
