package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.j;
import com.opera.android.Lazy;
import com.opera.android.OperaApplication;
import com.opera.android.settings.SettingsManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class zw1 implements as6 {
    public final hjf a;
    public final SettingsManager b;
    public final r65 c;
    public final cq5 d;
    public final nx5 e;
    public final b59 f;
    public s9 g;

    /* JADX WARN: Multi-variable type inference failed */
    public zw1(hjf hjfVar, SettingsManager settingsManager, r65 r65Var, cq5 cq5Var, nx5 nx5Var) {
        this.a = hjfVar;
        this.b = settingsManager;
        this.c = r65Var;
        this.d = cq5Var;
        this.e = nx5Var;
        umi umiVar = vml.d;
        this.f = w1h.l(hjfVar, umiVar, "appsflyer", new bg1[0]);
        hjfVar.getLifecycle().a(this);
        w1h.l(hjfVar, umiVar, "appsflyer-data", new bg1[0]);
    }

    @Override // defpackage.as6
    public final void W(ndc ndcVar) {
        SettingsManager settingsManager = this.b;
        if (settingsManager.i("eula_accepted.gdpr")) {
            a();
            return;
        }
        s9 s9Var = new s9(this, (byte) 3);
        settingsManager.F(s9Var);
        this.g = s9Var;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [android.content.Context, hjf, java.lang.Object] */
    public final void a() {
        pw1 pw1Var;
        if (this.b.i("ga_usage_statistics")) {
            ?? r3 = this.a;
            b59 b59Var = this.f;
            r65 r65Var = this.c;
            SettingsManager settingsManager = this.b;
            cq5 cq5Var = this.d;
            nx5 nx5Var = this.e;
            if (!xw1.a) {
                Context applicationContext = r3.getApplicationContext();
                Lazy lazyH = (!((d75) r65Var.b.get()).i || settingsManager.G()) ? null : i0l.h(applicationContext);
                String[] strArr = OperaApplication.K;
                OperaApplication operaApplication = (OperaApplication) applicationContext.getApplicationContext();
                x5f x5fVar = operaApplication.L().d;
                l45 l45Var = new l45();
                l45Var.a = x5fVar;
                l45Var.b = new ArrayList();
                na2.B(nx5Var, (CoroutineContext) null, (rx5) null, new s3(l45Var, cq5Var, (mt5) null, (byte) 8), 3);
                vzk vzkVar = xw1.b;
                nw1 nw1Var = new nw1(applicationContext, operaApplication.L().d, operaApplication.L().c, xnh.t(applicationContext), l45Var);
                ((i7f) vzkVar.b).b(nw1Var);
                synchronized (vzkVar.c) {
                    pw1Var = (pw1) vzkVar.d;
                }
                if (pw1Var != null) {
                    nw1Var.a(pw1Var);
                }
                AppsFlyerLib.getInstance().setCurrencyCode("USD");
                AppsFlyerLib.getInstance().setCollectIMEI(false);
                AppsFlyerLib.getInstance().setCollectAndroidID(false);
                AppsFlyerLib.getInstance().setCollectOaid(false);
                AppsFlyerLib.getInstance().setDisableNetworkData(true);
                AppsFlyerProperties.getInstance().set("disableLogs", true);
                ((OperaApplication) applicationContext.getApplicationContext()).q().c(d59.a, true);
                String strA = ((OperaApplication) applicationContext.getApplicationContext()).l().a();
                if ("amazon".equals(strA)) {
                    AppsFlyerLib.getInstance().setPreinstallAttribution("OFA_AMAZON_STORE", (String) null, (String) null);
                } else if ("oem_ofa_xiaomi_store".equals(strA)) {
                    AppsFlyerLib.getInstance().setPreinstallAttribution("OFA_XIAOMI_STORE", (String) null, (String) null);
                } else if ("samsungappstore".equals(strA)) {
                    AppsFlyerLib.getInstance().setPreinstallAttribution("OFA_SAMSUNG_STORE", (String) null, (String) null);
                } else if ("oem_Huawei_appgallery".equals(strA)) {
                    AppsFlyerLib.getInstance().setOutOfStore("ofa_huawei_store");
                } else if ("oem_ofa_honor_store".equals(strA)) {
                    AppsFlyerLib.getInstance().setPreinstallAttribution("OFA_HONOR_STORE", (String) null, (String) null);
                } else if ("oem_ofa_xiaomi_offline".equals(strA)) {
                    AppsFlyerLib.getInstance().setPreinstallAttribution("XIAOMI_PRELOAD_EU", (String) null, (String) null);
                } else if ("oem_ofa_sliide_offline".equals(strA)) {
                    AppsFlyerLib.getInstance().setPreinstallAttribution("OFA_SLIIDE_PRELOAD", (String) null, (String) null);
                } else if ("oem_ofa_lenovo_offline".equals(strA)) {
                    AppsFlyerLib.getInstance().setPreinstallAttribution("OFA_LENOVO_PRELOAD", (String) null, (String) null);
                } else if ("oem_ofa_transsion_onlinestore_af".equals(strA)) {
                    AppsFlyerLib.getInstance().setPreinstallAttribution("ofa_transsion_onlinestore", (String) null, (String) null);
                } else if ("oem_ofa_transsion_store".equals(strA)) {
                    AppsFlyerLib.getInstance().setPreinstallAttribution("ofa_transsion_store", (String) null, (String) null);
                }
                c3j c3jVarD = ((d3j) e3j.t(applicationContext).i()).d(18, false);
                if (c3jVarD != null) {
                    AppsFlyerLib.getInstance().setHost("", (String) c3jVarD.d);
                }
                AppsFlyerLib.getInstance().init("aWV5TF2eQmEbHYUWbhuGNP", new mw1(vzkVar, ((OperaApplication) applicationContext.getApplicationContext()).L().d, l45Var), applicationContext);
                String appsFlyerUID = AppsFlyerLib.getInstance().getAppsFlyerUID(applicationContext);
                if (appsFlyerUID == null) {
                    l45Var.M(tw1.UID_NULL, "");
                } else if (appsFlyerUID.isEmpty()) {
                    l45Var.M(tw1.UID_EMPTY, "");
                }
                x5f x5fVar2 = operaApplication.L().d;
                String str = appsFlyerUID != null ? appsFlyerUID : "";
                zpa zpaVar = x5fVar2.d;
                x56 x56VarF = zpa.F();
                ((xf0) new ck0(zpaVar, x56VarF).c.getValue()).a.x(5, str);
                x5fVar2.U0(x56VarF);
                SharedPreferences sharedPreferences = (SharedPreferences) b59Var.get();
                int i = sharedPreferences.getInt("start_count", 0);
                if (sharedPreferences.getInt("last_version", 0) != 1910404306) {
                    j.b(sharedPreferences, "last_version", 1910404306);
                    if (i > 0) {
                        AppsFlyerLib.getInstance().logEvent(applicationContext, "af_update", Collections.singletonMap("af_content_id", r9n.u(applicationContext, applicationContext.getPackageName(), 0L).versionName));
                    }
                }
                int i2 = sharedPreferences.getInt("start_count", 0);
                if (i2 < 4) {
                    int i3 = i2 + 1;
                    j.b(sharedPreferences, "start_count", i3);
                    if (i3 >= 4) {
                        AppsFlyerLib.getInstance().logEvent(applicationContext, "User", (Map) null);
                    }
                }
                AppsFlyerLib.getInstance().subscribeForDeepLink(new b8f(applicationContext));
                xw1.a = true;
                String str2 = Build.MANUFACTURER;
                if ((!TextUtils.isEmpty(str2) ? str2.toLowerCase(Locale.US) : "unknown").contains("huawei") && ((OperaApplication) applicationContext.getApplicationContext()).l().a().toLowerCase(Locale.US).contains("huawei")) {
                    Lazy lazy = lazyH;
                    g6f g6fVar = new g6f(applicationContext, new vw1(r3, applicationContext, r65Var, settingsManager, lazy, l45Var, (byte) 0));
                    Intent intent = new Intent("com.uodis.opendevice.OPENIDS_SERVICE");
                    intent.setPackage("com.huawei.hwid");
                    if (!applicationContext.bindService(intent, g6fVar, 1)) {
                        xw1.a(r3, applicationContext, r65Var, settingsManager, lazy, l45Var);
                    }
                } else {
                    xw1.a(r3, applicationContext, r65Var, settingsManager, lazyH, l45Var);
                }
            }
        }
        s9 s9Var = this.g;
        if (s9Var != null) {
            this.b.H(s9Var);
            this.g = null;
        }
        this.a.getLifecycle().b(this);
    }

    @Override // defpackage.as6
    public final void onDestroy(ndc ndcVar) {
        s9 s9Var = this.g;
        if (s9Var != null) {
            this.b.H(s9Var);
            this.g = null;
        }
        this.a.getLifecycle().b(this);
    }
}
