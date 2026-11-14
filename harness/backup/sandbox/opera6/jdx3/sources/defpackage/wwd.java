package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class wwd {
    public final pxh a;

    public wwd(pxh pxhVar, int i) {
        this.a = (i & 1) != 0 ? new qxh("") : pxhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wwd) && Intrinsics.a(this.a, ((wwd) obj).a);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + 1237;
    }

    public final String toString() {
        return "";
    }
}
