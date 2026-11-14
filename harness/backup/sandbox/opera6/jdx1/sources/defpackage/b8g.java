package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;
import kotlin.coroutines.f;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class b8g implements d9e {
    public final d9e a;
    public final tn b = new tn((byte) 17);

    public b8g(d9e d9eVar) {
        this.a = d9eVar;
    }

    public final Object fold(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }

    public final CoroutineContext.Element get(g gVar) {
        return f.a(this, gVar);
    }

    public final CoroutineContext minusKey(g gVar) {
        return f.b(this, gVar);
    }

    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        return e.a(this, coroutineContext);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.d9e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(kotlin.jvm.functions.Function1 r8, mt5 r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.a8g
            if (r0 == 0) goto L13
            r0 = r9
            a8g r0 = (defpackage.a8g) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.w = r1
            goto L18
        L13:
            a8g r0 = new a8g
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.u
            px5 r1 = px5.a
            int r2 = r0.w
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L39
            if (r2 == r5) goto L31
            if (r2 != r4) goto L2b
            defpackage.ybh.y(r9)
            return r9
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r7)
            return r3
        L31:
            kotlin.jvm.functions.Function1 r8 = r0.t
            kotlin.jvm.functions.Function1 r8 = (kotlin.jvm.functions.Function1) r8
            defpackage.ybh.y(r9)
            goto L7b
        L39:
            defpackage.ybh.y(r9)
            tn r9 = r7.b
            r2 = r8
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            r0.t = r2
            r0.w = r5
            java.lang.Object r2 = r9.b
            monitor-enter(r2)
            boolean r6 = r9.a     // Catch: java.lang.Throwable -> L8c
            monitor-exit(r2)
            if (r6 == 0) goto L50
            kotlin.Unit r9 = kotlin.Unit.a
            goto L79
        L50:
            nh4 r2 = new nh4
            mt5 r6 = hib.b(r0)
            r2.<init>(r5, r6)
            r2.s()
            java.lang.Object r5 = r9.b
            monitor-enter(r5)
            java.lang.Object r6 = r9.c     // Catch: java.lang.Throwable -> L89
            java.util.ArrayList r6 = (java.util.ArrayList) r6     // Catch: java.lang.Throwable -> L89
            r6.add(r2)     // Catch: java.lang.Throwable -> L89
            monitor-exit(r5)
            m91 r5 = new m91
            r6 = 8
            r5.<init>(r9, r2, r6)
            r2.u(r5)
            java.lang.Object r9 = r2.q()
            if (r9 == r1) goto L79
            kotlin.Unit r9 = kotlin.Unit.a
        L79:
            if (r9 == r1) goto L87
        L7b:
            d9e r7 = r7.a
            r0.t = r3
            r0.w = r4
            java.lang.Object r7 = r7.t(r8, r0)
            if (r7 != r1) goto L88
        L87:
            return r1
        L88:
            return r7
        L89:
            r7 = move-exception
            monitor-exit(r5)
            throw r7
        L8c:
            r7 = move-exception
            monitor-exit(r2)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b8g.t(kotlin.jvm.functions.Function1, mt5):java.lang.Object");
    }
}
