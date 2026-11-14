package defpackage;

/* loaded from: classes.dex */
public final class kpc {
    public final long a;
    public final apc b;

    public kpc(long j, apc apcVar) {
        this.a = j;
        this.b = apcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kpc)) {
            return false;
        }
        kpc kpcVar = (kpc) obj;
        return this.a == kpcVar.a && this.b == kpcVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "";
    }
}
