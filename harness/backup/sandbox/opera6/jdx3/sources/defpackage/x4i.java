package defpackage;

/* loaded from: classes.dex */
public final class x4i {
    public final y3i a;
    public final ikc b;
    public final ru9 c;
    public final ddc d;
    public d3k e;
    public boolean f;
    public boolean g;
    public final ode h;

    public x4i(y3i y3iVar, ikc ikcVar, ru9 ru9Var, ndc ndcVar) {
        new ode(n08.a);
        this.a = y3iVar;
        this.b = ikcVar;
        this.c = ru9Var;
        this.d = cqp.V(ndcVar.getLifecycle());
        this.h = new ode();
        ikcVar.j(ndcVar, new w4i(new rmg(this, (byte) 26), (byte) 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.k15 r5, nt5 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.v4i
            if (r0 == 0) goto L13
            r0 = r6
            v4i r0 = (defpackage.v4i) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.w = r1
            goto L18
        L13:
            v4i r0 = new v4i
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            px5 r1 = px5.a
            int r2 = r0.w
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2d
            k15 r5 = r0.t
            ybh.y(r6)
            t0i r6 = (t0i) r6
            java.lang.Object r6 = r6.a
            goto L46
        L2d:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r4)
            r4 = 0
            return r4
        L34:
            ybh.y(r6)
            java.lang.String r6 = r5.a
            r0.t = r5
            r0.w = r3
            y3i r2 = r4.a
            java.lang.Object r6 = r2.f(r6, r0)
            if (r6 != r1) goto L46
            return r1
        L46:
            p0i r0 = t0i.b
            boolean r0 = r6 instanceof q0i
            if (r0 != 0) goto L69
            ru9 r4 = r4.c
            android.content.SharedPreferences r0 = r4.a
            java.lang.String r1 = "rewards.claimed_wallpapers"
            java.util.HashSet r0 = w1h.m(r0, r1)
            java.lang.String r5 = r5.a
            r0.add(r5)
            nv6 r4 = r4.b()
            java.lang.Object r5 = r4.a
            android.content.SharedPreferences$Editor r5 = (android.content.SharedPreferences.Editor) r5
            r5.putStringSet(r1, r0)
            r4.w()
        L69:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x4i.a(k15, nt5):java.lang.Object");
    }
}
