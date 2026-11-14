package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class al6 implements fjc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rhg b;

    public /* synthetic */ al6(d11 d11Var, rhg rhgVar) {
        this.a = (byte) 0;
        this.b = rhgVar;
    }

    public /* synthetic */ al6(rhg rhgVar, byte b) {
        this.a = b;
        this.b = rhgVar;
    }

    public final void invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((dkd) ((e11) obj)).o = this.b;
                break;
            case 1:
                ((eig) obj).H(this.b);
                break;
            default:
                ((eig) obj).F(this.b);
                break;
        }
    }
}
