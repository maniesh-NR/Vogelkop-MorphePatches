package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class jth {
    public final String a;
    public final long b;
    public final Long c;
    public final orb d;

    public jth(String str, long j, Long l, orb orbVar) {
        this.a = str;
        this.b = j;
        this.c = l;
        this.d = orbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jth)) {
            return false;
        }
        jth jthVar = (jth) obj;
        return Intrinsics.a(this.a, jthVar.a) && this.b == jthVar.b && Intrinsics.a(this.c, jthVar.c) && this.d.equals(jthVar.d);
    }

    public final int hashCode() {
        int iE = z1m.e(this.a.hashCode() * 31, 31, this.b);
        Long l = this.c;
        return this.d.a.hashCode() + ((iE + (l == null ? 0 : l.hashCode())) * 31);
    }

    public final String toString() {
        return "";
    }
}
