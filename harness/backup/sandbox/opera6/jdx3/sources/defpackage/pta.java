package defpackage;

/* loaded from: classes.dex */
public final class pta {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public pta(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public static /* synthetic */ pta b(pta ptaVar, long j, long j2, long j3, int i) {
        if ((i & 1) != 0) {
            j = ptaVar.a;
        }
        long j4 = j;
        long j5 = ptaVar.c;
        if ((i & 8) != 0) {
            j3 = ptaVar.d;
        }
        return ptaVar.a(j4, j2, j5, j3);
    }

    public final pta a(long j, long j2, long j3, long j4) {
        return new pta(j != 16 ? j : this.a, j2 != 16 ? j2 : this.b, j3 != 16 ? j3 : this.c, j4 != 16 ? j4 : this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof pta)) {
            return false;
        }
        pta ptaVar = (pta) obj;
        long j = ptaVar.a;
        int i = u95.h;
        return jgm.a(this.a, j) && jgm.a(this.b, ptaVar.b) && jgm.a(this.c, ptaVar.c) && jgm.a(this.d, ptaVar.d);
    }

    public final int hashCode() {
        int i = u95.h;
        igm igmVar = jgm.b;
        return Long.hashCode(this.d) + z1m.e(z1m.e(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }
}
