package defpackage;

/* loaded from: classes.dex */
public final class rhc {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;

    public rhc(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = j7;
        this.h = j8;
        this.i = j9;
    }

    public static rhc a(rhc rhcVar, long j) {
        long j2;
        long j3;
        long j4 = rhcVar.b;
        long j5 = rhcVar.c;
        long j6 = rhcVar.d;
        long j7 = rhcVar.e;
        long j8 = rhcVar.f;
        long j9 = rhcVar.g;
        long j10 = rhcVar.h;
        long j11 = rhcVar.i;
        if (j != 16) {
            j2 = j11;
            j3 = j;
        } else {
            j2 = j11;
            j3 = rhcVar.a;
        }
        return new rhc(j3, j4, j5, j6, j7, j8, j9, j10, j2);
    }
}
