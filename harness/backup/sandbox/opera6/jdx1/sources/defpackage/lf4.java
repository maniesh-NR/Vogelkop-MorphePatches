package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class lf4 {
    public final yd4 a;
    public final vm2 b;

    public lf4(yd4 yd4Var, vm2 vm2Var) {
        this.a = yd4Var;
        this.b = vm2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lf4)) {
            return false;
        }
        lf4 lf4Var = (lf4) obj;
        return this.a == lf4Var.a && Intrinsics.a(this.b, lf4Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        vm2 vm2Var = this.b;
        return iHashCode + (vm2Var == null ? 0 : vm2Var.hashCode());
    }

    public final String toString() {
        return "CombinedCameraState(state=" + this.a + ", error=" + this.b + ')';
    }
}
