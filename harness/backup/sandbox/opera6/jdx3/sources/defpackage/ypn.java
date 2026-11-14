package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ypn implements zpn {
    public final lon a;
    public final String b;
    public final double c;

    public ypn(lon lonVar, String str, double d) {
        this.a = lonVar;
        this.b = str;
        this.c = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ypn)) {
            return false;
        }
        ypn ypnVar = (ypn) obj;
        return this.a == ypnVar.a && Intrinsics.a(this.b, ypnVar.b) && Double.compare(this.c, ypnVar.c) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.c) + z1m.f(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "";
    }
}
