package defpackage;

/* loaded from: classes.dex */
public final class z14 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public z14(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public static /* synthetic */ z14 b(z14 z14Var, long j, long j2, long j3, long j4, int i) {
        if ((i & 1) != 0) {
            j = z14Var.a;
        }
        long j5 = j;
        if ((i & 2) != 0) {
            j2 = z14Var.b;
        }
        long j6 = j2;
        if ((i & 4) != 0) {
            j3 = z14Var.c;
        }
        return z14Var.a(j5, j6, j3, (i & 8) != 0 ? z14Var.d : j4);
    }

    public final z14 a(long j, long j2, long j3, long j4) {
        return new z14(j != 16 ? j : this.a, j2 != 16 ? j2 : this.b, j3 != 16 ? j3 : this.c, j4 != 16 ? j4 : this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof z14)) {
            return false;
        }
        z14 z14Var = (z14) obj;
        long j = z14Var.a;
        int i = u95.h;
        return jgm.a(this.a, j) && jgm.a(this.b, z14Var.b) && jgm.a(this.c, z14Var.c) && jgm.a(this.d, z14Var.d);
    }

    public final int hashCode() {
        int i = u95.h;
        igm igmVar = jgm.b;
        return Long.hashCode(this.d) + z1m.e(z1m.e(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }
}
