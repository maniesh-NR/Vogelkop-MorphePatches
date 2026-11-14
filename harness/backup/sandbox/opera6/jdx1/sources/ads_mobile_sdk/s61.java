package ads_mobile_sdk;

import defpackage.prb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class s61 {
    public final String a;
    public final h07 b;
    public final String c;
    public final prb d;
    public final String e;
    public final boolean f;

    public s61(String str, h07 h07Var, String str2, prb prbVar, String str3, boolean z) {
        this.a = str;
        this.b = h07Var;
        this.c = str2;
        this.d = prbVar;
        this.e = str3;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s61)) {
            return false;
        }
        s61 s61Var = (s61) obj;
        return Intrinsics.a(this.a, s61Var.a) && Intrinsics.a(this.b, s61Var.b) && Intrinsics.a(this.c, s61Var.c) && Intrinsics.a(this.d, s61Var.d) && Intrinsics.a(this.e, s61Var.e) && this.f == s61Var.f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        h07 h07Var = this.b;
        int iHashCode2 = (iHashCode + (h07Var == null ? 0 : h07Var.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        prb prbVar = this.d;
        int iHashCode4 = (iHashCode3 + (prbVar == null ? 0 : prbVar.a.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode5 = (iHashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31;
        boolean z = this.f;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return iHashCode5 + i;
    }

    public final String toString() {
        return "InlineAd(html=" + this.a + ", bodyDeferred=" + this.b + ", baseUrl=" + this.c + ", adJson=" + this.d + ", adConfigKey=" + this.e + ", hasMultiAdConfigKey=" + this.f + ")";
    }
}
