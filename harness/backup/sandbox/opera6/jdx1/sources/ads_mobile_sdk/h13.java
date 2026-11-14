package ads_mobile_sdk;

import defpackage.prb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class h13 {
    public final String a;
    public final prb b;

    public h13(prb prbVar, String str) {
        this.a = str;
        this.b = prbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h13)) {
            return false;
        }
        h13 h13Var = (h13) obj;
        return Intrinsics.a(this.a, h13Var.a) && Intrinsics.a(this.b, h13Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        prb prbVar = this.b;
        return iHashCode + (prbVar == null ? 0 : prbVar.a.hashCode());
    }

    public final String toString() {
        return "Action(name=" + this.a + ", info=" + this.b + ")";
    }
}
