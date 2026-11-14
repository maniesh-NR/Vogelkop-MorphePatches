package defpackage;

/* loaded from: classes.dex */
public final class jaj {
    public static final jaj d = new jaj(cs5.d(4278190080L), 0, 0.0f);
    public final long a;
    public final long b;
    public final float c;

    public jaj(long j, long j2, float f) {
        this.a = j;
        this.b = j2;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jaj)) {
            return false;
        }
        jaj jajVar = (jaj) obj;
        long j = jajVar.a;
        int i = u95.h;
        return jgm.a(this.a, j) && y8f.b(this.b, jajVar.b) && this.c == jajVar.c;
    }

    public final int hashCode() {
        int i = u95.h;
        igm igmVar = jgm.b;
        return Float.hashCode(this.c) + z1m.e(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return am2.n(z1m.n("Shadow(color=", u95.h(this.a), ", offset=", y8f.g(this.b), ", blurRadius="), this.c, ")");
    }
}
