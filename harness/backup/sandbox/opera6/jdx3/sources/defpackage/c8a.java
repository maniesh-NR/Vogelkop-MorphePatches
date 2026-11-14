package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c8a {
    public final String a;

    public final boolean equals(Object obj) {
        if (obj instanceof c8a) {
            return Intrinsics.a(this.a, ((c8a) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return sko.k("SHA256HexLowercase(raw=", this.a, ")");
    }
}
