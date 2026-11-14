package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class u7a {
    public final String a;

    public /* synthetic */ u7a(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u7a) {
            return Intrinsics.a(this.a, ((u7a) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return sko.k("MD5HexLowercase(raw=", this.a, ")");
    }
}
