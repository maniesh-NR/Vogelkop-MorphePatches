package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class l5m extends ttj {
    public final ttj e;
    public final boolean f;
    public final boolean g;
    public Function1 h;
    public final long i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l5m(ttj ttjVar, Function1 function1, boolean z, boolean z2) {
        Function1 function1E;
        super(0L, xtj.e);
        bli bliVar = ytj.a;
        this.e = ttjVar;
        this.f = z;
        this.g = z2;
        this.h = ytj.i(function1, (ttjVar == null || (function1E = ttjVar.e()) == null) ? ytj.j.e : function1E, z);
        this.i = joh.k();
    }

    @Override // defpackage.ttj
    public final void c() {
        ttj ttjVar;
        this.c = true;
        if (!this.g || (ttjVar = this.e) == null) {
            return;
        }
        ttjVar.c();
    }

    @Override // defpackage.ttj
    public final xtj d() {
        return v().d();
    }

    @Override // defpackage.ttj
    public final Function1 e() {
        return this.h;
    }

    @Override // defpackage.ttj
    public final boolean f() {
        return v().f();
    }

    @Override // defpackage.ttj
    public final long g() {
        return v().g();
    }

    @Override // defpackage.ttj
    public final Function1 i() {
        return null;
    }

    @Override // defpackage.ttj
    public final void k() {
        gyg.Y();
        throw null;
    }

    @Override // defpackage.ttj
    public final void l() {
        gyg.Y();
        throw null;
    }

    @Override // defpackage.ttj
    public final void m() {
        v().m();
    }

    @Override // defpackage.ttj
    public final void n(vak vakVar) {
        v().n(vakVar);
    }

    @Override // defpackage.ttj
    public final ttj u(Function1 function1) {
        Function1 function1I = ytj.i(function1, this.h, true);
        return !this.f ? ytj.e(v().u(null), function1I, true) : v().u(function1I);
    }

    public final ttj v() {
        ttj ttjVar = this.e;
        return ttjVar == null ? ytj.j : ttjVar;
    }
}
