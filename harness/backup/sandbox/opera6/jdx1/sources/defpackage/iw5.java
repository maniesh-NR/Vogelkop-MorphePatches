package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class iw5 extends b8e implements i0j {
    public boolean o;
    public final boolean p;
    public Function1 q;

    public iw5(boolean z, boolean z2, Function1 function1) {
        this.o = z;
        this.p = z2;
        this.q = function1;
    }

    @Override // defpackage.i0j
    public final boolean D0() {
        return this.o;
    }

    @Override // defpackage.i0j
    public final void R(q0j q0jVar) {
        this.q.invoke(q0jVar);
    }

    @Override // defpackage.i0j
    public final boolean t() {
        return this.p;
    }
}
