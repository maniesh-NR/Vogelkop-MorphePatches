package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class t2f {
    public final String a;
    public final String b;
    public final String c;

    public t2f(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t2f)) {
            return false;
        }
        t2f t2fVar = (t2f) obj;
        return Intrinsics.a(this.a, t2fVar.a) && Intrinsics.a(this.b, t2fVar.b) && Intrinsics.a(this.c, t2fVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + z1m.f(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "";
    }
}
