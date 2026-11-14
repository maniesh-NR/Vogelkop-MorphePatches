package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class xp5 {
    public final int a;
    public final long b;
    public final yp5 c;
    public final bxk d;

    public xp5(int i, long j, yp5 yp5Var, bxk bxkVar) {
        this.a = i;
        this.b = j;
        this.c = yp5Var;
        this.d = bxkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xp5)) {
            return false;
        }
        xp5 xp5Var = (xp5) obj;
        return this.a == xp5Var.a && this.b == xp5Var.b && this.c == xp5Var.c && Intrinsics.a(this.d, xp5Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + z1m.e(Integer.hashCode(this.a) * 31, 31, this.b)) * 31;
        bxk bxkVar = this.d;
        return iHashCode + (bxkVar == null ? 0 : bxkVar.hashCode());
    }

    public final String toString() {
        return "ContentCaptureEvent(id=" + this.a + ", timestamp=" + this.b + ", type=" + this.c + ", structureCompat=" + this.d + ")";
    }
}
