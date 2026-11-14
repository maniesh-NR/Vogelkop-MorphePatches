package defpackage;

/* loaded from: classes.dex */
public final class pcd {
    public final long a;
    public final qcd b;

    public pcd(long j, qcd qcdVar) {
        this.a = j;
        this.b = qcdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pcd)) {
            return false;
        }
        pcd pcdVar = (pcd) obj;
        return this.a == pcdVar.a && this.b == pcdVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "MatchId(id=" + this.a + ", sport=" + this.b + ")";
    }
}
