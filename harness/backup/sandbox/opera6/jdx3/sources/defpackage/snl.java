package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class snl implements f7f {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kol b;

    public /* synthetic */ snl(kol kolVar, byte b) {
        this.a = b;
        this.b = kolVar;
    }

    public final void d0(Object obj) {
        byte b = this.a;
        kol kolVar = this.b;
        switch (b) {
            case 0:
                kolVar.h();
                break;
            default:
                if (kolVar.e.b instanceof col) {
                    kolVar.g(true);
                    break;
                }
                break;
        }
    }
}
