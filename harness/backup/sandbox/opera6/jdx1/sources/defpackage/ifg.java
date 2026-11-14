package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public abstract class ifg {
    public int a;
    public int b;
    public long c = 0;
    public long d = jfg.b;
    public long e = 0;

    public abstract int W(sz0 sz0Var);

    public int X() {
        return (int) (this.c & 4294967295L);
    }

    public int Y() {
        return (int) (this.c >> 32);
    }

    public final void c0() {
        this.a = djh.c((int) (this.c >> 32), yo5.j(this.d), yo5.h(this.d));
        this.b = djh.c((int) (this.c & 4294967295L), yo5.i(this.d), yo5.g(this.d));
        int i = this.a;
        long j = this.c;
        this.e = (((i - ((int) (j >> 32))) / 2) << 32) | (((r0 - ((int) (j & 4294967295L))) / 2) & 4294967295L);
    }

    public abstract void d0(long j, float f, Function1 function1);

    public final void f0(long j) {
        if (gcb.a(this.c, j)) {
            return;
        }
        this.c = j;
        c0();
    }

    public final void g0(long j) {
        if (yo5.b(this.d, j)) {
            return;
        }
        this.d = j;
        c0();
    }

    public Object p() {
        return null;
    }
}
