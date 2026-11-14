package ads_mobile_sdk;

import android.content.Context;
import android.os.Build;
import defpackage.mip;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Pair;

/* loaded from: classes.dex */
public final class q70 {
    public final nx5 a;
    public final qr0 b;
    public final mip c;
    public final uv2 d;
    public final pfe e = new pfe();
    public final LinkedHashMap f;
    public final ArrayList g;
    public final LinkedHashMap h;

    public q70(nx5 nx5Var, Context context, qr0 qr0Var, mip mipVar, uv2 uv2Var, av2 av2Var, ki0 ki0Var, xv xvVar) {
        this.a = nx5Var;
        this.b = qr0Var;
        this.c = mipVar;
        this.d = uv2Var;
        Pair pair = new Pair("ad_format", av2Var.a);
        Pair pair2 = new Pair("api_v", String.valueOf(Build.VERSION.SDK_INT));
        Pair pair3 = new Pair("app", context.getPackageName());
        Pair pair4 = new Pair("s", "gmob_sdk");
        Pair pair5 = new Pair("v", "3");
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        this.f = rbd.d(new Pair[]{pair, pair2, pair3, pair4, pair5, new Pair("device", kotlin.text.c.q(str2, str, false) ? str2 : sko.v(str, " ", str2)), new Pair("is_bstar", ((Boolean) ki0Var.f.getValue()).booleanValue() ? "1" : "0"), new Pair("is_lite_sdk", "0"), new Pair("gqi", xvVar.h), new Pair("os", Build.VERSION.RELEASE)});
        this.g = new ArrayList();
        this.h = new LinkedHashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.q70 r7, java.lang.String r8, nt5 r9) {
        /*
            boolean r0 = r9 instanceof ads_mobile_sdk.k70
            if (r0 == 0) goto L13
            r0 = r9
            ads_mobile_sdk.k70 r0 = (ads_mobile_sdk.k70) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h = r1
            goto L18
        L13:
            ads_mobile_sdk.k70 r0 = new ads_mobile_sdk.k70
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f
            px5 r1 = px5.a
            int r2 = r0.h
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L34
            pfe r7 = r0.e
            ads_mobile_sdk.wf3 r8 = r0.d
            ads_mobile_sdk.wf3 r1 = r0.c
            java.lang.String r2 = r0.b
            ads_mobile_sdk.q70 r0 = r0.a
            defpackage.ybh.y(r9)
            r9 = r8
            r8 = r2
            goto L6b
        L34:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r7)
            return r4
        L3a:
            defpackage.ybh.y(r9)
            ads_mobile_sdk.wf3 r9 = new ads_mobile_sdk.wf3
            on7 r2 = pn7.b
            mip r2 = r7.c
            r2.getClass()
            long r5 = android.os.SystemClock.elapsedRealtime()
            un7 r2 = un7.d
            long r5 = defpackage.cs5.y0(r5, r2)
            r9.<init>(r5, r8)
            pfe r2 = r7.e
            r0.a = r7
            r0.b = r8
            r0.c = r9
            r0.d = r9
            r0.e = r2
            r0.h = r3
            java.lang.Object r0 = r2.i(r0)
            if (r0 != r1) goto L68
            return r1
        L68:
            r0 = r7
            r1 = r9
            r7 = r2
        L6b:
            java.util.LinkedHashMap r0 = r0.h     // Catch: java.lang.Throwable -> L74
            r0.put(r8, r9)     // Catch: java.lang.Throwable -> L74
            r7.l(r4)
            return r1
        L74:
            r8 = move-exception
            r7.l(r4)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.q70.a(ads_mobile_sdk.q70, java.lang.String, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r6, java.lang.String r7, long r8, nt5 r10) {
        /*
            r5 = this;
            boolean r0 = r10 instanceof ads_mobile_sdk.p70
            if (r0 == 0) goto L13
            r0 = r10
            ads_mobile_sdk.p70 r0 = (ads_mobile_sdk.p70) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h = r1
            goto L18
        L13:
            ads_mobile_sdk.p70 r0 = new ads_mobile_sdk.p70
            r0.<init>(r5, r10)
        L18:
            java.lang.Object r10 = r0.f
            px5 r1 = px5.a
            int r2 = r0.h
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L34
            long r8 = r0.e
            pfe r5 = r0.d
            java.lang.String r7 = r0.c
            java.lang.String r6 = r0.b
            ads_mobile_sdk.q70 r0 = r0.a
            defpackage.ybh.y(r10)
            r10 = r5
            r5 = r0
            goto L52
        L34:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r5)
            return r4
        L3a:
            defpackage.ybh.y(r10)
            r0.a = r5
            r0.b = r6
            r0.c = r7
            pfe r10 = r5.e
            r0.d = r10
            r0.e = r8
            r0.h = r3
            java.lang.Object r0 = r10.i(r0)
            if (r0 != r1) goto L52
            return r1
        L52:
            java.util.LinkedHashMap r0 = r5.h     // Catch: java.lang.Throwable -> L6c
            java.lang.Object r7 = r0.get(r7)     // Catch: java.lang.Throwable -> L6c
            ads_mobile_sdk.wf3 r7 = (ads_mobile_sdk.wf3) r7     // Catch: java.lang.Throwable -> L6c
            if (r7 == 0) goto L66
            java.util.ArrayList r5 = r5.g     // Catch: java.lang.Throwable -> L6c
            ads_mobile_sdk.i70 r0 = new ads_mobile_sdk.i70     // Catch: java.lang.Throwable -> L6c
            r0.<init>(r6, r7, r8)     // Catch: java.lang.Throwable -> L6c
            r5.add(r0)     // Catch: java.lang.Throwable -> L6c
        L66:
            r10.l(r4)
            kotlin.Unit r5 = kotlin.Unit.a
            return r5
        L6c:
            r5 = move-exception
            r10.l(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.q70.a(java.lang.String, java.lang.String, long, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r6, java.lang.String r7, boolean r8, nt5 r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof ads_mobile_sdk.o70
            if (r0 == 0) goto L13
            r0 = r9
            ads_mobile_sdk.o70 r0 = (ads_mobile_sdk.o70) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h = r1
            goto L18
        L13:
            ads_mobile_sdk.o70 r0 = new ads_mobile_sdk.o70
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.f
            px5 r1 = px5.a
            int r2 = r0.h
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L34
            boolean r8 = r0.e
            pfe r5 = r0.d
            java.lang.String r7 = r0.c
            java.lang.String r6 = r0.b
            ads_mobile_sdk.q70 r0 = r0.a
            defpackage.ybh.y(r9)
            r9 = r5
            r5 = r0
            goto L52
        L34:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r5)
            return r4
        L3a:
            defpackage.ybh.y(r9)
            r0.a = r5
            r0.b = r6
            r0.c = r7
            pfe r9 = r5.e
            r0.d = r9
            r0.e = r8
            r0.h = r3
            java.lang.Object r0 = r9.i(r0)
            if (r0 != r1) goto L52
            return r1
        L52:
            if (r8 == 0) goto L5a
            java.util.LinkedHashMap r5 = r5.f     // Catch: java.lang.Throwable -> L65
            r5.put(r6, r7)     // Catch: java.lang.Throwable -> L65
            goto L5f
        L5a:
            java.util.LinkedHashMap r5 = r5.f     // Catch: java.lang.Throwable -> L65
            r5.putIfAbsent(r6, r7)     // Catch: java.lang.Throwable -> L65
        L5f:
            r9.l(r4)
            kotlin.Unit r5 = kotlin.Unit.a
            return r5
        L65:
            r5 = move-exception
            r9.l(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.q70.a(java.lang.String, java.lang.String, boolean, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(nt5 r14) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.q70.a(nt5):java.lang.Object");
    }
}
