package ads_mobile_sdk;

import defpackage.rap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class hv0 implements rap {
    public final Object b;

    public hv0(Object obj) {
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hv0) && Intrinsics.a(this.b, ((hv0) obj).b);
    }

    public final int hashCode() {
        Object obj = this.b;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "Success(result=" + this.b + ")";
    }
}
