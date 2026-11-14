package ads_mobile_sdk;

import android.net.Uri;
import defpackage.cs5;
import defpackage.eyo;
import defpackage.vkp;
import java.io.File;

/* loaded from: classes.dex */
public final class hr1 {
    public static final long d;
    public static final long e;
    public final qr0 a;
    public final eyo b;
    public final vkp c;

    static {
        on7 on7Var = pn7.b;
        un7 un7Var = un7.e;
        d = cs5.x0(60, un7Var);
        e = pn7.p(cs5.x0(1, un7.g), un7Var);
    }

    public hr1(qr0 qr0Var, eyo eyoVar, vkp vkpVar) {
        this.a = qr0Var;
        this.b = eyoVar;
        this.c = vkpVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a3, code lost:
    
        if (r14 == r3) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(ads_mobile_sdk.cy0 r12, android.webkit.WebResourceRequest r13, nt5 r14) {
        /*
            r11 = this;
            java.lang.String r0 = "UTF-8"
            java.lang.String r1 = "max-stale="
            boolean r2 = r14 instanceof ads_mobile_sdk.fr1
            if (r2 == 0) goto L17
            r2 = r14
            ads_mobile_sdk.fr1 r2 = (ads_mobile_sdk.fr1) r2
            int r3 = r2.f
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f = r3
            goto L1c
        L17:
            ads_mobile_sdk.fr1 r2 = new ads_mobile_sdk.fr1
            r2.<init>(r11, r14)
        L1c:
            java.lang.Object r14 = r2.d
            px5 r3 = px5.a
            int r4 = r2.f
            r5 = 2
            r6 = 1
            r7 = 0
            if (r4 == 0) goto L40
            if (r4 == r6) goto L36
            if (r4 != r5) goto L30
            defpackage.ybh.y(r14)     // Catch: java.lang.Exception -> Lbf
            goto La6
        L30:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r11)
            return r7
        L36:
            java.lang.String r11 = r2.c
            ads_mobile_sdk.g21 r12 = r2.b
            ads_mobile_sdk.hr1 r13 = r2.a
            defpackage.ybh.y(r14)     // Catch: java.lang.Exception -> Lbf
            goto L80
        L40:
            defpackage.ybh.y(r14)
            android.net.Uri r13 = r13.getUrl()     // Catch: java.lang.Exception -> Lbf
            if (r13 == 0) goto Lbf
            java.lang.String r12 = r11.a(r13, r12)     // Catch: java.lang.Exception -> Lbf
            if (r12 == 0) goto Lbf
            ads_mobile_sdk.g21 r13 = new ads_mobile_sdk.g21     // Catch: java.lang.Exception -> Lbf
            r13.<init>()     // Catch: java.lang.Exception -> Lbf
            r13.b(r12)     // Catch: java.lang.Exception -> Lbf
            java.lang.String r12 = "Cache-Control"
            long r8 = ads_mobile_sdk.hr1.e     // Catch: java.lang.Exception -> Lbf
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lbf
            r14.<init>(r1)     // Catch: java.lang.Exception -> Lbf
            r14.append(r8)     // Catch: java.lang.Exception -> Lbf
            java.lang.String r14 = r14.toString()     // Catch: java.lang.Exception -> Lbf
            r13.a(r12, r14)     // Catch: java.lang.Exception -> Lbf
            java.lang.String r12 = "User-Agent"
            eyo r14 = r11.b     // Catch: java.lang.Exception -> Lbf
            r2.a = r11     // Catch: java.lang.Exception -> Lbf
            r2.b = r13     // Catch: java.lang.Exception -> Lbf
            r2.c = r12     // Catch: java.lang.Exception -> Lbf
            r2.f = r6     // Catch: java.lang.Exception -> Lbf
            java.lang.Object r14 = r14.a(r2)     // Catch: java.lang.Exception -> Lbf
            if (r14 == r3) goto La5
            r10 = r13
            r13 = r11
            r11 = r12
            r12 = r10
        L80:
            java.lang.String r14 = (java.lang.String) r14     // Catch: java.lang.Exception -> Lbf
            r12.a(r11, r14)     // Catch: java.lang.Exception -> Lbf
            java.lang.String r11 = "GET"
            r12.a(r11, r7)     // Catch: java.lang.Exception -> Lbf
            ads_mobile_sdk.h21 r11 = r12.a()     // Catch: java.lang.Exception -> Lbf
            long r8 = ads_mobile_sdk.hr1.d     // Catch: java.lang.Exception -> Lbf
            hkm r12 = new hkm     // Catch: java.lang.Exception -> Lbf
            r14 = 15
            r12.<init>(r13, r11, r7, r14)     // Catch: java.lang.Exception -> Lbf
            r2.a = r7     // Catch: java.lang.Exception -> Lbf
            r2.b = r7     // Catch: java.lang.Exception -> Lbf
            r2.c = r7     // Catch: java.lang.Exception -> Lbf
            r2.f = r5     // Catch: java.lang.Exception -> Lbf
            java.lang.Object r14 = uyg.v(r8, r12, r2)     // Catch: java.lang.Exception -> Lbf
            if (r14 != r3) goto La6
        La5:
            return r3
        La6:
            java.lang.String r14 = (java.lang.String) r14     // Catch: java.lang.Exception -> Lbf
            if (r14 == 0) goto Lbf
            android.webkit.WebResourceResponse r11 = new android.webkit.WebResourceResponse     // Catch: java.lang.Exception -> Lbf
            java.lang.String r12 = "application/javascript"
            java.io.ByteArrayInputStream r13 = new java.io.ByteArrayInputStream     // Catch: java.lang.Exception -> Lbf
            java.nio.charset.Charset r1 = java.nio.charset.Charset.forName(r0)     // Catch: java.lang.Exception -> Lbf
            byte[] r14 = r14.getBytes(r1)     // Catch: java.lang.Exception -> Lbf
            r13.<init>(r14)     // Catch: java.lang.Exception -> Lbf
            r11.<init>(r12, r0, r13)     // Catch: java.lang.Exception -> Lbf
            return r11
        Lbf:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.hr1.a(ads_mobile_sdk.cy0, android.webkit.WebResourceRequest, nt5):java.lang.Object");
    }

    public final String a(Uri uri, cy0 cy0Var) {
        fo foVar = fo.a$23;
        String path = uri.getPath();
        if (path == null || !kotlin.text.c.m(new File(path).getName(), "mraid.js", true)) {
            return null;
        }
        boolean z = cy0Var.n.get();
        qr0 qr0Var = this.a;
        if (z) {
            qr0Var.getClass();
            return (String) qr0Var.a("gad:mraid:url_expanded_banner", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/production/mraid/v3/mraid_app_expanded_banner.js", foVar);
        }
        if (cy0Var.e().a == br3.d) {
            qr0Var.getClass();
            return (String) qr0Var.a("gad:mraid:url_interstitial", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/production/mraid/v3/mraid_app_interstitial.js", foVar);
        }
        qr0Var.getClass();
        return (String) qr0Var.a("gad:mraid:url_banner", "https://googleads.g.doubleclick.net/mads/static/mad/sdk/native/production/mraid/v3/mraid_app_banner.js", foVar);
    }
}
