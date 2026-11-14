package defpackage;

/* loaded from: classes.dex */
public final class wi9 {
    public final lsf a;
    public final ode b;
    public final dx5 c;
    public final jh d;
    public final jdj e;
    public final jdj f;

    public wi9(lsf lsfVar, ode odeVar, xoc xocVar, dx5 dx5Var) {
        this.a = lsfVar;
        this.b = odeVar;
        this.c = dx5Var;
        jh jhVar = new jh();
        jhVar.c = xocVar;
        this.d = jhVar;
        jdj jdjVarC = ipe.c(1, 0, (h04) null, 6);
        this.e = jdjVarC;
        this.f = jdjVarC;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.tpc r7, nt5 r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.ui9
            if (r0 == 0) goto L13
            r0 = r8
            ui9 r0 = (defpackage.ui9) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.w = r1
            goto L18
        L13:
            ui9 r0 = new ui9
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.u
            px5 r1 = px5.a
            int r2 = r0.w
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2d
            hne r6 = r0.t
            ybh.y(r8)
            goto L6f
        L2d:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r6)
            return r5
        L33:
            ybh.y(r8)
            t0i r8 = (t0i) r8
            java.lang.Object r7 = r8.a
            goto L54
        L3b:
            ybh.y(r8)
            lsf r8 = r6.a
            zyk r8 = r8.c
            java.lang.Object r8 = r8.getValue()
            zfo r8 = (defpackage.zfo) r8
            java.lang.String r2 = r7.c
            java.lang.String r7 = r7.b
            r0.w = r4
            java.lang.Object r7 = r8.b(r2, r7, r0)
            if (r7 == r1) goto L6d
        L54:
            java.lang.Throwable r8 = t0i.d(r7)
            if (r8 != 0) goto L72
            hne r7 = (defpackage.hne) r7
            fb9 r8 = new fb9
            r8.<init>(r6, r7, r5, r4)
            r0.t = r7
            r0.w = r3
            dx5 r6 = r6.c
            java.lang.Object r6 = na2.Z(r6, r8, r0)
            if (r6 != r1) goto L6e
        L6d:
            return r1
        L6e:
            r6 = r7
        L6f:
            java.util.List r6 = r6.a
            return r6
        L72:
            l08 r6 = l08.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wi9.a(tpc, nt5):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0071, code lost:
    
        if (r8.emit(r9, r0) != r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(nt5 r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.vi9
            if (r0 == 0) goto L13
            r0 = r9
            vi9 r0 = (defpackage.vi9) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.x = r1
            goto L18
        L13:
            vi9 r0 = new vi9
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.v
            px5 r1 = px5.a
            int r2 = r0.x
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L45
            if (r2 == r6) goto L3a
            if (r2 == r5) goto L34
            if (r2 != r4) goto L2e
            ybh.y(r9)
            goto L74
        L2e:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r8)
            return r3
        L34:
            jdj r8 = r0.t
            ybh.y(r9)
            goto L69
        L3a:
            wi9 r8 = r0.u
            jdj r2 = r0.t
            ybh.y(r9)
            r7 = r2
            r2 = r9
            r9 = r7
            goto L58
        L45:
            ybh.y(r9)
            jdj r9 = r8.e
            r0.t = r9
            r0.u = r8
            r0.x = r6
            ode r2 = r8.b
            java.lang.Object r2 = xf8.v(r2, r0)
            if (r2 == r1) goto L73
        L58:
            tpc r2 = (defpackage.tpc) r2
            r0.t = r9
            r0.u = r3
            r0.x = r5
            java.lang.Object r8 = r8.a(r2, r0)
            if (r8 == r1) goto L73
            r7 = r9
            r9 = r8
            r8 = r7
        L69:
            r0.t = r3
            r0.x = r4
            java.lang.Object r8 = r8.emit(r9, r0)
            if (r8 != r1) goto L74
        L73:
            return r1
        L74:
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wi9.b(nt5):java.lang.Object");
    }
}
