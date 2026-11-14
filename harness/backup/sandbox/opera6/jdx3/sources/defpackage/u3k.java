package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class u3k {
    public final String a;
    public final String b;
    public final int c;

    public u3k(String str, String str2, int i) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u3k)) {
            return false;
        }
        u3k u3kVar = (u3k) obj;
        return Intrinsics.a(this.a, u3kVar.a) && Intrinsics.a(this.b, u3kVar.b) && this.c == u3kVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + z1m.f(z1m.f(1741238018, 31, this.a), 31, this.b);
    }

    public final String toString() {
        return "";
    }
}
