package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class eid implements did {
    public final /* synthetic */ byte a;
    public final /* synthetic */ fid b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ eid(fid fidVar, int i, int i2, byte b) {
        this.a = b;
        this.b = fidVar;
        this.c = i;
        this.d = i2;
    }

    @Override // defpackage.did
    public final void c(ssa ssaVar, int i) {
        byte b = this.a;
        int i2 = this.d;
        int i3 = this.c;
        fid fidVar = this.b;
        switch (b) {
            case 0:
                ssaVar.A(fidVar.a.c, i, i3, i2);
                break;
            default:
                ssaVar.A(fidVar.a.c, i, i3, i2);
                break;
        }
    }
}
