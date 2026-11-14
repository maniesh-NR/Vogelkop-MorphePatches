package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class mtj implements h89 {
    public final rtj a;
    public final wi6 b;
    public final a2k c;
    public final bpi d = epi.b;

    public mtj(rtj rtjVar, wi6 wi6Var, a2k a2kVar) {
        this.a = rtjVar;
        this.b = wi6Var;
        this.c = a2kVar;
    }

    @Override // defpackage.h89
    public final Object a(opi opiVar, float f, mt5 mt5Var) {
        return c(opiVar, f, cqp.k, (nt5) mt5Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.opi r11, float r12, kotlin.jvm.functions.Function1 r13, nt5 r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof defpackage.htj
            if (r0 == 0) goto L13
            r0 = r14
            htj r0 = (defpackage.htj) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.w = r1
            goto L18
        L13:
            htj r0 = new htj
            r0.<init>(r10, r14)
        L18:
            java.lang.Object r14 = r0.u
            px5 r1 = px5.a
            int r2 = r0.w
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2c
            kotlin.jvm.functions.Function1 r10 = r0.t
            r13 = r10
            kotlin.jvm.functions.Function1 r13 = (kotlin.jvm.functions.Function1) r13
            defpackage.ybh.y(r14)
            goto L51
        L2c:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r10)
            r10 = 0
            return r10
        L33:
            defpackage.ybh.y(r14)
            jtj r4 = new jtj
            r9 = 0
            r5 = r10
            r8 = r11
            r6 = r12
            r7 = r13
            r4.<init>(r5, r6, r7, r8, r9)
            r13 = r7
            kotlin.jvm.functions.Function1 r13 = (kotlin.jvm.functions.Function1) r13
            r0.t = r13
            r0.w = r3
            bpi r10 = r5.d
            java.lang.Object r14 = defpackage.na2.Z(r10, r4, r0)
            if (r14 != r1) goto L50
            return r1
        L50:
            r13 = r7
        L51:
            te1 r14 = (defpackage.te1) r14
            java.lang.Float r10 = new java.lang.Float
            r11 = 0
            r10.<init>(r11)
            r13.invoke(r10)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mtj.b(opi, float, kotlin.jvm.functions.Function1, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.opi r5, float r6, kotlin.jvm.functions.Function1 r7, nt5 r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof defpackage.ktj
            if (r0 == 0) goto L13
            r0 = r8
            ktj r0 = (defpackage.ktj) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            ktj r0 = new ktj
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.t
            px5 r1 = px5.a
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            defpackage.ybh.y(r8)
            goto L3a
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.ybh.y(r8)
            r0.v = r3
            java.lang.Object r8 = r4.b(r5, r6, r7, r0)
            if (r8 != r1) goto L3a
            return r1
        L3a:
            te1 r8 = (defpackage.te1) r8
            java.lang.Float r4 = r8.a
            float r4 = r4.floatValue()
            xe1 r5 = r8.b
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L53
            java.lang.Object r4 = r5.b()
            java.lang.Number r4 = (java.lang.Number) r4
            float r6 = r4.floatValue()
        L53:
            java.lang.Float r4 = new java.lang.Float
            r4.<init>(r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mtj.c(opi, float, kotlin.jvm.functions.Function1, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.opi r11, float r12, float r13, defpackage.itj r14, nt5 r15) {
        /*
            r10 = this;
            boolean r0 = r15 instanceof defpackage.ltj
            if (r0 == 0) goto L14
            r0 = r15
            ltj r0 = (defpackage.ltj) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.v = r1
        L12:
            r15 = r0
            goto L1a
        L14:
            ltj r0 = new ltj
            r0.<init>(r10, r15)
            goto L12
        L1a:
            java.lang.Object r0 = r15.t
            px5 r1 = px5.a
            int r2 = r15.v
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L2a
            defpackage.ybh.y(r0)
            goto La0
        L2a:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r10)
            r10 = 0
            return r10
        L31:
            defpackage.ybh.y(r0)
            float r0 = java.lang.Math.abs(r12)
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L45
            float r0 = java.lang.Math.abs(r13)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L4c
        L45:
            r10 = 28
            xe1 r10 = defpackage.cs5.a(r10, r12, r13)
            return r10
        L4c:
            r15.v = r3
            wi6 r0 = r10.b
            oji r3 = r0.a
            java.lang.Object r3 = r3.a
            f82 r3 = (defpackage.f82) r3
            double r4 = r3.b(r13)
            float r6 = r3.a
            float r3 = r3.b
            float r6 = r6 * r3
            double r6 = (double) r6
            r8 = 4610498273497838410(0x3ffbc7c09563f34a, double:1.7362676463664735)
            double r8 = r8 * r4
            double r3 = java.lang.Math.exp(r8)
            double r3 = r3 * r6
            float r3 = (float) r3
            float r4 = java.lang.Math.signum(r13)
            float r4 = r4 * r3
            float r4 = r4 + r2
            float r2 = java.lang.Math.abs(r4)
            float r3 = java.lang.Math.abs(r12)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 < 0) goto L85
            zy9 r10 = new zy9
            r10.<init>(r0)
        L83:
            r0 = r12
            goto L8e
        L85:
            dcl r0 = new dcl
            a2k r10 = r10.c
            r0.<init>(r10)
            r10 = r0
            goto L83
        L8e:
            java.lang.Float r12 = new java.lang.Float
            r12.<init>(r0)
            r0 = r13
            java.lang.Float r13 = new java.lang.Float
            r13.<init>(r0)
            java.lang.Object r0 = r10.y(r11, r12, r13, r14, r15)
            if (r0 != r1) goto La0
            return r1
        La0:
            te1 r0 = (defpackage.te1) r0
            xe1 r10 = r0.b
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mtj.d(opi, float, float, itj, nt5):java.lang.Object");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof mtj)) {
            return false;
        }
        mtj mtjVar = (mtj) obj;
        return mtjVar.c.equals(this.c) && Intrinsics.a(mtjVar.b, this.b) && Intrinsics.a(mtjVar.a, this.a);
    }

    public final int hashCode() {
        return this.a.hashCode() + ((this.b.hashCode() + (this.c.hashCode() * 31)) * 31);
    }
}
