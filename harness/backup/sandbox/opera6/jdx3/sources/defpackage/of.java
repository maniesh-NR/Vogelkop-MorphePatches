package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class of implements y6f {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ of(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // defpackage.y6f
    public final void a(hjm hjmVar) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                pf pfVar = (pf) obj;
                if (!pfVar.b) {
                    pfVar.b = true;
                    ((Runnable) pfVar.d).run();
                    break;
                }
                break;
            case 1:
                xq3 xq3Var = (xq3) obj;
                xq3Var.finish(hjm.b);
                xq3Var.c = null;
                break;
            case 2:
                ((dej) obj).c(hjmVar);
                break;
            default:
                ((cej) obj).finish(hjmVar);
                break;
        }
    }
}
