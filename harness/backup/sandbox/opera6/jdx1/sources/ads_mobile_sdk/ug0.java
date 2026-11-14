package ads_mobile_sdk;

import defpackage.ato;

/* loaded from: classes.dex */
public final class ug0 implements ato {
    public final pfe a = new pfe();
    public int b;

    /* JADX WARN: Code restructure failed: missing block: B:32:0x008d, code lost:
    
        if (r7.a(r4, r0) == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.ato
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(ads_mobile_sdk.cy0 r7, java.util.Map r8, mt5 r9) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r9 instanceof ads_mobile_sdk.tg0
            if (r0 == 0) goto L13
            r0 = r9
            ads_mobile_sdk.tg0 r0 = (ads_mobile_sdk.tg0) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            ads_mobile_sdk.tg0 r0 = new ads_mobile_sdk.tg0
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.e
            px5 r1 = px5.a
            int r2 = r0.g
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L45
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2f
            java.lang.Object r6 = r0.a
            pfe r6 = (pfe) r6
            defpackage.ybh.y(r9)     // Catch: java.lang.Throwable -> L97
            goto L91
        L2f:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r6)
            return r5
        L35:
            pfe r6 = r0.d
            java.util.Map r8 = r0.c
            ads_mobile_sdk.cy0 r7 = r0.b
            java.lang.Object r2 = r0.a
            ads_mobile_sdk.ug0 r2 = (ads_mobile_sdk.ug0) r2
            defpackage.ybh.y(r9)
            r9 = r6
            r6 = r2
            goto L5a
        L45:
            defpackage.ybh.y(r9)
            r0.a = r6
            r0.b = r7
            r0.c = r8
            pfe r9 = r6.a
            r0.d = r9
            r0.g = r4
            java.lang.Object r2 = r9.i(r0)
            if (r2 == r1) goto L8f
        L5a:
            java.lang.String r2 = "start"
            boolean r2 = r8.containsKey(r2)     // Catch: java.lang.Throwable -> L9a
            if (r2 == 0) goto L68
            int r8 = r6.b     // Catch: java.lang.Throwable -> L9a
            int r8 = r8 + r4
            r6.b = r8     // Catch: java.lang.Throwable -> L9a
            goto L76
        L68:
            java.lang.String r2 = "stop"
            boolean r8 = r8.containsKey(r2)     // Catch: java.lang.Throwable -> L9a
            if (r8 == 0) goto L76
            int r8 = r6.b     // Catch: java.lang.Throwable -> L9a
            int r8 = r8 + (-1)
            r6.b = r8     // Catch: java.lang.Throwable -> L9a
        L76:
            ads_mobile_sdk.mt0 r7 = r7.o     // Catch: java.lang.Throwable -> L9a
            if (r7 == 0) goto L90
            int r6 = r6.b     // Catch: java.lang.Throwable -> L9a
            if (r6 > 0) goto L7f
            r4 = 0
        L7f:
            r0.a = r9     // Catch: java.lang.Throwable -> L9a
            r0.b = r5     // Catch: java.lang.Throwable -> L9a
            r0.c = r5     // Catch: java.lang.Throwable -> L9a
            r0.d = r5     // Catch: java.lang.Throwable -> L9a
            r0.g = r3     // Catch: java.lang.Throwable -> L9a
            java.lang.Object r6 = r7.a(r4, r0)     // Catch: java.lang.Throwable -> L9a
            if (r6 != r1) goto L90
        L8f:
            return r1
        L90:
            r6 = r9
        L91:
            kotlin.Unit r7 = kotlin.Unit.a     // Catch: java.lang.Throwable -> L97
            r6.l(r5)
            return r7
        L97:
            r7 = move-exception
            r9 = r6
            goto L9c
        L9a:
            r6 = move-exception
            r7 = r6
        L9c:
            r9.l(r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ug0.a(ads_mobile_sdk.cy0, java.util.Map, mt5):java.lang.Object");
    }

    @Override // defpackage.ato
    public final int b() {
        return 9;
    }

    @Override // defpackage.ato
    public final boolean c() {
        return true;
    }
}
