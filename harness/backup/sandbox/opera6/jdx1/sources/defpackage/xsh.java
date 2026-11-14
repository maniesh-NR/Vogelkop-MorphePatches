package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class xsh {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final float[] f;
    public final b8e g;

    public xsh(long j, long j2, long j3, long j4, long j5, float[] fArr, b8e b8eVar) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = fArr;
        this.g = b8eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r6 == r7) goto L5a
            r1 = 0
            if (r7 == 0) goto L5b
            java.lang.Class<xsh> r2 = defpackage.xsh.class
            java.lang.Class r3 = r7.getClass()
            if (r2 != r3) goto L5b
            xsh r7 = (defpackage.xsh) r7
            long r2 = r6.a
            long r4 = r7.a
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L5b
            long r2 = r6.b
            long r4 = r7.b
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L5b
            long r2 = r6.e
            long r4 = r7.e
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L5b
            long r2 = r6.c
            long r4 = r7.c
            boolean r2 = defpackage.ybb.a(r2, r4)
            if (r2 == 0) goto L5b
            long r2 = r6.d
            long r4 = r7.d
            boolean r2 = defpackage.ybb.a(r2, r4)
            if (r2 == 0) goto L5b
            float[] r2 = r7.f
            float[] r3 = r6.f
            if (r3 != 0) goto L46
            if (r2 != 0) goto L48
            r2 = r0
            goto L4e
        L46:
            if (r2 != 0) goto L4a
        L48:
            r2 = r1
            goto L4e
        L4a:
            boolean r2 = r3.equals(r2)
        L4e:
            if (r2 == 0) goto L5b
            b8e r6 = r6.g
            b8e r7 = r7.g
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L5b
        L5a:
            return r0
        L5b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xsh.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iE = z1m.e(z1m.e(z1m.e(z1m.e(Long.hashCode(this.a) * 31, 31, this.b), 31, this.e), 31, this.c), 31, this.d);
        float[] fArr = this.f;
        return this.g.hashCode() + ((iE + (fArr != null ? Arrays.hashCode(fArr) : 0)) * 31);
    }
}
