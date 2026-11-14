package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class wz0 {
    public final mga a;

    public wz0(mga mgaVar) {
        this.a = mgaVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof wz0) && Intrinsics.a(this.a, ((wz0) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Value(alignmentLine=" + this.a + ")";
    }
}
