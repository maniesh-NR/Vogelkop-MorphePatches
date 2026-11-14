package defpackage;

/* loaded from: classes.dex */
public final class l8b {
    public final long a;
    public final nla b;

    public l8b(long j, nla nlaVar) {
        mla mlaVar = mla.a;
        this.a = j;
        this.b = nlaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l8b)) {
            return false;
        }
        l8b l8bVar = (l8b) obj;
        if (this.a != l8bVar.a || this.b != l8bVar.b) {
            return false;
        }
        mla mlaVar = mla.a;
        return true;
    }

    public final int hashCode() {
        return mla.a.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        return "InputBoxState(height=" + this.a + ", status=" + this.b + ", mode=" + mla.a + ")";
    }
}
