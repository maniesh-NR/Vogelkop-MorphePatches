package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class k5m extends yee {
    public final yee o;
    public final boolean p;
    public final boolean q;
    public Function1 r;
    public Function1 s;
    public final long t;

    /* JADX WARN: Illegal instructions before constructor call */
    public k5m(yee yeeVar, Function1 function1, Function1 function12, boolean z, boolean z2) {
        Function1 function1I;
        Function1 function1E;
        bli bliVar = ytj.a;
        super(0L, xtj.e, ytj.i(function1, (yeeVar == null || (function1E = yeeVar.e()) == null) ? ytj.j.e : function1E, z), ytj.j(function12, (yeeVar == null || (function1I = yeeVar.i()) == null) ? ytj.j.f : function1I));
        this.o = yeeVar;
        this.p = z;
        this.q = z2;
        this.r = this.e;
        this.s = this.f;
        this.t = joh.k();
    }

    @Override // defpackage.yee
    public final void B(tee teeVar) {
        gyg.Y();
        throw null;
    }

    @Override // defpackage.yee
    public final yee C(Function1 function1, Function1 function12) {
        Function1 function1I = ytj.i(function1, this.r, true);
        Function1 function1J = ytj.j(function12, this.s);
        return !this.p ? new k5m(D().C(null, function1J), function1I, function1J, false, true) : D().C(function1I, function1J);
    }

    public final yee D() {
        yee yeeVar = this.o;
        return yeeVar == null ? ytj.j : yeeVar;
    }

    @Override // defpackage.yee, defpackage.ttj
    public final void c() {
        yee yeeVar;
        this.c = true;
        if (!this.q || (yeeVar = this.o) == null) {
            return;
        }
        yeeVar.c();
    }

    @Override // defpackage.ttj
    public final xtj d() {
        return D().d();
    }

    @Override // defpackage.yee, defpackage.ttj
    public final Function1 e() {
        return this.r;
    }

    @Override // defpackage.ttj
    public final boolean f() {
        return D().f();
    }

    @Override // defpackage.ttj
    public final long g() {
        return D().g();
    }

    @Override // defpackage.yee, defpackage.ttj
    public final int h() {
        return D().h();
    }

    @Override // defpackage.yee, defpackage.ttj
    public final Function1 i() {
        return this.s;
    }

    @Override // defpackage.yee, defpackage.ttj
    public final void k() {
        gyg.Y();
        throw null;
    }

    @Override // defpackage.yee, defpackage.ttj
    public final void l() {
        gyg.Y();
        throw null;
    }

    @Override // defpackage.yee, defpackage.ttj
    public final void m() {
        D().m();
    }

    @Override // defpackage.yee, defpackage.ttj
    public final void n(vak vakVar) {
        D().n(vakVar);
    }

    @Override // defpackage.ttj
    public final void r(xtj xtjVar) {
        gyg.Y();
        throw null;
    }

    @Override // defpackage.ttj
    public final void s(long j) {
        gyg.Y();
        throw null;
    }

    @Override // defpackage.yee, defpackage.ttj
    public final void t(int i) {
        D().t(i);
    }

    @Override // defpackage.yee, defpackage.ttj
    public final ttj u(Function1 function1) {
        Function1 function1I = ytj.i(function1, this.r, true);
        return !this.p ? ytj.e(D().u(null), function1I, true) : D().u(function1I);
    }

    @Override // defpackage.yee
    public final zwg w() {
        return D().w();
    }

    @Override // defpackage.yee
    public final tee x() {
        return D().x();
    }

    @Override // defpackage.yee
    /* renamed from: y */
    public final Function1 e() {
        return this.r;
    }
}
