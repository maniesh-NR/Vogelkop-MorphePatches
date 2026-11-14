package defpackage;

/* loaded from: classes.dex */
public final class o2c {
    public int a;
    public int b;
    public boolean c;
    public boolean d;

    public o2c(int i, int i2, boolean z, boolean z2) {
        this.a = i;
        this.b = i2;
        this.c = z;
        this.d = z2;
    }

    public o2c(boolean z, int i, int i2, boolean z2) {
        this.c = z;
        this.a = i;
        this.b = i2;
        this.d = z2;
    }

    public final int a(int i) {
        boolean z = this.c;
        if (z || this.d) {
            i = i < 0 ? 0 : i & (-8388616);
        }
        if (z) {
            i |= 8388611;
        }
        return this.d ? i | 8388613 : i;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0010  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(android.view.ViewGroup.MarginLayoutParams r4) {
        /*
            r3 = this;
            int r0 = r3.a
            r1 = 0
            r2 = -5000(0xffffffffffffec78, float:NaN)
            if (r0 != r2) goto Lc
            int r0 = r3.b
            if (r0 == r2) goto L1d
            r0 = r1
        Lc:
            int r3 = r3.b
            if (r3 != r2) goto L11
            r3 = r1
        L11:
            int r2 = r4.getMarginStart()
            if (r2 != r0) goto L1e
            int r2 = r4.getMarginEnd()
            if (r2 != r3) goto L1e
        L1d:
            return r1
        L1e:
            r4.setMarginStart(r0)
            r4.setMarginEnd(r3)
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o2c.b(android.view.ViewGroup$MarginLayoutParams):boolean");
    }

    public final boolean c(int i) {
        return (this.a & i) == i;
    }

    public final boolean d(int i) {
        return (this.b & i) == i;
    }
}
