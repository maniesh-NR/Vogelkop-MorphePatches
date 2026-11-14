package ads_mobile_sdk;

import android.util.Base64;
import androidx.webkit.WebViewCompat;
import defpackage.ijp;
import defpackage.qqo;
import defpackage.v0k;
import defpackage.vtp;
import java.util.concurrent.CancellationException;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class ws extends ijp {
    public final nx5 c;
    public final ko3 d;
    public final ux2 e;
    public final qr0 f;
    public final ax0 g;
    public final pfe h = new pfe();
    public i07 i;
    public os j;
    public d3k k;

    public ws(nx5 nx5Var, ko3 ko3Var, ux2 ux2Var, qr0 qr0Var, ax0 ax0Var) {
        this.c = nx5Var;
        this.d = ko3Var;
        this.e = ux2Var;
        this.f = qr0Var;
        this.g = ax0Var;
    }

    public static final os a(ws wsVar) {
        fo foVar = fo.a;
        ux2 ux2Var = wsVar.e;
        fw0 fw0Var = fw0.CUI_NAME_GET_WEBVIEW_VARIATIONS;
        l08 l08Var = l08.a;
        kh3 kh3Var = new kh3(new eq2(), new ih1(), new dt2(), new s8());
        byte b = 2;
        if (hh3.b().a == null) {
            wk2 wk2VarA = ux2.a(ux2Var, fw0Var, l08Var, kh3Var);
            try {
                try {
                    wsVar.d.getClass();
                    String variationsHeader = WebViewCompat.getVariationsHeader();
                    if (StringsKt.N(variationsHeader)) {
                        vr3 vr3Var = xu0.a;
                        if (vq.a != wq.a && xu0.a("GoogleMobileAds", 2)) {
                            vr3 vr3Var2 = xu0.a;
                            vr3Var2.getClass();
                            u0k u0kVarF = ((v0k) vr3Var2.d).f(vr3Var2, "variations header is blank");
                            while (true) {
                                u0k u0kVar = u0kVarF;
                                if (!u0kVar.hasNext()) {
                                    break;
                                }
                                Thread.currentThread().getName();
                            }
                        }
                        wk2VarA.close();
                        return null;
                    }
                    try {
                        ns nsVarA = ns.a(Base64.decode(variationsHeader, 0));
                        qr0 qr0Var = wsVar.f;
                        qr0Var.getClass();
                        os osVar = new os(variationsHeader, nsVarA, ((Boolean) qr0Var.a("gads:parse_chrome_variations_client_header", Boolean.TRUE, foVar)).booleanValue() ? xt.a(Base64.decode(variationsHeader, 2), ul0.b()) : null);
                        xu0.a(new qqo(osVar, b));
                        wsVar.j = osVar;
                        wk2VarA.close();
                        return osVar;
                    } catch (Throwable th) {
                        rg3 rg3VarA = hh3.a();
                        rg3VarA.e().m = false;
                        rg3VarA.a(th);
                        wk2VarA.close();
                    }
                } catch (Exception e) {
                    rg3 rg3VarA2 = hh3.a();
                    rg3VarA2.e().m = false;
                    rg3VarA2.a(e);
                    wk2VarA.close();
                }
            } catch (Throwable th2) {
                try {
                    wk2VarA.b(th2);
                    if (th2 instanceof iyo) {
                        throw th2;
                    }
                    wk2VarA.a(th2);
                    if (th2 instanceof kql) {
                        throw new uw0((kql) th2);
                    }
                    if (th2 instanceof CancellationException) {
                        throw new ou0(th2);
                    }
                    if (th2 instanceof mv0) {
                        throw th2;
                    }
                    throw new tu0(th2);
                } finally {
                }
            }
        } else {
            rg3 rg3VarA3 = hh3.a(fw0Var, l08Var, true);
            try {
                try {
                    wsVar.d.getClass();
                    String variationsHeader2 = WebViewCompat.getVariationsHeader();
                    if (StringsKt.N(variationsHeader2)) {
                        vr3 vr3Var3 = xu0.a;
                        if (vq.a != wq.a && xu0.a("GoogleMobileAds", 2)) {
                            vr3 vr3Var4 = xu0.a;
                            vr3Var4.getClass();
                            u0k u0kVarF2 = ((v0k) vr3Var4.d).f(vr3Var4, "variations header is blank");
                            while (true) {
                                u0k u0kVar2 = u0kVarF2;
                                if (!u0kVar2.hasNext()) {
                                    break;
                                }
                                Thread.currentThread().getName();
                            }
                        }
                        rg3VarA3.close();
                        return null;
                    }
                    try {
                        ns nsVarA2 = ns.a(Base64.decode(variationsHeader2, 0));
                        qr0 qr0Var2 = wsVar.f;
                        qr0Var2.getClass();
                        os osVar2 = new os(variationsHeader2, nsVarA2, ((Boolean) qr0Var2.a("gads:parse_chrome_variations_client_header", Boolean.TRUE, foVar)).booleanValue() ? xt.a(Base64.decode(variationsHeader2, 2), ul0.b()) : null);
                        xu0.a(new qqo(osVar2, b));
                        wsVar.j = osVar2;
                        rg3VarA3.close();
                        return osVar2;
                    } catch (Throwable th3) {
                        rg3 rg3VarA4 = hh3.a();
                        rg3VarA4.e().m = false;
                        rg3VarA4.a(th3);
                        rg3VarA3.close();
                    }
                } catch (Exception e2) {
                    rg3 rg3VarA5 = hh3.a();
                    rg3VarA5.e().m = false;
                    rg3VarA5.a(e2);
                    rg3VarA3.close();
                }
            } catch (Throwable th4) {
                try {
                    rg3VarA3.b(th4);
                    if (th4 instanceof iyo) {
                        throw th4;
                    }
                    rg3VarA3.a(th4);
                    if (th4 instanceof kql) {
                        throw new uw0((kql) th4);
                    }
                    if (th4 instanceof CancellationException) {
                        throw new ou0(th4);
                    }
                    if (th4 instanceof mv0) {
                        throw th4;
                    }
                    throw new tu0(th4);
                } catch (Throwable th5) {
                    try {
                        throw th5;
                    } catch (Throwable th6) {
                        vtp.v(rg3VarA3, th5);
                        throw th6;
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(ads_mobile_sdk.ws r10, nt5 r11) {
        /*
            boolean r0 = r11 instanceof ads_mobile_sdk.rs
            if (r0 == 0) goto L13
            r0 = r11
            ads_mobile_sdk.rs r0 = (ads_mobile_sdk.rs) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ads_mobile_sdk.rs r0 = new ads_mobile_sdk.rs
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.c
            px5 r1 = px5.a
            int r2 = r0.e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L31
            if (r2 != r3) goto L2b
            defpackage.ybh.y(r11)
            return r11
        L2b:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r10)
            return r5
        L31:
            pfe r10 = r0.b
            ads_mobile_sdk.ws r2 = r0.a
            defpackage.ybh.y(r11)
            r11 = r10
            r10 = r2
            goto L5a
        L3b:
            defpackage.ybh.y(r11)
            ads_mobile_sdk.ko3 r11 = r10.d
            r11.getClass()
            java.lang.String r11 = "GET_VARIATIONS_HEADER"
            boolean r11 = defpackage.axn.b(r11)
            if (r11 != 0) goto L4c
            return r5
        L4c:
            pfe r11 = r10.h
            r0.a = r10
            r0.b = r11
            r0.e = r4
            java.lang.Object r2 = r11.i(r0)
            if (r2 == r1) goto Lb5
        L5a:
            ads_mobile_sdk.os r2 = r10.j     // Catch: java.lang.Throwable -> Lb7
            nx5 r4 = r10.c
            if (r2 == 0) goto L65
            cd5 r10 = defpackage.sfe.d(r2)     // Catch: java.lang.Throwable -> Lb7
            goto La6
        L65:
            i07 r2 = r10.i     // Catch: java.lang.Throwable -> Lb7
            if (r2 != 0) goto La5
            uf4 r2 = new uf4     // Catch: java.lang.Throwable -> Lb7
            r6 = 4
            r2.<init>(r6, r5, r10)     // Catch: java.lang.Throwable -> Lb7
            kotlin.coroutines.h r6 = kotlin.coroutines.h.a     // Catch: java.lang.Throwable -> Lb7
            wc2 r7 = new wc2     // Catch: java.lang.Throwable -> Lb7
            r8 = 5
            r7.<init>(r2, r5, r8)     // Catch: java.lang.Throwable -> Lb7
            i07 r2 = defpackage.na2.g(r4, r6, r5, r7, r3)     // Catch: java.lang.Throwable -> Lb7
            r10.i = r2     // Catch: java.lang.Throwable -> Lb7
            ads_mobile_sdk.qr0 r6 = r10.f     // Catch: java.lang.Throwable -> Lb7
            r6.getClass()     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r7 = "gads:chrome_variations_refresh_enabled"
            java.lang.Boolean r8 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> Lb7
            ads_mobile_sdk.fo r9 = ads_mobile_sdk.fo.a     // Catch: java.lang.Throwable -> Lb7
            java.lang.Object r6 = r6.a(r7, r8, r9)     // Catch: java.lang.Throwable -> Lb7
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Throwable -> Lb7
            boolean r6 = r6.booleanValue()     // Catch: java.lang.Throwable -> Lb7
            if (r6 == 0) goto La5
            d3k r6 = r10.k     // Catch: java.lang.Throwable -> Lb7
            if (r6 != 0) goto La5
            ads_mobile_sdk.ss r6 = new ads_mobile_sdk.ss     // Catch: java.lang.Throwable -> Lb7
            r7 = 0
            r6.<init>(r10, r5, r7)     // Catch: java.lang.Throwable -> Lb7
            r7 = 3
            d3k r4 = defpackage.na2.B(r4, r5, r5, r6, r7)     // Catch: java.lang.Throwable -> Lb7
            r10.k = r4     // Catch: java.lang.Throwable -> Lb7
        La5:
            r10 = r2
        La6:
            r11.l(r5)
            r0.a = r5
            r0.b = r5
            r0.e = r3
            java.lang.Object r10 = r10.X(r0)
            if (r10 != r1) goto Lb6
        Lb5:
            return r1
        Lb6:
            return r10
        Lb7:
            r10 = move-exception
            r11.l(r5)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ws.a(ads_mobile_sdk.ws, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object b(ads_mobile_sdk.ws r6, nt5 r7) {
        /*
            boolean r0 = r7 instanceof ads_mobile_sdk.vs
            if (r0 == 0) goto L13
            r0 = r7
            ads_mobile_sdk.vs r0 = (ads_mobile_sdk.vs) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ads_mobile_sdk.vs r0 = new ads_mobile_sdk.vs
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.a
            px5 r1 = px5.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            defpackage.ybh.y(r7)
            goto L51
        L27:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            qp2.n(r6)
            r6 = 0
            return r6
        L2e:
            defpackage.ybh.y(r7)
            ads_mobile_sdk.qr0 r7 = r6.f
            r7.getClass()
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            ads_mobile_sdk.fo r4 = ads_mobile_sdk.fo.a
            java.lang.String r5 = "gads:chrome_variations_initialization_task_enabled"
            java.lang.Object r7 = r7.a(r5, r2, r4)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L51
            r0.c = r3
            java.lang.Object r6 = a(r6, r0)
            if (r6 != r1) goto L51
            return r1
        L51:
            ads_mobile_sdk.hv0 r6 = new ads_mobile_sdk.hv0
            kotlin.Unit r7 = kotlin.Unit.a
            r6.<init>(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ws.b(ads_mobile_sdk.ws, nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map a(android.net.Uri r7) {
        /*
            r6 = this;
            ads_mobile_sdk.qr0 r0 = r6.f
            r0.getClass()
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            ads_mobile_sdk.fo r2 = ads_mobile_sdk.fo.a
            java.lang.String r3 = "gads:parse_chrome_variations_client_header"
            java.lang.Object r1 = r0.a(r3, r1, r2)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r2 = 0
            if (r1 == 0) goto La6
            ads_mobile_sdk.ax0 r1 = r6.g
            boolean r3 = r1.c(r7)
            if (r3 != 0) goto L70
            boolean r3 = r1.a(r7)
            if (r3 != 0) goto L70
            boolean r3 = r1.b(r7)
            if (r3 == 0) goto La6
            java.lang.String r7 = r7.toString()
            ads_mobile_sdk.qr0 r1 = r1.c
            r1.getClass()
            java.lang.String r3 = "^[^?]*(/mads/gma|/gampad/ads|/pagead/ads).*"
            java.util.List r3 = java.util.Collections.singletonList(r3)
            ads_mobile_sdk.fo r4 = ads_mobile_sdk.fo.a$15
            java.lang.String r5 = "gads:ad_request_url_pattern_match"
            java.lang.Object r1 = r1.a(r5, r3, r4)
            java.util.List r1 = (java.util.List) r1
            boolean r3 = r1 instanceof java.util.Collection
            if (r3 == 0) goto L4f
            boolean r3 = r1.isEmpty()
            if (r3 != 0) goto La6
        L4f:
            java.util.Iterator r1 = r1.iterator()
        L53:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto La6
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            kotlin.text.Regex r4 = new kotlin.text.Regex
            r4.<init>(r3)
            java.util.regex.Pattern r3 = r4.a
            java.util.regex.Matcher r3 = r3.matcher(r7)
            boolean r3 = r3.find()
            if (r3 == 0) goto L53
        L70:
            ads_mobile_sdk.os r7 = r6.j
            if (r7 != 0) goto L81
            ads_mobile_sdk.ss r7 = new ads_mobile_sdk.ss
            r0 = 1
            r7.<init>(r6, r2, r0)
            r0 = 3
            nx5 r6 = r6.c
            defpackage.na2.B(r6, r2, r2, r7, r0)
            return r2
        L81:
            java.lang.Object r6 = r7.c
            ads_mobile_sdk.xt r6 = (ads_mobile_sdk.xt) r6
            if (r6 == 0) goto L92
            byte[] r6 = r6.a()
            r7 = 10
            java.lang.String r6 = android.util.Base64.encodeToString(r6, r7)
            goto L93
        L92:
            r6 = r2
        L93:
            if (r6 == 0) goto La6
            java.lang.String r7 = "x-client-data"
            ads_mobile_sdk.fo r1 = ads_mobile_sdk.fo.a$23
            java.lang.String r2 = "gads:client_data_header"
            java.lang.Object r7 = r0.a(r2, r7, r1)
            java.lang.String r7 = (java.lang.String) r7
            java.util.Map r6 = java.util.Collections.singletonMap(r7, r6)
            return r6
        La6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ws.a(android.net.Uri):java.util.Map");
    }

    @Override // ads_mobile_sdk.k61
    public final Object h(mt5 mt5Var) {
        return b(this, (nt5) mt5Var);
    }
}
