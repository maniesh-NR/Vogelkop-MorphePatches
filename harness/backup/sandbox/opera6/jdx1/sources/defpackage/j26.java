package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class j26 extends wxe {
    public final sd3 m;

    public j26(sd3 sd3Var) {
        this.m = sd3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j26) && Intrinsics.a(this.m, ((j26) obj).m);
    }

    @Override // defpackage.wxe
    public final int g(int i, int i2, d2c d2cVar, ifg ifgVar, int i3) {
        return this.m.a(i2, i);
    }

    public final int hashCode() {
        return this.m.hashCode();
    }

    public final String toString() {
        return "VerticalCrossAxisAlignment(vertical=" + this.m + ")";
    }
}
