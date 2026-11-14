package ads_mobile_sdk;

import defpackage.ato;
import defpackage.u6k;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class cn3 implements ato {
    public final CoroutineContext a;

    public cn3(CoroutineContext coroutineContext) {
        this.a = coroutineContext;
    }

    @Override // defpackage.ato
    public final Object a(cy0 cy0Var, Map map, mt5 mt5Var) {
        String str = (String) map.get("action");
        if (str == null || StringsKt.N(str)) {
            xh3.a("Action is missing from a video GMSG: " + map, null, 6);
            return Unit.a;
        }
        vr3 vr3Var = xu0.a;
        xu0.b("Handling \"" + str + "\" video GMSG", null);
        bz0 bz0VarD = cy0Var.d();
        if (bz0VarD == null) {
            return Unit.a;
        }
        int iHashCode = str.hashCode();
        CoroutineContext coroutineContext = this.a;
        if (iHashCode != 114148) {
            if (iHashCode != 3532159) {
                if (iHashCode == 1762557398 && str.equals("timeupdate")) {
                    Object objZ = defpackage.na2.Z(coroutineContext, new bn3(map, bz0VarD, null, (byte) 1), mt5Var);
                    return objZ == px5.a ? objZ : Unit.a;
                }
            } else if (str.equals("skip")) {
                Object objZ2 = defpackage.na2.Z(coroutineContext, new u6k((byte) 11, null, bz0VarD), mt5Var);
                return objZ2 == px5.a ? objZ2 : Unit.a;
            }
        } else if (str.equals("src")) {
            Object objZ3 = defpackage.na2.Z(coroutineContext, new bn3(map, bz0VarD, null, (byte) 0), mt5Var);
            return objZ3 == px5.a ? objZ3 : Unit.a;
        }
        xh3.a("Unhandled video GMSG: " + map, null, 6);
        return Unit.a;
    }

    @Override // defpackage.ato
    public final int b() {
        return 11;
    }

    @Override // defpackage.ato
    public final boolean c() {
        return true;
    }
}
