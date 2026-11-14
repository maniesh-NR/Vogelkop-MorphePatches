package defpackage;

/* loaded from: classes.dex */
public final class is5 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;

    public is5(long j, long j2, long j3, long j4, long j5) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof is5)) {
            return false;
        }
        is5 is5Var = (is5) obj;
        long j = is5Var.a;
        int i = u95.h;
        return jgm.a(this.a, j) && jgm.a(this.b, is5Var.b) && jgm.a(this.c, is5Var.c) && jgm.a(this.d, is5Var.d) && jgm.a(this.e, is5Var.e);
    }

    public final int hashCode() {
        int i = u95.h;
        igm igmVar = jgm.b;
        return Long.hashCode(this.e) + z1m.e(z1m.e(z1m.e(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        String strH = u95.h(this.a);
        String strH2 = u95.h(this.b);
        String strH3 = u95.h(this.c);
        String strH4 = u95.h(this.d);
        String strH5 = u95.h(this.e);
        StringBuilder sbN = z1m.n("ContextMenuColors(backgroundColor=", strH, ", textColor=", strH2, ", iconColor=");
        z1m.t(sbN, strH3, ", disabledTextColor=", strH4, ", disabledIconColor=");
        return z1m.l(sbN, strH5, ")");
    }
}
