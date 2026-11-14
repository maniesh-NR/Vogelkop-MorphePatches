package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c8h implements e8h {
    public final yc4 a;

    public c8h(yc4 yc4Var) {
        this.a = yc4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c8h) && Intrinsics.a(this.a, ((c8h) obj).a);
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
