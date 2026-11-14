package defpackage;

/* loaded from: classes.dex */
public final class rkm {
    public final String a;
    public final long b;
    public final long c;
    public final String d;

    public rkm(long j, long j2, String str, String str2) {
        this.a = str;
        this.b = j;
        this.c = j2;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rkm)) {
            return false;
        }
        rkm rkmVar = (rkm) obj;
        return this.a.equals(rkmVar.a) && this.b == rkmVar.b && this.c == rkmVar.c && this.d.equals(rkmVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + z1m.e(z1m.e(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "";
    }
}
