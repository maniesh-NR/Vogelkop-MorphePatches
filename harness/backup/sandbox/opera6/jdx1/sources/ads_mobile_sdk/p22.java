package ads_mobile_sdk;

import android.content.Context;
import android.net.ConnectivityManager;
import defpackage.cs5;
import defpackage.eg7;
import defpackage.mip;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class p22 {
    public final Context a;
    public final nx5 b;
    public final mip c;
    public final ah3 d;
    public final Set e;
    public ConnectivityManager f;
    public eg7 g;
    public final pfe h = new pfe();
    public boolean i = true;
    public long j;
    public oc3 k;
    public final AtomicBoolean l;
    public final AtomicInteger m;
    public final AtomicInteger n;

    public p22(Context context, nx5 nx5Var, mip mipVar, ah3 ah3Var, Set set) {
        this.a = context;
        this.b = nx5Var;
        this.c = mipVar;
        this.d = ah3Var;
        this.e = set;
        pn7.b.getClass();
        this.j = pn7.l(0L, cs5.x0(1, un7.e));
        this.l = new AtomicBoolean(true);
        this.m = new AtomicInteger(0);
        this.n = new AtomicInteger(-1);
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0173 A[Catch: all -> 0x01b6, TRY_LEAVE, TryCatch #1 {all -> 0x01b6, blocks: (B:60:0x016b, B:62:0x0173, B:65:0x0179, B:67:0x0197, B:73:0x01a4), top: B:104:0x016b }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0179 A[Catch: all -> 0x01b6, TRY_ENTER, TryCatch #1 {all -> 0x01b6, blocks: (B:60:0x016b, B:62:0x0173, B:65:0x0179, B:67:0x0197, B:73:0x01a4), top: B:104:0x016b }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01e1 A[Catch: all -> 0x022b, TryCatch #2 {all -> 0x022b, blocks: (B:82:0x01d1, B:84:0x01e1, B:85:0x01e3, B:87:0x01ec, B:89:0x01f0), top: B:105:0x01d1 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01ec A[Catch: all -> 0x022b, TryCatch #2 {all -> 0x022b, blocks: (B:82:0x01d1, B:84:0x01e1, B:85:0x01e3, B:87:0x01ec, B:89:0x01f0), top: B:105:0x01d1 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0204 A[LOOP:0: B:92:0x01fe->B:94:0x0204, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r24, android.net.Network r26, android.net.NetworkCapabilities r27, boolean r28, nt5 r29) {
        /*
            Method dump skipped, instructions count: 565
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.p22.a(long, android.net.Network, android.net.NetworkCapabilities, boolean, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(nt5 r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof ads_mobile_sdk.b22
            if (r0 == 0) goto L13
            r0 = r13
            ads_mobile_sdk.b22 r0 = (ads_mobile_sdk.b22) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.b22 r0 = new ads_mobile_sdk.b22
            r0.<init>(r12, r13)
        L18:
            java.lang.Object r13 = r0.c
            px5 r1 = px5.a
            int r2 = r0.e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2e
            pfe r12 = r0.b
            ads_mobile_sdk.p22 r0 = r0.a
            defpackage.ybh.y(r13)
            r13 = r12
            r12 = r0
            goto L46
        L2e:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r12)
            return r4
        L34:
            defpackage.ybh.y(r13)
            r0.a = r12
            pfe r13 = r12.h
            r0.b = r13
            r0.e = r3
            java.lang.Object r0 = r13.i(r0)
            if (r0 != r1) goto L46
            return r1
        L46:
            ads_mobile_sdk.oc3 r0 = r12.k     // Catch: java.lang.Throwable -> Laa
            android.content.Context r12 = r12.a
            r13.l(r4)
            if (r0 != 0) goto La9
            ads_mobile_sdk.oc3 r5 = new ads_mobile_sdk.oc3
            java.lang.Class<android.telephony.TelephonyManager> r13 = android.telephony.TelephonyManager.class
            java.lang.Object r0 = r12.getSystemService(r13)
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0
            java.lang.String r10 = r0.getNetworkOperator()
            int r6 = y4h.a(r12, r4)
            int r7 = y4h.d(r12)
            java.lang.Object r13 = r12.getSystemService(r13)
            android.telephony.TelephonyManager r13 = (android.telephony.TelephonyManager) r13
            int r8 = r13.getPhoneType()
            java.lang.String r13 = "android.permission.ACCESS_NETWORK_STATE"
            int r0 = r12.checkSelfPermission(r13)
            java.lang.Class<android.net.ConnectivityManager> r1 = android.net.ConnectivityManager.class
            if (r0 != 0) goto L85
            java.lang.Object r0 = r12.getSystemService(r1)
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0
            boolean r0 = r0.isActiveNetworkMetered()
        L83:
            r11 = r0
            goto L87
        L85:
            r0 = 0
            goto L83
        L87:
            int r13 = r12.checkSelfPermission(r13)
            if (r13 != 0) goto La3
            java.lang.Object r12 = r12.getSystemService(r1)
            android.net.ConnectivityManager r12 = (android.net.ConnectivityManager) r12
            android.net.NetworkInfo r12 = r12.getActiveNetworkInfo()
            if (r12 == 0) goto La3
            android.net.NetworkInfo$DetailedState r12 = r12.getDetailedState()
            int r12 = r12.ordinal()
        La1:
            r9 = r12
            goto La5
        La3:
            r12 = -1
            goto La1
        La5:
            r5.<init>(r6, r7, r8, r9, r10, r11)
            return r5
        La9:
            return r0
        Laa:
            r0 = move-exception
            r12 = r0
            r13.l(r4)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.p22.a(nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(nt5 r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof ads_mobile_sdk.c22
            if (r0 == 0) goto L14
            r0 = r10
            ads_mobile_sdk.c22 r0 = (ads_mobile_sdk.c22) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.d = r1
        L12:
            r7 = r0
            goto L1a
        L14:
            ads_mobile_sdk.c22 r0 = new ads_mobile_sdk.c22
            r0.<init>(r9, r10)
            goto L12
        L1a:
            java.lang.Object r10 = r7.b
            px5 r8 = px5.a
            int r0 = r7.d
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L33
            if (r0 != r2) goto L2d
            ads_mobile_sdk.p22 r9 = r7.a
            defpackage.ybh.y(r10)
            goto Lba
        L2d:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r9)
            return r1
        L33:
            defpackage.ybh.y(r10)
            on7 r10 = pn7.b
            mip r10 = r9.c
            r10.getClass()
            long r3 = android.os.SystemClock.elapsedRealtime()
            un7 r10 = un7.d
            long r3 = defpackage.cs5.y0(r3, r10)
            java.lang.Class<android.net.ConnectivityManager> r10 = android.net.ConnectivityManager.class
            android.content.Context r0 = r9.a
            java.lang.Object r10 = r0.getSystemService(r10)
            android.net.ConnectivityManager r10 = (android.net.ConnectivityManager) r10
            r9.f = r10
            dvj r10 = ads_mobile_sdk.ax0.f
            java.lang.String r10 = "android.permission.ACCESS_NETWORK_STATE"
            int r10 = r0.checkSelfPermission(r10)
            if (r10 != 0) goto La9
            eg7 r10 = new eg7
            r0 = 5
            r10.<init>(r9, r0)
            r9.g = r10
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> La0
            android.net.ConnectivityManager r5 = r9.f     // Catch: java.lang.Exception -> La0
            r6 = 31
            if (r0 >= r6) goto L74
            if (r5 == 0) goto L70
            r1 = r5
        L70:
            r1.registerDefaultNetworkCallback(r10)     // Catch: java.lang.Exception -> La0
            goto La9
        L74:
            if (r5 != 0) goto L77
            r5 = r1
        L77:
            android.net.NetworkRequest$Builder r10 = new android.net.NetworkRequest$Builder     // Catch: java.lang.Exception -> La0
            r10.<init>()     // Catch: java.lang.Exception -> La0
            android.net.NetworkRequest$Builder r10 = r10.addTransportType(r2)     // Catch: java.lang.Exception -> La0
            r0 = 0
            android.net.NetworkRequest$Builder r10 = r10.addTransportType(r0)     // Catch: java.lang.Exception -> La0
            r0 = 3
            android.net.NetworkRequest$Builder r10 = r10.addTransportType(r0)     // Catch: java.lang.Exception -> La0
            android.net.NetworkRequest r10 = r10.build()     // Catch: java.lang.Exception -> La0
            eg7 r0 = r9.g     // Catch: java.lang.Exception -> La0
            if (r0 == 0) goto L93
            r1 = r0
        L93:
            android.os.Handler r0 = new android.os.Handler     // Catch: java.lang.Exception -> La0
            android.os.Looper r6 = android.os.Looper.getMainLooper()     // Catch: java.lang.Exception -> La0
            r0.<init>(r6)     // Catch: java.lang.Exception -> La0
            r5.registerBestMatchingNetworkCallback(r10, r1, r0)     // Catch: java.lang.Exception -> La0
            goto La9
        La0:
            r0 = move-exception
            r10 = r0
            ads_mobile_sdk.ah3 r0 = r9.d
            java.lang.String r1 = "Failed to register network callbacks."
            r0.a(r1, r10)
        La9:
            r7.a = r9
            r7.d = r2
            r5 = 0
            r6 = 1
            r2 = r3
            r4 = 0
            r1 = r9
            java.lang.Object r9 = r1.a(r2, r4, r5, r6, r7)
            if (r9 != r8) goto Lb9
            return r8
        Lb9:
            r9 = r1
        Lba:
            ads_mobile_sdk.nw.f2a = r9
            ads_mobile_sdk.hv0 r9 = new ads_mobile_sdk.hv0
            kotlin.Unit r10 = kotlin.Unit.a
            r9.<init>(r10)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.p22.b(nt5):java.lang.Object");
    }
}
