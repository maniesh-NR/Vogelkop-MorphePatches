package ads_mobile_sdk;

import defpackage.ato;
import defpackage.cwh;
import defpackage.yvh;
import defpackage.zvh;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class fa1 implements ato {
    public final ah3 a;
    public final cu2 b;
    public final yi c;

    public fa1(ah3 ah3Var, cu2 cu2Var, yi yiVar) {
        this.a = ah3Var;
        this.b = cu2Var;
        this.c = yiVar;
    }

    @Override // defpackage.ato
    public final Object a(cy0 cy0Var, Map map, mt5 mt5Var) throws NumberFormatException {
        Object obj;
        Object next;
        String str = (String) map.get("applicationMuted");
        yi yiVar = this.c;
        if (str != null) {
            yiVar.d = str.equals("1");
        }
        String str2 = (String) map.get("applicationVolume");
        ah3 ah3Var = this.a;
        if (str2 != null) {
            try {
                yiVar.c = Float.parseFloat(str2);
            } catch (NumberFormatException e) {
                ah3Var.a("Failed to parse application volume: " + str2 + ".", (Throwable) e);
            }
        }
        cu2 cu2Var = this.b;
        cwh cwhVarA = cu2Var.a();
        cwhVarA.getClass();
        awh awhVar = awh.a;
        bwh bwhVar = bwh.a;
        yvh yvhVar = yvh.b;
        ArrayList arrayListD = j95.d(new String[]{"B3EEABB8EE11C2BE770B684D95219ECB"});
        zvh zvhVar = zvh.b;
        yvh yvhVar2 = cwhVarA.a;
        zvh zvhVar2 = cwhVarA.c;
        ArrayList arrayList = cwhVarA.b;
        arrayListD.clear();
        arrayListD.addAll(arrayList);
        arrayListD.add("B3EEABB8EE11C2BE770B684D95219ECB");
        h58 h58Var = yvh.d;
        w4 w4VarE = sko.e(h58Var, h58Var);
        while (true) {
            obj = null;
            if (!w4VarE.hasNext()) {
                next = null;
                break;
            }
            next = w4VarE.next();
            if (((yvh) next).a.equals(map.get("maxAdContentRating"))) {
                break;
            }
        }
        yvh yvhVar3 = (yvh) next;
        if (yvhVar3 != null) {
            yvhVar2 = yvhVar3;
        }
        String str3 = (String) map.get("publisherPrivacyPersonalizationState");
        if (str3 != null) {
            try {
                int i = Integer.parseInt(str3);
                h58 h58Var2 = zvh.d;
                h58Var2.getClass();
                w4 w4Var = new w4(h58Var2, (byte) 0);
                while (true) {
                    if (!w4Var.hasNext()) {
                        break;
                    }
                    Object next2 = w4Var.next();
                    if (((zvh) next2).a == i) {
                        obj = next2;
                        break;
                    }
                }
                zvh zvhVar3 = (zvh) obj;
                if (zvhVar3 != null) {
                    zvhVar2 = zvhVar3;
                }
            } catch (NumberFormatException e2) {
                ah3Var.a("Failed to parse publisher privacy personalization state: " + str3 + ".", (Throwable) e2);
            }
        }
        cu2Var.a.setValue(cu2.b[0], new cwh(yvhVar2, arrayListD, zvhVar2));
        return Unit.a;
    }

    @Override // defpackage.ato
    public final int b() {
        return 40;
    }
}
