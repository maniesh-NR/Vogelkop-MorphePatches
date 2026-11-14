package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class j3g implements akh, tng {
    public final Function2 a;
    public final osk b;
    public final AtomicInteger c = new AtomicInteger(0);
    public s1m d;

    public j3g(Function2 function2, osk oskVar) {
        this.a = function2;
        this.b = oskVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.tng
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r11, kotlin.jvm.functions.Function1 r12, nt5 r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof defpackage.i3g
            if (r0 == 0) goto L13
            r0 = r13
            i3g r0 = (defpackage.i3g) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.x = r1
            goto L18
        L13:
            i3g r0 = new i3g
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.v
            px5 r1 = px5.a
            int r2 = r0.x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L31
            if (r2 != r3) goto L2a
            defpackage.ybh.y(r13)
            return r13
        L2a:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r10)
            r10 = 0
            return r10
        L31:
            kotlin.jvm.functions.Function1 r11 = r0.u
            r12 = r11
            kotlin.jvm.functions.Function1 r12 = (kotlin.jvm.functions.Function1) r12
            java.lang.String r11 = r0.t
            defpackage.ybh.y(r13)
        L3b:
            r6 = r11
            r7 = r12
            goto L51
        L3e:
            defpackage.ybh.y(r13)
            r0.t = r11
            r13 = r12
            kotlin.jvm.functions.Function1 r13 = (kotlin.jvm.functions.Function1) r13
            r0.u = r13
            r0.x = r4
            java.lang.Boolean r13 = r10.c(r0)
            if (r13 != r1) goto L3b
            goto L6f
        L51:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r11 = r13.booleanValue()
            r8 = 0
            if (r11 == 0) goto L71
            tf4 r4 = new tf4
            r9 = 1
            r5 = r10
            r4.<init>(r5, r6, r7, r8, r9)
            r0.t = r8
            r0.u = r8
            r0.x = r3
            kotlin.jvm.functions.Function2 r10 = r5.a
            java.lang.Object r10 = r10.invoke(r4, r0)
            if (r10 != r1) goto L70
        L6f:
            return r1
        L70:
            return r10
        L71:
            r5 = r10
            osk r10 = r5.b
            wsk r10 = r10.h(r6)
            java.lang.Object r11 = r7.invoke(r10)     // Catch: java.lang.Throwable -> L80
            defpackage.fr3.t(r10, r8)
            return r11
        L80:
            r0 = move-exception
            r11 = r0
            throw r11     // Catch: java.lang.Throwable -> L83
        L83:
            r0 = move-exception
            r12 = r0
            defpackage.fr3.t(r10, r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j3g.a(java.lang.String, kotlin.jvm.functions.Function1, nt5):java.lang.Object");
    }

    @Override // defpackage.akh
    public final osk b() {
        return this.b;
    }

    public final Boolean c(mt5 mt5Var) {
        return Boolean.valueOf(this.d != null || this.b.a.p());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.s1m r9, kotlin.jvm.functions.Function2 r10, nt5 r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof defpackage.h3g
            if (r0 == 0) goto L13
            r0 = r11
            h3g r0 = (defpackage.h3g) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.w = r1
            goto L18
        L13:
            h3g r0 = new h3g
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.u
            px5 r1 = px5.a
            int r2 = r0.w
            java.lang.String r3 = "ROLLBACK TRANSACTION"
            r4 = 0
            java.util.concurrent.atomic.AtomicInteger r5 = r8.c
            r6 = 1
            osk r7 = r8.b
            if (r2 == 0) goto L36
            if (r2 != r6) goto L30
            boolean r6 = r0.t
            defpackage.ybh.y(r11)     // Catch: java.lang.Throwable -> L85
            goto L71
        L30:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r8)
            return r4
        L36:
            defpackage.ybh.y(r11)
            int r11 = r9.ordinal()
            if (r11 == 0) goto L54
            if (r11 == r6) goto L4e
            r2 = 2
            if (r11 != r2) goto L4a
            java.lang.String r11 = "BEGIN EXCLUSIVE TRANSACTION"
            defpackage.nxg.k(r7, r11)
            goto L59
        L4a:
            h9o.p()
            return r4
        L4e:
            java.lang.String r11 = "BEGIN IMMEDIATE TRANSACTION"
            defpackage.nxg.k(r7, r11)
            goto L59
        L54:
            java.lang.String r11 = "BEGIN DEFERRED TRANSACTION"
            defpackage.nxg.k(r7, r11)
        L59:
            int r11 = r5.incrementAndGet()
            if (r11 <= 0) goto L61
            r8.d = r9
        L61:
            g3g r9 = new g3g     // Catch: java.lang.Throwable -> L85
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L85
            r0.t = r6     // Catch: java.lang.Throwable -> L85
            r0.w = r6     // Catch: java.lang.Throwable -> L85
            java.lang.Object r11 = r10.invoke(r9, r0)     // Catch: java.lang.Throwable -> L85
            if (r11 != r1) goto L71
            return r1
        L71:
            int r9 = r5.decrementAndGet()
            if (r9 != 0) goto L79
            r8.d = r4
        L79:
            if (r6 == 0) goto L81
            java.lang.String r8 = "END TRANSACTION"
            defpackage.nxg.k(r7, r8)
            return r11
        L81:
            defpackage.nxg.k(r7, r3)
            return r11
        L85:
            r9 = move-exception
            throw r9     // Catch: java.lang.Throwable -> L87
        L87:
            r10 = move-exception
            int r11 = r5.decrementAndGet()     // Catch: android.database.SQLException -> L94
            if (r11 != 0) goto L90
            r8.d = r4     // Catch: android.database.SQLException -> L94
        L90:
            defpackage.nxg.k(r7, r3)     // Catch: android.database.SQLException -> L94
            goto L98
        L94:
            r8 = move-exception
            defpackage.wf8.a(r9, r8)
        L98:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j3g.d(s1m, kotlin.jvm.functions.Function2, nt5):java.lang.Object");
    }

    public final Object e(s1m s1mVar, Function2 function2, kuk kukVar) {
        Object objInvoke = this.a.invoke(new k50(this, s1mVar, function2, null, (byte) 7), kukVar);
        px5 px5Var = px5.a;
        return objInvoke;
    }
}
