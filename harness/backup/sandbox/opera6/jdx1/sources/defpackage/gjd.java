package defpackage;

/* loaded from: classes.dex */
public class gjd {
    public static final gjd i = new gjd(new fjd());
    public static final String j = "0";
    public static final String k = "1";
    public static final String l = "2";
    public static final String m = "3";
    public static final String n = "4";
    public static final String o = "5";
    public static final String p = "6";
    public static final String q = "7";
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public gjd(fjd fjdVar) {
        this.a = tym.c0(fjdVar.a);
        this.c = tym.c0(fjdVar.c);
        this.b = fjdVar.a;
        this.d = fjdVar.c;
        this.e = fjdVar.b;
        this.f = fjdVar.d;
        this.g = fjdVar.e;
        this.h = fjdVar.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gjd)) {
            return false;
        }
        gjd gjdVar = (gjd) obj;
        return this.b == gjdVar.b && this.d == gjdVar.d && this.e == gjdVar.e && this.f == gjdVar.f && this.g == gjdVar.g && this.h == gjdVar.h;
    }

    public final int hashCode() {
        long j2 = this.b;
        int i2 = ((int) (j2 ^ (j2 >>> 32))) * 31;
        long j3 = this.d;
        return ((((((((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.e ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0);
    }
}
