package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class t3k implements y0n {
    public final y0n a;
    public final long b;

    public t3k(y0n y0nVar, long j) {
        this.a = y0nVar;
        this.b = j;
    }

    @Override // defpackage.y0n
    public final boolean b() {
        return this.a.b();
    }

    @Override // defpackage.y0n
    public final long c(if1 if1Var, if1 if1Var2, if1 if1Var3) {
        return this.a.c(if1Var, if1Var2, if1Var3) + this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof t3k)) {
            return false;
        }
        t3k t3kVar = (t3k) obj;
        return t3kVar.b == this.b && Intrinsics.a(t3kVar.a, this.a);
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    @Override // defpackage.y0n
    public final if1 t(long j, if1 if1Var, if1 if1Var2, if1 if1Var3) {
        long j2 = this.b;
        return j < j2 ? if1Var3 : this.a.t(j - j2, if1Var, if1Var2, if1Var3);
    }

    @Override // defpackage.y0n
    public final if1 w(long j, if1 if1Var, if1 if1Var2, if1 if1Var3) {
        long j2 = this.b;
        return j < j2 ? if1Var : this.a.w(j - j2, if1Var, if1Var2, if1Var3);
    }
}
