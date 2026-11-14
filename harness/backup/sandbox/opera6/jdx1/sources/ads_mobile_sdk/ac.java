package ads_mobile_sdk;

import defpackage.wdp;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class ac implements wdp {
    public final sb a;
    public final List b;

    public ac(qr0 qr0Var, sb sbVar) {
        this.a = sbVar;
        qr0Var.getClass();
        this.b = (List) qr0Var.a("gads:logged_adapter_version_classes", Arrays.asList("com.google.ads.mediation.inmobi.InMobiMediationAdapter", "com.google.ads.mediation.imobile.IMobileMediationAdapter", "com.google.ads.mediation.nend.NendMediationAdapter", "com.google.ads.mediation.adcolony.AdColonyMediationAdapter", "com.google.ads.mediation.facebook.FacebookMediationAdapter", "com.google.ads.mediation.mopub.MoPubMediationAdapter", "com.google.ads.mediation.applovin.AppLovinMediationAdapter", "com.google.ads.mediation.tapjoy.TapjoyMediationAdapter", "com.google.ads.mediation.vungle.VungleMediationAdapter", "com.google.ads.mediation.unity.UnityMediationAdapter", "com.google.ads.mediation.chartboost.ChartboostMediationAdapter", "com.google.ads.mediation.mytarget.MyTargetMediationAdapter", "com.google.ads.mediation.maio.MaioMediationAdapter", "com.google.ads.mediation.ironsource.IronSourceMediationAdapter", "com.google.ads.mediation.fyber.FyberMediationAdapter", "com.google.ads.mediation.verizon.VerizonMediationAdapter"), fo.a$22);
    }

    @Override // defpackage.wdp
    /* renamed from: a */
    public final lw0 mo15a() {
        return lw0.ADAPTER_VERSIONS;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.wdp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(mt5 r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof ads_mobile_sdk.zb
            if (r0 == 0) goto L13
            r0 = r8
            ads_mobile_sdk.zb r0 = (ads_mobile_sdk.zb) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L1a
        L13:
            ads_mobile_sdk.zb r0 = new ads_mobile_sdk.zb
            nt5 r8 = (nt5) r8
            r0.<init>(r7, r8)
        L1a:
            java.lang.Object r8 = r0.c
            px5 r1 = px5.a
            int r2 = r0.e
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 != r4) goto L32
            java.util.LinkedHashMap r7 = r0.b
            ads_mobile_sdk.ac r0 = r0.a
            defpackage.ybh.y(r8)
            r6 = r8
            r8 = r7
            r7 = r0
            r0 = r6
            goto L67
        L32:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r7)
            return r3
        L38:
            defpackage.ybh.y(r8)
            java.util.List r8 = r7.b
            boolean r8 = r8.isEmpty()
            if (r8 == 0) goto L50
            ads_mobile_sdk.hv0 r7 = new ads_mobile_sdk.hv0
            ads_mobile_sdk.yb r8 = new ads_mobile_sdk.yb
            n08 r0 = n08.a
            r8.<init>(r0)
            r7.<init>(r8)
            return r7
        L50:
            java.util.LinkedHashMap r8 = new java.util.LinkedHashMap
            r8.<init>()
            r0.a = r7
            r0.b = r8
            r0.e = r4
            ads_mobile_sdk.sb r2 = r7.a
            r2.getClass()
            java.lang.Object r0 = ads_mobile_sdk.sb.a(r2, r0)
            if (r0 != r1) goto L67
            return r1
        L67:
            java.util.Map r0 = (java.util.Map) r0
            java.util.List r7 = r7.b
            java.util.Iterator r7 = r7.iterator()
        L6f:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto La3
            java.lang.Object r1 = r7.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r0.get(r1)
            ads_mobile_sdk.ma r2 = (ads_mobile_sdk.ma) r2
            if (r2 == 0) goto L8b
            jl6 r2 = r2.a
            java.lang.Object r2 = r2.d
            rr r2 = (defpackage.rr) r2
            if (r2 != 0) goto L8d
        L8b:
            rr r2 = defpackage.rr.a
        L8d:
            java.lang.Object r4 = r0.get(r1)
            ads_mobile_sdk.ma r4 = (ads_mobile_sdk.ma) r4
            if (r4 == 0) goto L98
            sr r4 = r4.b
            goto L99
        L98:
            r4 = r3
        L99:
            rr r5 = defpackage.rr.c
            if (r2 != r5) goto L6f
            if (r4 == 0) goto L6f
            r8.put(r1, r4)
            goto L6f
        La3:
            ads_mobile_sdk.hv0 r7 = new ads_mobile_sdk.hv0
            ads_mobile_sdk.yb r0 = new ads_mobile_sdk.yb
            r0.<init>(r8)
            r7.<init>(r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ac.d(mt5):java.lang.Object");
    }
}
