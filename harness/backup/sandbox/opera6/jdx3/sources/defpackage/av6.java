package defpackage;

import java.util.HashMap;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class av6 implements y3i {
    public final jv1 a;
    public final zyk b;
    public final zyk c = z4c.b(new r94(this, (byte) 24));

    public av6(z3i z3iVar, jv1 jv1Var) {
        this.a = jv1Var;
        this.b = z4c.b(new r94(z3iVar, (byte) 23));
    }

    @Override // defpackage.y3i
    public final Object a(HashMap map, ebb ebbVar, p71 p71Var) {
        Object objD = p().b.o().d(map, ebbVar != null ? new Long(ebbVar.i()) : null, p71Var);
        return objD == px5.a ? objD : Unit.a;
    }

    @Override // defpackage.y3i
    public final ekc b() {
        return (ekc) this.c.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009b  */
    @Override // defpackage.y3i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final j7i c(defpackage.s3i r21, defpackage.p4i r22, defpackage.e6g r23) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.av6.c(s3i, p4i, e6g):j7i");
    }

    @Override // defpackage.y3i
    public final f99 d() {
        return new vu6(p().b.n().e.b(c2h.c), (byte) 1);
    }

    @Override // defpackage.y3i
    public final void e(String str) {
        zs8 zs8Var = p().b.n().h;
        na2.B(zs8Var.a, (CoroutineContext) null, (rx5) null, new fg6(zs8Var, str, null, (byte) 14), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.y3i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(java.lang.String r5, mt5 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.pu6
            if (r0 == 0) goto L13
            r0 = r6
            pu6 r0 = (defpackage.pu6) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L1a
        L13:
            pu6 r0 = new pu6
            nt5 r6 = (nt5) r6
            r0.<init>(r4, r6)
        L1a:
            java.lang.Object r6 = r0.t
            px5 r1 = px5.a
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2d
            ybh.y(r6)
            t0i r6 = (t0i) r6
            java.lang.Object r4 = r6.a
            return r4
        L2d:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r4)
            r4 = 0
            return r4
        L34:
            ybh.y(r6)
            e6e r4 = r4.p()
            a36 r4 = r4.b
            t3e r4 = r4.n()
            r0.v = r3
            h5e r4 = (h5e) r4
            java.lang.Object r4 = r4.p(r5, r0)
            if (r4 != r1) goto L4c
            return r1
        L4c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.av6.f(java.lang.String, mt5):java.lang.Object");
    }

    @Override // defpackage.y3i
    public final f99 g() {
        return new vu6(p().b.n().e.b(c2h.d), (byte) 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.y3i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(mt5 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.yu6
            if (r0 == 0) goto L13
            r0 = r5
            yu6 r0 = (defpackage.yu6) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L1a
        L13:
            yu6 r0 = new yu6
            nt5 r5 = (nt5) r5
            r0.<init>(r4, r5)
        L1a:
            java.lang.Object r5 = r0.t
            px5 r1 = px5.a
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2d
            ybh.y(r5)
            t0i r5 = (t0i) r5
            java.lang.Object r4 = r5.a
            goto L4c
        L2d:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r4)
            r4 = 0
            return r4
        L34:
            ybh.y(r5)
            e6e r4 = r4.p()
            a36 r4 = r4.b
            t3e r4 = r4.n()
            r0.v = r3
            h5e r4 = (h5e) r4
            java.lang.Object r4 = r4.A(r0)
            if (r4 != r1) goto L4c
            return r1
        L4c:
            p0i r5 = t0i.b
            boolean r5 = r4 instanceof q0i
            if (r5 != 0) goto L56
            java.util.List r4 = (java.util.List) r4
            kotlin.Unit r4 = kotlin.Unit.a
        L56:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.av6.h(mt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.y3i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(mt5 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.su6
            if (r0 == 0) goto L13
            r0 = r5
            su6 r0 = (defpackage.su6) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L1a
        L13:
            su6 r0 = new su6
            nt5 r5 = (nt5) r5
            r0.<init>(r4, r5)
        L1a:
            java.lang.Object r5 = r0.t
            px5 r1 = px5.a
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2d
            ybh.y(r5)
            t0i r5 = (t0i) r5
            java.lang.Object r4 = r5.a
            goto L4c
        L2d:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r4)
            r4 = 0
            return r4
        L34:
            ybh.y(r5)
            e6e r4 = r4.p()
            a36 r4 = r4.b
            t3e r4 = r4.n()
            r0.v = r3
            h5e r4 = (h5e) r4
            java.lang.Object r4 = r4.s(r0)
            if (r4 != r1) goto L4c
            return r1
        L4c:
            p0i r5 = t0i.b
            boolean r5 = r4 instanceof q0i
            if (r5 != 0) goto L56
            htm r4 = (htm) r4
            kotlin.Unit r4 = kotlin.Unit.a
        L56:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.av6.i(mt5):java.lang.Object");
    }

    @Override // defpackage.y3i
    public final Object j(p71 p71Var) {
        Object objC = p().b.o().c(p71Var);
        return objC == px5.a ? objC : Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.y3i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(java.lang.String r5, mt5 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.ou6
            if (r0 == 0) goto L13
            r0 = r6
            ou6 r0 = (defpackage.ou6) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L1a
        L13:
            ou6 r0 = new ou6
            nt5 r6 = (nt5) r6
            r0.<init>(r4, r6)
        L1a:
            java.lang.Object r6 = r0.t
            px5 r1 = px5.a
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2d
            ybh.y(r6)
            t0i r6 = (t0i) r6
            java.lang.Object r4 = r6.a
            return r4
        L2d:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r4)
            r4 = 0
            return r4
        L34:
            ybh.y(r6)
            e6e r4 = r4.p()
            a36 r4 = r4.b
            t3e r4 = r4.n()
            r0.v = r3
            h5e r4 = (h5e) r4
            java.lang.Object r4 = r4.k(r5, r0)
            if (r4 != r1) goto L4c
            return r1
        L4c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.av6.k(java.lang.String, mt5):java.lang.Object");
    }

    @Override // defpackage.y3i
    public final hfk l() {
        h5e h5eVarN = p().b.n();
        ifk ifkVar = h5eVarN.p;
        return new kfk(ifkVar.a, h5eVarN, ifkVar.b, ifkVar.c, ifkVar.d);
    }

    @Override // defpackage.y3i
    public final f99 m() {
        kzl kzlVar = p().b.n().q;
        mvm mvmVar = kzlVar.a;
        mvmVar.getClass();
        return new ya9(qbe.t(new vu6(new xd6(new p71((byte) 29, (mt5) null, (Object) mvmVar), (byte) 11), (byte) 4)), kzlVar.b, new im4((byte) 4, (mt5) null, kzlVar), (byte) 0);
    }

    @Override // defpackage.y3i
    public final void n(z1e z1eVar) {
        if (((Boolean) this.a.get()).booleanValue()) {
            if (z1eVar.equals(t4j.a)) {
                h5e h5eVarN = p().b.n();
                h5eVarN.getClass();
                t3e.a(h5eVarN, t1e.d);
                return;
            }
            if (z1eVar.equals(j1a.a)) {
                h5e h5eVarN2 = p().b.n();
                h5eVarN2.getClass();
                t3e.a(h5eVarN2, t1e.e);
                return;
            }
            if (z1eVar.equals(bm6.a)) {
                h5e h5eVarN3 = p().b.n();
                h5eVarN3.getClass();
                t3e.a(h5eVarN3, t1e.f);
                return;
            }
            if (z1eVar.equals(zff.a)) {
                h5e h5eVarN4 = p().b.n();
                h5eVarN4.getClass();
                t3e.a(h5eVarN4, t1e.g);
            } else if (z1eVar.equals(nkh.a)) {
                h5e h5eVarN5 = p().b.n();
                h5eVarN5.getClass();
                t3e.a(h5eVarN5, t1e.h);
            } else {
                if (!(z1eVar instanceof gzl)) {
                    h9o.p();
                    return;
                }
                h5e h5eVarN6 = p().b.n();
                h5e h5eVar = h5eVarN6;
                na2.B(h5eVar.a, (CoroutineContext) null, (rx5) null, new qmb(h5eVar, ((gzl) z1eVar).a, (mt5) null, (byte) 8), 3);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.y3i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(mt5 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.zu6
            if (r0 == 0) goto L13
            r0 = r5
            zu6 r0 = (defpackage.zu6) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L1a
        L13:
            zu6 r0 = new zu6
            nt5 r5 = (nt5) r5
            r0.<init>(r4, r5)
        L1a:
            java.lang.Object r5 = r0.t
            px5 r1 = px5.a
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2d
            ybh.y(r5)
            t0i r5 = (t0i) r5
            java.lang.Object r4 = r5.a
            goto L4c
        L2d:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r4)
            r4 = 0
            return r4
        L34:
            ybh.y(r5)
            e6e r4 = r4.p()
            a36 r4 = r4.b
            t3e r4 = r4.n()
            r0.v = r3
            h5e r4 = (h5e) r4
            java.lang.Object r4 = r4.G(r0)
            if (r4 != r1) goto L4c
            return r1
        L4c:
            p0i r5 = t0i.b
            boolean r5 = r4 instanceof q0i
            if (r5 != 0) goto L56
            java.util.List r4 = (java.util.List) r4
            kotlin.Unit r4 = kotlin.Unit.a
        L56:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.av6.o(mt5):java.lang.Object");
    }

    public final e6e p() {
        return (e6e) this.b.getValue();
    }
}
