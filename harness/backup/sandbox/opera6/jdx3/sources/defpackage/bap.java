package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public abstract class bap {
    public final boolean a;
    public boolean b;
    public final boolean c;
    public boolean d;
    public boolean e;

    public bap(int i, boolean z, boolean z2, boolean z3, boolean z4) {
        z = (i & 1) != 0 ? false : z;
        z2 = (i & 2) != 0 ? false : z2;
        z3 = (i & 4) != 0 ? false : z3;
        boolean z5 = (i & 8) == 0;
        z4 = (i & 16) != 0 ? false : z4;
        this.a = z;
        this.b = z3;
        this.c = z5;
        this.d = z2;
        this.e = z4;
    }

    public n9p a() {
        return new n9p(false, false, false);
    }

    public bap b(k48 k48Var, u6p u6pVar) {
        return this;
    }

    public bap c(Function1 function1) {
        return new j9p();
    }

    public void d() {
    }

    public void e() {
    }

    public void f() {
    }

    public bap g() {
        return this;
    }

    public bap h() {
        return this;
    }

    public bap i() {
        return this;
    }
}
