package ads_mobile_sdk;

import defpackage.jcp;
import defpackage.prb;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class e23 implements jcp {
    public final Object a;
    public final /* synthetic */ byte b;

    public /* synthetic */ e23(Object obj, byte b) {
        this.b = b;
        this.a = obj;
    }

    @Override // defpackage.jcp
    public final Object a(prb prbVar, mt5 mt5Var) {
        byte b = this.b;
        Object obj = this.a;
        switch (b) {
            case 0:
                int iA = bw2.a(prbVar, "total_inflight_ad_limit", 0);
                if (iA <= 0) {
                    vr3 vr3Var = xu0.a;
                    xu0.b("Received non-positive total_inflight_ad_limit: " + iA, null);
                    break;
                } else {
                    a33 a33Var = (a33) obj;
                    a33Var.getClass();
                    Object objA = a33.a(a33Var, new x23(iA), (k) mt5Var);
                    px5 px5Var = px5.a;
                    if (objA != px5Var) {
                        objA = Unit.a;
                    }
                    if (objA != px5Var) {
                        break;
                    }
                }
                break;
            default:
                vz vzVar = (vz) obj;
                if (bw2.a(prbVar, "clear", "").length() > 0) {
                    Object objV = vzVar.v((nt5) mt5Var);
                    if (objV != px5.a) {
                        break;
                    }
                } else {
                    String strA = bw2.a(prbVar, "cookie", "");
                    if (strA.length() <= 0 || (r2 = vzVar.b(strA, (nt5) mt5Var)) != px5.a) {
                    }
                }
                break;
        }
        return Unit.a;
    }
}
