package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class y4l {
    public final String a;

    public final boolean equals(Object obj) {
        if (obj instanceof y4l) {
            return Intrinsics.a(this.a, ((y4l) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return sko.k("MainPageUrl(value=", this.a, ")");
    }
}
