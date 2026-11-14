package defpackage;

import J.N;

/* loaded from: classes.dex */
public final class fn3 implements ywk {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fn3(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // defpackage.ywk
    public final void G(int i) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                gn3 gn3Var = (gn3) obj;
                zwk zwkVar = gn3Var.h;
                if (i != 0 && i != 1 && i != 2) {
                    if (i != 6) {
                        if (gn3Var.L) {
                            gn3Var.L = false;
                            gn3Var.u();
                            break;
                        }
                    } else {
                        zwkVar.getClass();
                        if (zwk.i()) {
                            xih.y(gn3Var.p, zwkVar, new fv2(this, (byte) 15), null);
                            break;
                        }
                    }
                } else if (!gn3Var.L) {
                    gn3Var.L = true;
                    gn3Var.u();
                    break;
                }
                break;
            default:
                t6g t6gVar = (t6g) obj;
                kze kzeVar = t6gVar.r;
                if (i != 0 && i != 1 && i != 2) {
                    kzeVar.r(Boolean.FALSE);
                    if (i == 6 && !t6gVar.q) {
                        t6gVar.q = true;
                        ((x5f) t6gVar.k).l0(gm0.m);
                        hxk hxkVar = t6gVar.j;
                        kxk kxkVar = (kxk) hxkVar;
                        xih.y(kxkVar.e, (zwk) kxkVar.d.b.get(), new l31(new s6g(t6gVar, (byte) 4), (byte) 5), null);
                        break;
                    }
                } else {
                    kzeVar.r(Boolean.TRUE);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.ywk
    public final void c0() {
        byte b = this.a;
        eb0 eb0Var = eb0.c;
        eb0 eb0Var2 = eb0.b;
        Object obj = this.b;
        switch (b) {
            case 0:
                gn3 gn3Var = (gn3) obj;
                x5f x5fVar = gn3Var.g;
                zwk zwkVar = gn3Var.h;
                zwkVar.getClass();
                avj avjVar = cak.d;
                if ((avj.b(1) && zwk.c(1)) ? N.MnqdMkOU(1) : false) {
                    if (gn3Var.L) {
                        gn3Var.L = false;
                        gn3Var.u();
                    }
                    zwkVar.H(this);
                    zwkVar.getClass();
                    if (!avj.b(1) ? false : N.M_kS3iaM(1)) {
                        x5fVar.X(z80.j);
                        x5fVar.I(w2b.c, c3b.RESTORE_FROM_OPERA_ACCOUNT, v2b.BOOKMARKS, eb0Var2);
                    }
                    zwkVar.getClass();
                    if (zwk.c(1) ? N.MwNBJ0s3(1) : false) {
                        x5fVar.X(z80.k);
                        x5fVar.I(w2b.c, c3b.RESTORE_FROM_OPERA_ACCOUNT, v2b.BOOKMARKS, eb0Var);
                        break;
                    }
                }
                break;
            default:
                t6g t6gVar = (t6g) obj;
                kze kzeVar = t6gVar.r;
                orm ormVar = t6gVar.k;
                zwk zwkVar2 = t6gVar.i;
                zwkVar2.getClass();
                if (zwk.f()) {
                    zwkVar2.getClass();
                    if (!zwk.c(3)) {
                        kzeVar.r(Boolean.FALSE);
                        break;
                    } else {
                        zwkVar2.getClass();
                        avj avjVar2 = cak.d;
                        if ((avj.b(1) && zwk.c(3)) ? N.MnqdMkOU(3) : false) {
                            kzeVar.r(Boolean.FALSE);
                            zwkVar2.getClass();
                            if (!avj.b(1) ? false : N.M_kS3iaM(3)) {
                                ((x5f) ormVar).l0(gm0.p);
                                ((x5f) ormVar).I(w2b.d, c3b.RESTORE_FROM_OPERA_ACCOUNT, v2b.PASSWORDS, eb0Var2);
                            }
                            zwkVar2.getClass();
                            if (zwk.c(3) ? N.MwNBJ0s3(3) : false) {
                                ((x5f) ormVar).l0(gm0.q);
                                ((x5f) ormVar).I(w2b.d, c3b.RESTORE_FROM_OPERA_ACCOUNT, v2b.PASSWORDS, eb0Var);
                                break;
                            }
                        }
                    }
                }
                break;
        }
    }
}
