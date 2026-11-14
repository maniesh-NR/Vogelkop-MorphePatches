package defpackage;

/* loaded from: classes.dex */
public final class gd8 implements vhi {
    public final oj9 a;
    public long[] c;
    public boolean d;
    public hd8 e;
    public boolean f;
    public int g;
    public final c37 b = new c37((byte) 16);
    public long h = -9223372036854775807L;

    public gd8(hd8 hd8Var, oj9 oj9Var, boolean z) {
        this.a = oj9Var;
        this.e = hd8Var;
        this.c = hd8Var.b;
        a(hd8Var, z);
    }

    public final void a(hd8 hd8Var, boolean z) {
        int i = this.g;
        long j = -9223372036854775807L;
        long j2 = i == 0 ? -9223372036854775807L : this.c[i - 1];
        this.d = z;
        this.e = hd8Var;
        long[] jArr = hd8Var.b;
        this.c = jArr;
        long j3 = this.h;
        if (j3 == -9223372036854775807L) {
            if (j2 != -9223372036854775807L) {
                this.g = tym.b(jArr, j2, false);
            }
        } else {
            int iB = tym.b(jArr, j3, true);
            this.g = iB;
            if (this.d && iB == this.c.length) {
                j = j3;
            }
            this.h = j;
        }
    }

    @Override // defpackage.vhi
    public final int c(i16 i16Var, qj6 qj6Var, int i) {
        int i2 = this.g;
        boolean z = i2 == this.c.length;
        if (z && !this.d) {
            qj6Var.b = 4;
            return -4;
        }
        if ((i & 2) != 0 || !this.f) {
            i16Var.c = this.a;
            this.f = true;
            return -5;
        }
        if (z) {
            return -3;
        }
        if ((i & 1) == 0) {
            this.g = i2 + 1;
        }
        if ((i & 4) == 0) {
            byte[] bArrN = this.b.n(this.e.a[i2]);
            qj6Var.k(bArrN.length);
            qj6Var.e.put(bArrN);
        }
        qj6Var.g = this.c[i2];
        qj6Var.b = 1;
        return -4;
    }

    @Override // defpackage.vhi
    public final boolean isReady() {
        return true;
    }

    @Override // defpackage.vhi
    public final void maybeThrowError() {
    }

    @Override // defpackage.vhi
    public final int skipData(long j) {
        int iMax = Math.max(this.g, tym.b(this.c, j, true));
        int i = iMax - this.g;
        this.g = iMax;
        return i;
    }
}
