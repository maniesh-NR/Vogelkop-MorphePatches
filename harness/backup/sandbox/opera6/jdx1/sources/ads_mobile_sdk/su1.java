package ads_mobile_sdk;

import defpackage.uie;
import defpackage.yko;

/* loaded from: classes.dex */
public final class su1 extends f2 {
    public final q70 l;
    public final ab0 m;
    public final ab0 n;
    public final o6 o;
    public final wt1 p;
    public final uie q;
    public final yko r;
    public final ux2 s;
    public final nx5 t;
    public final int u;
    public final vh v;

    public su1(q70 q70Var, ab0 ab0Var, ab0 ab0Var2, o6 o6Var, wt1 wt1Var, uie uieVar, yko ykoVar, ux2 ux2Var, kh3 kh3Var, defpackage.r83 r83Var, av2 av2Var, long j, int i, a2 a2Var, xv xvVar, n13 n13Var, String str, nx5 nx5Var, int i2, vh vhVar) {
        super(kh3Var, r83Var, av2Var, j, i, a2Var, xvVar, n13Var, str, (ve2) vhVar.get());
        this.l = q70Var;
        this.m = ab0Var;
        this.n = ab0Var2;
        this.o = o6Var;
        this.p = wt1Var;
        this.q = uieVar;
        this.r = ykoVar;
        this.s = ux2Var;
        this.t = nx5Var;
        this.u = i2;
        this.v = vhVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00f4, code lost:
    
        if (r1 == r3) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.su1 r17, nt5 r18) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.su1.a(ads_mobile_sdk.su1, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.kyo r7, ads_mobile_sdk.a2 r8, nt5 r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof ads_mobile_sdk.nu1
            if (r0 == 0) goto L13
            r0 = r9
            ads_mobile_sdk.nu1 r0 = (ads_mobile_sdk.nu1) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ads_mobile_sdk.nu1 r0 = new ads_mobile_sdk.nu1
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r6 = r0.a
            px5 r9 = px5.a
            int r1 = r0.c
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L28
            defpackage.ybh.y(r6)
            goto L6d
        L28:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r6)
            return r3
        L2e:
            defpackage.ybh.y(r6)
            prb r6 = new prb
            r6.<init>()
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            java.lang.String r4 = "isNonagon"
            r6.q(r4, r1)
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 30
            if (r4 < r5) goto L48
            java.lang.String r4 = "skipDeepLinkValidation"
            r6.q(r4, r1)
        L48:
            prb r1 = new prb
            r1.<init>()
            ads_mobile_sdk.s61 r8 = r8.I
            prb r8 = r8.d
            java.lang.String r4 = "response"
            r1.o(r4, r8)
            java.lang.String r8 = "sdk_params"
            r1.o(r8, r6)
            r0.c = r2
            r7.getClass()
            java.lang.String r6 = r1.toString()
            java.lang.String r8 = "google.afma.nativeAds.preProcessJson"
            java.lang.Object r6 = r7.a(r8, r6, r0)
            if (r6 != r9) goto L6d
            return r9
        L6d:
            rap r6 = (defpackage.rap) r6
            boolean r7 = r6 instanceof ads_mobile_sdk.av0
            if (r7 == 0) goto L76
            ads_mobile_sdk.av0 r6 = (ads_mobile_sdk.av0) r6
            return r6
        L76:
            ads_mobile_sdk.hv0 r6 = (ads_mobile_sdk.hv0) r6
            java.lang.Object r6 = r6.b
            prb r6 = (defpackage.prb) r6
            java.lang.String r7 = "success"
            r8 = 0
            boolean r7 = ads_mobile_sdk.bw2.a(r6, r7, r8)
            if (r7 != 0) goto L8f
            ads_mobile_sdk.ev0 r6 = new ads_mobile_sdk.ev0
            java.lang.String r7 = "Process native ad json failed"
            ads_mobile_sdk.ae1 r8 = ads_mobile_sdk.ae1.a
            r6.<init>(r7, r8)
            return r6
        L8f:
            java.lang.String r7 = "json"
            prb r6 = ads_mobile_sdk.bw2.a(r6, r7, r3)
            if (r6 == 0) goto Lb4
            java.lang.String r7 = "ads"
            wpb r6 = ads_mobile_sdk.bw2.e(r6, r7)
            if (r6 == 0) goto Lb4
            java.util.ArrayList r7 = r6.a
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto Lae
            ads_mobile_sdk.fv0 r6 = new ads_mobile_sdk.fv0
            r7 = 3
            r6.<init>(r3, r7)
            return r6
        Lae:
            ads_mobile_sdk.hv0 r7 = new ads_mobile_sdk.hv0
            r7.<init>(r6)
            return r7
        Lb4:
            ads_mobile_sdk.ev0 r6 = new ads_mobile_sdk.ev0
            java.lang.String r7 = "Invalid processed native ad json"
            ads_mobile_sdk.ae1 r8 = ads_mobile_sdk.ae1.a
            r6.<init>(r7, r8)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.su1.a(kyo, ads_mobile_sdk.a2, nt5):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x021a, code lost:
    
        if (r5.a((defpackage.zep) r2, (mt5) r3) != r4) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.prb r19, defpackage.kyo r20, com.google.android.libraries.ads.mobile.sdk.internal.webview.PerAdNativeJavscriptEngineJsContext r21, nt5 r22) {
        /*
            Method dump skipped, instructions count: 557
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.su1.a(prb, kyo, com.google.android.libraries.ads.mobile.sdk.internal.webview.PerAdNativeJavscriptEngineJsContext, nt5):java.lang.Object");
    }

    @Override // ads_mobile_sdk.f2
    public final Object a(boolean z, mt5 mt5Var) {
        return a(this, (nt5) mt5Var);
    }

    @Override // defpackage.yno
    public final boolean b() {
        s61 s61Var = this.f.I;
        return (s61Var != null ? s61Var.d : null) != null;
    }
}
