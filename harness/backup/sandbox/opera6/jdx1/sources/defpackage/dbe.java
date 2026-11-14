package defpackage;

/* loaded from: classes.dex */
public final class dbe implements jxd {
    public final long a;
    public final long b;
    public final long c;

    public dbe(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dbe)) {
            return false;
        }
        dbe dbeVar = (dbe) obj;
        return this.a == dbeVar.a && this.b == dbeVar.b && this.c == dbeVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + z1m.e(z1m.e(527, 31, this.a), 31, this.b);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.a + ", modification time=" + this.b + ", timescale=" + this.c;
    }
}
