package defpackage;

/* loaded from: classes.dex */
public abstract class u9b extends b8e implements u5m {
    public g2o o;
    public g2o p;

    public u9b() {
        f69 f69Var = sfe.f;
        this.o = f69Var;
        this.p = f69Var;
    }

    @Override // defpackage.b8e
    public void L0() throws pxb {
        zch.B(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new t9b(this, (byte) 1));
        U0();
    }

    @Override // defpackage.b8e
    public void M0() {
        this.p = this.o;
        zch.D(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new t9b(this, (byte) 0));
    }

    @Override // defpackage.b8e
    public final void N0() {
        this.o = sfe.f;
    }

    public abstract g2o T0(g2o g2oVar);

    public void U0() {
        this.p = T0(this.o);
        zch.D(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new t9b(this, (byte) 0));
    }

    @Override // defpackage.u5m
    public final Object h() {
        return "androidx.compose.foundation.layout.ConsumedInsetsProvider";
    }
}
