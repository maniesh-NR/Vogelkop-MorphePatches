package defpackage;

/* loaded from: classes.dex */
public final class poc {
    public final long a;
    public final jnc b;
    public final long c;

    public poc(long j, jnc jncVar, long j2) {
        this.a = j;
        this.b = jncVar;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof poc)) {
            return false;
        }
        poc pocVar = (poc) obj;
        return this.a == pocVar.a && this.b == pocVar.b && this.c == pocVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + ((this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        return "";
    }
}
