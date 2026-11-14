package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class uol {
    public final g1b a;
    public final int b;
    public final g1b c;

    public uol(g1b g1bVar, int i, g1b g1bVar2) {
        this.a = g1bVar;
        this.b = i;
        this.c = g1bVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uol)) {
            return false;
        }
        uol uolVar = (uol) obj;
        return Intrinsics.a(this.a, uolVar.a) && this.b == uolVar.b && Intrinsics.a(this.c, uolVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + rfp.c(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "TierHistoryUi(values=" + this.a + ", maxValue=" + this.b + ", markers=" + this.c + ")";
    }
}
