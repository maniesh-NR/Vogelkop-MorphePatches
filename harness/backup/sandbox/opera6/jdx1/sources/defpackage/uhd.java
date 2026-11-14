package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class uhd implements did, zpd {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ float c;

    public /* synthetic */ uhd(Object obj, float f, byte b) {
        this.a = b;
        this.b = obj;
        this.c = f;
    }

    @Override // defpackage.zpd
    public final void b(nod nodVar) {
        ((aqd) this.b).f.t.b(this.c);
    }

    @Override // defpackage.did
    public final void c(ssa ssaVar, int i) {
        byte b = this.a;
        float f = this.c;
        gid gidVar = (gid) this.b;
        switch (b) {
            case 0:
                ssaVar.f0(gidVar.c, i, f);
                break;
            case 1:
                ssaVar.n(gidVar.c, i, f);
                break;
            default:
                m4j m4jVar = gidVar.n;
                m4jVar.getClass();
                int i2 = m4jVar.a.c;
                lid lidVar = gidVar.c;
                if (i2 < 6) {
                    ssaVar.n(lidVar, i, f);
                    break;
                } else {
                    ssaVar.Z(lidVar, i);
                    break;
                }
        }
    }
}
