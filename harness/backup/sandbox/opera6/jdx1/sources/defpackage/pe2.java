package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class pe2 {
    public final Object a;

    public final boolean equals(Object obj) {
        if (obj instanceof pe2) {
            return Intrinsics.a(this.a, ((pe2) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "AsyncTypefaceResult(result=" + this.a + ")";
    }
}
