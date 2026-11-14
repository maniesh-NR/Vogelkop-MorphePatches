package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class myj implements f7f {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vi2 b;

    public /* synthetic */ myj(vi2 vi2Var, byte b) {
        this.a = b;
        this.b = vi2Var;
    }

    public final void d0(Object obj) {
        byte b = this.a;
        vi2 vi2Var = this.b;
        switch (b) {
            case 0:
                pde pdeVar = (pde) vi2Var.g;
                ode odeVar = (ode) vi2Var.d;
                bzj bzjVar = (bzj) odeVar.g();
                if (bzjVar != null && !bzjVar.a()) {
                    odeVar.p((myj) vi2Var.h);
                    pdeVar.r(og.a);
                }
                if (bzjVar != null && !bzjVar.equals(wyj.a) && !(bzjVar instanceof xyj)) {
                    if (!(bzjVar instanceof yyj)) {
                        if (!(bzjVar instanceof vyj)) {
                            if (!bzjVar.equals(azj.a)) {
                                if (!bzjVar.equals(zyj.a)) {
                                    h9o.p();
                                    break;
                                } else {
                                    vi2Var.a(vi2Var.a.length());
                                    break;
                                }
                            }
                        } else {
                            ((oyj) vi2Var.f).invoke(vi2Var.a, Integer.valueOf(vi2Var.c));
                            break;
                        }
                    } else {
                        a26.T(((yyj) bzjVar).c, pdeVar, new myj(vi2Var, (byte) 1));
                        break;
                    }
                }
                break;
            default:
                vi2Var.a(((Integer) obj).intValue());
                break;
        }
    }
}
