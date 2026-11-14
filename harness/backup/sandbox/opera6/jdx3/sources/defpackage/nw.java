package defpackage;

/* loaded from: classes.dex */
public final class nw implements ow {
    public final wv a;
    public final long b;

    public nw(wv wvVar, long j) {
        this.a = wvVar;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nw)) {
            return false;
        }
        nw nwVar = (nw) obj;
        return this.a.equals(nwVar.a) && this.b == nwVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        return "Registered(address=" + this.a + ", publishedOn=" + this.b + ")";
    }
}
