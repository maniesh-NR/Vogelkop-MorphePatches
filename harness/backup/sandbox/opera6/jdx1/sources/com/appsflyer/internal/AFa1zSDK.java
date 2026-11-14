package com.appsflyer.internal;

import android.os.Build;
import com.appsflyer.AFKeystoreWrapper;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import java.security.KeyStoreException;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u000e\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\r"}, d2 = {"Lcom/appsflyer/internal/AFa1zSDK;", "", "<init>", "()V", "Lcom/appsflyer/internal/AFc1iSDK;", "p0", "Lcom/appsflyer/internal/AFc1pSDK;", "p1", "", "AFAdRevenueData", "(Lcom/appsflyer/internal/AFc1iSDK;Lcom/appsflyer/internal/AFc1pSDK;)V", "", "getCurrencyIso4217Code", "()Ljava/lang/String;", "getRevenue"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AFa1zSDK {

    @NotNull
    public static final AFa1zSDK INSTANCE = new AFa1zSDK();

    private AFa1zSDK() {
    }

    public static final void AFAdRevenueData(@NotNull AFc1iSDK p0, @NotNull AFc1pSDK p1) {
        AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
        if (AFj1iSDK.getMediationNetwork()) {
            AFLogger.afRDLog("OPPO device found");
        }
        boolean z = appsFlyerProperties.getBoolean(AppsFlyerProperties.DISABLE_KEYSTORE, true);
        int i = Build.VERSION.SDK_INT;
        if (z) {
            AFLogger.afRDLog("OS SDK is=" + i + "; no KeyStore usage");
            return;
        }
        AFLogger.afRDLog("OS SDK is=" + i + "; use KeyStore");
        AFKeystoreWrapper aFKeystoreWrapper = new AFKeystoreWrapper(p0.getMonetizationNetwork);
        if (aFKeystoreWrapper.getRevenue()) {
            String mediationNetwork = aFKeystoreWrapper.getMediationNetwork();
            synchronized (aFKeystoreWrapper.getMonetizationNetwork) {
                aFKeystoreWrapper.AFAdRevenueData++;
                AFLogger.afInfoLog("Deleting key with alias: ".concat(String.valueOf(mediationNetwork)));
                try {
                    synchronized (aFKeystoreWrapper.getMonetizationNetwork) {
                        aFKeystoreWrapper.getCurrencyIso4217Code.deleteEntry(mediationNetwork);
                    }
                } catch (KeyStoreException e) {
                    StringBuilder sb = new StringBuilder("Exception ");
                    sb.append(e.getMessage());
                    sb.append(" occurred");
                    AFLogger.afErrorLog(sb.toString(), e);
                }
            }
            aFKeystoreWrapper.getRevenue(aFKeystoreWrapper.getMediationNetwork());
        } else {
            aFKeystoreWrapper.getRevenue = AFb1iSDK.getRevenue(p1.getMonetizationNetwork);
            aFKeystoreWrapper.AFAdRevenueData = 0;
            aFKeystoreWrapper.getRevenue(aFKeystoreWrapper.getMediationNetwork());
        }
        appsFlyerProperties.set("KSAppsFlyerId", aFKeystoreWrapper.getMonetizationNetwork());
        appsFlyerProperties.set("KSAppsFlyerRICounter", String.valueOf(aFKeystoreWrapper.AFAdRevenueData()));
    }

    public static String getCurrencyIso4217Code() {
        return AppsFlyerProperties.getInstance().getString("KSAppsFlyerId");
    }

    public static String getRevenue() {
        return AppsFlyerProperties.getInstance().getString("KSAppsFlyerRICounter");
    }
}
