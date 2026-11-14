package defpackage;

/* loaded from: classes.dex */
public final class gdl {
    public final long a;
    public final hdl b;

    public gdl(long j, hdl hdlVar) {
        this.a = j;
        this.b = hdlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gdl)) {
            return false;
        }
        gdl gdlVar = (gdl) obj;
        return this.a == gdlVar.a && this.b == gdlVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "TeamId(id=" + this.a + ", sport=" + this.b + ")";
    }
}
