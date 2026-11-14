package defpackage;

import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class rah extends i17 implements ble {
    public boolean q;
    public Function0 r;
    public sah t;
    public float u;
    public boolean s = true;
    public final hle v = new hle(this, null);
    public final p0g w = new p0g(0.0f);
    public final p0g x = new p0g(0.0f);

    public rah(boolean z, Function0 function0, sah sahVar, float f) {
        this.q = z;
        this.r = function0;
        this.t = sahVar;
        this.u = f;
    }

    @Override // defpackage.b8e
    public final boolean I0() {
        return false;
    }

    @Override // defpackage.ble
    public final long K(int i, long j, long j2) {
        if (((Boolean) this.t.a.d.getValue()).booleanValue() || !this.s) {
            return 0L;
        }
        byte b = 1;
        if (i != 1) {
            return 0L;
        }
        long jY0 = Y0(j2);
        na2.B(H0(), null, null, new oah(this, null, b), 3);
        return jY0;
    }

    @Override // defpackage.b8e
    public final void L0() throws pxb {
        T0(this.v);
        na2.B(H0(), null, null, new oah(this, null, (byte) 0), 3);
        c1(this.q ? Z0() : 0.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object W0(nt5 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.mah
            if (r0 == 0) goto L13
            r0 = r7
            mah r0 = (defpackage.mah) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            mah r0 = new mah
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.t
            px5 r1 = px5.a
            int r2 = r0.v
            r3 = 0
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L2f
            if (r2 != r4) goto L29
            defpackage.ybh.y(r7)     // Catch: java.lang.Throwable -> L53
            goto L4a
        L29:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r6)
            return r3
        L2f:
            defpackage.ybh.y(r7)
            sah r7 = r6.t     // Catch: java.lang.Throwable -> L53
            r0.v = r4     // Catch: java.lang.Throwable -> L53
            cd1 r7 = r7.a     // Catch: java.lang.Throwable -> L53
            java.lang.Float r2 = new java.lang.Float     // Catch: java.lang.Throwable -> L53
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L53
            r4 = 14
            java.lang.Object r7 = defpackage.cd1.a(r7, r2, r3, r0, r4)     // Catch: java.lang.Throwable -> L53
            if (r7 == r1) goto L47
            kotlin.Unit r7 = kotlin.Unit.a     // Catch: java.lang.Throwable -> L53
        L47:
            if (r7 != r1) goto L4a
            return r1
        L4a:
            r6.b1(r5)
            r6.c1(r5)
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        L53:
            r7 = move-exception
            r6.b1(r5)
            r6.c1(r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rah.W0(nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object X0(nt5 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.nah
            if (r0 == 0) goto L13
            r0 = r6
            nah r0 = (defpackage.nah) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            nah r0 = new nah
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.t
            px5 r1 = px5.a
            int r2 = r0.v
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L2e
            if (r2 != r4) goto L28
            defpackage.ybh.y(r6)     // Catch: java.lang.Throwable -> L62
            goto L4b
        L28:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r5)
            return r3
        L2e:
            defpackage.ybh.y(r6)
            sah r6 = r5.t     // Catch: java.lang.Throwable -> L62
            r0.v = r4     // Catch: java.lang.Throwable -> L62
            cd1 r6 = r6.a     // Catch: java.lang.Throwable -> L62
            java.lang.Float r2 = new java.lang.Float     // Catch: java.lang.Throwable -> L62
            r4 = 1065353216(0x3f800000, float:1.0)
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L62
            r4 = 14
            java.lang.Object r6 = defpackage.cd1.a(r6, r2, r3, r0, r4)     // Catch: java.lang.Throwable -> L62
            if (r6 == r1) goto L48
            kotlin.Unit r6 = kotlin.Unit.a     // Catch: java.lang.Throwable -> L62
        L48:
            if (r6 != r1) goto L4b
            return r1
        L4b:
            boolean r6 = r5.n
            if (r6 == 0) goto L5f
            int r6 = r5.Z0()
            float r6 = (float) r6
            r5.b1(r6)
            int r6 = r5.Z0()
            float r6 = (float) r6
            r5.c1(r6)
        L5f:
            kotlin.Unit r5 = kotlin.Unit.a
            return r5
        L62:
            r6 = move-exception
            boolean r0 = r5.n
            if (r0 == 0) goto L77
            int r0 = r5.Z0()
            float r0 = (float) r0
            r5.b1(r0)
            int r0 = r5.Z0()
            float r0 = (float) r0
            r5.c1(r0)
        L77:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rah.X0(nt5):java.lang.Object");
    }

    public final long Y0(long j) {
        float fZ0;
        float f = 0.0f;
        if (!this.q) {
            p0g p0gVar = this.x;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L)) + p0gVar.h();
            if (fIntBitsToFloat < 0.0f) {
                fIntBitsToFloat = 0.0f;
            }
            float fH = fIntBitsToFloat - p0gVar.h();
            b1(fIntBitsToFloat);
            if (p0gVar.h() * 0.5f <= Z0()) {
                fZ0 = p0gVar.h() * 0.5f;
            } else {
                float fB = djh.b(Math.abs((p0gVar.h() * 0.5f) / Z0()) - 1.0f, 0.0f, 2.0f);
                fZ0 = Z0() + (Z0() * (fB - (((float) Math.pow(fB, 2.0d)) / 4.0f)));
            }
            c1(fZ0);
            f = fH;
        }
        return Float.floatToRawIntBits(f) & 4294967295L;
    }

    public final int Z0() {
        return ui6.e0(this).y.M(this.u);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a1(float r7, nt5 r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.qah
            if (r0 == 0) goto L13
            r0 = r8
            qah r0 = (defpackage.qah) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.w = r1
            goto L18
        L13:
            qah r0 = new qah
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.u
            px5 r1 = px5.a
            int r2 = r0.w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L31
            if (r2 != r3) goto L2a
            float r7 = r0.t
            defpackage.ybh.y(r8)
            goto L6d
        L2a:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r6)
            r6 = 0
            return r6
        L31:
            defpackage.ybh.y(r8)
            boolean r8 = r6.q
            if (r8 == 0) goto L3e
            java.lang.Float r6 = new java.lang.Float
            r6.<init>(r4)
            return r6
        L3e:
            p0g r8 = r6.x
            float r2 = r8.h()
            r5 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 * r5
            int r5 = r6.Z0()
            float r5 = (float) r5
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 <= 0) goto L55
            kotlin.jvm.functions.Function0 r2 = r6.r
            r2.invoke()
        L55:
            float r8 = r8.h()
            int r8 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r8 == 0) goto L61
            int r8 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r8 >= 0) goto L62
        L61:
            r7 = r4
        L62:
            r0.t = r7
            r0.w = r3
            java.lang.Object r8 = r6.W0(r0)
            if (r8 != r1) goto L6d
            return r1
        L6d:
            r6.b1(r4)
            java.lang.Float r6 = new java.lang.Float
            r6.<init>(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rah.a1(float, nt5):java.lang.Object");
    }

    public final void b1(float f) {
        this.x.i(f);
    }

    public final void c1(float f) {
        this.w.i(f);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.ble
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f0(long r5, mt5 r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.pah
            if (r0 == 0) goto L13
            r0 = r7
            pah r0 = (defpackage.pah) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L1a
        L13:
            pah r0 = new pah
            nt5 r7 = (nt5) r7
            r0.<init>(r4, r7)
        L1a:
            java.lang.Object r7 = r0.t
            px5 r1 = px5.a
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            defpackage.ybh.y(r7)
            goto L40
        L29:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r4)
            r4 = 0
            return r4
        L30:
            defpackage.ybh.y(r7)
            float r5 = defpackage.i1n.c(r5)
            r0.v = r3
            java.lang.Object r7 = r4.a1(r5, r0)
            if (r7 != r1) goto L40
            return r1
        L40:
            java.lang.Number r7 = (java.lang.Number) r7
            float r4 = r7.floatValue()
            r5 = 0
            long r4 = w0h.a(r5, r4)
            i1n r6 = new i1n
            r6.<init>(r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rah.f0(long, mt5):java.lang.Object");
    }

    @Override // defpackage.ble
    public final long v(int i, long j) {
        if (((Boolean) this.t.a.d.getValue()).booleanValue() || !this.s || i != 1 || Float.intBitsToFloat((int) (4294967295L & j)) >= 0.0f) {
            return 0L;
        }
        return Y0(j);
    }
}
