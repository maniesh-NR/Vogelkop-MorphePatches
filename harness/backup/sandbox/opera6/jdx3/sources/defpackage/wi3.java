package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class wi3 {
    public final xi3 a;
    public final yi3 b;

    public wi3(xi3 xi3Var, yi3 yi3Var) {
        this.a = xi3Var;
        this.b = yi3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wi3)) {
            return false;
        }
        wi3 wi3Var = (wi3) obj;
        return Intrinsics.a(this.a, wi3Var.a) && this.b.equals(wi3Var.b);
    }

    public final int hashCode() {
        xi3 xi3Var = this.a;
        return this.b.hashCode() + ((xi3Var == null ? 0 : xi3Var.hashCode()) * 31);
    }

    public final String toString() {
        return "";
    }
}
