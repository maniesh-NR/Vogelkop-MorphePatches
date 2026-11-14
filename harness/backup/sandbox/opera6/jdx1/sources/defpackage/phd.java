package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class phd implements fjc, did {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gid b;

    public /* synthetic */ phd(gid gidVar, byte b) {
        this.a = b;
        this.b = gidVar;
    }

    @Override // defpackage.did
    public final void c(ssa ssaVar, int i) {
        byte b = this.a;
        gid gidVar = this.b;
        switch (b) {
            case 2:
                ssaVar.q(gidVar.c, i);
                break;
            case 3:
                ssaVar.u0(gidVar.c, i);
                break;
            case 4:
                ssaVar.w0(gidVar.c, i);
                break;
            case 5:
                ssaVar.L0(gidVar.c, i);
                break;
            case 6:
                ssaVar.N(gidVar.c, i);
                break;
            case 7:
                ssaVar.s(gidVar.c, i);
                break;
            case 8:
                ssaVar.d(gidVar.c, i);
                break;
            case 9:
                ssaVar.o(gidVar.c, i);
                break;
            case 10:
                ssaVar.p0(gidVar.c, i);
                break;
            case 11:
                ssaVar.a0(gidVar.c, i);
                break;
            case 12:
                ssaVar.S(gidVar.c, i);
                break;
            case 13:
                ssaVar.D(gidVar.c, i);
                break;
            case 14:
                m4j m4jVar = gidVar.n;
                m4jVar.getClass();
                int i2 = m4jVar.a.c;
                lid lidVar = gidVar.c;
                if (i2 < 6) {
                    ssaVar.n(lidVar, i, 0.0f);
                    break;
                } else {
                    ssaVar.g(lidVar, i);
                    break;
                }
            case 15:
                ssaVar.e0(gidVar.c, i);
                break;
            default:
                ssaVar.G(gidVar.c, i);
                break;
        }
    }

    public final void invoke(Object obj) {
        byte b = this.a;
        gid gidVar = this.b;
        eig eigVar = (eig) obj;
        switch (b) {
            case 0:
                eigVar.N(gidVar.y);
                break;
            default:
                eigVar.N(gidVar.y);
                break;
        }
    }
}
