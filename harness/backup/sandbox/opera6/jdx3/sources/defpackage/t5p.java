package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class t5p {
    public final int a;
    public final Boolean b;
    public final boolean c;

    public t5p(int i, Boolean bool, boolean z) {
        this.a = i;
        this.b = bool;
        this.c = z;
    }

    public final String a() {
        t5p t5pVar = d1p.a;
        int i = this.a;
        return i != -1 ? i != 2 ? i != 4 ? i != 5 ? i != 6 ? i != 7 ? "unknown" : "5g" : "4g" : "3g" : "2g" : "wifi" : "none";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t5p)) {
            return false;
        }
        t5p t5pVar = (t5p) obj;
        return this.a == t5pVar.a && Intrinsics.a(this.b, t5pVar.b) && this.c == t5pVar.c;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        Boolean bool = this.b;
        return Boolean.hashCode(this.c) + ((iHashCode + (bool == null ? 0 : bool.hashCode())) * 31);
    }

    public final String toString() {
        return "ConnectionInfo(type=" + this.a + ", connected=" + this.b + ", isVpnInUse=" + this.c + ')';
    }
}
