package ads_mobile_sdk;

import defpackage.ato;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class k33 implements ato {
    public final CoroutineContext a;
    public final zt1 b;

    public k33(CoroutineContext coroutineContext, zt1 zt1Var) {
        this.a = coroutineContext;
        this.b = zt1Var;
    }

    @Override // defpackage.ato
    public final Object a(cy0 cy0Var, Map map, mt5 mt5Var) {
        cy0 cy0Var2 = (cy0) this.b.e.get();
        if (cy0Var2 != null) {
            Object objZ = defpackage.na2.Z(this.a, new gy1(cy0Var2, null, (byte) 1), mt5Var);
            if (objZ == px5.a) {
                return objZ;
            }
        }
        return Unit.a;
    }

    @Override // defpackage.ato
    public final int b() {
        return 52;
    }
}
