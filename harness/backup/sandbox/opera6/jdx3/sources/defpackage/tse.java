package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class tse {
    public final ij0 a;
    public final l0c b;

    public tse(ij0 ij0Var, l0c l0cVar) {
        this.a = ij0Var;
        this.b = l0cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof tse) {
            tse tseVar = (tse) obj;
            if (this.a == tseVar.a && Intrinsics.a(this.b, tseVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "";
    }
}
