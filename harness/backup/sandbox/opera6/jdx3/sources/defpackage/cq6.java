package defpackage;

/* loaded from: classes.dex */
public final class cq6 {
    public final nx5 a;
    public final fs6 b;
    public final gmc c;
    public final ti9 d;
    public final qs6 e;
    public final o0i f;
    public final rlh g;

    public cq6(nx5 nx5Var, fs6 fs6Var, gmc gmcVar, ti9 ti9Var, qs6 qs6Var, vpc vpcVar, o0i o0iVar, dx5 dx5Var) {
        this.a = nx5Var;
        this.b = fs6Var;
        this.c = gmcVar;
        this.d = ti9Var;
        this.e = qs6Var;
        this.f = o0iVar;
        z4o.f(l08.a);
        this.g = gmcVar.o;
        byte b = 0;
        qs6Var.f = new up6(this, b);
        byte b2 = 1;
        up6 up6Var = new up6(this, b2);
        jh jhVar = ti9Var.j;
        if (!jhVar.a) {
            jhVar.c = up6Var;
        } else if (!jhVar.b) {
            jhVar.b = true;
            up6Var.run();
        }
        byte b3 = 13;
        mt5 mt5Var = null;
        w7d.i(new yc1(gmcVar.v, b3), nx5Var, new vp6(this, mt5Var, b));
        w7d.i(gmcVar.p, nx5Var, new vp6(this, mt5Var, b2));
        vpcVar.d.k(new cl4(new wg5(this, b3), (byte) 9));
        w7d.i(qbe.t(new yc1(ic4.r(new ya9(xf8.t(fs6Var.d), gmcVar.t, new km4(3, (mt5) null, (byte) 3), (byte) 0), dx5Var), b3)), nx5Var, new wp6(this, mt5Var, b));
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(nt5 r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof defpackage.xp6
            if (r0 == 0) goto L13
            r0 = r11
            xp6 r0 = (defpackage.xp6) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.w = r1
            goto L18
        L13:
            xp6 r0 = new xp6
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.u
            px5 r1 = px5.a
            int r2 = r0.w
            r3 = 3
            r4 = 1
            r5 = 0
            r6 = 2
            if (r2 == 0) goto L43
            if (r2 == r4) goto L3f
            if (r2 == r6) goto L37
            if (r2 != r3) goto L31
            java.lang.Object r10 = r0.t
            ybh.y(r11)
            goto Lb3
        L31:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r10)
            return r5
        L37:
            ybh.y(r11)
            t0i r11 = (t0i) r11
            java.lang.Object r11 = r11.a
            goto L63
        L3f:
            ybh.y(r11)
            goto L59
        L43:
            ybh.y(r11)
            fs6 r11 = r10.b
            jze r11 = r11.d
            xf r2 = new xf
            r7 = 9
            r2.<init>(r6, r5, r7)
            r0.w = r4
            java.lang.Object r11 = xf8.w(r11, r2, r0)
            if (r11 == r1) goto Lb1
        L59:
            r0.w = r6
            ti9 r11 = r10.d
            java.lang.Object r11 = r11.a(r0)
            if (r11 == r1) goto Lb1
        L63:
            p0i r2 = t0i.b
            boolean r2 = r11 instanceof q0i
            if (r2 != 0) goto Lb4
            r2 = r11
            java.util.List r2 = (java.util.List) r2
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r4 = new java.util.ArrayList
            r6 = 10
            int r6 = k95.o(r2, r6)
            r4.<init>(r6)
            java.util.Iterator r2 = r2.iterator()
        L7d:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L96
            java.lang.Object r6 = r2.next()
            gme r6 = (defpackage.gme) r6
            quc r7 = new quc
            long r8 = r6.a
            java.lang.String r6 = r6.b
            r7.<init>(r8, r6)
            r4.add(r7)
            goto L7d
        L96:
            r0.t = r11
            r0.w = r3
            gmc r10 = r10.c
            r10.getClass()
            emc r2 = new emc
            r3 = 0
            r2.<init>(r10, r4, r5, r3)
            java.lang.Object r10 = r10.a(r2, r0)
            px5 r0 = px5.a
            if (r10 == r0) goto Laf
            kotlin.Unit r10 = kotlin.Unit.a
        Laf:
            if (r10 != r1) goto Lb2
        Lb1:
            return r1
        Lb2:
            r10 = r11
        Lb3:
            r11 = r10
        Lb4:
            p0i r10 = t0i.b
            boolean r10 = r11 instanceof q0i
            if (r10 != 0) goto Lbf
            java.util.List r11 = (java.util.List) r11
            java.lang.Boolean r10 = java.lang.Boolean.TRUE
            return r10
        Lbf:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cq6.a(nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0098 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(nt5 r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.yp6
            if (r0 == 0) goto L13
            r0 = r9
            yp6 r0 = (defpackage.yp6) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.w = r1
            goto L18
        L13:
            yp6 r0 = new yp6
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.u
            px5 r1 = px5.a
            int r2 = r0.w
            r3 = 3
            r4 = 0
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L42
            if (r2 == r6) goto L3e
            if (r2 == r5) goto L36
            if (r2 != r3) goto L30
            java.lang.Object r8 = r0.t
            ybh.y(r9)
            goto L87
        L30:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r8)
            return r4
        L36:
            ybh.y(r9)
            t0i r9 = (t0i) r9
            java.lang.Object r9 = r9.a
            goto L62
        L3e:
            ybh.y(r9)
            goto L58
        L42:
            ybh.y(r9)
            fs6 r9 = r8.b
            jze r9 = r9.d
            xf r2 = new xf
            r7 = 10
            r2.<init>(r5, r4, r7)
            r0.w = r6
            java.lang.Object r9 = xf8.w(r9, r2, r0)
            if (r9 == r1) goto L85
        L58:
            r0.w = r5
            ti9 r9 = r8.d
            java.lang.Object r9 = r9.b(r0)
            if (r9 == r1) goto L85
        L62:
            p0i r2 = t0i.b
            boolean r2 = r9 instanceof q0i
            if (r2 != 0) goto L88
            r2 = r9
            o7f r2 = (defpackage.o7f) r2
            r0.t = r9
            r0.w = r3
            gmc r8 = r8.c
            r8.getClass()
            s23 r3 = new s23
            r5 = 13
            r3.<init>(r8, r2, r4, r5)
            java.lang.Object r8 = r8.a(r3, r0)
            if (r8 == r1) goto L83
            kotlin.Unit r8 = kotlin.Unit.a
        L83:
            if (r8 != r1) goto L86
        L85:
            return r1
        L86:
            r8 = r9
        L87:
            r9 = r8
        L88:
            p0i r8 = t0i.b
            boolean r8 = r9 instanceof q0i
            if (r8 != 0) goto L98
            o7f r9 = (defpackage.o7f) r9
            if (r9 != 0) goto L93
            r6 = 0
        L93:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r6)
            return r8
        L98:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cq6.b(nt5):java.lang.Object");
    }
}
