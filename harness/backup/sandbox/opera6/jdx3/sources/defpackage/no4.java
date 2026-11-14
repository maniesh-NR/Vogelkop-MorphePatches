package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class no4 implements fjc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ fig b;
    public final /* synthetic */ fig c;

    public /* synthetic */ no4(fig figVar, fig figVar2, byte b) {
        this.a = b;
        this.b = figVar;
        this.c = figVar2;
    }

    public final void invoke(Object obj) {
        byte b = this.a;
        fig figVar = this.c;
        fig figVar2 = this.b;
        eig eigVar = (eig) obj;
        switch (b) {
            case 0:
                eigVar.onPositionDiscontinuity(1);
                eigVar.n(1, figVar2, figVar);
                break;
            case 1:
                eigVar.onPositionDiscontinuity(0);
                eigVar.n(0, figVar2, figVar);
                break;
            default:
                eigVar.onPositionDiscontinuity(0);
                eigVar.n(0, figVar2, figVar);
                break;
        }
    }
}
