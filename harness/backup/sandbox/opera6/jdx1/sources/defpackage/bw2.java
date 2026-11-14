package defpackage;

/* loaded from: classes.dex */
public final class bw2 extends b8e {
    public inl o;
    public final /* synthetic */ cw2 p;

    public bw2(cw2 cw2Var) {
        this.p = cw2Var;
    }

    @Override // defpackage.b8e
    public final void L0() {
        cw2 cw2Var = this.p;
        cw2Var.b = this;
        if (cw2Var.c != null) {
            this.o = k1g.c0(this, new cv2(this, cw2Var, (byte) 1));
        }
    }

    @Override // defpackage.b8e
    public final void M0() throws pxb {
        cw2 cw2Var = this.p;
        if (cw2Var.b == this) {
            cw2Var.b = null;
        }
        inl inlVar = this.o;
        if (inlVar != null) {
            inlVar.b();
        }
        this.o = null;
    }
}
