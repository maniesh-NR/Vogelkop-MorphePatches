package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class yhd implements did {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gid b;
    public final /* synthetic */ List c;

    public /* synthetic */ yhd(gid gidVar, List list, byte b) {
        this.a = b;
        this.b = gidVar;
        this.c = list;
    }

    @Override // defpackage.did
    public final void c(ssa ssaVar, int i) {
        byte b = this.a;
        int i2 = 0;
        List list = this.c;
        gid gidVar = this.b;
        switch (b) {
            case 0:
                lid lidVar = gidVar.c;
                z0b z0bVarP = h1b.p();
                while (i2 < list.size()) {
                    z0bVarP.c(((qjd) list.get(i2)).c(true));
                    i2++;
                }
                ssaVar.n0(lidVar, i, new k14(z0bVarP.g()), true);
                break;
            default:
                lid lidVar2 = gidVar.c;
                z0b z0bVarP2 = h1b.p();
                while (i2 < list.size()) {
                    z0bVarP2.c(((qjd) list.get(i2)).c(true));
                    i2++;
                }
                ssaVar.r0(lidVar2, i, new k14(z0bVarP2.g()));
                break;
        }
    }
}
