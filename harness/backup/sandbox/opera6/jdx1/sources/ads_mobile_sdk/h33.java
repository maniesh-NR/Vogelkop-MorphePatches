package ads_mobile_sdk;

import defpackage.ato;
import defpackage.udj;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class h33 implements ato {
    public final CoroutineContext a;
    public final zt1 b;
    public final w12 c;

    public h33(CoroutineContext coroutineContext, zt1 zt1Var, w12 w12Var) {
        this.a = coroutineContext;
        this.b = zt1Var;
        this.c = w12Var;
    }

    @Override // defpackage.ato
    public final Object a(cy0 cy0Var, Map map, mt5 mt5Var) {
        cy0 cy0Var2 = (cy0) this.b.d.get();
        if (cy0Var2 != null) {
            Object objZ = defpackage.na2.Z(this.a, new udj(this, cy0Var2, (mt5) null, (byte) 18), mt5Var);
            if (objZ == px5.a) {
                return objZ;
            }
        }
        return Unit.a;
    }

    @Override // defpackage.ato
    public final int b() {
        return 46;
    }
}
