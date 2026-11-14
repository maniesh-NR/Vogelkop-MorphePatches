package ads_mobile_sdk;

import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class ek {
    public final xq0 a;
    public final pfe b = new pfe();
    public final LinkedHashMap c = new LinkedHashMap();
    public final ConcurrentHashMap d = new ConcurrentHashMap();
    public final ConcurrentHashMap e = new ConcurrentHashMap();
    public final AtomicInteger f = new AtomicInteger(0);
    public final AtomicReference g = new AtomicReference("");
    public final AtomicBoolean h = new AtomicBoolean(false);

    public ek(xq0 xq0Var) {
        this.a = xq0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005c A[Catch: all -> 0x0067, TRY_LEAVE, TryCatch #0 {all -> 0x0067, blocks: (B:18:0x0050, B:20:0x0056, B:21:0x005c), top: B:27:0x0050 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.ek r5, java.lang.String r6, java.lang.String r7, mt5 r8) {
        /*
            boolean r0 = r8 instanceof ads_mobile_sdk.bk
            if (r0 == 0) goto L13
            r0 = r8
            ads_mobile_sdk.bk r0 = (ads_mobile_sdk.bk) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            ads_mobile_sdk.bk r0 = new ads_mobile_sdk.bk
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.e
            px5 r1 = px5.a
            int r2 = r0.g
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L38
            if (r2 != r3) goto L32
            pfe r5 = r0.d
            java.lang.String r7 = r0.c
            java.lang.String r6 = r0.b
            ads_mobile_sdk.ek r0 = r0.a
            defpackage.ybh.y(r8)
            r8 = r5
            r5 = r0
            goto L4e
        L32:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r5)
            return r4
        L38:
            defpackage.ybh.y(r8)
            pfe r8 = r5.b
            r0.a = r5
            r0.b = r6
            r0.c = r7
            r0.d = r8
            r0.g = r3
            java.lang.Object r0 = r8.i(r0)
            if (r0 != r1) goto L4e
            return r1
        L4e:
            if (r7 == 0) goto L5c
            int r0 = r7.length()     // Catch: java.lang.Throwable -> L67
            if (r0 == 0) goto L5c
            java.util.LinkedHashMap r5 = r5.c     // Catch: java.lang.Throwable -> L67
            r5.put(r6, r7)     // Catch: java.lang.Throwable -> L67
            goto L61
        L5c:
            java.util.LinkedHashMap r5 = r5.c     // Catch: java.lang.Throwable -> L67
            r5.remove(r6)     // Catch: java.lang.Throwable -> L67
        L61:
            r8.l(r4)
            kotlin.Unit r5 = kotlin.Unit.a
            return r5
        L67:
            r5 = move-exception
            r8.l(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ek.a(ads_mobile_sdk.ek, java.lang.String, java.lang.String, mt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.ek r5, nt5 r6) {
        /*
            boolean r0 = r6 instanceof ads_mobile_sdk.qj
            if (r0 == 0) goto L13
            r0 = r6
            ads_mobile_sdk.qj r0 = (ads_mobile_sdk.qj) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.qj r0 = new ads_mobile_sdk.qj
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.c
            px5 r1 = px5.a
            int r2 = r0.e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2c
            pfe r5 = r0.b
            ads_mobile_sdk.ek r0 = r0.a
            defpackage.ybh.y(r6)
            goto L46
        L2c:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r5)
            return r4
        L32:
            defpackage.ybh.y(r6)
            pfe r6 = r5.b
            r0.a = r5
            r0.b = r6
            r0.e = r3
            java.lang.Object r0 = r6.i(r0)
            if (r0 != r1) goto L44
            return r1
        L44:
            r0 = r5
            r5 = r6
        L46:
            java.util.LinkedHashMap r6 = r0.c     // Catch: java.lang.Throwable -> L50
            r5.l(r4)
            java.util.Map r5 = rbd.i(r6)
            return r5
        L50:
            r6 = move-exception
            r5.l(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ek.a(ads_mobile_sdk.ek, nt5):java.lang.Object");
    }
}
