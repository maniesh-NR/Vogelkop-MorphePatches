package ads_mobile_sdk;

import defpackage.hpo;
import defpackage.oap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class eh implements hpo {
    public final jd1 a;
    public final oap b;
    public final AtomicBoolean c = new AtomicBoolean(false);

    public eh(jd1 jd1Var, oap oapVar) {
        this.a = jd1Var;
        this.b = oapVar;
    }

    @Override // defpackage.hpo
    public final Object a(nn3 nn3Var, mt5 mt5Var) {
        if (nn3Var.b && this.c.compareAndSet(false, true) && this.a.i().u) {
            this.b.d();
        }
        return Unit.a;
    }
}
