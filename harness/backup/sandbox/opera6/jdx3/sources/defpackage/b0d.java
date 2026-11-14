package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b0d extends y9m {
    public final ehc q;

    public b0d(ehc ehcVar) {
        this.q = ehcVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof b0d) && Intrinsics.a(this.q, ((b0d) obj).q);
        }
        return true;
    }

    public final int hashCode() {
        return this.q.hashCode();
    }

    public final String toString() {
        return "";
    }
}
