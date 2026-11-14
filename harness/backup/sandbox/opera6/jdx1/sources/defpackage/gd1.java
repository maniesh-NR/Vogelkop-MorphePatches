package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class gd1 implements kd1 {
    public final ed1 a;
    public final ed1 b;

    public gd1(ed1 ed1Var, ed1 ed1Var2) {
        this.a = ed1Var;
        this.b = ed1Var2;
    }

    @Override // defpackage.kd1
    public final a73 D() {
        return new o0k((t89) this.a.D(), (t89) this.b.D());
    }

    @Override // defpackage.kd1
    public final List G() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // defpackage.kd1
    public final boolean H() {
        return this.a.H() && this.b.H();
    }
}
