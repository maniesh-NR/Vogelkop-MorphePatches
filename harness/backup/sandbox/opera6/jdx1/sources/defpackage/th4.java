package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class th4 {
    public n27 a;
    public d2c b;
    public sh4 c;
    public long d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof th4)) {
            return false;
        }
        th4 th4Var = (th4) obj;
        return Intrinsics.a(this.a, th4Var.a) && this.b == th4Var.b && Intrinsics.a(this.c, th4Var.c) && bpj.a(this.d, th4Var.d);
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "DrawParams(density=" + this.a + ", layoutDirection=" + this.b + ", canvas=" + this.c + ", size=" + bpj.f(this.d) + ")";
    }
}
