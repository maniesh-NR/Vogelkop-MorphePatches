package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class qq {
    public final xog a;
    public final long b;
    public final String c;

    public qq(xog xogVar, long j, String str) {
        this.a = xogVar;
        this.b = j;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qq)) {
            return false;
        }
        qq qqVar = (qq) obj;
        return this.a == qqVar.a && this.b == qqVar.b && Intrinsics.a(this.c, qqVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + z1m.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdValue(precisionType=");
        sb.append(this.a);
        sb.append(", valueMicros=");
        sb.append(this.b);
        return p3p.n(sb, ", currencyCode=", this.c, ")");
    }
}
