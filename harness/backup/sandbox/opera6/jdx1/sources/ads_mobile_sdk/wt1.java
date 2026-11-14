package ads_mobile_sdk;

import android.content.Context;
import defpackage.uie;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class wt1 {
    public final Context a;
    public final CoroutineContext b;
    public final jx1 c;
    public final w8 d;
    public final uie e;
    public final qr0 f;
    public final ah3 g;

    public wt1(Context context, CoroutineContext coroutineContext, jx1 jx1Var, w8 w8Var, uie uieVar, qr0 qr0Var, ah3 ah3Var) {
        this.a = context;
        this.b = coroutineContext;
        this.c = jx1Var;
        this.d = w8Var;
        this.e = uieVar;
        this.f = qr0Var;
        this.g = ah3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0098 A[Catch: all -> 0x00bf, TryCatch #5 {all -> 0x00bf, blocks: (B:38:0x0091, B:40:0x0098, B:42:0x009f, B:44:0x00a3, B:46:0x00a7, B:47:0x00a8, B:48:0x00ad, B:49:0x00ae, B:50:0x00b5, B:51:0x00b6, B:52:0x00bd, B:53:0x00be), top: B:66:0x0091 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00be A[Catch: all -> 0x00bf, TRY_LEAVE, TryCatch #5 {all -> 0x00bf, blocks: (B:38:0x0091, B:40:0x0098, B:42:0x009f, B:44:0x00a3, B:46:0x00a7, B:47:0x00a8, B:48:0x00ad, B:49:0x00ae, B:50:0x00b5, B:51:0x00b6, B:52:0x00bd, B:53:0x00be), top: B:66:0x0091 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(ads_mobile_sdk.wt1 r7, ads_mobile_sdk.it1 r8, ads_mobile_sdk.cy0 r9, nt5 r10) {
        /*
            Method dump skipped, instructions count: 198
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.wt1.a(ads_mobile_sdk.wt1, ads_mobile_sdk.it1, ads_mobile_sdk.cy0, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x006d A[Catch: all -> 0x0094, TryCatch #2 {all -> 0x0094, blocks: (B:30:0x0066, B:32:0x006d, B:34:0x0074, B:36:0x0078, B:38:0x007c, B:39:0x007d, B:40:0x0082, B:41:0x0083, B:42:0x008a, B:43:0x008b, B:44:0x0092, B:45:0x0093), top: B:55:0x0066 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0093 A[Catch: all -> 0x0094, TRY_LEAVE, TryCatch #2 {all -> 0x0094, blocks: (B:30:0x0066, B:32:0x006d, B:34:0x0074, B:36:0x0078, B:38:0x007c, B:39:0x007d, B:40:0x0082, B:41:0x0083, B:42:0x008a, B:43:0x008b, B:44:0x0092, B:45:0x0093), top: B:55:0x0066 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(ads_mobile_sdk.a2 r6, defpackage.prb r7, ads_mobile_sdk.ve2 r8, nt5 r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof ads_mobile_sdk.jt1
            if (r0 == 0) goto L13
            r0 = r9
            ads_mobile_sdk.jt1 r0 = (ads_mobile_sdk.jt1) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.jt1 r0 = new ads_mobile_sdk.jt1
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.c
            px5 r1 = px5.a
            int r2 = r0.e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2c
            ads_mobile_sdk.rg3 r5 = r0.b
            ads_mobile_sdk.rg3 r6 = r0.a
            defpackage.ybh.y(r9)     // Catch: java.lang.Throwable -> L60
            goto L4f
        L2c:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r5)
            return r4
        L32:
            defpackage.ybh.y(r9)
            java.util.WeakHashMap r9 = ads_mobile_sdk.hh3.a
            l08 r9 = l08.a
            ads_mobile_sdk.fw0 r2 = ads_mobile_sdk.fw0.CUI_NAME_LOAD_NATIVE_ASSETS
            ads_mobile_sdk.rg3 r9 = ads_mobile_sdk.hh3.a(r2, r9, r3)
            r0.a = r9     // Catch: java.lang.Throwable -> L63
            r0.b = r9     // Catch: java.lang.Throwable -> L63
            r0.e = r3     // Catch: java.lang.Throwable -> L63
            java.lang.Object r5 = r5.b(r6, r7, r8, r0)     // Catch: java.lang.Throwable -> L63
            if (r5 != r1) goto L4c
            return r1
        L4c:
            r6 = r9
            r9 = r5
            r5 = r6
        L4f:
            rap r9 = (defpackage.rap) r9     // Catch: java.lang.Throwable -> L60
            boolean r7 = r9 instanceof ads_mobile_sdk.av0     // Catch: java.lang.Throwable -> L60
            if (r7 == 0) goto L5c
            r7 = r9
            ads_mobile_sdk.av0 r7 = (ads_mobile_sdk.av0) r7     // Catch: java.lang.Throwable -> L60
            r8 = 0
            ads_mobile_sdk.xh3.a(r7, r8)     // Catch: java.lang.Throwable -> L60
        L5c:
            defpackage.vtp.v(r5, r4)
            return r9
        L60:
            r7 = move-exception
            r9 = r6
            goto L66
        L63:
            r5 = move-exception
            r7 = r5
            r5 = r9
        L66:
            r9.b(r7)     // Catch: java.lang.Throwable -> L94
            boolean r6 = r7 instanceof iyo     // Catch: java.lang.Throwable -> L94
            if (r6 != 0) goto L93
            r9.a(r7)     // Catch: java.lang.Throwable -> L94
            boolean r6 = r7 instanceof kql     // Catch: java.lang.Throwable -> L94
            if (r6 != 0) goto L8b
            boolean r6 = r7 instanceof java.util.concurrent.CancellationException     // Catch: java.lang.Throwable -> L94
            if (r6 != 0) goto L83
            boolean r6 = r7 instanceof ads_mobile_sdk.mv0     // Catch: java.lang.Throwable -> L94
            if (r6 == 0) goto L7d
            throw r7     // Catch: java.lang.Throwable -> L94
        L7d:
            ads_mobile_sdk.tu0 r6 = new ads_mobile_sdk.tu0     // Catch: java.lang.Throwable -> L94
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L94
            throw r6     // Catch: java.lang.Throwable -> L94
        L83:
            ads_mobile_sdk.ou0 r6 = new ads_mobile_sdk.ou0     // Catch: java.lang.Throwable -> L94
            java.util.concurrent.CancellationException r7 = (java.util.concurrent.CancellationException) r7     // Catch: java.lang.Throwable -> L94
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L94
            throw r6     // Catch: java.lang.Throwable -> L94
        L8b:
            ads_mobile_sdk.uw0 r6 = new ads_mobile_sdk.uw0     // Catch: java.lang.Throwable -> L94
            kql r7 = (kql) r7     // Catch: java.lang.Throwable -> L94
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L94
            throw r6     // Catch: java.lang.Throwable -> L94
        L93:
            throw r7     // Catch: java.lang.Throwable -> L94
        L94:
            r6 = move-exception
            throw r6     // Catch: java.lang.Throwable -> L96
        L96:
            r7 = move-exception
            defpackage.vtp.v(r5, r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.wt1.a(ads_mobile_sdk.a2, prb, ads_mobile_sdk.ve2, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:87:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(ads_mobile_sdk.a2 r12, defpackage.prb r13, ads_mobile_sdk.ve2 r14, nt5 r15) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.wt1.b(ads_mobile_sdk.a2, prb, ads_mobile_sdk.ve2, nt5):java.lang.Object");
    }
}
