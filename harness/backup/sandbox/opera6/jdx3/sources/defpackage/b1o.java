package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final class b1o {
    public final Context a;
    public final wjh b;
    public final m91 c;
    public final br6 d;
    public final jv1 e;
    public final zyk f;
    public final a64 g;
    public final a1o h;
    public final i07 i;
    public volatile v0o j;
    public d3k k;

    public b1o(Context context, wjh wjhVar, m91 m91Var, br6 br6Var, jv1 jv1Var) {
        r16 r16Var = ngh.a;
        this.a = context;
        this.b = wjhVar;
        this.c = m91Var;
        this.d = br6Var;
        this.e = jv1Var;
        this.f = z4c.b(new m2n(this, (byte) 12));
        a64 a64VarB = sgb.b(zch.a());
        this.g = a64VarB;
        a1o a1oVar = new a1o(this, (jg8) wjhVar.d, (jg8) wjhVar.e);
        this.h = a1oVar;
        this.i = na2.g(a64VarB, (jg8) wjhVar.d, (rx5) null, new u6k((byte) 10, (mt5) null, this), 2);
        ((d3k) a1oVar.b).start();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(nt5 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.x0o
            if (r0 == 0) goto L13
            r0 = r5
            x0o r0 = (defpackage.x0o) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            x0o r0 = new x0o
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.t
            px5 r1 = px5.a
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            ybh.y(r5)
            goto L49
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r4)
            r4 = 0
            return r4
        L2e:
            ybh.y(r5)
            d3k r5 = r4.k
            if (r5 == 0) goto L39
            v0o r5 = r4.j
            if (r5 != 0) goto L3c
        L39:
            r4.b()
        L3c:
            d3k r5 = r4.k
            if (r5 == 0) goto L49
            r0.v = r3
            java.lang.Object r5 = r5.Z(r0)
            if (r5 != r1) goto L49
            return r1
        L49:
            v0o r4 = r4.j
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b1o.a(nt5):java.lang.Object");
    }

    public final void b() {
        d3k d3kVar = this.k;
        if (d3kVar == null || !d3kVar.isActive()) {
            this.k = na2.B(this.g, (d7a) this.b.b, (rx5) null, new pin((byte) 1, (mt5) null, this), 2);
        }
    }

    public final void c() {
        Long l;
        v0o v0oVar = this.j;
        if (v0oVar == null || (l = v0oVar.e) == null) {
            na2.B(this.g, (jg8) this.b.d, (rx5) null, new rf4((byte) 20, (mt5) null, this), 2);
            return;
        }
        long jLongValue = l.longValue();
        x5f x5fVar = (x5f) ((skm) this.e.get());
        zpa zpaVar = x5fVar.d;
        x56 x56VarF = zpa.F();
        ((kn0) new ck0(zpaVar, x56VarF).d.getValue()).b.p(35, 1, 1000 * jLongValue);
        x5fVar.U0(x56VarF);
        skm skmVar = (skm) this.e.get();
        boolean zJ = urj.j(jLongValue);
        x5f x5fVar2 = (x5f) skmVar;
        zpa zpaVar2 = x5fVar2.d;
        x56 x56VarF2 = zpa.F();
        new ck0(zpaVar2, x56VarF2).h().a.r(11, 1, zJ);
        x5fVar2.U0(x56VarF2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(nt5 r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof defpackage.y0o
            if (r0 == 0) goto L13
            r0 = r12
            y0o r0 = (defpackage.y0o) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.w = r1
            goto L18
        L13:
            y0o r0 = new y0o
            r0.<init>(r11, r12)
        L18:
            java.lang.Object r12 = r0.u
            px5 r1 = px5.a
            int r2 = r0.w
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            long r0 = r0.t
            ybh.y(r12)
            goto L4d
        L29:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r11)
            r11 = 0
            return r11
        L30:
            ybh.y(r12)
            v0o r12 = r11.j
            if (r12 == 0) goto Lb6
            java.lang.Long r12 = r12.e
            if (r12 == 0) goto Lb6
            long r4 = r12.longValue()
            i07 r12 = r11.i
            r0.t = r4
            r0.w = r3
            java.lang.Object r12 = r12.A(r0)
            if (r12 != r1) goto L4c
            return r1
        L4c:
            r0 = r4
        L4d:
            android.content.SharedPreferences r12 = (android.content.SharedPreferences) r12
            java.lang.String r2 = "report_first_seen"
            r4 = 0
            boolean r5 = r12.getBoolean(r2, r4)
            if (r5 == 0) goto Lb3
            jv1 r5 = r11.e
            java.lang.Object r5 = r5.get()
            skm r5 = (defpackage.skm) r5
            x5f r5 = (defpackage.x5f) r5
            zpa r6 = r5.d
            x56 r7 = defpackage.zpa.F()
            ck0 r8 = new ck0
            r8.<init>(r6, r7)
            zyk r6 = r8.d
            java.lang.Object r6 = r6.getValue()
            kn0 r6 = (defpackage.kn0) r6
            r8 = 1000(0x3e8, double:4.94E-321)
            long r8 = r8 * r0
            in0 r6 = r6.b
            r10 = 35
            r6.p(r10, r3, r8)
            r5.U0(r7)
            jv1 r11 = r11.e
            java.lang.Object r11 = r11.get()
            skm r11 = (defpackage.skm) r11
            boolean r0 = defpackage.urj.j(r0)
            x5f r11 = (defpackage.x5f) r11
            zpa r1 = r11.d
            x56 r5 = defpackage.zpa.F()
            ck0 r6 = new ck0
            r6.<init>(r1, r5)
            at0 r1 = r6.h()
            zs0 r1 = r1.a
            r6 = 11
            r1.r(r6, r3, r0)
            r11.U0(r5)
            android.content.SharedPreferences$Editor r11 = r12.edit()
            r11.putBoolean(r2, r4)
            r11.apply()
        Lb3:
            kotlin.Unit r11 = kotlin.Unit.a
            return r11
        Lb6:
            kotlin.Unit r11 = kotlin.Unit.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b1o.d(nt5):java.lang.Object");
    }
}
