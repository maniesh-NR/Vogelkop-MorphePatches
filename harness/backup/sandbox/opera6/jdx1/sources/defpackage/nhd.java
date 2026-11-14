package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class nhd implements did, fjc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gid b;
    public final /* synthetic */ int c;

    public /* synthetic */ nhd(gid gidVar, int i, byte b) {
        this.a = b;
        this.b = gidVar;
        this.c = i;
    }

    @Override // defpackage.did
    public final void c(ssa ssaVar, int i) {
        byte b = this.a;
        int i2 = this.c;
        gid gidVar = this.b;
        switch (b) {
            case 0:
                ssaVar.E(gidVar.c, i, i2);
                break;
            case 1:
            case 3:
            case 5:
            default:
                ssaVar.m0(gidVar.c, i, i2);
                break;
            case 2:
                ssaVar.v(gidVar.c, i, i2);
                break;
            case 4:
                ssaVar.k0(gidVar.c, i, i2);
                break;
            case 6:
                ssaVar.M0(gidVar.c, i, i2);
                break;
            case 7:
                ssaVar.H0(gidVar.c, i, i2);
                break;
        }
    }

    public final void invoke(Object obj) {
        eig eigVar = (eig) obj;
        switch (this.a) {
            case 1:
                eigVar.l(this.c, this.b.p.u);
                break;
            case 2:
            case 4:
            case 6:
            case 7:
            default:
                eigVar.l(this.c, this.b.p.u);
                break;
            case 3:
                eigVar.l(this.c, this.b.p.u);
                break;
            case 5:
                eigVar.l(this.c, this.b.p.u);
                break;
            case 8:
                eigVar.l(this.c, this.b.p.u);
                break;
            case 9:
                eigVar.l(this.c, this.b.p.u);
                break;
        }
    }
}
