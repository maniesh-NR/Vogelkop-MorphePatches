package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d8a {
    public final String a;

    public final boolean equals(Object obj) {
        if (obj instanceof d8a) {
            return Intrinsics.a(this.a, ((d8a) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return sko.k("SHA512Base64Url(raw=", this.a, ")");
    }
}
