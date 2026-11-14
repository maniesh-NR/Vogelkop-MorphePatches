package defpackage;

/* loaded from: classes.dex */
public final class rh7 extends b8e implements u5m, z1c {
    public rh7 o;
    public rh7 p;
    public long q;

    @Override // defpackage.b8e
    public final void M0() {
        this.p = null;
        this.o = null;
    }

    public final boolean T0() {
        rh7 rh7Var = this.o;
        if (rh7Var != null) {
            return rh7Var.T0();
        }
        rh7 rh7Var2 = this.p;
        if (rh7Var2 != null) {
            return rh7Var2.T0();
        }
        return false;
    }

    public final void U0() {
        rh7 rh7Var = this.p;
        if (rh7Var != null) {
            rh7Var.U0();
            return;
        }
        rh7 rh7Var2 = this.o;
        if (rh7Var2 != null) {
            rh7Var2.U0();
        }
    }

    public final void V0() {
        rh7 rh7Var = this.p;
        if (rh7Var != null) {
            rh7Var.V0();
        }
        rh7 rh7Var2 = this.o;
        if (rh7Var2 != null) {
            rh7Var2.V0();
        }
        this.o = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void W0(d06 r5) {
        /*
            r4 = this;
            rh7 r0 = r4.o
            if (r0 == 0) goto L11
            long r1 = oup.d0(r5)
            boolean r1 = defpackage.vtp.w(r0, r1)
            r2 = 1
            if (r1 != r2) goto L11
            r1 = r0
            goto L2d
        L11:
            b8e r1 = r4.a
            boolean r1 = r1.n
            if (r1 != 0) goto L19
            r1 = 0
            goto L2b
        L19:
            pqh r1 = new pqh
            r1.<init>()
            qh7 r2 = new qh7
            r3 = 0
            r2.<init>(r1, r4, r5, r3)
            defpackage.zch.E(r4, r2)
            java.lang.Object r1 = r1.a
            u5m r1 = (defpackage.u5m) r1
        L2b:
            rh7 r1 = (defpackage.rh7) r1
        L2d:
            if (r1 == 0) goto L3f
            if (r0 != 0) goto L4f
            r1.U0()
            r1.W0(r5)
            rh7 r5 = r4.p
            if (r5 == 0) goto L70
            r5.V0()
            goto L70
        L3f:
            if (r0 == 0) goto L4f
            rh7 r2 = r4.p
            if (r2 == 0) goto L4b
            r2.U0()
            r2.W0(r5)
        L4b:
            r0.V0()
            goto L70
        L4f:
            boolean r2 = kotlin.jvm.internal.Intrinsics.a(r1, r0)
            if (r2 != 0) goto L63
            if (r1 == 0) goto L5d
            r1.U0()
            r1.W0(r5)
        L5d:
            if (r0 == 0) goto L70
            r0.V0()
            goto L70
        L63:
            if (r1 == 0) goto L69
            r1.W0(r5)
            goto L70
        L69:
            rh7 r0 = r4.p
            if (r0 == 0) goto L70
            r0.W0(r5)
        L70:
            r4.o = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rh7.W0(d06):void");
    }

    public final void X0() {
        rh7 rh7Var = this.p;
        if (rh7Var != null) {
            rh7Var.X0();
            return;
        }
        rh7 rh7Var2 = this.o;
        if (rh7Var2 != null) {
            rh7Var2.X0();
        }
    }

    @Override // defpackage.z1c, defpackage.xfd
    public final void a(long j) {
        this.q = j;
    }

    @Override // defpackage.u5m
    public final Object h() {
        return rbe.r;
    }
}
