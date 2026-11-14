package defpackage;

/* loaded from: classes.dex */
public final class vb9 extends cej {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ja2 b;

    public /* synthetic */ vb9(xb9 xb9Var, ja2 ja2Var, byte b) {
        this.a = b;
        this.b = ja2Var;
    }

    @Override // defpackage.cej
    public final dej createSheet(mej mejVar, b2l b2lVar) {
        switch (this.a) {
            case 0:
                return new fwd(mejVar, (kb9) this.b, (byte) 0);
            default:
                return new fwd(mejVar, (lb9) this.b, (byte) 1);
        }
    }
}
