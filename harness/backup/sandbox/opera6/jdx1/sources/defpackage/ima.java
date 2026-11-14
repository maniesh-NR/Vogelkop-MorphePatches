package defpackage;

/* loaded from: classes.dex */
public final class ima extends b8e implements omg {
    public lde o;
    public cma p;

    @Override // defpackage.b8e
    public final void M0() {
        V0();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object T0(nt5 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.fma
            if (r0 == 0) goto L13
            r0 = r5
            fma r0 = (defpackage.fma) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.w = r1
            goto L18
        L13:
            fma r0 = new fma
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            px5 r1 = px5.a
            int r2 = r0.w
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            cma r0 = r0.t
            defpackage.ybh.y(r5)
            goto L4a
        L29:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r4)
            r4 = 0
            return r4
        L30:
            defpackage.ybh.y(r5)
            cma r5 = r4.p
            if (r5 != 0) goto L4c
            cma r5 = new cma
            r5.<init>()
            lde r2 = r4.o
            r0.t = r5
            r0.w = r3
            java.lang.Object r0 = r2.a(r5, r0)
            if (r0 != r1) goto L49
            return r1
        L49:
            r0 = r5
        L4a:
            r4.p = r0
        L4c:
            kotlin.Unit r4 = kotlin.Unit.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ima.T0(nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object U0(nt5 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.gma
            if (r0 == 0) goto L13
            r0 = r6
            gma r0 = (defpackage.gma) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            gma r0 = new gma
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.t
            px5 r1 = px5.a
            int r2 = r0.v
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L2e
            if (r2 != r4) goto L28
            defpackage.ybh.y(r6)
            goto L45
        L28:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r5)
            return r3
        L2e:
            defpackage.ybh.y(r6)
            cma r6 = r5.p
            if (r6 == 0) goto L47
            dma r2 = new dma
            r2.<init>(r6)
            lde r6 = r5.o
            r0.v = r4
            java.lang.Object r6 = r6.a(r2, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            r5.p = r3
        L47:
            kotlin.Unit r5 = kotlin.Unit.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ima.U0(nt5):java.lang.Object");
    }

    public final void V0() {
        cma cmaVar = this.p;
        if (cmaVar != null) {
            this.o.b(new dma(cmaVar));
            this.p = null;
        }
    }

    @Override // defpackage.omg
    public final void g0() {
        V0();
    }

    @Override // defpackage.omg
    public final void n(fmg fmgVar, gmg gmgVar, long j) {
        if (gmgVar == gmg.b) {
            byte b = fmgVar.f;
            mt5 mt5Var = null;
            if (b == 4) {
                na2.B(H0(), null, null, new hma(this, mt5Var, (byte) 0), 3);
            } else if (b == 5) {
                na2.B(H0(), null, null, new hma(this, mt5Var, (byte) 1), 3);
            }
        }
    }
}
