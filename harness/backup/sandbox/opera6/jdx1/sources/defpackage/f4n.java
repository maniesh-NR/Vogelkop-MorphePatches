package defpackage;

import android.content.Context;
import android.os.Build;
import android.view.Surface;

/* loaded from: classes.dex */
public final class f4n {
    public final e69 a;
    public final Context b;
    public c4n c;
    public boolean d;
    public Surface e;
    public float f;
    public float g;
    public float h;
    public float i;
    public int j;
    public long k;
    public long l;
    public long m;
    public long n;
    public long o;
    public long p;
    public long q;
    public long r;
    public long s;

    public f4n(Context context) {
        this.b = context;
        e69 e69Var = new e69();
        e69Var.a = new d69();
        e69Var.b = new d69();
        e69Var.d = -9223372036854775807L;
        this.a = e69Var;
        this.f = -1.0f;
        this.i = 1.0f;
        this.j = 0;
    }

    public final void a() {
        Surface surface;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.e) == null || this.j == Integer.MIN_VALUE || this.h == 0.0f || !surface.isValid()) {
            return;
        }
        this.h = 0.0f;
        r9n.W(this.e, 0.0f);
    }

    public final void b() {
        this.m = 0L;
        this.q = -1L;
        this.n = -1L;
        this.k = 0L;
        this.l = 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            r9 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L86
            android.view.Surface r0 = r9.e
            if (r0 == 0) goto L86
            e69 r0 = r9.a
            d69 r2 = r0.a
            boolean r2 = r2.a()
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r2 == 0) goto L36
            d69 r2 = r0.a
            boolean r2 = r2.a()
            if (r2 == 0) goto L34
            d69 r2 = r0.a
            long r4 = r2.e
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L2b
            long r6 = r2.f
            long r6 = r6 / r4
        L2b:
            double r4 = (double) r6
            r6 = 4741671816366391296(0x41cdcd6500000000, double:1.0E9)
            double r6 = r6 / r4
            float r2 = (float) r6
            goto L38
        L34:
            r2 = r3
            goto L38
        L36:
            float r2 = r9.f
        L38:
            float r4 = r9.g
            int r5 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r5 == 0) goto L86
            int r5 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r5 == 0) goto L7c
            int r1 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r1 == 0) goto L80
            d69 r1 = r0.a
            boolean r1 = r1.a()
            if (r1 == 0) goto L6d
            d69 r1 = r0.a
            boolean r1 = r1.a()
            if (r1 == 0) goto L5b
            d69 r0 = r0.a
            long r0 = r0.f
            goto L60
        L5b:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L60:
            r3 = 5000000000(0x12a05f200, double:2.470328229E-314)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 < 0) goto L6d
            r0 = 1036831949(0x3dcccccd, float:0.1)
            goto L6f
        L6d:
            r0 = 1065353216(0x3f800000, float:1.0)
        L6f:
            float r1 = r9.g
            float r1 = r2 - r1
            float r1 = java.lang.Math.abs(r1)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L86
            goto L80
        L7c:
            int r0 = r0.e
            if (r0 < r1) goto L86
        L80:
            r9.g = r2
            r0 = 0
            r9.d(r0)
        L86:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f4n.c():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(boolean r4) {
        /*
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L36
            android.view.Surface r0 = r3.e
            if (r0 == 0) goto L36
            int r1 = r3.j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r2) goto L36
            boolean r0 = r0.isValid()
            if (r0 == 0) goto L36
            boolean r0 = r3.d
            if (r0 == 0) goto L26
            float r0 = r3.g
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 == 0) goto L26
            float r1 = r3.i
            float r0 = r0 * r1
            goto L27
        L26:
            r0 = 0
        L27:
            if (r4 != 0) goto L2f
            float r4 = r3.h
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r4 == 0) goto L36
        L2f:
            r3.h = r0
            android.view.Surface r3 = r3.e
            defpackage.r9n.W(r3, r0)
        L36:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f4n.d(boolean):void");
    }
}
