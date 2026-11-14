package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a8a {
    public final String a;

    public final boolean equals(Object obj) {
        if (obj instanceof a8a) {
            return Intrinsics.a(this.a, ((a8a) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return sko.k("SHA256Base64(raw=", this.a, ")");
    }
}
