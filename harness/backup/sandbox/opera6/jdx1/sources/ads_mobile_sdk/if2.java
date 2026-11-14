package ads_mobile_sdk;

import defpackage.mip;

/* loaded from: classes.dex */
public final class if2 {
    public final nx5 a;
    public final mip b;
    public final qr0 c;
    public final pb1 d;
    public final ux2 e;
    public final pfe f = new pfe();
    public long g = -1;
    public e7 h;
    public d3k i;

    public if2(nx5 nx5Var, mip mipVar, qr0 qr0Var, pb1 pb1Var, ux2 ux2Var) {
        this.a = nx5Var;
        this.b = mipVar;
        this.c = qr0Var;
        this.d = pb1Var;
        this.e = ux2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(ads_mobile_sdk.if2 r8, nt5 r9) {
        /*
            boolean r0 = r9 instanceof ads_mobile_sdk.ff2
            if (r0 == 0) goto L13
            r0 = r9
            ads_mobile_sdk.ff2 r0 = (ads_mobile_sdk.ff2) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.ff2 r0 = new ads_mobile_sdk.ff2
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.c
            px5 r1 = px5.a
            int r2 = r0.e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2e
            pfe r8 = r0.b
            ads_mobile_sdk.if2 r0 = r0.a
            defpackage.ybh.y(r9)
            r9 = r8
            r8 = r0
            goto L46
        L2e:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r8)
            return r4
        L34:
            defpackage.ybh.y(r9)
            pfe r9 = r8.f
            r0.a = r8
            r0.b = r9
            r0.e = r3
            java.lang.Object r0 = r9.i(r0)
            if (r0 != r1) goto L46
            return r1
        L46:
            mip r0 = r8.b     // Catch: java.lang.Throwable -> La3
            r0.getClass()     // Catch: java.lang.Throwable -> La3
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> La3
            long r2 = r8.g     // Catch: java.lang.Throwable -> La3
            long r0 = r0 - r2
            ads_mobile_sdk.qr0 r2 = r8.c     // Catch: java.lang.Throwable -> La3
            r2.getClass()     // Catch: java.lang.Throwable -> La3
            java.lang.String r3 = "gads:play_prewarm_manager_connection_duration"
            on7 r5 = pn7.b     // Catch: java.lang.Throwable -> La3
            un7 r5 = un7.e     // Catch: java.lang.Throwable -> La3
            r6 = 180(0xb4, float:2.52E-43)
            long r5 = defpackage.cs5.x0(r6, r5)     // Catch: java.lang.Throwable -> La3
            pn7 r7 = new pn7     // Catch: java.lang.Throwable -> La3
            r7.<init>(r5)     // Catch: java.lang.Throwable -> La3
            ads_mobile_sdk.fo r5 = ads_mobile_sdk.fo.a$21     // Catch: java.lang.Throwable -> La3
            java.lang.Object r2 = r2.a(r3, r7, r5)     // Catch: java.lang.Throwable -> La3
            pn7 r2 = (pn7) r2     // Catch: java.lang.Throwable -> La3
            long r2 = r2.a     // Catch: java.lang.Throwable -> La3
            long r2 = pn7.f(r2)     // Catch: java.lang.Throwable -> La3
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L9d
            ads_mobile_sdk.e7 r0 = r8.h     // Catch: java.lang.Throwable -> La3
            if (r0 == 0) goto L9b
            java.lang.Object r0 = r0.a     // Catch: java.lang.Throwable -> La3
            ads_mobile_sdk.lk2 r0 = (ads_mobile_sdk.lk2) r0     // Catch: java.lang.Throwable -> La3
            ads_mobile_sdk.u13 r0 = r0.a     // Catch: java.lang.Throwable -> La3
            if (r0 == 0) goto L9b
            ads_mobile_sdk.e7 r1 = ads_mobile_sdk.lk2.c     // Catch: java.lang.Throwable -> La3
            java.lang.String r2 = "detach"
            r3 = 0
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> La3
            r1.a(r2, r5)     // Catch: java.lang.Throwable -> La3
            r0.getClass()     // Catch: java.lang.Throwable -> La3
            ads_mobile_sdk.p13 r1 = new ads_mobile_sdk.p13     // Catch: java.lang.Throwable -> La3
            r1.<init>(r0, r3)     // Catch: java.lang.Throwable -> La3
            r0.b(r1)     // Catch: java.lang.Throwable -> La3
        L9b:
            r8.h = r4     // Catch: java.lang.Throwable -> La3
        L9d:
            kotlin.Unit r8 = kotlin.Unit.a     // Catch: java.lang.Throwable -> La3
            r9.l(r4)
            return r8
        La3:
            r8 = move-exception
            r9.l(r4)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.if2.a(ads_mobile_sdk.if2, nt5):java.lang.Object");
    }
}
