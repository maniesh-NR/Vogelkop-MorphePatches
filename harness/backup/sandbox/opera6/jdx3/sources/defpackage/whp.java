package defpackage;

/* loaded from: classes.dex */
public final class whp {
    public static int f = 1;
    public final int a;
    public final String b;
    public final int c;
    public final int d;
    public final vhp e;

    public whp(String str, int i, int i2, vhp vhpVar) {
        int i3 = f;
        f = i3 + 1;
        this.a = i3;
        this.b = str;
        this.c = i;
        this.d = i2;
        this.e = vhpVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || whp.class != obj.getClass()) {
            return false;
        }
        whp whpVar = (whp) obj;
        if (this.c == whpVar.c && this.d == whpVar.d && this.e == whpVar.e) {
            return this.b.equals(whpVar.b);
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + (((((((this.b.hashCode() * 31) + this.c) * 31) + this.d) * 31) + 4096) * 31);
    }
}
