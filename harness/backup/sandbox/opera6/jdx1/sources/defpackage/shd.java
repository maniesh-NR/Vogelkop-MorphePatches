package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class shd implements did {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gid b;
    public final /* synthetic */ qjd c;

    public /* synthetic */ shd(gid gidVar, qjd qjdVar, byte b) {
        this.a = b;
        this.b = gidVar;
        this.c = qjdVar;
    }

    @Override // defpackage.did
    public final void c(ssa ssaVar, int i) {
        byte b = this.a;
        qjd qjdVar = this.c;
        gid gidVar = this.b;
        switch (b) {
            case 0:
                ssaVar.B0(gidVar.c, i, qjdVar.c(true));
                break;
            default:
                ssaVar.K(gidVar.c, i, qjdVar.c(true), true);
                break;
        }
    }
}
