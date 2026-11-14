package defpackage;

import android.view.View;

/* loaded from: classes.dex */
public final class q65 extends n1 {
    public final /* synthetic */ byte c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q65(Object obj, byte b) {
        super((byte) 23, false);
        this.c = b;
        this.d = obj;
    }

    @Override // defpackage.n1
    public final void run() {
        byte b = this.c;
        Object obj = this.d;
        switch (b) {
            case 0:
                r65 r65Var = (r65) obj;
                if (!r65Var.c()) {
                    r65Var.j(31, "Timed out before SDK initialization completed.");
                    fwm.Companion.getClass();
                    r65Var.i(null, null, new fwm(new hwm("Timed out before SDK initialization completed.", (Throwable) null)));
                    break;
                }
                break;
            case 1:
                x65 x65Var = (x65) obj;
                if (x65Var.z && x65Var.isAdded() && !x65Var.isRemoving()) {
                    View viewR0 = x65Var.r0();
                    if (viewR0 == null) {
                        x65Var.n0(yim.e);
                        break;
                    } else {
                        x65Var.r.S();
                        x65Var.w = viewR0;
                        x65Var.l0();
                        break;
                    }
                }
                break;
            case 2:
                xb9 xb9Var = (xb9) obj;
                xb9Var.j = 0L;
                xb9Var.V(xb9Var.b, true);
                break;
            case 3:
                ((l2b) obj).K0();
                break;
            case 4:
                ((Runnable) obj).run();
                break;
            default:
                sa4 sa4Var = (sa4) obj;
                ih4 ih4Var = (ih4) sa4Var.m;
                if (ih4Var != null) {
                    ih4Var.cancel();
                    sa4Var.m = null;
                }
                sa4Var.f();
                break;
        }
    }
}
