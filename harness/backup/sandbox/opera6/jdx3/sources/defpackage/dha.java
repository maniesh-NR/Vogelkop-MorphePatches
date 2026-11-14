package defpackage;

/* loaded from: classes.dex */
public final class dha {
    public final String a;
    public final long b;
    public final long c;
    public final String d;

    public dha(long j, long j2, String str, String str2) {
        this.a = str;
        this.b = j;
        this.c = j2;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dha)) {
            return false;
        }
        dha dhaVar = (dha) obj;
        return this.a.equals(dhaVar.a) && this.b == dhaVar.b && this.c == dhaVar.c && this.d.equals(dhaVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + z1m.e(z1m.e(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "";
    }
}
