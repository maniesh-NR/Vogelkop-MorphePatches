package defpackage;

/* loaded from: classes.dex */
public final class fpf extends ipf {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final byte f;

    /* JADX WARN: Multi-variable type inference failed */
    public fpf(String str, int i, int i2, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
        this.f = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fpf)) {
            return false;
        }
        fpf fpfVar = (fpf) obj;
        return this.a.equals(fpfVar.a) && this.b.equals(fpfVar.b) && this.c.equals(fpfVar.c) && this.d.equals(fpfVar.d) && this.e == fpfVar.e && this.f == fpfVar.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + rfp.c(this.e, z1m.f(z1m.f(z1m.f(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31);
    }

    public final String toString() {
        return "";
    }
}
