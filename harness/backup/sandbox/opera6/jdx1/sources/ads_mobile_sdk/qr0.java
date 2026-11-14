package ads_mobile_sdk;

import defpackage.bto;
import defpackage.cs5;
import defpackage.fjp;
import defpackage.oip;
import defpackage.pep;
import defpackage.prb;
import defpackage.w7p;
import defpackage.xdp;
import java.util.Map;
import kotlin.Pair;

/* loaded from: classes.dex */
public final class qr0 extends ov {
    public static final long A;
    public static final int B;
    public static final prb C;
    public static final prb D;
    public static final prb E;
    public static final prb F;
    public static final prb G;
    public static final prb H;
    public static final prb I;
    public static final long z;
    public final oip r;
    public final pep s;
    public final bto t;
    public final xdp u;
    public final fjp v;
    public boolean w;
    public double x;
    public int y;

    static {
        on7 on7Var = pn7.b;
        un7 un7Var = un7.e;
        z = cs5.x0(20, un7Var);
        A = cs5.x0(1, un7Var);
        B = wh0.TIER_LOW.getNumber();
        prb prbVar = new prb();
        lw0 lw0Var = lw0.AD_ID_INFO;
        prbVar.p(500, String.valueOf(lw0Var.getNumber()));
        i83 i83Var = i83.b;
        hyg.a(prbVar, lw0.AD_REQUEST, i83Var);
        i83 i83Var2 = i83.e;
        hyg.a(prbVar, lw0.AD_SPAM, i83Var2);
        hyg.a(prbVar, lw0.AD_SIZE, i83Var);
        hyg.a(prbVar, lw0.AD_TYPE, i83Var);
        hyg.a(prbVar, lw0.APP_OPEN, i83Var);
        hyg.a(prbVar, lw0.APP_PERMISSIONS, i83Var);
        hyg.a(prbVar, lw0.APP_SET_ID, i83Var);
        i83 i83Var3 = i83.d;
        lw0 lw0Var2 = lw0.AUDIO;
        hyg.a(prbVar, lw0Var2, i83Var3);
        lw0 lw0Var3 = lw0.BATTERY;
        hyg.a(prbVar, lw0Var3, i83Var);
        i83 i83Var4 = i83.c;
        hyg.a(prbVar, lw0.CLD, i83Var4);
        hyg.a(prbVar, lw0.DEBUG_SIGNAL, i83Var);
        hyg.a(prbVar, lw0.EXPERIMENT_IDS, i83Var);
        hyg.a(prbVar, lw0.IN_MEMORY_SDK_CORE_DATA, i83Var);
        hyg.a(prbVar, lw0.MEMORY, i83Var);
        hyg.a(prbVar, lw0.OMID, i83Var);
        hyg.a(prbVar, lw0.PACKAGE_INFO, i83Var);
        hyg.a(prbVar, lw0.PER_APP_ID_V1, i83Var);
        hyg.a(prbVar, lw0.PER_APP_ID_V2, i83Var);
        hyg.a(prbVar, lw0.STATIC_DEVICE, i83Var);
        hyg.a(prbVar, lw0.TELEPHONY, i83Var);
        hyg.a(prbVar, lw0.CONSENT_STRINGS, i83Var);
        hyg.a(prbVar, lw0.AD_ID_PERMISSION, i83Var);
        hyg.a(prbVar, lw0.QUALITY, i83Var);
        hyg.a(prbVar, lw0.REQUEST_ID, i83Var);
        hyg.a(prbVar, lw0.SDK_ENV, i83Var);
        hyg.a(prbVar, lw0.ADAPTER_VERSIONS, i83Var);
        hyg.a(prbVar, lw0.RTB_SIGNAL, i83Var2);
        hyg.a(prbVar, lw0.SESSION_ID, i83Var);
        lw0 lw0Var4 = lw0.TRUSTLESS_TOKEN;
        hyg.a(prbVar, lw0Var4, i83Var);
        lw0 lw0Var5 = lw0.AD_SERVICES_EXTENSION_VERSION;
        hyg.a(prbVar, lw0Var5, i83Var);
        hyg.a(prbVar, lw0.FIREBASE_ANALYTICS, i83Var4);
        hyg.a(prbVar, lw0.INSPECTOR_SIGNAL, i83Var4);
        hyg.a(prbVar, lw0.AMAZON_FIRE_AD_ID, i83Var);
        hyg.a(prbVar, lw0.DISPLAY_COUNT, i83Var);
        hyg.a(prbVar, lw0.CSRB_ECO_DATA, i83Var);
        hyg.a(prbVar, lw0.PARENT_AD_CONFIG, i83Var);
        hyg.a(prbVar, lw0.TOPICS, i83Var4);
        hyg.a(prbVar, lw0.NATIVE_AD, i83Var4);
        hyg.a(prbVar, lw0.ICON_AD, i83Var);
        lw0 lw0Var6 = lw0.UNDEFINED;
        hyg.a(prbVar, lw0Var6, i83Var4);
        hyg.a(prbVar, lw0.AD_RESPONSE_ENCRYPTION_KEY, i83Var3);
        hyg.a(prbVar, lw0.SCAR_SIGNAL_TYPE, i83Var);
        hyg.a(prbVar, lw0.DEVICE_TIER, i83Var);
        C = prbVar;
        prb prbVar2 = new prb();
        String strValueOf = String.valueOf(lw0Var.getNumber());
        Boolean bool = Boolean.TRUE;
        prbVar2.q(strValueOf, bool);
        String strValueOf2 = String.valueOf(lw0Var5.getNumber());
        Boolean bool2 = Boolean.FALSE;
        prbVar2.q(strValueOf2, bool2);
        prbVar2.q(String.valueOf(lw0Var2.getNumber()), bool2);
        prbVar2.q(String.valueOf(lw0Var3.getNumber()), bool2);
        prbVar2.q(String.valueOf(lw0Var4.getNumber()), bool2);
        prbVar2.q(String.valueOf(lw0Var6.getNumber()), bool2);
        D = prbVar2;
        prb prbVar3 = new prb();
        prbVar3.q(String.valueOf(lw0Var.getNumber()), bool);
        prbVar3.q(String.valueOf(lw0Var5.getNumber()), bool2);
        prbVar3.q(String.valueOf(lw0Var2.getNumber()), bool2);
        prbVar3.q(String.valueOf(lw0Var3.getNumber()), bool2);
        prbVar3.q(String.valueOf(lw0Var4.getNumber()), bool2);
        prbVar3.q(String.valueOf(lw0Var6.getNumber()), bool2);
        E = prbVar3;
        prb prbVar4 = new prb();
        prbVar4.p(0, String.valueOf(lw0Var.getNumber()));
        prbVar4.p(0, String.valueOf(lw0Var5.getNumber()));
        prbVar4.p(0, String.valueOf(lw0Var2.getNumber()));
        prbVar4.p(0, String.valueOf(lw0Var3.getNumber()));
        long jX0 = cs5.x0(30, un7Var);
        prbVar4.p(Long.valueOf(pn7.f(jX0)), String.valueOf(lw0Var4.getNumber()));
        prbVar4.p(0, String.valueOf(lw0Var6.getNumber()));
        F = prbVar4;
        prb prbVar5 = new prb();
        un7 un7Var2 = un7.f;
        long jX02 = cs5.x0(10, un7Var2);
        prbVar5.p(Long.valueOf(pn7.f(jX02)), String.valueOf(lw0Var.getNumber()));
        long jX03 = cs5.x0(365, un7.h);
        prbVar5.p(Long.valueOf(pn7.f(jX03)), String.valueOf(lw0Var5.getNumber()));
        long jX04 = cs5.x0(30, un7Var);
        prbVar5.p(Long.valueOf(pn7.f(jX04)), String.valueOf(lw0Var2.getNumber()));
        long jX05 = cs5.x0(5, un7Var2);
        prbVar5.p(Long.valueOf(pn7.f(jX05)), String.valueOf(lw0Var3.getNumber()));
        long jX06 = cs5.x0(300, un7Var);
        prbVar5.p(Long.valueOf(pn7.f(jX06)), String.valueOf(lw0Var4.getNumber()));
        prbVar5.p(0, String.valueOf(lw0Var6.getNumber()));
        G = prbVar5;
        prb prbVar6 = new prb();
        prbVar6.q(String.valueOf(lw0Var.getNumber()), bool);
        prbVar6.q(String.valueOf(lw0Var5.getNumber()), bool2);
        prbVar6.q(String.valueOf(lw0Var2.getNumber()), bool2);
        prbVar6.q(String.valueOf(lw0Var3.getNumber()), bool2);
        prbVar6.q(String.valueOf(lw0Var4.getNumber()), bool);
        prbVar6.q(String.valueOf(lw0Var6.getNumber()), bool2);
        H = prbVar6;
        prb prbVar7 = new prb();
        prbVar7.q(String.valueOf(lw0Var.getNumber()), bool2);
        prbVar7.q(String.valueOf(lw0Var5.getNumber()), bool2);
        prbVar7.q(String.valueOf(lw0Var2.getNumber()), bool2);
        prbVar7.q(String.valueOf(lw0Var3.getNumber()), bool2);
        prbVar7.q(String.valueOf(lw0Var4.getNumber()), bool2);
        prbVar7.q(String.valueOf(lw0Var6.getNumber()), bool2);
        I = prbVar7;
    }

    public qr0(oip oipVar, pep pepVar, bto btoVar, xdp xdpVar, fjp fjpVar, w7p w7pVar) {
        super(w7pVar);
        this.r = oipVar;
        this.s = pepVar;
        this.t = btoVar;
        this.u = xdpVar;
        this.v = fjpVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.qr0 r5, kotlin.coroutines.CoroutineContext r6, nx5 r7, nt5 r8) {
        /*
            boolean r0 = r8 instanceof ads_mobile_sdk.nr0
            if (r0 == 0) goto L13
            r0 = r8
            ads_mobile_sdk.nr0 r0 = (ads_mobile_sdk.nr0) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ads_mobile_sdk.nr0 r0 = new ads_mobile_sdk.nr0
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.b
            px5 r1 = px5.a
            int r2 = r0.d
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L2a
            ads_mobile_sdk.qr0 r5 = r0.a
            defpackage.ybh.y(r8)
            goto L50
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r5)
            return r3
        L30:
            defpackage.ybh.y(r8)
            java.lang.Object r8 = r5.a
            w7p r8 = (defpackage.w7p) r8
            r0.a = r5
            r0.d = r4
            ads_mobile_sdk.eo r8 = (ads_mobile_sdk.eo) r8
            r8.getClass()
            ads_mobile_sdk.pn r2 = new ads_mobile_sdk.pn
            r2.<init>(r8, r7, r3)
            java.lang.Object r6 = defpackage.na2.Z(r6, r2, r0)
            if (r6 == r1) goto L4d
            kotlin.Unit r6 = kotlin.Unit.a
        L4d:
            if (r6 != r1) goto L50
            return r1
        L50:
            java.lang.Object r6 = r5.a
            w7p r6 = (defpackage.w7p) r6
            ads_mobile_sdk.fo r7 = ads_mobile_sdk.fo.a
            r8 = r6
            ads_mobile_sdk.eo r8 = (ads_mobile_sdk.eo) r8
            java.lang.String r0 = "gads:csrb:enabled"
            java.lang.Object r7 = r8.a(r0, r7)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            if (r7 == 0) goto L67
            boolean r4 = r7.booleanValue()
        L67:
            r5.w = r4
            ads_mobile_sdk.fo r7 = ads_mobile_sdk.fo.a$17
            ads_mobile_sdk.eo r6 = (ads_mobile_sdk.eo) r6
            java.lang.String r8 = "gads:csrb_abtest_enabled:ratio"
            java.lang.Object r7 = r6.a(r8, r7)
            java.lang.Double r7 = (java.lang.Double) r7
            if (r7 == 0) goto L7c
            double r7 = r7.doubleValue()
            goto L7e
        L7c:
            r7 = 0
        L7e:
            r5.x = r7
            ads_mobile_sdk.fo r7 = ads_mobile_sdk.fo.a$19
            java.lang.String r8 = "gads:csrb_break_glass_mode"
            java.lang.Object r6 = r6.a(r8, r7)
            java.lang.Integer r6 = (java.lang.Integer) r6
            if (r6 == 0) goto L91
            int r6 = r6.intValue()
            goto L92
        L91:
            r6 = 0
        L92:
            r5.y = r6
            kotlin.Unit r5 = kotlin.Unit.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.qr0.a(ads_mobile_sdk.qr0, kotlin.coroutines.CoroutineContext, nx5, nt5):java.lang.Object");
    }

    public final boolean B0() {
        return ((Boolean) a("gads:viewability_activity_lifecycle:enabled", Boolean.TRUE, fo.a)).booleanValue();
    }

    public final boolean L() {
        return ((Boolean) a("gads:enable_stop_api:enabled", Boolean.TRUE, fo.a)).booleanValue();
    }

    public final String N() {
        return (String) a("gads:firebase_analytics_class_name", "com.google.android.gms.measurement.api.AppMeasurementSdk", fo.a$23);
    }

    public final String O() {
        return (String) a("gads_firebase_analytics_url_macro", "%5Bgw_fbsaeid%5D", fo.a$23);
    }

    public final long V() {
        on7 on7Var = pn7.b;
        return ((pn7) a("gads:immersive_video_media_data_timeout_ms", u0h.b(5, un7.e), fo.a$18)).a;
    }

    public final boolean X() {
        return ((Boolean) a("gads:inspector:enabled", Boolean.TRUE, fo.a)).booleanValue();
    }

    public final Map h0() {
        Pair pair = new Pair(String.valueOf(fw0.CUI_NAME_SIGNAL.getNumber()), Double.valueOf(0.003d));
        Pair pair2 = new Pair(String.valueOf(fw0.CUI_NAME_SIGNAL_UPDATE_SIGNALS.getNumber()), Double.valueOf(3.0E-4d));
        String strValueOf = String.valueOf(fw0.CUI_NAME_ADREQUEST.getNumber());
        Double dValueOf = Double.valueOf(0.1d);
        Pair pair3 = new Pair(strValueOf, dValueOf);
        Pair pair4 = new Pair(String.valueOf(fw0.CUI_NAME_SDKINIT_SDKCORE.getNumber()), dValueOf);
        Pair pair5 = new Pair(String.valueOf(fw0.CUI_NAME_WEBVIEW_INITIALIZATION.getNumber()), dValueOf);
        Pair pair6 = new Pair(String.valueOf(fw0.CUI_NAME_WEBVIEW_LOAD.getNumber()), dValueOf);
        String strValueOf2 = String.valueOf(fw0.CUI_NAME_INSTALL_REFERRER_DETAILS.getNumber());
        Double dValueOf2 = Double.valueOf(1.0d);
        return (Map) a("gads:per_trace_sample_rate", rbd.c(new Pair[]{pair, pair2, pair3, pair4, pair5, pair6, new Pair(strValueOf2, dValueOf2), new Pair(String.valueOf(fw0.CUI_NAME_INSTALL_REFERRER_TASK.getNumber()), dValueOf2), new Pair(String.valueOf(fw0.CUI_NAME_POST_CLICK_LIFECYCLE_MONITORING.getNumber()), dValueOf2), new Pair(String.valueOf(fw0.CUI_NAME_HSDP_SERVICE.getNumber()), dValueOf2), new Pair(String.valueOf(fw0.CUI_NAME_AD_INSPECTOR_DISABLED.getNumber()), dValueOf2), new Pair(String.valueOf(fw0.CUI_NAME_AD_INSPECTOR_GLOBAL_ALLOWLIST_OVERRIDE.getNumber()), dValueOf2)}), fo.a$9);
    }

    public final long n() {
        on7 on7Var = pn7.b;
        return ((pn7) a("gads:adapter_initialization:timeout", u0h.b(30, un7.e), fo.a$21)).a;
    }

    public final long w0() {
        on7 on7Var = pn7.b;
        return ((pn7) a("gad:signal_collection_timeout_ms", u0h.b(60, un7.e), fo.a$18)).a;
    }
}
