package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class cv0 extends av0 {
    public final int c;
    public final String d;

    public cv0(String str, int i) {
        super(ae1.e);
        this.c = i;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cv0)) {
            return false;
        }
        cv0 cv0Var = (cv0) obj;
        return this.c == cv0Var.c && Intrinsics.a(this.d, cv0Var.d);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.c) * 31;
        String str = this.d;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "HttpError(responseCode=" + this.c + ", responseMessage=" + this.d + ")";
    }
}
