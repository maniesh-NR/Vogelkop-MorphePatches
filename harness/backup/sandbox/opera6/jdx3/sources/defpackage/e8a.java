package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e8a {
    public final String a;

    public final boolean equals(Object obj) {
        if (obj instanceof e8a) {
            return Intrinsics.a(this.a, ((e8a) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return sko.k("SHA512HexLowercase(raw=", this.a, ")");
    }
}
