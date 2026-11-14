package ads_mobile_sdk;

import android.view.View;
import defpackage.ato;
import defpackage.fvo;
import defpackage.sdp;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class q12 implements ato {
    public final zt1 a;
    public final it1 b;

    public q12(zt1 zt1Var, it1 it1Var) {
        this.a = zt1Var;
        this.b = it1Var;
    }

    @Override // defpackage.ato
    public final Object a(cy0 cy0Var, Map map, mt5 mt5Var) {
        ew1 ew1Var;
        View viewB;
        gt1 gt1Var = this.b.b;
        int i = gt1Var == null ? -1 : sdp.a[gt1Var.ordinal()];
        if (i == -1) {
            return Unit.a;
        }
        zt1 zt1Var = this.a;
        if (i == 1) {
            fvo fvoVar = (fvo) zt1Var.c.get();
            if (fvoVar != null && (viewB = (ew1Var = (ew1) fvoVar).b("3010")) != null) {
                ew1Var.onClick(viewB);
            }
        } else if (i == 2) {
            zt1Var.a$1();
        }
        return Unit.a;
    }

    @Override // defpackage.ato
    public final int b() {
        return 39;
    }
}
