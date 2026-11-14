package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class i0n implements g2o {
    public final String a;
    public final t0g b;

    public i0n(bab babVar, String str) {
        this.a = str;
        this.b = hyg.k(babVar);
    }

    @Override // defpackage.g2o
    public final int a(n27 n27Var) {
        return e().b;
    }

    @Override // defpackage.g2o
    public final int b(n27 n27Var, d2c d2cVar) {
        return e().c;
    }

    @Override // defpackage.g2o
    public final int c(n27 n27Var) {
        return e().d;
    }

    @Override // defpackage.g2o
    public final int d(n27 n27Var, d2c d2cVar) {
        return e().a;
    }

    public final bab e() {
        return (bab) this.b.getValue();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i0n) {
            return Intrinsics.a(e(), ((i0n) obj).e());
        }
        return false;
    }

    public final void f(bab babVar) {
        this.b.setValue(babVar);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        int i = e().a;
        int i2 = e().b;
        int i3 = e().c;
        int i4 = e().d;
        StringBuilder sb = new StringBuilder(this.a);
        sb.append("(left=");
        sb.append(i);
        sb.append(", top=");
        sb.append(i2);
        vep.w(i3, i4, ", right=", ", bottom=", sb);
        sb.append(")");
        return sb.toString();
    }
}
