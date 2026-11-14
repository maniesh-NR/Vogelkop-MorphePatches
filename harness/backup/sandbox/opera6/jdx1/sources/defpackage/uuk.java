package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.h;

/* loaded from: classes.dex */
public final class uuk implements n27, mt5 {
    public final /* synthetic */ vuk a;
    public final nh4 b;
    public nh4 c;
    public gmg d = gmg.b;
    public final h e = h.a;
    public final /* synthetic */ vuk f;

    public uuk(vuk vukVar, nh4 nh4Var) {
        this.f = vukVar;
        this.a = vukVar;
        this.b = nh4Var;
    }

    @Override // defpackage.n27
    public final int M(float f) {
        return this.a.M(f);
    }

    @Override // defpackage.n27
    public final float Q(long j) {
        return this.a.Q(j);
    }

    public final Object a(gmg gmgVar, mt5 mt5Var) {
        nh4 nh4Var = new nh4(1, hib.b(mt5Var));
        nh4Var.s();
        this.d = gmgVar;
        this.c = nh4Var;
        Object objQ = nh4Var.q();
        px5 px5Var = px5.a;
        return objQ;
    }

    @Override // defpackage.n27
    public final float b() {
        return this.a.b();
    }

    public final long c() {
        vuk vukVar = this.f;
        long jY0 = vukVar.y0(ui6.e0(vukVar).A.d());
        long j = vukVar.x;
        float fMax = Math.max(0.0f, Float.intBitsToFloat((int) (jY0 >> 32)) - ((int) (j >> 32))) / 2.0f;
        float fMax2 = Math.max(0.0f, Float.intBitsToFloat((int) (jY0 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f;
        return (Float.floatToRawIntBits(fMax) << 32) | (Float.floatToRawIntBits(fMax2) & 4294967295L);
    }

    public final u5n f() {
        return ui6.e0(this.f).A;
    }

    public final CoroutineContext getContext() {
        return this.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(long r9, kotlin.jvm.functions.Function2 r11, z53 r12) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r12 instanceof defpackage.suk
            if (r0 == 0) goto L13
            r0 = r12
            suk r0 = (defpackage.suk) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.w = r1
            goto L18
        L13:
            suk r0 = new suk
            r0.<init>(r8, r12)
        L18:
            java.lang.Object r12 = r0.u
            px5 r1 = px5.a
            int r2 = r0.w
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2c
            d3k r8 = r0.t
            defpackage.ybh.y(r12)     // Catch: java.lang.Throwable -> L2a
            goto L6a
        L2a:
            r9 = move-exception
            goto L74
        L2c:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r8)
            return r3
        L32:
            defpackage.ybh.y(r12)
            r5 = 0
            int r12 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r12 > 0) goto L4e
            nh4 r12 = r8.c
            if (r12 == 0) goto L4e
            p0i r2 = t0i.b
            hmg r2 = new hmg
            r2.<init>(r9)
            q0i r5 = new q0i
            r5.<init>(r2)
            r12.resumeWith(r5)
        L4e:
            vuk r12 = r8.f
            nx5 r12 = r12.H0()
            us6 r2 = new us6
            r2.<init>(r9, r8, r3)
            r9 = 3
            d3k r9 = defpackage.na2.B(r12, r3, r3, r2, r9)
            r0.t = r9     // Catch: java.lang.Throwable -> L70
            r0.w = r4     // Catch: java.lang.Throwable -> L70
            java.lang.Object r12 = r11.invoke(r8, r0)     // Catch: java.lang.Throwable -> L70
            if (r12 != r1) goto L69
            return r1
        L69:
            r8 = r9
        L6a:
            eh4 r9 = defpackage.eh4.b
            r8.k(r9)
            return r12
        L70:
            r8 = move-exception
            r7 = r9
            r9 = r8
            r8 = r7
        L74:
            eh4 r10 = defpackage.eh4.b
            r8.k(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uuk.h(long, kotlin.jvm.functions.Function2, z53):java.lang.Object");
    }

    @Override // defpackage.n27
    public final long j(float f) {
        return this.a.j(f);
    }

    @Override // defpackage.n27
    public final float j0(int i) {
        return this.a.j0(i);
    }

    @Override // defpackage.n27
    public final long k(long j) {
        return this.a.k(j);
    }

    @Override // defpackage.n27
    public final float k0(float f) {
        return f / this.a.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(long r6, kotlin.jvm.functions.Function2 r8, nt5 r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof defpackage.tuk
            if (r0 == 0) goto L13
            r0 = r9
            tuk r0 = (defpackage.tuk) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            tuk r0 = new tuk
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.t
            px5 r1 = px5.a
            int r2 = r0.v
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L2e
            if (r2 != r4) goto L28
            defpackage.ybh.y(r9)     // Catch: defpackage.hmg -> L3b
            return r9
        L28:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r5)
            return r3
        L2e:
            defpackage.ybh.y(r9)
            r0.v = r4     // Catch: defpackage.hmg -> L3b
            java.lang.Object r5 = r5.h(r6, r8, r0)     // Catch: defpackage.hmg -> L3b
            if (r5 != r1) goto L3a
            return r1
        L3a:
            return r5
        L3b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uuk.l(long, kotlin.jvm.functions.Function2, nt5):java.lang.Object");
    }

    @Override // defpackage.n27
    public final float n0() {
        return this.a.n0();
    }

    @Override // defpackage.n27
    public final float o(long j) {
        return this.a.o(j);
    }

    @Override // defpackage.n27
    public final float o0(float f) {
        return this.a.b() * f;
    }

    public final void resumeWith(Object obj) {
        vuk vukVar = this.f;
        synchronized (vukVar.u) {
            vukVar.t.k(this);
        }
        this.b.resumeWith(obj);
    }

    @Override // defpackage.n27
    public final int t0(long j) {
        return this.a.t0(j);
    }

    @Override // defpackage.n27
    public final long u(float f) {
        return this.a.u(f);
    }

    @Override // defpackage.n27
    public final long y0(long j) {
        return this.a.y0(j);
    }
}
