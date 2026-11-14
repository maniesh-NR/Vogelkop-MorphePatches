package ads_mobile_sdk;

import defpackage.a6p;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class h80 extends a6p {
    public final String a;
    public final String b;

    public h80(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h80)) {
            return false;
        }
        h80 h80Var = (h80) obj;
        return this.a.equals(h80Var.a) && Intrinsics.a(this.b, h80Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return sko.l("StringCustomAsset(key=", this.a, ", stringValue=", this.b, ")");
    }
}
