package defpackage;

/* loaded from: classes.dex */
public final class wv2 implements cn8 {
    public final /* synthetic */ byte a;
    public final g1g b;
    public final bmj c;

    public wv2(byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = new g1g(4);
                this.c = new bmj(-1, -1, "image/webp");
                break;
            default:
                this.b = new g1g(4);
                this.c = new bmj(-1, -1, "image/avif");
                break;
        }
    }

    private final void e() {
    }

    private final void f() {
    }

    @Override // defpackage.cn8
    public final boolean a(dn8 dn8Var) {
        byte b = this.a;
        g1g g1gVar = this.b;
        switch (b) {
            case 0:
                lp6 lp6Var = (lp6) dn8Var;
                lp6Var.a(4, false);
                g1gVar.K(4);
                lp6Var.peekFully(g1gVar.a, 0, 4, false);
                if (g1gVar.C() == 1718909296) {
                    g1gVar.K(4);
                    lp6Var.peekFully(g1gVar.a, 0, 4, false);
                    if (g1gVar.C() == 1635150182) {
                    }
                }
                break;
            default:
                g1gVar.K(4);
                lp6 lp6Var2 = (lp6) dn8Var;
                lp6Var2.peekFully(g1gVar.a, 0, 4, false);
                if (g1gVar.C() == 1380533830) {
                    lp6Var2.a(4, false);
                    g1gVar.K(4);
                    lp6Var2.peekFully(g1gVar.a, 0, 4, false);
                    if (g1gVar.C() == 1464156752) {
                    }
                }
                break;
        }
        return false;
    }

    @Override // defpackage.cn8
    public final int b(dn8 dn8Var, hp2 hp2Var) {
        byte b = this.a;
        bmj bmjVar = this.c;
        switch (b) {
        }
        return bmjVar.b(dn8Var, hp2Var);
    }

    @Override // defpackage.cn8
    public final void d(en8 en8Var) {
        byte b = this.a;
        bmj bmjVar = this.c;
        switch (b) {
            case 0:
                bmjVar.d(en8Var);
                break;
            default:
                bmjVar.d(en8Var);
                break;
        }
    }

    @Override // defpackage.cn8
    public final void release() {
        byte b = this.a;
    }

    @Override // defpackage.cn8
    public final void seek(long j, long j2) {
        byte b = this.a;
        bmj bmjVar = this.c;
        switch (b) {
            case 0:
                bmjVar.seek(j, j2);
                break;
            default:
                bmjVar.seek(j, j2);
                break;
        }
    }
}
