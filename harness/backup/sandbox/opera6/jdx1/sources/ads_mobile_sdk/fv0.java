package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class fv0 extends av0 {
    public final String c;
    public final boolean d;

    /* JADX WARN: Illegal instructions before constructor call */
    public fv0(String str, int i) {
        if ((i & 1) != 0) {
            zl0[] zl0VarArr = zl0.f;
            str = "No fill.";
        }
        this(str, false);
    }

    public fv0(String str, boolean z) {
        super(ae1.c);
        this.c = str;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fv0)) {
            return false;
        }
        fv0 fv0Var = (fv0) obj;
        return Intrinsics.a(this.c, fv0Var.c) && this.d == fv0Var.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int iHashCode = this.c.hashCode() * 31;
        boolean z = this.d;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return iHashCode + i;
    }

    public final String toString() {
        return "NoFillError(message=" + this.c + ", isThrottled=" + this.d + ")";
    }
}
