package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class kth {
    public final orb a;
    public final e74 b;

    public kth(orb orbVar, e74 e74Var) {
        this.a = orbVar;
        this.b = e74Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kth)) {
            return false;
        }
        kth kthVar = (kth) obj;
        return this.a.equals(kthVar.a) && Intrinsics.a(this.b, kthVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        return "";
    }
}
