package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class xp9 extends c09 {
    public final wp9 W;
    public final String X;
    public final nsd Y;

    public xp9(wp9 wp9Var, String str, nsd nsdVar) {
        this.W = wp9Var;
        this.X = str;
        this.Y = nsdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xp9)) {
            return false;
        }
        xp9 xp9Var = (xp9) obj;
        return this.W == xp9Var.W && this.X.equals(xp9Var.X) && Intrinsics.a(this.Y, xp9Var.Y);
    }

    public final int hashCode() {
        int iF = z1m.f(this.W.hashCode() * 31, 31, this.X);
        nsd nsdVar = this.Y;
        return iF + (nsdVar == null ? 0 : nsdVar.hashCode());
    }

    public final String toString() {
        return "FullScreenContentError(code=" + this.W + ", message=" + this.X + ", mediationAdError=" + this.Y + ")";
    }
}
