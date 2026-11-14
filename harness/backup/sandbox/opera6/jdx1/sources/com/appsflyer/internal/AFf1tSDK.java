package com.appsflyer.internal;

import ads_mobile_sdk.pd;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* loaded from: classes.dex */
public final class AFf1tSDK extends AFf1rSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int AFKeystoreWrapper = 1;
    private static int AFLogger;
    private final AFg1qSDK AFInAppEventType;
    private final AFc1pSDK copydefault;
    private final String equals;
    private final AFc1iSDK hashCode;
    private static char[] AFInAppEventParameterName = {10790, 10789, 10800, 10806, 10786, 10791, 10805, 10788, 10810};
    private static char registerClient = 8141;

    public AFf1tSDK(@NonNull String str, @NonNull AFc1dSDK aFc1dSDK) {
        super(new AFg1wSDK(), aFc1dSDK, str);
        this.copydefault = aFc1dSDK.getRevenue();
        this.hashCode = aFc1dSDK.AFInAppEventType();
        this.equals = str;
        this.AFInAppEventType = aFc1dSDK.component3();
    }

    public static /* synthetic */ Object AFAdRevenueData(Object[] objArr, int i, int i2, int i3) {
        return getRevenue(objArr);
    }

    private static void a(byte b, String str, int i, Object[] objArr) {
        int i2;
        char[] charArray = str != null ? str.toCharArray() : str;
        AFk1mSDK aFk1mSDK = new AFk1mSDK();
        char[] cArr = AFInAppEventParameterName;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i3 = 0; i3 < length; i3++) {
                cArr2[i3] = (char) (cArr[i3] ^ (-374623853307093042L));
            }
            cArr = cArr2;
        }
        char c = (char) (registerClient ^ (-374623853307093042L));
        char[] cArr3 = new char[i];
        if (i % 2 != 0) {
            int i4 = $10 + 67;
            $11 = i4 % NotificationCompat.FLAG_HIGH_PRIORITY;
            if (i4 % 2 == 0) {
                i2 = i + 123;
                cArr3[i2] = (char) (charArray[i2] - b);
            } else {
                i2 = i - 1;
                cArr3[i2] = (char) (charArray[i2] - b);
            }
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            aFk1mSDK.AFAdRevenueData = 0;
            $11 = ($10 + 113) % NotificationCompat.FLAG_HIGH_PRIORITY;
            while (true) {
                int i5 = aFk1mSDK.AFAdRevenueData;
                if (i5 >= i2) {
                    break;
                }
                char c2 = charArray[i5];
                aFk1mSDK.getMonetizationNetwork = c2;
                char c3 = charArray[i5 + 1];
                aFk1mSDK.getCurrencyIso4217Code = c3;
                if (c2 == c3) {
                    cArr3[i5] = (char) (c2 - b);
                    cArr3[i5 + 1] = (char) (c3 - b);
                } else {
                    int i6 = c2 / c;
                    aFk1mSDK.getMediationNetwork = i6;
                    int i7 = c2 % c;
                    aFk1mSDK.component1 = i7;
                    int i8 = c3 / c;
                    aFk1mSDK.getRevenue = i8;
                    int i9 = c3 % c;
                    aFk1mSDK.component2 = i9;
                    if (i7 == i9) {
                        $11 = ($10 + 83) % NotificationCompat.FLAG_HIGH_PRIORITY;
                        int i10 = ((i6 + c) - 1) % c;
                        aFk1mSDK.getMediationNetwork = i10;
                        int i11 = ((i8 + c) - 1) % c;
                        aFk1mSDK.getRevenue = i11;
                        cArr3[i5] = cArr[(i10 * c) + i7];
                        cArr3[i5 + 1] = cArr[(i11 * c) + i9];
                    } else if (i6 == i8) {
                        int i12 = ((i7 + c) - 1) % c;
                        aFk1mSDK.component1 = i12;
                        int i13 = ((i9 + c) - 1) % c;
                        aFk1mSDK.component2 = i13;
                        cArr3[i5] = cArr[(i6 * c) + i12];
                        cArr3[i5 + 1] = cArr[(i8 * c) + i13];
                        $11 = ($10 + 69) % NotificationCompat.FLAG_HIGH_PRIORITY;
                    } else {
                        cArr3[i5] = cArr[(i6 * c) + i9];
                        cArr3[i5 + 1] = cArr[(i8 * c) + i7];
                    }
                }
                aFk1mSDK.AFAdRevenueData = i5 + 2;
            }
        }
        $10 = ($11 + 33) % NotificationCompat.FLAG_HIGH_PRIORITY;
        int i14 = 0;
        while (i14 < i) {
            int i15 = $11 + 67;
            $10 = i15 % NotificationCompat.FLAG_HIGH_PRIORITY;
            if (i15 % 2 != 0) {
                cArr3[i14] = (char) (cArr3[i14] ^ 31812);
                i14 += 84;
            } else {
                cArr3[i14] = (char) (cArr3[i14] ^ 13722);
                i14++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    private void copy() {
        int i = AFLogger + pd.T0;
        AFKeystoreWrapper = i % NotificationCompat.FLAG_HIGH_PRIORITY;
        this.copy.getCurrencyIso4217Code("sentRegisterRequestToAF", i % 2 != 0);
        AFLogger.afDebugLog("[register] Successfully registered for Uninstall Tracking");
        AFLogger = (AFKeystoreWrapper + 81) % NotificationCompat.FLAG_HIGH_PRIORITY;
    }

    private static /* synthetic */ Object getRevenue(Object[] objArr) {
        int i = AFLogger + 53;
        AFKeystoreWrapper = i % NotificationCompat.FLAG_HIGH_PRIORITY;
        if (i % 2 != 0) {
            return null;
        }
        throw null;
    }

    @Override // com.appsflyer.internal.AFf1rSDK
    public final void AFAdRevenueData(AFh1rSDK aFh1rSDK) {
        int i = AFKeystoreWrapper + 57;
        AFLogger = i % NotificationCompat.FLAG_HIGH_PRIORITY;
        int i2 = i % 2;
        super.AFAdRevenueData(aFh1rSDK);
        if (i2 != 0) {
            Context context = this.hashCode.getMonetizationNetwork;
            throw null;
        }
        Context context2 = this.hashCode.getMonetizationNetwork;
        AFa1tSDK aFa1tSDK = (AFa1tSDK) AFa1tSDK.getMonetizationNetwork(new Object[0], -631580017, 631580017, (int) System.currentTimeMillis());
        if (context2 == null) {
            qp2.n("Context is not provided, can't send register request");
            return;
        }
        if (aFa1tSDK.getMediationNetwork()) {
            AFLogger.afInfoLog("CustomerUserId not set, Tracking is disabled", true);
            qp2.n("CustomerUserId not set, register is not sent");
            return;
        }
        PackageManager packageManager = context2.getPackageManager();
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(context2.getPackageName(), 0);
            aFh1rSDK.getMediationNetwork("app_version_code", Integer.toString(packageInfo.versionCode));
            aFh1rSDK.getMediationNetwork("app_version_name", packageInfo.versionName);
            aFh1rSDK.getMediationNetwork("app_name", packageManager.getApplicationLabel(packageInfo.applicationInfo).toString());
            aFh1rSDK.getMediationNetwork("installDate", AFa1tSDK.getRevenue(new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US), packageInfo.firstInstallTime));
            AFKeystoreWrapper = (AFLogger + 37) % NotificationCompat.FLAG_HIGH_PRIORITY;
        } catch (Throwable th) {
            AFLogger.afErrorLog("Exception while collecting application version info.", th);
        }
        this.AFInAppEventType.AFAdRevenueData(aFh1rSDK.AFAdRevenueData);
        aFh1rSDK.AFAdRevenueData.remove("ivc");
        String revenue = AFa1tSDK.getRevenue();
        if (revenue != null) {
            aFh1rSDK.getMediationNetwork("appUserId", revenue);
        }
        try {
            aFh1rSDK.getMediationNetwork("model", Build.MODEL);
            Object[] objArr = new Object[1];
            a((byte) (124 - TextUtils.lastIndexOf("", '0', 0)), "\u0006\u0003\u0007\u0006㙻", 5 - TextUtils.indexOf("", "", 0), objArr);
            aFh1rSDK.getMediationNetwork(((String) objArr[0]).intern(), Build.BRAND);
        } catch (Throwable th2) {
            AFLogger.afErrorLog("Exception while collecting device brand and model.", th2);
        }
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, false)) {
            int i3 = AFKeystoreWrapper + 75;
            AFLogger = i3 % NotificationCompat.FLAG_HIGH_PRIORITY;
            int i4 = i3 % 2;
            aFh1rSDK.getMediationNetwork(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, "true");
            if (i4 != 0) {
                int i5 = 86 / 0;
            }
        }
        AFb1mSDK aFb1mSDKK_ = AFb1jSDK.k_(context2.getContentResolver());
        if (aFb1mSDKK_ != null) {
            int i6 = AFLogger + 113;
            AFKeystoreWrapper = i6 % NotificationCompat.FLAG_HIGH_PRIORITY;
            if (i6 % 2 == 0) {
                aFh1rSDK.getMediationNetwork("amazon_aid", aFb1mSDKK_.getMonetizationNetwork);
                aFh1rSDK.getMediationNetwork("amazon_aid_limit", String.valueOf(aFb1mSDKK_.getMediationNetwork));
                throw null;
            }
            aFh1rSDK.getMediationNetwork("amazon_aid", aFb1mSDKK_.getMonetizationNetwork);
            aFh1rSDK.getMediationNetwork("amazon_aid_limit", String.valueOf(aFb1mSDKK_.getMediationNetwork));
        }
        aFh1rSDK.getMediationNetwork("devkey", ((AFe1dSDK) this).component3.getMediationNetwork());
        aFh1rSDK.getMediationNetwork("uid", AFb1iSDK.getRevenue(this.copydefault.getMonetizationNetwork));
        aFh1rSDK.getMediationNetwork("af_gcm_token", this.equals);
        aFh1rSDK.getMediationNetwork("launch_counter", Integer.toString(this.copy.AFAdRevenueData("appsFlyerCount", 0)));
        aFh1rSDK.getMediationNetwork("sdk", Integer.toString(Build.VERSION.SDK_INT));
        String strComponent2 = this.copydefault.component2();
        if (strComponent2 != null) {
            AFKeystoreWrapper = (AFLogger + 19) % NotificationCompat.FLAG_HIGH_PRIORITY;
            aFh1rSDK.getMediationNetwork(AppsFlyerProperties.CHANNEL, strComponent2);
        }
    }

    @Override // com.appsflyer.internal.AFf1rSDK
    public final void component3(AFh1rSDK aFh1rSDK) {
        int i = AFKeystoreWrapper + pd.l1;
        AFLogger = i % NotificationCompat.FLAG_HIGH_PRIORITY;
        int i2 = i % 2;
        AFc1pSDK aFc1pSDK = this.copydefault;
        if (i2 != 0) {
            aFc1pSDK.AFAdRevenueData();
            throw null;
        }
        String strAFAdRevenueData = aFc1pSDK.AFAdRevenueData();
        if (strAFAdRevenueData != null) {
            AFLogger = (AFKeystoreWrapper + pd.K0) % NotificationCompat.FLAG_HIGH_PRIORITY;
            aFh1rSDK.getMediationNetwork("advertiserId", strAFAdRevenueData);
        }
    }

    @Override // com.appsflyer.internal.AFf1rSDK, com.appsflyer.internal.AFe1dSDK
    public final boolean copydefault() {
        int i = AFKeystoreWrapper + 95;
        int i2 = i % NotificationCompat.FLAG_HIGH_PRIORITY;
        AFLogger = i2;
        boolean z = i % 2 != 0;
        int i3 = i2 + 73;
        AFKeystoreWrapper = i3 % NotificationCompat.FLAG_HIGH_PRIORITY;
        if (i3 % 2 != 0) {
            return z;
        }
        throw null;
    }

    @Override // com.appsflyer.internal.AFf1rSDK
    public final void getCurrencyIso4217Code(AFh1rSDK aFh1rSDK) {
        AFLogger = (AFKeystoreWrapper + 1) % NotificationCompat.FLAG_HIGH_PRIORITY;
    }

    @Override // com.appsflyer.internal.AFf1rSDK
    public final void getMediationNetwork(AFh1rSDK aFh1rSDK) {
        AFKeystoreWrapper = (AFLogger + pd.K0) % NotificationCompat.FLAG_HIGH_PRIORITY;
    }

    @Override // com.appsflyer.internal.AFf1rSDK
    public final void getMonetizationNetwork(AFh1rSDK aFh1rSDK) {
        int i = AFLogger + 21;
        AFKeystoreWrapper = i % NotificationCompat.FLAG_HIGH_PRIORITY;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFe1dSDK, com.appsflyer.internal.AFe1sSDK
    public final void getRevenue() {
        super.getRevenue();
        ResponseNetwork responseNetwork = ((AFe1dSDK) this).component1;
        if (responseNetwork != null) {
            AFKeystoreWrapper = (AFLogger + 11) % NotificationCompat.FLAG_HIGH_PRIORITY;
            if (responseNetwork.isSuccessful()) {
                int i = AFLogger + 117;
                AFKeystoreWrapper = i % NotificationCompat.FLAG_HIGH_PRIORITY;
                int i2 = i % 2;
                copy();
                if (i2 == 0) {
                    throw null;
                }
            }
        }
    }

    @Override // com.appsflyer.internal.AFf1rSDK
    public final void getRevenue(AFh1rSDK aFh1rSDK) {
        AFAdRevenueData(new Object[]{this, aFh1rSDK}, 2011239149, -2011239149, System.identityHashCode(this));
    }
}
