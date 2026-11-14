package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class qrl implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ qrl(Object obj, boolean z, boolean z2, byte b) {
        this.a = b;
        this.d = obj;
        this.b = z;
        this.c = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        boolean z = this.c;
        boolean z2 = this.b;
        Object obj = this.d;
        switch (b) {
            case 0:
                k8 k8Var = (k8) obj;
                k8Var.k0(z2);
                vml.c(new gh2((byte) 13, k8Var, z));
                break;
            case 1:
                ((wci) ((ev4) obj).d).p(z2, z);
                break;
            default:
                ((jvg) ((ev4) obj).d).E(z2, z);
                break;
        }
    }
}
