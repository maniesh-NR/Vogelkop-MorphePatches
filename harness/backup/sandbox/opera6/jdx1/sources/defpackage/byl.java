package defpackage;

/* loaded from: classes.dex */
public final class byl {
    public final int a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final oj9 g;
    public final boolean h;
    public final long[] i;
    public final long[] j;
    public final int k;
    public final cyl[] l;

    /* JADX WARN: Multi-variable type inference failed */
    public byl(int i, int i2, long j, long j2, long j3, long j4, oj9 oj9Var, int i3, cyl[] cylVarArr, int i4, long[] jArr, long[] jArr2) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = j4;
        this.g = oj9Var;
        this.h = i3;
        this.l = cylVarArr;
        this.k = i4;
        this.i = jArr;
        this.j = jArr2;
    }

    public final byl a(oj9 oj9Var) {
        long[] jArr = this.i;
        long[] jArr2 = this.j;
        int i = this.a;
        int i2 = this.b;
        long j = this.c;
        long j2 = this.d;
        long j3 = this.e;
        long j4 = this.f;
        boolean z = this.h;
        return new byl(i, i2, j, j2, j3, j4, oj9Var, z ? 1 : 0, this.l, this.k, jArr, jArr2);
    }
}
