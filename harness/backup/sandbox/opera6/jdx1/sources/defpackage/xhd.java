package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class xhd implements fjc, did {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gid b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ xhd(gid gidVar, boolean z, byte b) {
        this.a = b;
        this.b = gidVar;
        this.c = z;
    }

    @Override // defpackage.did
    public final void c(ssa ssaVar, int i) {
        byte b = this.a;
        boolean z = this.c;
        gid gidVar = this.b;
        switch (b) {
            case 1:
                ssaVar.Q0(gidVar.c, i, z);
                break;
            case 2:
                ssaVar.R(gidVar.c, i, z);
                break;
            default:
                ssaVar.H(gidVar.c, i, z);
                break;
        }
    }

    public final void invoke(Object obj) {
        eig eigVar = (eig) obj;
        switch (this.a) {
            case 0:
                eigVar.l(this.b.p.t, this.c);
                break;
            default:
                eigVar.l(this.b.p.t, this.c);
                break;
        }
    }
}
