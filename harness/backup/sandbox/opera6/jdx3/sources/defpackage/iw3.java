package defpackage;

/* loaded from: classes.dex */
public final class iw3 implements nue {
    public mue a;
    public final /* synthetic */ tw3 b;

    public iw3(tw3 tw3Var) {
        this.b = tw3Var;
    }

    @Override // defpackage.nue
    public final ize getVisibility() {
        mue mueVar = this.a;
        if (mueVar != null) {
            return mueVar.h;
        }
        tw3 tw3Var = this.b;
        mue mueVar2 = (mue) tw3Var.D.get();
        tw3Var.b.getLifecycle().a(mueVar2);
        this.a = mueVar2;
        return mueVar2.h;
    }
}
