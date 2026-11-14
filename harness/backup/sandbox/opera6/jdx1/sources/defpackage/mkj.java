package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class mkj {
    public final Object a;
    public final ew4 b;

    public mkj(Object obj, ew4 ew4Var) {
        this.a = obj;
        this.b = ew4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mkj)) {
            return false;
        }
        mkj mkjVar = (mkj) obj;
        return Intrinsics.a(this.a, mkjVar.a) && this.b == mkjVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SimpleChildNavState(configuration=" + this.a + ", status=" + this.b + ')';
    }
}
