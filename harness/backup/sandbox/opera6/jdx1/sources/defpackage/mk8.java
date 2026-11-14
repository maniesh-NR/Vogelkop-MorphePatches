package defpackage;

/* loaded from: classes.dex */
public final class mk8 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public mk8(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mk8)) {
            return false;
        }
        mk8 mk8Var = (mk8) obj;
        long j = mk8Var.a;
        int i = u95.h;
        return jgm.a(this.a, j) && jgm.a(this.b, mk8Var.b) && jgm.a(this.c, mk8Var.c) && jgm.a(this.d, mk8Var.d);
    }

    public final int hashCode() {
        int i = u95.h;
        igm igmVar = jgm.b;
        return Long.hashCode(this.d) + z1m.e(z1m.e(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        String strH = u95.h(this.a);
        String strH2 = u95.h(this.b);
        return sko.n(z1m.n("ExtendedColors(primary=", strH, ", onPrimary=", strH2, ", container="), u95.h(this.c), ", onContainer=", u95.h(this.d), ")");
    }
}
