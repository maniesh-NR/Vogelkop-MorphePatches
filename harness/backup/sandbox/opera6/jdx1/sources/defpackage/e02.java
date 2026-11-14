package defpackage;

/* loaded from: classes.dex */
public final class e02 {
    public final String a;
    public final String b;
    public final f02 c;
    public final long d;

    public e02(String str, String str2, f02 f02Var, long j) {
        this.a = str;
        this.b = str2;
        this.c = f02Var;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e02)) {
            return false;
        }
        e02 e02Var = (e02) obj;
        return this.a.equals(e02Var.a) && this.b.equals(e02Var.b) && this.c == e02Var.c && this.d == e02Var.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + ((this.c.hashCode() + z1m.f(this.a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        return "";
    }
}
