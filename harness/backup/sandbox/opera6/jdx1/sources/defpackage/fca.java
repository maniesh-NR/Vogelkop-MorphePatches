package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class fca implements gca {
    public final String a;

    public fca(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fca) && Intrinsics.a(this.a, ((fca) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return sko.k("ReadyToActivate(targetUrl=", this.a, ")");
    }
}
