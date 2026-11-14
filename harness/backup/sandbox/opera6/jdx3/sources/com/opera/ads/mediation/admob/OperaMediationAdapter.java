package com.opera.ads.mediation.admob;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.VersionInfo;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.InitializationCompleteCallback;
import com.google.android.gms.ads.mediation.MediationAdConfiguration;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationAppOpenAdCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.leanplum.internal.Constants;
import defpackage.c37;
import defpackage.eq;
import defpackage.ghf;
import defpackage.mpf;
import defpackage.npf;
import defpackage.opf;
import defpackage.p8f;
import defpackage.ppf;
import defpackage.qhf;
import defpackage.qpf;
import defpackage.r9i;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@Keep
/* loaded from: classes.dex */
public class OperaMediationAdapter extends Adapter {

    @NonNull
    private final qhf mLogger;

    public OperaMediationAdapter() {
        qhf qhfVar = new qhf();
        Map map = qhf.b;
        synchronized (map) {
            if (((Integer) map.get(this)) == null) {
                map.put(this, Integer.valueOf(qhf.a.getAndIncrement()));
            }
        }
        this.mLogger = qhfVar;
        log("onCreate");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void log(@NonNull String str) {
        this.mLogger.getClass();
        qhf.a();
    }

    @NonNull
    public VersionInfo getSDKVersionInfo() {
        String[] strArrSplit = "2.14.0".split("\\.");
        if (strArrSplit.length >= 3) {
            try {
                return new VersionInfo(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[2]));
            } catch (NumberFormatException unused) {
            }
        }
        log("getSDKVersionInfo: Unexpected SDK version 2.14.0");
        return new VersionInfo(0, 0, 0);
    }

    @NonNull
    public VersionInfo getVersionInfo() {
        String[] strArrSplit = "2.14.0.0".split("\\.");
        if (strArrSplit.length >= 4) {
            try {
                return new VersionInfo(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), (Integer.parseInt(strArrSplit[2]) * 100) + Integer.parseInt(strArrSplit[3]));
            } catch (NumberFormatException unused) {
            }
        }
        log("getVersionInfo: Unexpected adapter version 2.14.0.0");
        return new VersionInfo(0, 0, 0);
    }

    public void initialize(@NonNull Context context, @NonNull InitializationCompleteCallback initializationCompleteCallback, @NonNull List<MediationConfiguration> list) throws JSONException {
        log("initialize");
        HashSet hashSet = new HashSet();
        Iterator<MediationConfiguration> it = list.iterator();
        while (it.hasNext()) {
            String string = it.next().getServerParameters().getString("parameter");
            if (!TextUtils.isEmpty(string)) {
                try {
                    String string2 = new JSONObject(string).getString(Constants.Params.APP_ID);
                    if (!TextUtils.isEmpty(string2)) {
                        hashSet.add(string2);
                    }
                } catch (JSONException unused) {
                }
            }
        }
        if (!hashSet.isEmpty()) {
            String str = (String) hashSet.iterator().next();
            if (hashSet.size() > 1) {
                log("initialize: ".concat(String.format("Found multiple app IDs in %s. Using %s to initialize Opera Ads SDK.", hashSet, str)));
            }
            c37.s().x(context, str, new esg(this, initializationCompleteCallback, (byte) 28), this.mLogger);
            return;
        }
        AdError adErrorO = rm5.o(101, "Failed to initialize Opera Ads SDK. Missing or invalid App ID.");
        log("initialize: failed, error=" + adErrorO);
        initializationCompleteCallback.onInitializationFailed(adErrorO.toString());
    }

    public void loadAppOpenAd(@NonNull MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration, @NonNull MediationAdLoadCallback<MediationAppOpenAd, MediationAppOpenAdCallback> mediationAdLoadCallback) {
        log("loadAppOpenAd");
        qhf qhfVar = this.mLogger;
        mpf mpfVar = new mpf(mediationAdLoadCallback, qhfVar);
        c5o c5oVarJ = rm5.J(mediationAppOpenAdConfiguration.getServerParameters());
        if (c5oVarJ == null) {
            AdError adErrorO = rm5.o(101, "Missing or invalid server parameters.");
            mpfVar.a("loadAd: failed, error=" + adErrorO);
            mediationAdLoadCallback.onFailure(adErrorO);
            return;
        }
        Context context = mediationAppOpenAdConfiguration.getContext();
        String str = (String) c5oVarJ.a;
        String str2 = (String) c5oVarJ.b;
        mpfVar.a("loadAd: placementId=" + str2);
        c37.s().x(context, str, new ghf((Object) mpfVar, (MediationAdConfiguration) mediationAppOpenAdConfiguration, str2, (byte) 1), qhfVar);
    }

    public void loadBannerAd(@NonNull MediationBannerAdConfiguration mediationBannerAdConfiguration, @NonNull MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback) {
        Object next;
        log("loadBannerAd");
        npf npfVar = new npf(mediationAdLoadCallback, this.mLogger);
        c5o c5oVarJ = rm5.J(mediationBannerAdConfiguration.getServerParameters());
        if (c5oVarJ == null) {
            AdError adErrorO = rm5.o(101, "Missing or invalid server parameters.");
            npfVar.a("loadAd: failed, error=" + adErrorO);
            mediationAdLoadCallback.onFailure(adErrorO);
            return;
        }
        Context context = mediationBannerAdConfiguration.getContext();
        String str = (String) c5oVarJ.a;
        String str2 = (String) c5oVarJ.b;
        AdSize adSize = mediationBannerAdConfiguration.getAdSize();
        npfVar.a("loadAd: placementId=" + str2 + ", size=" + adSize);
        int width = adSize.getWidth();
        int height = adSize.getHeight();
        Iterator it = eq.f.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            eq eqVar = (eq) next;
            if (eqVar.a == width && eqVar.b == height) {
                break;
            }
        }
        eq eqVar2 = (eq) next;
        if (eqVar2 == null) {
            AdError adErrorQ = rm5.q(102, "Failed to load Banner ad. Unsupported banner size.");
            npfVar.a("loadAd: failed, error=" + adErrorQ);
            mediationAdLoadCallback.onFailure(adErrorQ);
            return;
        }
        c37 c37VarS = c37.s();
        x79 x79Var = new x79();
        x79Var.e = npfVar;
        x79Var.a = mediationBannerAdConfiguration;
        x79Var.b = context;
        x79Var.c = str2;
        x79Var.d = eqVar2;
        c37VarS.x(context, str, x79Var, npfVar.b);
    }

    public void loadInterstitialAd(@NonNull MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, @NonNull MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback) {
        log("loadInterstitialAd");
        qhf qhfVar = this.mLogger;
        opf opfVar = new opf(mediationAdLoadCallback, qhfVar);
        c5o c5oVarJ = rm5.J(mediationInterstitialAdConfiguration.getServerParameters());
        if (c5oVarJ == null) {
            AdError adErrorO = rm5.o(101, "Missing or invalid server parameters.");
            opfVar.a("loadAd: failed, error=" + adErrorO);
            mediationAdLoadCallback.onFailure(adErrorO);
            return;
        }
        Context context = mediationInterstitialAdConfiguration.getContext();
        String str = (String) c5oVarJ.a;
        String str2 = (String) c5oVarJ.b;
        opfVar.a("loadAd: placementId=" + str2);
        c37.s().x(context, str, new p8f((Object) opfVar, (MediationAdConfiguration) mediationInterstitialAdConfiguration, str2, (byte) 2), qhfVar);
    }

    public void loadNativeAdMapper(@NonNull MediationNativeAdConfiguration mediationNativeAdConfiguration, @NonNull MediationAdLoadCallback<NativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback) {
        log("loadNativeAdMapper");
        ppf ppfVar = new ppf(mediationAdLoadCallback, this.mLogger);
        c5o c5oVarJ = rm5.J(mediationNativeAdConfiguration.getServerParameters());
        if (c5oVarJ == null) {
            AdError adErrorO = rm5.o(101, "Missing or invalid server parameters.");
            ppfVar.a("loadAd: failed, error=" + adErrorO);
            ppfVar.t.onFailure(adErrorO);
            return;
        }
        Context context = mediationNativeAdConfiguration.getContext();
        String str = (String) c5oVarJ.a;
        String str2 = (String) c5oVarJ.b;
        ppfVar.a("loadAd: placementId=" + str2);
        c37.s().x(context, str, new r9i(ppfVar, mediationNativeAdConfiguration, context, str2), ppfVar.u);
    }

    public void loadRewardedAd(@NonNull MediationRewardedAdConfiguration mediationRewardedAdConfiguration, @NonNull MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        log("loadRewardedAd");
        qhf qhfVar = this.mLogger;
        qpf qpfVar = new qpf(mediationAdLoadCallback, qhfVar, (byte) 0);
        c5o c5oVarJ = rm5.J(mediationRewardedAdConfiguration.getServerParameters());
        if (c5oVarJ == null) {
            AdError adErrorO = rm5.o(101, "Missing or invalid server parameters.");
            qpfVar.a("loadAd: failed, error=" + adErrorO);
            mediationAdLoadCallback.onFailure(adErrorO);
            return;
        }
        Context context = mediationRewardedAdConfiguration.getContext();
        String str = (String) c5oVarJ.a;
        String str2 = (String) c5oVarJ.b;
        qpfVar.a("loadAd: placementId=" + str2);
        c37.s().x(context, str, new ghf((Object) qpfVar, (MediationAdConfiguration) mediationRewardedAdConfiguration, str2, (byte) 2), qhfVar);
    }

    public void loadRewardedInterstitialAd(@NonNull MediationRewardedAdConfiguration mediationRewardedAdConfiguration, @NonNull MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        log("loadRewardedInterstitialAd");
        qhf qhfVar = this.mLogger;
        qpf qpfVar = new qpf(mediationAdLoadCallback, qhfVar, (byte) 1);
        c5o c5oVarJ = rm5.J(mediationRewardedAdConfiguration.getServerParameters());
        if (c5oVarJ == null) {
            AdError adErrorO = rm5.o(101, "Missing or invalid server parameters.");
            qpfVar.b("loadAd: failed, error=" + adErrorO);
            mediationAdLoadCallback.onFailure(adErrorO);
            return;
        }
        Context context = mediationRewardedAdConfiguration.getContext();
        String str = (String) c5oVarJ.a;
        String str2 = (String) c5oVarJ.b;
        qpfVar.b("loadAd: placementId=" + str2);
        c37.s().x(context, str, new p8f((Object) qpfVar, (MediationAdConfiguration) mediationRewardedAdConfiguration, str2, (byte) 3), qhfVar);
    }
}
