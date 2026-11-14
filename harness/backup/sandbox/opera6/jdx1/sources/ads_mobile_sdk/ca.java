package ads_mobile_sdk;

import defpackage.hpo;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class ca implements hpo {
    public final z2 a;
    public final AtomicBoolean b = new AtomicBoolean(false);

    public ca(z2 z2Var) {
        this.a = z2Var;
    }

    @Override // defpackage.hpo
    public final Object a(nn3 nn3Var, mt5 mt5Var) {
        if (!nn3Var.b || !this.b.compareAndSet(false, true)) {
            return Unit.a;
        }
        Object objQ = this.a.q(mt5Var);
        return objQ == px5.a ? objQ : Unit.a;
    }
}
