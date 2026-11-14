package defpackage;

import ads_mobile_sdk.pd;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class qp1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xp1 b;

    public /* synthetic */ qp1(xp1 xp1Var, byte b) {
        this.a = b;
        this.b = xp1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        byte b = this.a;
        xp1 xp1Var = this.b;
        switch (b) {
            case 0:
                if ((xp1Var.Y & 1) != 0) {
                    xp1Var.v(0);
                }
                if ((xp1Var.Y & 4096) != 0) {
                    xp1Var.v(pd.i1);
                }
                xp1Var.X = false;
                xp1Var.Y = 0;
                break;
            default:
                xp1Var.w.showAtLocation(xp1Var.v, 55, 0, 0);
                l8n l8nVar = xp1Var.y;
                if (l8nVar != null) {
                    l8nVar.b();
                }
                if (!xp1Var.z || (viewGroup = xp1Var.A) == null || !viewGroup.isLaidOut()) {
                    xp1Var.v.setAlpha(1.0f);
                    xp1Var.v.setVisibility(0);
                    break;
                } else {
                    xp1Var.v.setAlpha(0.0f);
                    l8n l8nVarB = r5n.b(xp1Var.v);
                    l8nVarB.a(1.0f);
                    xp1Var.y = l8nVarB;
                    l8nVarB.d(new rp1(this, (byte) 0));
                    break;
                }
                break;
        }
    }
}
