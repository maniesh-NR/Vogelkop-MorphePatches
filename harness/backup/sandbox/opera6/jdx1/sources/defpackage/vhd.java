package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class vhd implements fjc, op5 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ thg b;

    public /* synthetic */ vhd(thg thgVar, byte b) {
        this.a = b;
        this.b = thgVar;
    }

    @Override // defpackage.op5
    public final void accept(Object obj) {
        ((xkg) obj).c(this.b);
    }

    public final void invoke(Object obj) {
        byte b = this.a;
        thg thgVar = this.b;
        eig eigVar = (eig) obj;
        switch (b) {
            case 0:
                eigVar.M(thgVar);
                break;
            default:
                eigVar.M(thgVar);
                break;
        }
    }
}
