package ads_mobile_sdk;

import defpackage.dgh;
import defpackage.z1m;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ih1 {
    public String a = "";
    public String b = "";
    public int c = 0;
    public int d = 2;
    public int e = 0;
    public ee2 f = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ih1)) {
            return false;
        }
        ih1 ih1Var = (ih1) obj;
        return Intrinsics.a(this.a, ih1Var.a) && Intrinsics.a(this.b, ih1Var.b) && this.c == ih1Var.c && this.d == ih1Var.d && this.e == ih1Var.e && Intrinsics.a(this.f, ih1Var.f);
    }

    public final int hashCode() {
        int iA = n6h.a(this.e, (vep.A(this.d) + n6h.a(this.c, dgh.a(this.b, this.a.hashCode() * 31))) * 31);
        ee2 ee2Var = this.f;
        return iA + (ee2Var == null ? 0 : ee2Var.hashCode());
    }

    public final String toString() {
        String str;
        String str2 = this.a;
        String str3 = this.b;
        int i = this.c;
        int i2 = this.d;
        int i3 = this.e;
        ee2 ee2Var = this.f;
        StringBuilder sbN = z1m.n("InternalRequestTraceMeta(internalRequestId=", str2, ", gwsQueryId=", str3, ", sequenceNumber=");
        sbN.append(i);
        sbN.append(", scarRequestType=");
        switch (i2) {
            case 1:
                str = "SCAR_REQUEST_TYPE_ADMOB";
                break;
            case 2:
                str = "SCAR_REQUEST_TYPE_UNSPECIFIED";
                break;
            case 3:
                str = "SCAR_REQUEST_TYPE_INBOUND_MEDIATION";
                break;
            case 4:
                str = "SCAR_REQUEST_TYPE_GBID";
                break;
            case 5:
                str = "SCAR_REQUEST_TYPE_GOLDENEYE";
                break;
            case 6:
                str = "SCAR_REQUEST_TYPE_YAVIN";
                break;
            case 7:
                str = "SCAR_REQUEST_TYPE_UNITY";
                break;
            case 8:
                str = "SCAR_REQUEST_TYPE_PAW";
                break;
            case 9:
                str = "SCAR_REQUEST_TYPE_GUILDER";
                break;
            case 10:
                str = "SCAR_REQUEST_TYPE_GAM_S2S";
                break;
            case 11:
                str = "UNRECOGNIZED";
                break;
            default:
                str = "null";
                break;
        }
        sbN.append(str);
        sbN.append(", mediationChainLength=");
        sbN.append(i3);
        sbN.append(", persistentCacheRequestData=");
        sbN.append(ee2Var);
        sbN.append(")");
        return sbN.toString();
    }
}
