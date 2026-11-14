package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class f13 {
    public final defpackage.r83 a;

    public f13(defpackage.r83 r83Var) {
        this.a = r83Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f13) && Intrinsics.a(this.a, ((f13) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ServerRequest(baseRequest=" + this.a + ")";
    }
}
