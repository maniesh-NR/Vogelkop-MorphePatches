package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class hle extends b8e implements u5m, ble {
    public ble o;
    public s9i p;
    public hle q;
    public final String r;

    public hle(ble bleVar, s9i s9iVar) {
        this.o = bleVar;
        this.p = s9iVar == null ? new s9i((byte) 21) : s9iVar;
        this.r = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    @Override // defpackage.ble
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object B0(long r13, long r15, mt5 r17) throws pxb {
        /*
            r12 = this;
            r0 = r17
            boolean r1 = r0 instanceof defpackage.fle
            if (r1 == 0) goto L16
            r1 = r0
            fle r1 = (defpackage.fle) r1
            int r2 = r1.x
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.x = r2
        L14:
            r7 = r1
            goto L1e
        L16:
            fle r1 = new fle
            nt5 r0 = (nt5) r0
            r1.<init>(r12, r0)
            goto L14
        L1e:
            java.lang.Object r0 = r7.v
            px5 r1 = px5.a
            int r2 = r7.x
            r8 = 0
            r9 = 2
            r3 = 1
            if (r2 == 0) goto L44
            if (r2 == r3) goto L39
            if (r2 != r9) goto L33
            long r12 = r7.t
            defpackage.ybh.y(r0)
            goto L84
        L33:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r12)
            return r8
        L39:
            long r13 = r7.u
            long r2 = r7.t
            defpackage.ybh.y(r0)
            r10 = r2
            r2 = r13
            r13 = r10
            goto L58
        L44:
            defpackage.ybh.y(r0)
            ble r2 = r12.o
            r7.t = r13
            r5 = r15
            r7.u = r5
            r7.x = r3
            r3 = r13
            java.lang.Object r0 = r2.B0(r3, r5, r7)
            if (r0 == r1) goto L82
            r2 = r15
        L58:
            i1n r0 = (defpackage.i1n) r0
            long r4 = r0.a
            boolean r0 = r12.n
            if (r0 == 0) goto L68
            if (r0 == 0) goto L66
            hle r8 = r12.U0()
        L66:
            r12 = r8
            goto L6b
        L68:
            hle r8 = r12.q
            goto L66
        L6b:
            if (r12 == 0) goto L8a
            long r13 = defpackage.i1n.e(r13, r4)
            long r2 = defpackage.i1n.d(r2, r4)
            r7.t = r4
            r7.x = r9
            r15 = r2
            r17 = r7
            java.lang.Object r0 = r12.B0(r13, r15, r17)
            if (r0 != r1) goto L83
        L82:
            return r1
        L83:
            r12 = r4
        L84:
            i1n r0 = (defpackage.i1n) r0
            long r0 = r0.a
            r4 = r12
            goto L8c
        L8a:
            r0 = 0
        L8c:
            long r12 = defpackage.i1n.e(r4, r0)
            i1n r14 = new i1n
            r14.<init>(r12)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hle.B0(long, long, mt5):java.lang.Object");
    }

    @Override // defpackage.ble
    public final long K(int i, long j, long j2) {
        long jK = this.o.K(i, j, j2);
        hle hleVarU0 = this.n ? U0() : null;
        return y8f.e(jK, hleVarU0 != null ? hleVarU0.K(i, y8f.e(j, jK), y8f.d(j2, jK)) : 0L);
    }

    @Override // defpackage.b8e
    public final void L0() {
        s9i s9iVar = this.p;
        s9iVar.b = this;
        s9iVar.c = null;
        this.q = null;
        s9iVar.d = new d8e(this, (byte) 2);
        s9iVar.e = H0();
    }

    @Override // defpackage.b8e
    public final void M0() throws pxb {
        pqh pqhVar = new pqh();
        zch.C(this, new j31(pqhVar, (byte) 4));
        hle hleVar = (hle) ((u5m) pqhVar.a);
        this.q = hleVar;
        s9i s9iVar = this.p;
        s9iVar.c = hleVar;
        if (((hle) s9iVar.b) == this) {
            s9iVar.b = null;
            s9iVar.e = null;
            s9iVar.d = jpo.f;
        }
    }

    public final nx5 T0() throws pxb {
        hle hleVarU0 = U0();
        nx5 nx5VarT0 = hleVarU0 != null ? hleVarU0.T0() : null;
        if (nx5VarT0 != null && sgb.M(nx5VarT0)) {
            return nx5VarT0;
        }
        nx5 nx5Var = (nx5) this.p.e;
        if (nx5Var != null) {
            return nx5Var;
        }
        qp2.n("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        return null;
    }

    public final hle U0() throws pxb {
        tah tahVar;
        u5m u5mVar = null;
        if (!this.n) {
            return null;
        }
        if (!this.a.n) {
            a8b.b("visitAncestors called on an unattached node");
        }
        b8e b8eVar = this.a.e;
        m3c m3cVarE0 = ui6.e0(this);
        loop0: while (true) {
            if (m3cVarE0 == null) {
                break;
            }
            if ((((b8e) m3cVarE0.F.g).d & 262144) != 0) {
                while (b8eVar != null) {
                    if ((b8eVar.c & 262144) != 0) {
                        b8e b8eVarU = b8eVar;
                        dfe dfeVar = null;
                        while (b8eVarU != null) {
                            if (b8eVarU instanceof u5m) {
                                u5m u5mVar2 = (u5m) b8eVarU;
                                if (Intrinsics.a(this.r, u5mVar2.h()) && hle.class == u5mVar2.getClass()) {
                                    u5mVar = u5mVar2;
                                    break loop0;
                                }
                            }
                            if ((b8eVarU.c & 262144) != 0 && (b8eVarU instanceof i17)) {
                                int i = 0;
                                for (b8e b8eVar2 = ((i17) b8eVarU).p; b8eVar2 != null; b8eVar2 = b8eVar2.f) {
                                    if ((b8eVar2.c & 262144) != 0) {
                                        i++;
                                        if (i == 1) {
                                            b8eVarU = b8eVar2;
                                        } else {
                                            if (dfeVar == null) {
                                                dfeVar = new dfe(new b8e[16]);
                                            }
                                            if (b8eVarU != null) {
                                                dfeVar.c(b8eVarU);
                                                b8eVarU = null;
                                            }
                                            dfeVar.c(b8eVar2);
                                        }
                                    }
                                }
                                if (i != 1) {
                                }
                            }
                            b8eVarU = ui6.U(dfeVar);
                        }
                    }
                    b8eVar = b8eVar.e;
                }
            }
            m3cVarE0 = m3cVarE0.u();
            b8eVar = (m3cVarE0 == null || (tahVar = m3cVarE0.F) == null) ? null : (lbl) tahVar.f;
        }
        return (hle) u5mVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0050, code lost:
    
        if (r9 != r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.ble
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f0(long r7, mt5 r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.gle
            if (r0 == 0) goto L13
            r0 = r9
            gle r0 = (defpackage.gle) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.w = r1
            goto L1a
        L13:
            gle r0 = new gle
            nt5 r9 = (nt5) r9
            r0.<init>(r6, r9)
        L1a:
            java.lang.Object r9 = r0.u
            px5 r1 = px5.a
            int r2 = r0.w
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3b
            if (r2 == r5) goto L35
            if (r2 != r4) goto L2f
            long r6 = r0.t
            defpackage.ybh.y(r9)
            goto L6b
        L2f:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r6)
            return r3
        L35:
            long r7 = r0.t
            defpackage.ybh.y(r9)
            goto L52
        L3b:
            defpackage.ybh.y(r9)
            boolean r9 = r6.n
            if (r9 == 0) goto L46
            hle r3 = r6.U0()
        L46:
            if (r3 == 0) goto L57
            r0.t = r7
            r0.w = r5
            java.lang.Object r9 = r3.f0(r7, r0)
            if (r9 == r1) goto L69
        L52:
            i1n r9 = (defpackage.i1n) r9
            long r2 = r9.a
            goto L59
        L57:
            r2 = 0
        L59:
            ble r6 = r6.o
            long r7 = defpackage.i1n.d(r7, r2)
            r0.t = r2
            r0.w = r4
            java.lang.Object r9 = r6.f0(r7, r0)
            if (r9 != r1) goto L6a
        L69:
            return r1
        L6a:
            r6 = r2
        L6b:
            i1n r9 = (defpackage.i1n) r9
            long r8 = r9.a
            long r6 = defpackage.i1n.e(r6, r8)
            i1n r8 = new i1n
            r8.<init>(r6)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hle.f0(long, mt5):java.lang.Object");
    }

    @Override // defpackage.u5m
    public final Object h() {
        return this.r;
    }

    @Override // defpackage.ble
    public final long v(int i, long j) {
        hle hleVarU0 = this.n ? U0() : null;
        long jV = hleVarU0 != null ? hleVarU0.v(i, j) : 0L;
        return y8f.e(jV, this.o.v(i, y8f.d(j, jV)));
    }
}
