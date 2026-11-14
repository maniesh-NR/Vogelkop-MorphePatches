package defpackage;

import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class y1h implements afe, nx5 {
    public final /* synthetic */ afe a;
    public final CoroutineContext b;

    public y1h(afe afeVar, CoroutineContext coroutineContext) {
        this.a = afeVar;
        this.b = coroutineContext;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(j3i r5, nt5 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.x1h
            if (r0 == 0) goto L13
            r0 = r6
            x1h r0 = (defpackage.x1h) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.w = r1
            goto L18
        L13:
            x1h r0 = new x1h
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r4 = r0.u
            px5 r6 = px5.a
            int r1 = r0.w
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 == r2) goto L29
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r4)
            return
        L29:
            j3i r5 = r0.t
            defpackage.ybh.y(r4)     // Catch: java.lang.Throwable -> L4f
            goto L49
        L2f:
            defpackage.ybh.y(r4)
            r0.t = r5     // Catch: java.lang.Throwable -> L4f
            r0.w = r2     // Catch: java.lang.Throwable -> L4f
            nh4 r4 = new nh4     // Catch: java.lang.Throwable -> L4f
            mt5 r0 = hib.b(r0)     // Catch: java.lang.Throwable -> L4f
            r4.<init>(r2, r0)     // Catch: java.lang.Throwable -> L4f
            r4.s()     // Catch: java.lang.Throwable -> L4f
            java.lang.Object r4 = r4.q()     // Catch: java.lang.Throwable -> L4f
            if (r4 != r6) goto L49
            return
        L49:
            pxb r4 = new pxb     // Catch: java.lang.Throwable -> L4f
            r4.<init>()     // Catch: java.lang.Throwable -> L4f
            throw r4     // Catch: java.lang.Throwable -> L4f
        L4f:
            r4 = move-exception
            r5.invoke()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y1h.b(j3i, nt5):void");
    }

    @Override // defpackage.iak
    public final Object getValue() {
        return this.a.getValue();
    }

    public final CoroutineContext l() {
        return this.b;
    }

    @Override // defpackage.afe
    public final void setValue(Object obj) {
        this.a.setValue(obj);
    }
}
