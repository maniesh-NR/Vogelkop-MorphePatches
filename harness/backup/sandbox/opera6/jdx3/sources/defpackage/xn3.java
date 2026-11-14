package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class xn3 {
    public j71 a = null;
    public a31 b = null;
    public uh4 c = null;
    public d91 d = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xn3)) {
            return false;
        }
        xn3 xn3Var = (xn3) obj;
        return Intrinsics.a(this.a, xn3Var.a) && Intrinsics.a(this.b, xn3Var.b) && Intrinsics.a(this.c, xn3Var.c) && Intrinsics.a(this.d, xn3Var.d);
    }

    public final int hashCode() {
        j71 j71Var = this.a;
        int iHashCode = (j71Var == null ? 0 : j71Var.hashCode()) * 31;
        a31 a31Var = this.b;
        int iHashCode2 = (iHashCode + (a31Var == null ? 0 : a31Var.hashCode())) * 31;
        uh4 uh4Var = this.c;
        int iHashCode3 = (iHashCode2 + (uh4Var == null ? 0 : uh4Var.hashCode())) * 31;
        d91 d91Var = this.d;
        return iHashCode3 + (d91Var != null ? d91Var.hashCode() : 0);
    }

    public final String toString() {
        return "BorderCache(imageBitmap=" + this.a + ", canvas=" + this.b + ", canvasDrawScope=" + this.c + ", borderPath=" + this.d + ")";
    }
}
