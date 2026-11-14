package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class r0i {
    public final byte a;
    public final x61 b;

    /* JADX WARN: Multi-variable type inference failed */
    public r0i(int i, x61 x61Var) {
        this.a = i;
        this.b = x61Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0i)) {
            return false;
        }
        r0i r0iVar = (r0i) obj;
        return this.a == r0iVar.a && Intrinsics.a(this.b, r0iVar.b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        x61 x61Var = this.b;
        return iHashCode + (x61Var == null ? 0 : x61Var.hashCode());
    }

    public final String toString() {
        return "Result3A(status=" + ((Object) ("Status(value=" + ((int) this.a) + ')')) + ", frameMetadata=" + this.b + ')';
    }
}
