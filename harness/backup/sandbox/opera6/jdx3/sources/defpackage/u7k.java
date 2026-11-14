package defpackage;

import android.app.UiModeManager;
import android.content.ContentResolver;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.webkit.WebView;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzjn;
import com.leanplum.internal.Constants;
import com.opera.ads.internal.fullscreenad.AdActivity;
import com.opera.android.ui.catalog.widget.OperaListItem;
import java.io.IOException;
import java.util.ArrayList;
import java.util.UUID;
import kotlin.collections.CollectionsKt;
import org.chromium.content.browser.accessibility.WebContentsAccessibilityImpl;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class u7k implements vlf, psm, a5a, ssk, w7e, bpm, qen, d94, m1p, f94, ph {
    public Object a;

    public u7k() {
        itl itlVar = new itl();
        itlVar.h = true;
        itlVar.i = 2;
        itlVar.j = 1;
        itlVar.l = itl.m;
        this.a = itlVar;
    }

    public u7k(fee feeVar) {
        this.a = feeVar;
        an2 an2Var = fcl.Dp;
        Class cls = (Class) feeVar.b(an2Var, (Object) null);
        if (cls != null && !cls.equals(fgk.class)) {
            kp5.d("Invalid target class configuration for ", this, ": ", cls);
            throw null;
        }
        feeVar.s(qsm.Sp, ssm.e);
        feeVar.s(an2Var, fgk.class);
        an2 an2Var2 = fcl.Cp;
        if (feeVar.b(an2Var2, (Object) null) == null) {
            feeVar.s(an2Var2, fgk.class.getCanonicalName() + "-" + UUID.randomUUID());
        }
    }

    public /* synthetic */ u7k(Object obj) {
        this.a = obj;
    }

    public /* synthetic */ u7k(n0c n0cVar) {
        uto utoVar = new uto(n0cVar, (byte) 7);
        this.a = zop.a(new z4k((Object) zop.a(new agm(zop.a(new wci(utoVar, zop.a(new ppp(utoVar)), (byte) 14)), zop.a(new uto(utoVar, (byte) 5)), utoVar, (byte) 13)), (byte) 25));
    }

    public static u7k e() {
        u7k u7kVar = new u7k();
        itl itlVar = (itl) u7kVar.a;
        itlVar.j = 2;
        itlVar.i = fki.a;
        return u7kVar;
    }

    public static u7k f(int i) {
        u7k u7kVar = new u7k();
        itl itlVar = (itl) u7kVar.a;
        itlVar.j = 1;
        itlVar.i = i;
        return u7kVar;
    }

    public static u7k j(int i) {
        u7k u7kVar = new u7k();
        itl itlVar = (itl) u7kVar.a;
        itlVar.l = new sa2((byte) 19, i, false);
        itlVar.i = 1;
        return u7kVar;
    }

    public static boolean r(gqk gqkVar) {
        int i = gqkVar.a;
        if (i != 6 && i != 20) {
            switch (gqkVar.b.ordinal()) {
                case 0:
                case 1:
                case 5:
                case h1a.ERROR_PRIVATE_FIELD_NUMBER /* 9 */:
                case h1a.INTENTS_REGULAR_FIELD_NUMBER /* 10 */:
                    return true;
                default:
                    h9o.p();
                case 2:
                case 3:
                case 4:
                case 6:
                case 7:
                case 8:
                case 11:
                    return false;
            }
        }
        return false;
    }

    @Override // defpackage.a5a
    public final boolean Q(int i) {
        if (i == -1) {
            return false;
        }
        return r((gqk) ((hqk) this.a).y.get(i));
    }

    @Override // defpackage.m1p
    public final void a() {
        ((cko) this.a).b = true;
    }

    public final void b() {
        wqn wqnVar = (wqn) this.a;
        if (wqnVar.e instanceof uqn) {
            wqnVar.f = true;
            wqnVar.X(uqn.a);
        }
    }

    public final yb6 c(Uri uri) {
        return new agk((byte) 1, uri, (ContentResolver) this.a);
    }

    public final JSONObject d(View view) throws JSONException {
        int currentModeType;
        JSONObject jSONObjectA = yqo.a(0, 0, 0, 0);
        UiModeManager uiModeManager = ynh.b;
        try {
            jSONObjectA.put("noOutputDevice", hqo.a[vep.A((uiModeManager == null || (currentModeType = uiModeManager.getCurrentModeType()) == 1 || currentModeType != 4) ? 2 : j7h.a)] == 1);
        } catch (JSONException unused) {
        }
        return jSONObjectA;
    }

    @Override // defpackage.m1p
    public final void g(WebView webView) {
        cko ckoVar = (cko) this.a;
        ylp ylpVar = ckoVar.c;
        ylp ylpVar2 = ckoVar.c;
        if (ylpVar.q == null || ckoVar.e != null) {
            return;
        }
        AdActivity adActivity = ckoVar.a;
        if (!c26.q.b) {
            c26.f(adActivity);
        }
        ckoVar.e = new dpo(webView, (String) CollectionsKt.firstOrNull(e82.p(new String[]{ylpVar2.o, ylpVar2.p})), ylpVar2.q);
    }

    public final String h() {
        return ((wsk) ((vsk) this.a)).b;
    }

    public final fee i() {
        return (fee) this.a;
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [android.app.Activity, com.android.billingclient.api.ProxyBillingActivityV2] */
    public final void k(Object obj) {
        ?? r5 = (ProxyBillingActivityV2) this.a;
        oh ohVar = (oh) obj;
        Intent intent = ohVar.b;
        int i = ohVar.a;
        Bundle extras = intent == null ? null : intent.getExtras();
        if (i != -1) {
            if (extras == null) {
                extras = new Bundle();
            }
            zzc.zzo("ProxyBillingActivityV2", "Launch external link flow finished with resultCode: " + i);
            extras.putInt("INTERNAL_LOG_ERROR_REASON", zzjn.zzbv.zza());
            extras.putString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS", "Launch external link flow finished with error resultCode: " + i);
        }
        int i2 = zzc.zzi(intent, "ProxyBillingActivityV2").a;
        ResultReceiver resultReceiver = r5.j;
        if (resultReceiver != null) {
            resultReceiver.send(i2, extras);
        } else {
            zzc.zzo("ProxyBillingActivityV2", "Launch external link flow result receiver is null");
        }
        if (i2 != 0) {
            zzc.zzo("ProxyBillingActivityV2", "Launch external link flow finished with billing responseCode: " + i2);
        }
        r5.finish();
    }

    public final void l(rsk rskVar) {
        vsk vskVar = (vsk) this.a;
        int length = vskVar.d.length;
        for (int i = 1; i < length; i++) {
            int i2 = vskVar.d[i];
            if (i2 == 1) {
                rskVar.T0(i, vskVar.e[i]);
            } else if (i2 == 2) {
                rskVar.B(i, vskVar.f[i]);
            } else if (i2 == 3) {
                rskVar.w(i, vskVar.g[i]);
            } else if (i2 == 4) {
                rskVar.Z0(i, vskVar.h[i]);
            } else if (i2 == 5) {
                rskVar.j1(i);
            }
        }
    }

    public final boolean m(int i, int i2, boolean z) {
        WebContentsAccessibilityImpl webContentsAccessibilityImpl = (WebContentsAccessibilityImpl) this.a;
        r1j r1jVar = WebContentsAccessibilityImpl.P;
        AccessibilityEvent accessibilityEventL = webContentsAccessibilityImpl.L(i, i2, z);
        if (accessibilityEventL == null) {
            return false;
        }
        webContentsAccessibilityImpl.clearNodeInfoCacheForGivenId(i);
        webContentsAccessibilityImpl.Z(accessibilityEventL, i);
        if (i2 == 128) {
            AccessibilityEvent accessibilityEventL2 = webContentsAccessibilityImpl.L(webContentsAccessibilityImpl.g, Constants.Crypt.KEY_LENGTH, true);
            if (accessibilityEventL2 != null) {
                webContentsAccessibilityImpl.Z(accessibilityEventL2, -1);
                webContentsAccessibilityImpl.g = i;
                return true;
            }
            if (i != -1 && webContentsAccessibilityImpl.g != i) {
                webContentsAccessibilityImpl.g = i;
            }
        }
        return true;
    }

    public final b2l n(b2l b2lVar, u3l u3lVar) {
        k6l k6lVar = (k6l) this.a;
        ArrayList arrayListP = exg.p(k6lVar, u3lVar, k6lVar.m);
        if (arrayListP.isEmpty()) {
            return null;
        }
        if (arrayListP.get(0) != b2lVar) {
            return (b2l) arrayListP.get(0);
        }
        if (arrayListP.size() > 1) {
            return (b2l) arrayListP.get(1);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.String r5, nt5 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.y0l
            if (r0 == 0) goto L13
            r0 = r6
            y0l r0 = (defpackage.y0l) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.w = r1
            goto L18
        L13:
            y0l r0 = new y0l
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            px5 r1 = px5.a
            int r2 = r0.w
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            u7k r4 = r0.t
            ybh.y(r6)     // Catch: java.lang.Exception -> L4b
            goto L42
        L29:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r4)
            r4 = 0
            return r4
        L30:
            ybh.y(r6)
            java.lang.Object r6 = r4.a     // Catch: java.lang.Exception -> L4b
            g1l r6 = (g1l) r6     // Catch: java.lang.Exception -> L4b
            r0.t = r4     // Catch: java.lang.Exception -> L4b
            r0.w = r3     // Catch: java.lang.Exception -> L4b
            java.lang.Object r5 = r6.a(r5, r0)     // Catch: java.lang.Exception -> L4b
            if (r5 != r1) goto L42
            return r1
        L42:
            p0i r5 = t0i.b     // Catch: java.lang.Exception -> L4b
            java.lang.Object r4 = r4.a     // Catch: java.lang.Exception -> L4b
            g1l r4 = (g1l) r4     // Catch: java.lang.Exception -> L4b
            com.usercentrics.tcf.core.model.gvl.Declarations r4 = r4.d     // Catch: java.lang.Exception -> L4b
            return r4
        L4b:
            r4 = move-exception
            p0i r5 = t0i.b
            hwm r5 = new hwm
            java.lang.String r6 = "Unable to initialise due to poor or no network connection while fetching the TCF data."
            r5.<init>(r6, r4)
            q0i r4 = new q0i
            r4.<init>(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u7k.o(java.lang.String, nt5):java.lang.Object");
    }

    public final void onFailure(v84 v84Var, IOException iOException) {
        p0i p0iVar = t0i.b;
        pfp.a(new ky(new q0i(iOException), (e9a) null, new cfn(0, v84Var, v84.class, "isCanceled", "isCanceled()Z", 0, (byte) 21), (icp) this.a, 0));
    }

    public final void onResponse(v84 v84Var, pzh pzhVar) {
        Object q0iVar;
        e9a e9aVar;
        int i;
        Object q0iVar2;
        icp icpVar = (icp) this.a;
        try {
            try {
                p0i p0iVar = t0i.b;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    vtp.v(pzhVar, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            p0i p0iVar2 = t0i.b;
            q0iVar = new q0i(th3);
        }
        if (!pzhVar.q) {
            throw new vjo(100, (String) null);
        }
        q0iVar = icpVar.s(pzhVar);
        Throwable thD = t0i.d(q0iVar);
        if (thD == null) {
            int i2 = pzhVar.d;
            e9aVar = pzhVar.f;
            q0iVar2 = q0iVar;
            i = i2;
        } else {
            int i3 = pzhVar.d;
            e9aVar = pzhVar.f;
            i = i3;
            q0iVar2 = new q0i(thD);
        }
        e9a e9aVar2 = e9aVar;
        pfp.a(new ky(q0iVar2, e9aVar2, new cfn(0, v84Var, v84.class, "isCanceled", "isCanceled()Z", 0, (byte) 21), (icp) this.a, i));
        vtp.v(pzhVar, (Throwable) null);
    }

    public final void onSuccess() {
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(nt5 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.z0l
            if (r0 == 0) goto L13
            r0 = r5
            z0l r0 = (defpackage.z0l) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.w = r1
            goto L18
        L13:
            z0l r0 = new z0l
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            px5 r1 = px5.a
            int r2 = r0.w
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            u7k r4 = r0.t
            ybh.y(r5)     // Catch: java.lang.Exception -> L4b
            goto L42
        L29:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qp2.n(r4)
            r4 = 0
            return r4
        L30:
            ybh.y(r5)
            java.lang.Object r5 = r4.a     // Catch: java.lang.Exception -> L4b
            g1l r5 = (g1l) r5     // Catch: java.lang.Exception -> L4b
            r0.t = r4     // Catch: java.lang.Exception -> L4b
            r0.w = r3     // Catch: java.lang.Exception -> L4b
            java.lang.Object r5 = r5.b(r0)     // Catch: java.lang.Exception -> L4b
            if (r5 != r1) goto L42
            return r1
        L42:
            p0i r5 = t0i.b     // Catch: java.lang.Exception -> L4b
            java.lang.Object r4 = r4.a     // Catch: java.lang.Exception -> L4b
            g1l r4 = (g1l) r4     // Catch: java.lang.Exception -> L4b
            com.usercentrics.tcf.core.model.gvl.VendorList r4 = r4.c     // Catch: java.lang.Exception -> L4b
            return r4
        L4b:
            r4 = move-exception
            p0i r5 = t0i.b
            hwm r5 = new hwm
            java.lang.String r0 = "Unable to initialise due to poor or no network connection while fetching the TCF data."
            r5.<init>(r0, r4)
            q0i r4 = new q0i
            r4.<init>(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u7k.p(nt5):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    @Override // defpackage.a5a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.z4a q(int r5) {
        /*
            r4 = this;
            java.lang.Object r4 = r4.a
            hqk r4 = (defpackage.hqk) r4
            java.util.List r0 = r4.y
            java.lang.Object r0 = r0.get(r5)
            gqk r0 = (defpackage.gqk) r0
            xpk r0 = r0.b
            java.util.List r1 = r4.y
            int r2 = r5 + (-1)
            java.lang.Object r1 = kotlin.collections.CollectionsKt.M(r2, r1)
            gqk r1 = (defpackage.gqk) r1
            r2 = 0
            if (r1 == 0) goto L27
            boolean r3 = r(r1)
            if (r3 != 0) goto L22
            r1 = r2
        L22:
            if (r1 == 0) goto L27
            xpk r1 = r1.b
            goto L28
        L27:
            r1 = r2
        L28:
            java.util.List r4 = r4.y
            int r5 = r5 + 1
            java.lang.Object r4 = kotlin.collections.CollectionsKt.M(r5, r4)
            gqk r4 = (defpackage.gqk) r4
            if (r4 == 0) goto L3f
            boolean r5 = r(r4)
            if (r5 != 0) goto L3b
            r4 = r2
        L3b:
            if (r4 == 0) goto L3f
            xpk r2 = r4.b
        L3f:
            if (r0 != r1) goto L49
            if (r0 != r2) goto L46
            z4a r4 = defpackage.z4a.c
            return r4
        L46:
            z4a r4 = defpackage.z4a.b
            return r4
        L49:
            if (r0 != r2) goto L4e
            z4a r4 = defpackage.z4a.a
            return r4
        L4e:
            z4a r4 = defpackage.z4a.d
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u7k.q(int):z4a");
    }

    public final void s(int i) {
        ((itl) this.a).a = i == 0 ? null : new rxh(i);
    }

    @Override // defpackage.vlf
    public final void u(OperaListItem operaListItem, boolean z) {
        ((v7k) this.a).I0().b.V(z ? 1 : 0, "enable_suggested_speed_dials_on_start_page");
    }

    public final qsm v() {
        return new ggk(wrf.f((fee) this.a));
    }

    public final v7e w(d5o d5oVar) {
        return new cpm(this);
    }
}
