package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ev0 extends av0 {
    public final String c;
    public final ae1 d;

    public /* synthetic */ ev0(String str) {
        this(str, ae1.a);
    }

    public ev0(String str, ae1 ae1Var) {
        super(ae1Var);
        this.c = str;
        this.d = ae1Var;
    }

    @Override // ads_mobile_sdk.av0
    public final ae1 a() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ev0)) {
            return false;
        }
        ev0 ev0Var = (ev0) obj;
        return Intrinsics.a(this.c, ev0Var.c) && this.d == ev0Var.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() * 31);
    }

    public final String toString() {
        return "MessageError(message=" + this.c + ", internalErrorCode=" + this.d + ")";
    }
}
