package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class ecl implements me1 {
    public final y0n a;
    public final j8m b;
    public final Object c;
    public final Object d;
    public final if1 e;
    public final if1 f;
    public final if1 g;
    public long h;
    public if1 i;

    public ecl(we1 we1Var, j8m j8mVar, Object obj, Object obj2, if1 if1Var) {
        this.a = we1Var.a(j8mVar);
        this.b = j8mVar;
        this.c = obj2;
        this.d = obj;
        this.e = (if1) j8mVar.a.invoke(obj);
        Function1 function1 = j8mVar.a;
        this.f = (if1) function1.invoke(obj2);
        this.g = if1Var != null ? nb6.m(if1Var) : ((if1) function1.invoke(obj)).c();
        this.h = -1L;
    }

    public final boolean b() {
        return this.a.b();
    }

    public final if1 c(long j) {
        if (!d(j)) {
            return this.a.t(j, this.e, this.f, this.g);
        }
        if1 if1Var = this.i;
        if (if1Var != null) {
            return if1Var;
        }
        if1 if1VarQ = this.a.q(this.e, this.f, this.g);
        this.i = if1VarQ;
        return if1VarQ;
    }

    public final long e() {
        long j = this.h;
        if (j >= 0) {
            return j;
        }
        long jC = this.a.c(this.e, this.f, this.g);
        this.h = jC;
        return jC;
    }

    public final j8m f() {
        return this.b;
    }

    public final Object g(long j) {
        if (d(j)) {
            return this.c;
        }
        if1 if1VarW = this.a.w(j, this.e, this.f, this.g);
        int iB = if1VarW.b();
        for (int i = 0; i < iB; i++) {
            if (Float.isNaN(if1VarW.a(i))) {
                dpg.b("AnimationVector cannot contain a NaN. " + if1VarW + ". Animation: " + this + ", playTimeNanos: " + j);
            }
        }
        return this.b.b.invoke(if1VarW);
    }

    public final Object h() {
        return this.c;
    }

    public final String toString() {
        return "TargetBasedAnimation: " + this.d + " -> " + this.c + ",initial velocity: " + this.g + ", duration: " + (e() / 1000000) + " ms,animationSpec: " + this.a;
    }
}
