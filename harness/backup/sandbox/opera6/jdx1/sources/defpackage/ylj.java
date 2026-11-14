package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class ylj {
    public final pfe a = new pfe();
    public final eme b = new eme((byte) 12);
    public final xd6 c = new xd6(new wv0(2, (mt5) null, (byte) 4), (byte) 11);

    public final Integer a() {
        return new Integer(((AtomicInteger) this.b.a).get());
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005a, code lost:
    
        if (r8 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(kotlin.jvm.functions.Function1 r7, mt5 r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.wlj
            if (r0 == 0) goto L13
            r0 = r8
            wlj r0 = (defpackage.wlj) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.x = r1
            goto L18
        L13:
            wlj r0 = new wlj
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.v
            px5 r1 = px5.a
            int r2 = r0.x
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3f
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2f
            java.lang.Object r6 = r0.t
            pfe r6 = (pfe) r6
            defpackage.ybh.y(r8)     // Catch: java.lang.Throwable -> L61
            goto L5d
        L2f:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r6)
            return r5
        L35:
            pfe r6 = r0.u
            java.lang.Object r7 = r0.t
            kotlin.jvm.functions.Function1 r7 = (kotlin.jvm.functions.Function1) r7
            defpackage.ybh.y(r8)
            goto L50
        L3f:
            defpackage.ybh.y(r8)
            r0.t = r7
            pfe r6 = r6.a
            r0.u = r6
            r0.x = r4
            java.lang.Object r8 = r6.i(r0)
            if (r8 == r1) goto L5c
        L50:
            r0.t = r6     // Catch: java.lang.Throwable -> L61
            r0.u = r5     // Catch: java.lang.Throwable -> L61
            r0.x = r3     // Catch: java.lang.Throwable -> L61
            java.lang.Object r8 = r7.invoke(r0)     // Catch: java.lang.Throwable -> L61
            if (r8 != r1) goto L5d
        L5c:
            return r1
        L5d:
            r6.l(r5)
            return r8
        L61:
            r7 = move-exception
            r6.l(r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ylj.b(kotlin.jvm.functions.Function1, mt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(kotlin.jvm.functions.Function2 r7, mt5 r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.xlj
            if (r0 == 0) goto L13
            r0 = r8
            xlj r0 = (defpackage.xlj) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.x = r1
            goto L18
        L13:
            xlj r0 = new xlj
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.v
            px5 r1 = px5.a
            int r2 = r0.x
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2e
            boolean r6 = r0.u
            pfe r7 = r0.t
            defpackage.ybh.y(r8)     // Catch: java.lang.Throwable -> L2c
            goto L52
        L2c:
            r8 = move-exception
            goto L5d
        L2e:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r6)
            return r4
        L34:
            defpackage.ybh.y(r8)
            pfe r6 = r6.a
            boolean r8 = r6.j()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r8)     // Catch: java.lang.Throwable -> L58
            r0.t = r6     // Catch: java.lang.Throwable -> L58
            r0.u = r8     // Catch: java.lang.Throwable -> L58
            r0.x = r3     // Catch: java.lang.Throwable -> L58
            java.lang.Object r7 = r7.invoke(r2, r0)     // Catch: java.lang.Throwable -> L58
            if (r7 != r1) goto L4e
            return r1
        L4e:
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r5
        L52:
            if (r6 == 0) goto L57
            r7.l(r4)
        L57:
            return r8
        L58:
            r7 = move-exception
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r5
        L5d:
            if (r6 == 0) goto L62
            r7.l(r4)
        L62:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ylj.c(kotlin.jvm.functions.Function2, mt5):java.lang.Object");
    }
}
