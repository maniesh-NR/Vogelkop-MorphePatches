package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class of4 extends kf4 {
    public final yc4 a;

    public of4(yc4 yc4Var) {
        this.a = yc4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof of4) && Intrinsics.a(this.a, ((of4) obj).a);
    }

    public final int hashCode() {
        yc4 yc4Var = this.a;
        if (yc4Var == null) {
            return 0;
        }
        return Integer.hashCode(yc4Var.a);
    }

    public final String toString() {
        return "CameraStateClosing(cameraErrorCode=" + this.a + ')';
    }
}
