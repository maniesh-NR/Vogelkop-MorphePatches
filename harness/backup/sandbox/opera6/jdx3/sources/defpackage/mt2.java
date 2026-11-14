package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class mt2 implements dkj {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lqh b;

    public /* synthetic */ mt2(lqh lqhVar, byte b) {
        this.a = b;
        this.b = lqhVar;
    }

    @Override // defpackage.dkj
    public final void a() {
        byte b = this.a;
        lqh lqhVar = this.b;
        switch (b) {
            case 0:
                lqhVar.a = true;
                break;
            case 1:
                lqhVar.a = false;
                break;
            case 2:
                lqhVar.a = true;
                break;
            default:
                lqhVar.a = false;
                break;
        }
    }
}
