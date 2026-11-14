package defpackage;

/* loaded from: classes.dex */
public final class qih {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public qih(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof qih)) {
            return false;
        }
        qih qihVar = (qih) obj;
        long j = qihVar.a;
        int i = u95.h;
        return jgm.a(this.a, j) && jgm.a(this.b, qihVar.b) && jgm.a(this.c, qihVar.c) && jgm.a(this.d, qihVar.d);
    }

    public final int hashCode() {
        int i = u95.h;
        igm igmVar = jgm.b;
        return Long.hashCode(this.d) + z1m.e(z1m.e(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }
}
