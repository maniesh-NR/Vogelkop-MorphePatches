package defpackage;

/* loaded from: classes.dex */
public final class iu1 implements y43 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ k8 b;

    public /* synthetic */ iu1(k8 k8Var, byte b) {
        this.a = b;
        this.b = k8Var;
    }

    @Override // defpackage.y43
    public final void O(x43 x43Var) {
        byte b = this.a;
        k8 k8Var = this.b;
        switch (b) {
            case 0:
                pde pdeVar = ((ju1) k8Var).p;
                xf8.F0(pdeVar, avl.a((avl) pdeVar.g(), x43Var.a));
                break;
            default:
                pde pdeVar2 = ((ju1) k8Var).p;
                xf8.F0(pdeVar2, avl.a((avl) pdeVar2.g(), x43Var.a));
                break;
        }
    }

    @Override // defpackage.y43
    public final void p(float f) {
        byte b = this.a;
        k8 k8Var = this.b;
        switch (b) {
            case 0:
                ((ju1) k8Var).r.r(Float.valueOf(f));
                break;
            default:
                ((ju1) k8Var).r.r(Float.valueOf(f));
                break;
        }
    }

    @Override // defpackage.y43
    public final void v(float f) {
        byte b = this.a;
        k8 k8Var = this.b;
        switch (b) {
            case 0:
                xf8.G0(((ju1) k8Var).q, Float.valueOf(f));
                break;
            default:
                xf8.G0(((ju1) k8Var).q, Float.valueOf(f));
                break;
        }
    }
}
