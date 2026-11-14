package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class agf {
    public final z21 a;
    public final yc4 b;

    public agf(z21 z21Var, yc4 yc4Var, int i) {
        z21Var = (i & 1) != 0 ? null : z21Var;
        yc4Var = (i & 2) != 0 ? null : yc4Var;
        this.a = z21Var;
        this.b = yc4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof agf)) {
            return false;
        }
        agf agfVar = (agf) obj;
        return Intrinsics.a(this.a, agfVar.a) && Intrinsics.a(this.b, agfVar.b);
    }

    public final int hashCode() {
        z21 z21Var = this.a;
        int iHashCode = (z21Var == null ? 0 : z21Var.hashCode()) * 31;
        yc4 yc4Var = this.b;
        return iHashCode + (yc4Var != null ? Integer.hashCode(yc4Var.a) : 0);
    }

    public final String toString() {
        return "OpenCameraResult(cameraState=" + this.a + ", errorCode=" + this.b + ')';
    }
}
