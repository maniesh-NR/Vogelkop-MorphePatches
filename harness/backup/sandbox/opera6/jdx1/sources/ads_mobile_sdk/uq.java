package ads_mobile_sdk;

import defpackage.dgh;
import defpackage.lip;
import defpackage.z1m;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class uq {
    public static final lip h = new lip();
    public final List a;
    public final String b;
    public final String c;
    public final boolean d;
    public final String e;
    public String f;
    public final List g;

    public uq(List list, String str, String str2, boolean z, String str3, String str4, List list2) {
        this.a = list;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = str3;
        this.f = str4;
        this.g = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uq)) {
            return false;
        }
        uq uqVar = (uq) obj;
        return Intrinsics.a(this.a, uqVar.a) && Intrinsics.a(this.b, uqVar.b) && Intrinsics.a(this.c, uqVar.c) && this.d == uqVar.d && Intrinsics.a(this.e, uqVar.e) && Intrinsics.a(this.f, uqVar.f) && Intrinsics.a(this.g, uqVar.g);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        List list = this.a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        boolean z = this.d;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int iA = dgh.a(this.e, (iHashCode3 + i) * 31);
        String str3 = this.f;
        int iHashCode4 = (iA + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list2 = this.g;
        return iHashCode4 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.f;
        StringBuilder sb = new StringBuilder("BuildAdUrlResult(errors=");
        sb.append(this.a);
        sb.append(", baseUri=");
        sb.append(this.b);
        sb.append(", postParameters=");
        sb.append(this.c);
        sb.append(", includeCookies=");
        sb.append(this.d);
        sb.append(", url=");
        z1m.t(sb, this.e, ", queryWithFlattenedBlobParams=", str, ", csrbErrors=");
        sb.append(this.g);
        sb.append(")");
        return sb.toString();
    }
}
