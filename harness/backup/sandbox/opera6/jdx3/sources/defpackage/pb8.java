package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class pb8 {
    public final String a;
    public final long b;
    public final Long c;

    public pb8(long j, Long l, String str) {
        this.a = str;
        this.b = j;
        this.c = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pb8)) {
            return false;
        }
        pb8 pb8Var = (pb8) obj;
        return this.a.equals(pb8Var.a) && this.b == pb8Var.b && Intrinsics.a(this.c, pb8Var.c);
    }

    public final int hashCode() {
        int iE = z1m.e(this.a.hashCode() * 31, 31, this.b);
        Long l = this.c;
        return iE + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        return "EventCheckoutParametersData(iso3=" + this.a + ", days=" + this.b + ", gigas=" + this.c + ")";
    }
}
