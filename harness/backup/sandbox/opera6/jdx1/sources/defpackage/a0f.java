package defpackage;

/* loaded from: classes.dex */
public final class a0f {
    public final String a;
    public final String b;
    public final long c;
    public final long d;
    public final boolean e;

    public a0f(long j, long j2, String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a0f.class != obj.getClass()) {
            return false;
        }
        a0f a0fVar = (a0f) obj;
        return this.c == a0fVar.c && this.d == a0fVar.d && this.a.equals(a0fVar.a) && this.b.equals(a0fVar.b) && this.e == a0fVar.e;
    }

    public final int hashCode() {
        int iF = z1m.f(this.a.hashCode() * 31, 31, this.b);
        long j = this.c;
        int i = (iF + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.d;
        return Boolean.hashCode(this.e) + ((i + ((int) (j2 ^ (j2 >>> 32)))) * 31);
    }
}
