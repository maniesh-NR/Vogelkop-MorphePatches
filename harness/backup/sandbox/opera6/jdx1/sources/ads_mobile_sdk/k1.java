package ads_mobile_sdk;

import defpackage.kap;

/* loaded from: classes.dex */
public final class k1 {
    public final kap a;

    public k1(kap kapVar) {
        this.a = kapVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0072 A[Catch: all -> 0x0099, TryCatch #2 {all -> 0x0099, blocks: (B:28:0x006b, B:30:0x0072, B:32:0x0079, B:34:0x007d, B:36:0x0081, B:37:0x0082, B:38:0x0087, B:39:0x0088, B:40:0x008f, B:41:0x0090, B:42:0x0097, B:43:0x0098), top: B:53:0x006b }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0098 A[Catch: all -> 0x0099, TRY_LEAVE, TryCatch #2 {all -> 0x0099, blocks: (B:28:0x006b, B:30:0x0072, B:32:0x0079, B:34:0x007d, B:36:0x0081, B:37:0x0082, B:38:0x0087, B:39:0x0088, B:40:0x008f, B:41:0x0090, B:42:0x0097, B:43:0x0098), top: B:53:0x006b }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlin.jvm.functions.Function1 r7, nt5 r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof ads_mobile_sdk.i1
            if (r0 == 0) goto L13
            r0 = r8
            ads_mobile_sdk.i1 r0 = (ads_mobile_sdk.i1) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.i1 r0 = new ads_mobile_sdk.i1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.c
            px5 r1 = px5.a
            int r2 = r0.e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2c
            ads_mobile_sdk.rg3 r6 = r0.b
            ads_mobile_sdk.rg3 r7 = r0.a
            defpackage.ybh.y(r8)     // Catch: java.lang.Throwable -> L65
            goto L5d
        L2c:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r6)
            return r4
        L32:
            defpackage.ybh.y(r8)
            java.util.WeakHashMap r8 = ads_mobile_sdk.hh3.a
            l08 r8 = l08.a
            ads_mobile_sdk.fw0 r2 = ads_mobile_sdk.fw0.CUI_NAME_PERSISTENT_CACHE_METADATA_WRITE
            ads_mobile_sdk.rg3 r8 = ads_mobile_sdk.hh3.a(r2, r8, r3)
            kap r6 = r6.a     // Catch: java.lang.Throwable -> L67
            java.lang.Object r6 = r6.get()     // Catch: java.lang.Throwable -> L67
            qd6 r6 = (defpackage.qd6) r6     // Catch: java.lang.Throwable -> L67
            m76 r2 = new m76     // Catch: java.lang.Throwable -> L67
            r5 = 4
            r2.<init>(r7, r4, r5)     // Catch: java.lang.Throwable -> L67
            r0.a = r8     // Catch: java.lang.Throwable -> L67
            r0.b = r8     // Catch: java.lang.Throwable -> L67
            r0.e = r3     // Catch: java.lang.Throwable -> L67
            java.lang.Object r6 = r6.a(r2, r0)     // Catch: java.lang.Throwable -> L67
            if (r6 != r1) goto L5a
            return r1
        L5a:
            r7 = r8
            r8 = r6
            r6 = r7
        L5d:
            ads_mobile_sdk.h1 r8 = (ads_mobile_sdk.h1) r8     // Catch: java.lang.Throwable -> L65
            defpackage.vtp.v(r6, r4)
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        L65:
            r8 = move-exception
            goto L6b
        L67:
            r6 = move-exception
            r7 = r8
            r8 = r6
            r6 = r7
        L6b:
            r7.b(r8)     // Catch: java.lang.Throwable -> L99
            boolean r0 = r8 instanceof iyo     // Catch: java.lang.Throwable -> L99
            if (r0 != 0) goto L98
            r7.a(r8)     // Catch: java.lang.Throwable -> L99
            boolean r7 = r8 instanceof kql     // Catch: java.lang.Throwable -> L99
            if (r7 != 0) goto L90
            boolean r7 = r8 instanceof java.util.concurrent.CancellationException     // Catch: java.lang.Throwable -> L99
            if (r7 != 0) goto L88
            boolean r7 = r8 instanceof ads_mobile_sdk.mv0     // Catch: java.lang.Throwable -> L99
            if (r7 == 0) goto L82
            throw r8     // Catch: java.lang.Throwable -> L99
        L82:
            ads_mobile_sdk.tu0 r7 = new ads_mobile_sdk.tu0     // Catch: java.lang.Throwable -> L99
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L99
            throw r7     // Catch: java.lang.Throwable -> L99
        L88:
            ads_mobile_sdk.ou0 r7 = new ads_mobile_sdk.ou0     // Catch: java.lang.Throwable -> L99
            java.util.concurrent.CancellationException r8 = (java.util.concurrent.CancellationException) r8     // Catch: java.lang.Throwable -> L99
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L99
            throw r7     // Catch: java.lang.Throwable -> L99
        L90:
            ads_mobile_sdk.uw0 r7 = new ads_mobile_sdk.uw0     // Catch: java.lang.Throwable -> L99
            kql r8 = (kql) r8     // Catch: java.lang.Throwable -> L99
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L99
            throw r7     // Catch: java.lang.Throwable -> L99
        L98:
            throw r8     // Catch: java.lang.Throwable -> L99
        L99:
            r7 = move-exception
            throw r7     // Catch: java.lang.Throwable -> L9b
        L9b:
            r8 = move-exception
            defpackage.vtp.v(r6, r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.k1.a(kotlin.jvm.functions.Function1, nt5):java.lang.Object");
    }
}
