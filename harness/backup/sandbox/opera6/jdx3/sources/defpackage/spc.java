package defpackage;

/* loaded from: classes.dex */
public final class spc {
    public final long a;
    public final apc b;

    public spc(long j, apc apcVar) {
        this.a = j;
        this.b = apcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof spc)) {
            return false;
        }
        spc spcVar = (spc) obj;
        return this.a == spcVar.a && this.b == spcVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "";
    }
}
