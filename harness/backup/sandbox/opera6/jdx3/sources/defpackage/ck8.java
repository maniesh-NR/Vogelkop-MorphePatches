package defpackage;

/* loaded from: classes.dex */
public final class ck8 {
    public final String a;
    public final String b;
    public final long c;
    public final long d;
    public final boolean e;

    public ck8(long j, long j2, String str, String str2, boolean z) {
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
        if (obj == null || ck8.class != obj.getClass()) {
            return false;
        }
        ck8 ck8Var = (ck8) obj;
        return this.c == ck8Var.c && this.d == ck8Var.d && this.a.equals(ck8Var.a) && this.b.equals(ck8Var.b) && this.e == ck8Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + z1m.e(z1m.e(z1m.f(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }
}
