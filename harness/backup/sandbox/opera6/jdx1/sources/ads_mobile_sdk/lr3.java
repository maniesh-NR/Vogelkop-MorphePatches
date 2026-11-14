package ads_mobile_sdk;

import defpackage.prb;
import java.util.Optional;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class lr3 implements wgp {
    public final nx5 a;
    public final Optional b;

    public lr3(nx5 nx5Var, Optional optional) {
        this.a = nx5Var;
        this.b = optional;
    }

    public final Unit a(boolean z) {
        cy0 cy0Var = (cy0) this.b.orElse(null);
        if (cy0Var == null) {
            return Unit.a;
        }
        String str = z ? "1" : "0";
        prb prbVar = new prb();
        prbVar.r("isVisible", str);
        defpackage.na2.B(this.a, null, null, new aq1(cy0Var, prbVar, null, (byte) 1), 3);
        return Unit.a;
    }
}
