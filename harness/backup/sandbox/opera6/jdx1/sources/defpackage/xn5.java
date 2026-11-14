package defpackage;

/* loaded from: classes.dex */
public final class xn5 extends wn5 implements xwi {
    public final long h;
    public final int i;
    public final int j;
    public final boolean k;
    public final long l;

    public xn5(long j, long j2, int i, int i2, boolean z) {
        super(j, j2, i, i2, z);
        this.h = j2;
        this.i = i;
        this.j = i2;
        this.k = z;
        this.l = j == -1 ? -1L : j;
    }

    @Override // defpackage.xwi
    public final long a() {
        return this.h;
    }

    @Override // defpackage.xwi
    public final long b() {
        return this.l;
    }

    @Override // defpackage.xwi
    public final int c() {
        return this.i;
    }

    @Override // defpackage.xwi
    public final long getTimeUs(long j) {
        return ((Math.max(0L, j - this.b) << 3) * 1000000) / this.e;
    }
}
