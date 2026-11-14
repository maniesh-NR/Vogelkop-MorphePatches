package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class mcn implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ocn b;

    public /* synthetic */ mcn(ocn ocnVar, byte b) {
        this.a = b;
        this.b = ocnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ocn ocnVar = this.b;
        switch (b) {
            case 0:
                k2d k2dVar = ocnVar.h;
                k2d k2dVar2 = ocn.j;
                k2d k2dVar3 = ocn.l;
                if (k2dVar != k2dVar2) {
                    if (k2dVar == k2dVar3) {
                        ocnVar.S(ocn.m);
                        break;
                    }
                } else {
                    if (ocnVar.g != 2) {
                        k2dVar3 = ocn.k;
                    }
                    ocnVar.S(k2dVar3);
                    break;
                }
                break;
            default:
                f3d f3dVar = ocnVar.a;
                if (f3dVar.a != null) {
                    if (!f3dVar.isVisible()) {
                        f3d f3dVar2 = (ncn) ocnVar.b.b;
                        f3dVar2.e.clear();
                        f3dVar2.b.cancel();
                        if (!f3dVar2.isVisible()) {
                            f3dVar2.E = 1;
                            break;
                        }
                    } else {
                        k2d k2dVar4 = ocnVar.h;
                        if (k2dVar4 == null) {
                            ocnVar.R();
                            break;
                        } else {
                            ocnVar.S(k2dVar4);
                            break;
                        }
                    }
                }
                break;
        }
    }
}
