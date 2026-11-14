package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class u9p extends bap {
    public u6p f;

    @Override // defpackage.bap
    public final n9p a() {
        return new n9p(this.d, this.b, this.e);
    }

    @Override // defpackage.bap
    public final bap c(Function1 function1) {
        u6p u6pVar = this.f;
        if (u6pVar != null) {
            u6pVar.invoke(this);
        }
        this.f = null;
        function1.invoke(this);
        return new j9p();
    }

    @Override // defpackage.bap
    public final void d() {
        this.e = true;
    }

    @Override // defpackage.bap
    public final void e() {
        this.b = true;
    }

    @Override // defpackage.bap
    public final void f() {
        this.d = true;
    }

    @Override // defpackage.bap
    public final bap i() {
        u6p u6pVar = this.f;
        if (u6pVar != null) {
            u6pVar.invoke(this);
        }
        this.f = null;
        return new t9p(this.d, this.b, this.e);
    }
}
