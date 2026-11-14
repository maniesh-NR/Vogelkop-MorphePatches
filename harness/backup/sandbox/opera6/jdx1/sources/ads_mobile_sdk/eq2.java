package ads_mobile_sdk;

import defpackage.dgh;
import defpackage.z1m;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class eq2 {
    public String a;
    public String b;
    public av2 c;
    public String g;

    public eq2() {
        av2 av2Var = av2.d;
        this.a = "";
        this.b = "";
        this.c = av2Var;
        this.g = "";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eq2)) {
            return false;
        }
        eq2 eq2Var = (eq2) obj;
        return Intrinsics.a(this.a, eq2Var.a) && Intrinsics.a(this.b, eq2Var.b) && this.c == eq2Var.c && Intrinsics.a(this.g, eq2Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + ((this.c.hashCode() + dgh.a(this.b, this.a.hashCode() * 31)) * 923521);
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        av2 av2Var = this.c;
        String str3 = this.g;
        StringBuilder sbN = z1m.n("PublisherRequestTraceMeta(publisherRequestId=", str, ", adUnitId=", str2, ", publisherRequestType=");
        sbN.append(av2Var);
        sbN.append(", signalGenerationRequestId=, preloadId=, skipUninitializedAdapters=false, requestAgent=");
        sbN.append(str3);
        sbN.append(")");
        return sbN.toString();
    }
}
