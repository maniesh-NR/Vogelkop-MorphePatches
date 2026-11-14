package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class f74 extends b8e implements j7f, e14, lk7 {
    public final g74 o;
    public boolean p;
    public Function1 q;

    public f74(g74 g74Var, Function1 function1) {
        this.o = g74Var;
        this.q = function1;
        g74Var.a = this;
    }

    public final void J() {
        T0();
    }

    @Override // defpackage.b8e
    public final void M0() {
    }

    @Override // defpackage.b8e
    public final void N0() {
        T0();
    }

    public final void T0() {
        this.p = false;
        this.o.b = null;
        c26.y(this);
    }

    @Override // defpackage.e14
    public final n27 b() {
        return ui6.e0(this).y;
    }

    @Override // defpackage.f17, defpackage.omg
    public final void d() {
        T0();
    }

    @Override // defpackage.e14
    public final long e() {
        return fr3.g0(ui6.c0(this, 4).c);
    }

    @Override // defpackage.e14
    public final d2c getLayoutDirection() {
        return ui6.e0(this).z;
    }

    @Override // defpackage.lk7
    public final void i0() {
        T0();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: pxb */
    @Override // defpackage.lk7
    public final void v0(o3c o3cVar) throws pxb {
        boolean z = this.p;
        g74 g74Var = this.o;
        if (!z) {
            g74Var.b = null;
            x7d.y(this, new gb3(this, g74Var, (byte) 10));
            if (g74Var.b == null) {
                throw vep.q("DrawResult not defined, did you forget to call onDraw?");
            }
            this.p = true;
        }
        ((Function1) g74Var.b.b).invoke(o3cVar);
    }

    @Override // defpackage.f17
    public final void z() {
        T0();
    }
}
