package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class bs3 implements zr3 {
    public final ikk a;
    public final long b;

    public bs3(ikk ikkVar, long j) {
        this.a = ikkVar;
        this.b = j;
    }

    @Override // defpackage.zr3
    public final c8e a(c8e c8eVar, td3 td3Var) {
        return c8eVar.d(new jr3(td3Var, false, uup.d));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bs3)) {
            return false;
        }
        bs3 bs3Var = (bs3) obj;
        return Intrinsics.a(this.a, bs3Var.a) && yo5.b(this.b, bs3Var.b);
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BoxWithConstraintsScopeImpl(density=" + this.a + ", constraints=" + yo5.l(this.b) + ")";
    }
}
