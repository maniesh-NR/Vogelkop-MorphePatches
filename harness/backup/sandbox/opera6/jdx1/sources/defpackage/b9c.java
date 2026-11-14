package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b9c {
    public final m7c a;
    public final g1b b;
    public final g1b c;
    public final g1b d;
    public final uol e;

    public b9c(m7c m7cVar, g1b g1bVar, g1b g1bVar2, g1b g1bVar3, uol uolVar) {
        this.a = m7cVar;
        this.b = g1bVar;
        this.c = g1bVar2;
        this.d = g1bVar3;
        this.e = uolVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b9c)) {
            return false;
        }
        b9c b9cVar = (b9c) obj;
        return Intrinsics.a(this.a, b9cVar.a) && this.b.equals(b9cVar.b) && this.c.equals(b9cVar.c) && Intrinsics.a(this.d, b9cVar.d) && Intrinsics.a(this.e, b9cVar.e);
    }

    public final int hashCode() {
        m7c m7cVar = this.a;
        int iHashCode = (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + ((m7cVar == null ? 0 : m7cVar.hashCode()) * 31)) * 31)) * 31)) * 31;
        uol uolVar = this.e;
        return iHashCode + (uolVar != null ? uolVar.hashCode() : 0);
    }

    public final String toString() {
        return "LeaderboardUiState(standing=" + this.a + ", pendingRequirements=" + this.b + ", completedRequirements=" + this.c + ", tiers=" + this.d + ", tierHistory=" + this.e + ")";
    }
}
