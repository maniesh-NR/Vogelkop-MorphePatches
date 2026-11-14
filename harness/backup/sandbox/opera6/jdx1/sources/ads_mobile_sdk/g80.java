package ads_mobile_sdk;

import defpackage.a6p;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g80 extends a6p {
    public final String a;
    public final zf1 b;

    public g80(String str, zf1 zf1Var) {
        this.a = str;
        this.b = zf1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g80)) {
            return false;
        }
        g80 g80Var = (g80) obj;
        return Intrinsics.a(this.a, g80Var.a) && this.b.equals(g80Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ImageCustomAsset(key=" + this.a + ", imageValue=" + this.b + ")";
    }
}
