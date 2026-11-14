package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class r85 implements kg {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r85(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // defpackage.kg
    public final void q(eri eriVar, boolean z) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((u85) obj).g();
                break;
            case 1:
                iv7 iv7Var = (iv7) obj;
                xf8.F0(iv7Var.f, iv7Var.c.b());
                xf8.F0(iv7Var.k, Boolean.valueOf(iv7Var.a()));
                break;
            default:
                ((zg) obj).l();
                break;
        }
    }
}
