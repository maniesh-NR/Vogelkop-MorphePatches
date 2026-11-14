package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class t4g {
    public final String a;
    public final String b;
    public final long c;
    public final boolean d;

    public t4g(long j, String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t4g)) {
            return false;
        }
        t4g t4gVar = (t4g) obj;
        return Intrinsics.a(this.a, t4gVar.a) && this.b.equals(t4gVar.b) && this.c == t4gVar.c && this.d == t4gVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + z1m.e(z1m.f(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "";
    }
}
