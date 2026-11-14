package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class sw3 implements esk {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tw3 b;

    public /* synthetic */ sw3(tw3 tw3Var, byte b) {
        this.a = b;
        this.b = tw3Var;
    }

    public final Object get() {
        byte b = this.a;
        tw3 tw3Var = this.b;
        switch (b) {
            case 0:
                return ru9.c(tw3Var.b);
            case 1:
                return new pjn(tw3Var, (byte) 19);
            case 2:
                return tw3Var.b.J0();
            default:
                return (hxk) tw3Var.b.g0.E(kxk.class);
        }
    }
}
