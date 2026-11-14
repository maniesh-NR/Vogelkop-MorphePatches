package defpackage;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class ece implements zth {
    public final l4c a;
    public final nx5 b;
    public final cb7 c;
    public final yin d;
    public final pfe e = new pfe();
    public final HashMap f = new HashMap();
    public final HashMap g = new HashMap();
    public final jdj h = ipe.c(0, 1, h04.b, 1);

    public ece(l4c l4cVar, nx5 nx5Var, cb7 cb7Var, yin yinVar) {
        this.a = l4cVar;
        this.b = nx5Var;
        this.c = cb7Var;
        this.d = yinVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r7, nt5 r8) {
        /*
            r6 = this;
            java.util.HashMap r0 = r6.g
            boolean r1 = r8 instanceof defpackage.bce
            if (r1 == 0) goto L15
            r1 = r8
            bce r1 = (defpackage.bce) r1
            int r2 = r1.x
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.x = r2
            goto L1a
        L15:
            bce r1 = new bce
            r1.<init>(r6, r8)
        L1a:
            java.lang.Object r8 = r1.v
            px5 r2 = px5.a
            int r3 = r1.x
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L36
            if (r3 != r4) goto L30
            pfe r7 = r1.u
            java.lang.String r1 = r1.t
            ybh.y(r8)
            r8 = r7
            r7 = r1
            goto L48
        L30:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r6)
            return r5
        L36:
            ybh.y(r8)
            r1.t = r7
            pfe r8 = r6.e
            r1.u = r8
            r1.x = r4
            java.lang.Object r1 = r8.i(r1)
            if (r1 != r2) goto L48
            return r2
        L48:
            java.lang.Object r1 = r0.get(r7)     // Catch: java.lang.Throwable -> L5e
            fra r1 = (defpackage.fra) r1     // Catch: java.lang.Throwable -> L5e
            if (r1 != 0) goto L5a
            fra r1 = new fra     // Catch: java.lang.Throwable -> L5e
            l4c r6 = r6.a     // Catch: java.lang.Throwable -> L5e
            r1.<init>(r6, r7)     // Catch: java.lang.Throwable -> L5e
            r0.put(r7, r1)     // Catch: java.lang.Throwable -> L5e
        L5a:
            r8.l(r5)
            return r1
        L5e:
            r6 = move-exception
            r8.l(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ece.d(java.lang.String, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.String r9, nt5 r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.cce
            if (r0 == 0) goto L13
            r0 = r10
            cce r0 = (defpackage.cce) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.x = r1
            goto L18
        L13:
            cce r0 = new cce
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.v
            px5 r1 = px5.a
            int r2 = r0.x
            java.util.HashMap r3 = r8.f
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L3f
            if (r2 == r5) goto L37
            if (r2 != r4) goto L31
            pfe r8 = r0.u
            java.lang.String r9 = r0.t
            ybh.y(r10)     // Catch: java.lang.Throwable -> L73
            goto L69
        L31:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r8)
            return r6
        L37:
            pfe r9 = r0.u
            java.lang.String r2 = r0.t
            ybh.y(r10)
            goto L52
        L3f:
            ybh.y(r10)
            r0.t = r9
            pfe r10 = r8.e
            r0.u = r10
            r0.x = r5
            java.lang.Object r2 = r10.i(r0)
            if (r2 == r1) goto L66
            r2 = r9
            r9 = r10
        L52:
            java.lang.Object r10 = r3.get(r2)     // Catch: java.lang.Throwable -> L79
            dwn r10 = (defpackage.dwn) r10     // Catch: java.lang.Throwable -> L79
            if (r10 != 0) goto L75
            r0.t = r2     // Catch: java.lang.Throwable -> L79
            r0.u = r9     // Catch: java.lang.Throwable -> L79
            r0.x = r4     // Catch: java.lang.Throwable -> L79
            java.lang.Object r10 = r8.f(r2, r0)     // Catch: java.lang.Throwable -> L79
            if (r10 != r1) goto L67
        L66:
            return r1
        L67:
            r8 = r9
            r9 = r2
        L69:
            r0 = r10
            dwn r0 = (defpackage.dwn) r0     // Catch: java.lang.Throwable -> L73
            r3.put(r9, r0)     // Catch: java.lang.Throwable -> L73
            dwn r10 = (defpackage.dwn) r10     // Catch: java.lang.Throwable -> L73
            r9 = r8
            goto L75
        L73:
            r9 = move-exception
            goto L7d
        L75:
            r9.l(r6)
            return r10
        L79:
            r8 = move-exception
            r7 = r9
            r9 = r8
            r8 = r7
        L7d:
            r8.l(r6)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ece.e(java.lang.String, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(java.lang.String r8, nt5 r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.dce
            if (r0 == 0) goto L13
            r0 = r9
            dce r0 = (defpackage.dce) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.w = r1
            goto L18
        L13:
            dce r0 = new dce
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.u
            px5 r1 = px5.a
            int r2 = r0.w
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L2a
            java.lang.String r8 = r0.t
            ybh.y(r9)
            goto L76
        L2a:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r7)
            return r3
        L30:
            ybh.y(r9)
            l4c r9 = r7.a
            java.lang.Object r9 = r9.getValue()
            pna r9 = (pna) r9
            r0.t = r8
            r0.w = r4
            tmj r2 = defpackage.iwn.d
            goa.a(r9, r2)
            cd5 r2 = new cd5
            r2.<init>()
            spa r4 = new spa
            r4.<init>()
            vgm r5 = vgm.e
            tgm r6 = r4.a
            r6.d = r5
            vgm r5 = r6.d()
            short r5 = r5.b
            r6.e(r5)
            ugm.b(r6, r8)
            yqa r5 = new yqa
            r6 = 0
            r5.<init>(r4, r9, r6)
            g14 r4 = new g14
            r4.<init>(r5, r2, r3)
            r5 = 3
            na2.B(r9, r3, r3, r4, r5)
            java.lang.Object r9 = r2.A(r0)
            if (r9 != r1) goto L76
            return r1
        L76:
            r1 = r9
            an6 r1 = (an6) r1
            cb7 r9 = r7.c
            kzd r9 = (kzd) r9
            ab7 r9 = r9.a
            dx5 r9 = r9.c()
            a64 r3 = new a64
            nx5 r2 = r7.b
            kotlin.coroutines.CoroutineContext r0 = r2.l()
            kotlin.coroutines.CoroutineContext r9 = r0.plus(r9)
            r3.<init>(r9)
            jkc r5 = new jkc
            r9 = 16
            r5.<init>(r7, r8, r9)
            dwn r0 = new dwn
            jdj r4 = r7.h
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ece.f(java.lang.String, nt5):java.lang.Object");
    }
}
