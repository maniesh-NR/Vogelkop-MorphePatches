package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class z7a {
    public final String a;

    public /* synthetic */ z7a(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof z7a) {
            return Intrinsics.a(this.a, ((z7a) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return sko.k("SHA1HexLowercase(raw=", this.a, ")");
    }
}
