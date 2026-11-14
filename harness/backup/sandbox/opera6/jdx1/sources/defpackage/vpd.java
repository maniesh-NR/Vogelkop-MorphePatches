package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class vpd implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xkg b;
    public final /* synthetic */ int c;

    public /* synthetic */ vpd(xkg xkgVar, int i, byte b) {
        this.a = b;
        this.b = xkgVar;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int i = this.c;
        xkg xkgVar = this.b;
        switch (b) {
            case 0:
                if (xkgVar.C(25) || xkgVar.C(33)) {
                    if (!xkgVar.C(33)) {
                        xkgVar.n0(i);
                        break;
                    } else {
                        xkgVar.Y(i, 1);
                        break;
                    }
                }
                break;
            default:
                if (xkgVar.C(26) || xkgVar.C(34)) {
                    if (i == -100) {
                        if (!xkgVar.C(34)) {
                            xkgVar.D(true);
                            break;
                        } else {
                            xkgVar.i(1, true);
                            break;
                        }
                    } else if (i == -1) {
                        if (!xkgVar.C(34)) {
                            xkgVar.j();
                            break;
                        } else {
                            xkgVar.v(1);
                            break;
                        }
                    } else if (i == 1) {
                        if (!xkgVar.C(34)) {
                            xkgVar.K();
                            break;
                        } else {
                            xkgVar.k(1);
                            break;
                        }
                    } else if (i == 100) {
                        if (!xkgVar.C(34)) {
                            xkgVar.D(false);
                            break;
                        } else {
                            xkgVar.i(1, false);
                            break;
                        }
                    } else if (i == 101) {
                        if (!xkgVar.C(34)) {
                            xkgVar.D(!xkgVar.z0());
                            break;
                        } else {
                            xkgVar.i(1, !xkgVar.z0());
                            break;
                        }
                    } else {
                        vep.y(i, "onAdjustVolume: Ignoring unknown direction: ");
                        break;
                    }
                }
                break;
        }
    }
}
