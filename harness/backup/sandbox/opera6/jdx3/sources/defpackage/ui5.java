package defpackage;

/* loaded from: classes.dex */
public final class ui5 extends ta6 {
    public long d;
    public long e;

    @Override // defpackage.ta6
    public final boolean c() {
        return f() <= 0;
    }

    public final int f() {
        long j = this.e;
        if (j <= 0) {
            return 0;
        }
        long j2 = this.d;
        if (j2 <= 0 || j2 >= j) {
            return 0;
        }
        return Math.min(99, 100 - ((int) ((j2 * 100) / j)));
    }

    public final long g() {
        return Math.max(0L, this.e - this.d);
    }
}
