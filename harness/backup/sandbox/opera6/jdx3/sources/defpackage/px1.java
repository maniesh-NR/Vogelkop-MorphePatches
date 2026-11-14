package defpackage;

/* loaded from: classes.dex */
public final class px1 extends vx1 {
    public final ey1 d;

    public px1(vx1 vx1Var, ey1 ey1Var) {
        super(vx1Var.a, vx1Var.b, vx1Var.c);
        this.d = ey1Var;
    }

    @Override // defpackage.vx1
    public final boolean equals(Object obj) {
        if (super.equals(obj) && (obj instanceof px1)) {
            return this.d == ((px1) obj).d;
        }
        return false;
    }

    @Override // defpackage.vx1
    public final int hashCode() {
        return this.d.hashCode() + (super.hashCode() * 31);
    }
}
