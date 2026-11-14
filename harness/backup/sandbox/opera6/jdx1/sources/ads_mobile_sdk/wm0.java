package ads_mobile_sdk;

import android.os.Bundle;
import defpackage.d2i;
import defpackage.fsg;
import defpackage.ic4;
import defpackage.sto;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.h;

/* loaded from: classes.dex */
public final class wm0 implements hap, fkp {
    public final defpackage.r83 a;
    public final bn0 b;
    public final a2 c;
    public final nx5 d;

    public wm0(defpackage.r83 r83Var, bn0 bn0Var, a2 a2Var, nx5 nx5Var) {
        this.a = r83Var;
        this.b = bn0Var;
        this.c = a2Var;
        this.d = nx5Var;
    }

    public final Object a(boolean z, mt5 mt5Var) {
        String strM = this.a.m();
        if (strM == null) {
            return Unit.a;
        }
        zj zjVar = new zj(this, strM, z, (mt5) null);
        defpackage.na2.B(this.d, h.a, null, new fsg(zjVar, null, (byte) 3), 2);
        return Unit.a;
    }

    public final Unit a(d2i d2iVar, mt5 mt5Var) {
        String strM;
        Object objA = this.b.a("generateEventId");
        mt5 mt5Var2 = null;
        String string = objA != null ? objA.toString() : null;
        if (string != null && (strM = this.a.m()) != null) {
            Bundle bundleM = ic4.m(new Pair("_ai", strM), new Pair("reward_type", d2iVar.getType()), new Pair("reward_value", new Integer(d2iVar.getAmount())));
            Bundle bundle = this.c.q;
            ym0 ym0Var = ym0.b;
            bundle.putBundle("_ar", bundleM);
            defpackage.na2.B(this.d, h.a, null, new fsg(new sto((Object) this, (Object) bundle, (Object) string, mt5Var2, (byte) 7), null, (byte) 3), 2);
            return Unit.a;
        }
        return Unit.a;
    }
}
