package ads_mobile_sdk;

import defpackage.ato;
import defpackage.fsg;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.h;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class m80 implements ato {
    public final nx5 a;

    public m80(nx5 nx5Var) {
        this.a = nx5Var;
    }

    @Override // defpackage.ato
    public final Object a(cy0 cy0Var, Map map, mt5 mt5Var) {
        by0 by0Var = new by0(cy0Var, Intrinsics.a(map.get("custom_close"), "1"), (mt5) null);
        defpackage.na2.B(this.a, h.a, null, new fsg(by0Var, null, (byte) 3), 2);
        return Unit.a;
    }

    @Override // defpackage.ato
    public final int b() {
        return 16;
    }
}
