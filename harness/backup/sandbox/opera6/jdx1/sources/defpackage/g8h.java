package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g8h implements i8h {
    public final yc4 a;

    public g8h(yc4 yc4Var) {
        this.a = yc4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g8h) && Intrinsics.a(this.a, ((g8h) obj).a);
    }

    public final int hashCode() {
        yc4 yc4Var = this.a;
        if (yc4Var == null) {
            return 0;
        }
        return Integer.hashCode(yc4Var.a);
    }

    public final String toString() {
        return "Error(lastCameraError=" + this.a + ')';
    }
}
