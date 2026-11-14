package ads_mobile_sdk;

import defpackage.ato;
import defpackage.nip;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class yv2 implements ato {
    public final nip a;
    public final a2 b;

    public yv2(nip nipVar, a2 a2Var) {
        this.a = nipVar;
        this.b = a2Var;
    }

    @Override // defpackage.ato
    public final Object a(cy0 cy0Var, Map map, mt5 mt5Var) throws NumberFormatException {
        Unit unitA;
        Unit unit;
        String str = (String) map.get("action");
        if (str != null) {
            int iHashCode = str.hashCode();
            nip nipVar = this.a;
            if (iHashCode != 98615580) {
                if (iHashCode != 1385608094) {
                    if (iHashCode == 2098866301 && str.equals("video_complete")) {
                        Object objF = nipVar.f(mt5Var);
                        return objF == px5.a ? objF : Unit.a;
                    }
                } else if (str.equals("video_start")) {
                    Object objK = nipVar.k(mt5Var);
                    return objK == px5.a ? objK : Unit.a;
                }
            } else if (str.equals("grant")) {
                cw2 cw2Var = this.b.k0;
                if (cw2Var != null) {
                    unitA = nipVar.a(cw2Var, mt5Var);
                    unit = px5.a;
                    if (unitA != unit) {
                        unitA = Unit.a;
                    }
                } else {
                    int i = 1;
                    try {
                        String str2 = (String) map.get("amount");
                        if (str2 != null) {
                            i = Integer.parseInt(str2);
                        }
                    } catch (NumberFormatException e) {
                        vr3 vr3Var = xu0.a;
                        xu0.c("Unable to parse reward amount: " + e, null);
                    }
                    String str3 = (String) map.get("type");
                    if (str3 == null) {
                        str3 = "";
                    }
                    unitA = nipVar.a(new cm(str3, i, (byte) 9), mt5Var);
                    unit = px5.a;
                    if (unitA != unit) {
                        unitA = Unit.a;
                    }
                }
                return unitA == unit ? unitA : Unit.a;
            }
        }
        return Unit.a;
    }

    @Override // defpackage.ato
    public final int b() {
        return 19;
    }
}
