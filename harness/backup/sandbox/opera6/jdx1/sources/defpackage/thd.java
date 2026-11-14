package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class thd implements did {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gid b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ thd(gid gidVar, int i, int i2, byte b) {
        this.a = b;
        this.b = gidVar;
        this.c = i;
        this.d = i2;
    }

    @Override // defpackage.did
    public final void c(ssa ssaVar, int i) {
        byte b = this.a;
        int i2 = this.d;
        int i3 = this.c;
        gid gidVar = this.b;
        switch (b) {
            case 0:
                ssaVar.u(gidVar.c, i, i3, i2);
                break;
            case 1:
                ssaVar.k(gidVar.c, i, i3, i2);
                break;
            default:
                ssaVar.O0(gidVar.c, i, i3, i2);
                break;
        }
    }
}
