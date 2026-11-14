package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class gs4 {
    public final cs4 a;
    public final String b;
    public final ebb c;
    public final long d;
    public final int e;

    public gs4(cs4 cs4Var, String str, ebb ebbVar, long j, int i) {
        this.a = cs4Var;
        this.b = str;
        this.c = ebbVar;
        this.d = j;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gs4)) {
            return false;
        }
        gs4 gs4Var = (gs4) obj;
        return this.a == gs4Var.a && this.b.equals(gs4Var.b) && Intrinsics.a(this.c, gs4Var.c) && this.d == gs4Var.d && this.e == gs4Var.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + z1m.e((this.c.hashCode() + z1m.f(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d);
    }

    public final String toString() {
        return "";
    }
}
