package ads_mobile_sdk;

import defpackage.ato;
import defpackage.kyo;
import defpackage.prb;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class d13 implements ato {
    public final kyo a;

    public d13(kyo kyoVar) {
        this.a = kyoVar;
    }

    @Override // defpackage.ato
    public final Object a(cy0 cy0Var, Map map, mt5 mt5Var) {
        prb prbVar = new prb();
        for (Map.Entry entry : map.entrySet()) {
            prbVar.r((String) entry.getKey(), (String) entry.getValue());
        }
        Object objA = this.a.a(prbVar, mt5Var);
        return objA == px5.a ? objA : Unit.a;
    }

    @Override // defpackage.ato
    public final int b() {
        return 48;
    }
}
