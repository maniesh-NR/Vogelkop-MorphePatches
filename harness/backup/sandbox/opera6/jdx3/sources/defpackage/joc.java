package defpackage;

/* loaded from: classes.dex */
public final class joc {
    public final long a;
    public final apc b;

    public joc(long j, apc apcVar) {
        this.a = j;
        this.b = apcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof joc)) {
            return false;
        }
        joc jocVar = (joc) obj;
        return this.a == jocVar.a && this.b == jocVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "";
    }
}
