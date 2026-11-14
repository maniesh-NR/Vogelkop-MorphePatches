package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class qlh extends ttj {
    public final Function1 e;
    public int f;

    public qlh(long j, xtj xtjVar, Function1 function1) {
        super(j, xtjVar);
        this.e = function1;
        this.f = 1;
    }

    @Override // defpackage.ttj
    public final void c() {
        if (this.c) {
            return;
        }
        l();
        this.c = true;
        synchronized (ytj.c) {
            o();
        }
    }

    @Override // defpackage.ttj
    public final Function1 e() {
        return this.e;
    }

    @Override // defpackage.ttj
    public final boolean f() {
        return true;
    }

    @Override // defpackage.ttj
    public final Function1 i() {
        return null;
    }

    @Override // defpackage.ttj
    public final void k() {
        this.f++;
    }

    @Override // defpackage.ttj
    public final void l() {
        int i = this.f - 1;
        this.f = i;
        if (i == 0) {
            a();
        }
    }

    @Override // defpackage.ttj
    public final void m() {
    }

    @Override // defpackage.ttj
    public final void n(vak vakVar) {
        bli bliVar = ytj.a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // defpackage.ttj
    public final ttj u(Function1 function1) {
        ytj.v(this);
        return new ale(this.b, this.a, ytj.i(function1, this.e, true), this);
    }
}
