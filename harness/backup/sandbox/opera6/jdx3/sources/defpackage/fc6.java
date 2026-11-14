package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class fc6 {
    public final jm3 a;
    public final v5g b;

    public fc6(jm3 jm3Var, v5g v5gVar) {
        this.a = jm3Var;
        this.b = v5gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fc6)) {
            return false;
        }
        fc6 fc6Var = (fc6) obj;
        return Intrinsics.a(this.a, fc6Var.a) && Intrinsics.a(this.b, fc6Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "";
    }
}
