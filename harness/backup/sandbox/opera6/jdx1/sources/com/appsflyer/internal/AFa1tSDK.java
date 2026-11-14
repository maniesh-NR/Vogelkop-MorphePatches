package com.appsflyer.internal;

import ads_mobile_sdk.pd;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.StrictMode;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.appsflyer.AFAdRevenueData;
import com.appsflyer.AFInAppEventParameterName;
import com.appsflyer.AFInAppEventType;
import com.appsflyer.AFLogger;
import com.appsflyer.AFPurchaseDetails;
import com.appsflyer.AppsFlyerConsent;
import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerInAppPurchaseValidationCallback;
import com.appsflyer.AppsFlyerInAppPurchaseValidatorListener;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.deeplink.DeepLinkListener;
import com.appsflyer.deeplink.DeepLinkResult;
import com.appsflyer.internal.AFb1bSDK;
import com.appsflyer.internal.AFe1lSDK.AnonymousClass5;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.appsflyer.internal.platform_extension.PluginInfo;
import com.google.android.gms.common.GoogleApiAvailability;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AFa1tSDK extends AppsFlyerLib {
    private static int $10 = 0;
    private static int $11 = 1;
    static AppsFlyerInAppPurchaseValidatorListener AFAdRevenueData = null;
    private static int AFInAppEventParameterName = 0;
    private static int AFInAppEventType = 1;
    private static int[] AFKeystoreWrapper;
    private static AFa1tSDK areAllFieldsValid;
    public static final String getMonetizationNetwork;
    public static final String getRevenue;
    Application component1;
    private Map<Long, String> copydefault;
    private AFf1mSDK equals;
    private SharedPreferences hashCode;
    private boolean toString;
    public volatile AppsFlyerConversionListener getCurrencyIso4217Code = null;
    private long component2 = -1;
    long getMediationNetwork = -1;
    private long component3 = 5000;
    boolean component4 = false;

    @NonNull
    private final AFc1eSDK copy = new AFc1eSDK();

    /* renamed from: com.appsflyer.internal.AFa1tSDK$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] getRevenue;

        static {
            int[] iArr = new int[AppsFlyerProperties.EmailsCryptType.values().length];
            getRevenue = iArr;
            try {
                iArr[AppsFlyerProperties.EmailsCryptType.SHA256.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                getRevenue[AppsFlyerProperties.EmailsCryptType.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    class AFa1vSDK implements AFe1qSDK {
        public AFa1vSDK() {
        }

        private boolean getCurrencyIso4217Code() {
            return AFa1tSDK.this.getCurrencyIso4217Code != null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ Unit getRevenue() {
            AFa1tSDK aFa1tSDK = AFa1tSDK.this;
            AFa1tSDK.getMonetizationNetwork(new Object[]{aFa1tSDK, new AFh1kSDK()}, 974724333, -974724320, System.identityHashCode(aFa1tSDK));
            return Unit.a;
        }

        @Override // com.appsflyer.internal.AFe1qSDK
        public final void getCurrencyIso4217Code(AFe1sSDK<?> aFe1sSDK, AFe1rSDK aFe1rSDK) {
            JSONObject revenue;
            AFf1aSDK revenue2;
            if (!(aFe1sSDK instanceof AFf1rSDK)) {
                if (!(aFe1sSDK instanceof AFg1rSDK) || aFe1rSDK == AFe1rSDK.SUCCESS) {
                    return;
                }
                AFg1pSDK aFg1pSDK = new AFg1pSDK(AFa1tSDK.this.AFAdRevenueData());
                AFe1lSDK aFe1lSDKCopydefault = AFa1tSDK.this.AFAdRevenueData().copydefault();
                aFe1lSDKCopydefault.getRevenue.execute(aFe1lSDKCopydefault.new AnonymousClass5(aFg1pSDK));
                return;
            }
            AFf1rSDK aFf1rSDK = (AFf1rSDK) aFe1sSDK;
            boolean z = aFe1sSDK instanceof AFf1uSDK;
            if (z && getCurrencyIso4217Code()) {
                AFf1uSDK aFf1uSDK = (AFf1uSDK) aFe1sSDK;
                if (aFf1uSDK.getMediationNetwork == AFe1rSDK.SUCCESS || aFf1uSDK.getRevenue == 1) {
                    AFg1rSDK aFg1rSDK = new AFg1rSDK(aFf1uSDK, AFa1tSDK.this.AFAdRevenueData().component2());
                    AFe1lSDK aFe1lSDKCopydefault2 = AFa1tSDK.this.AFAdRevenueData().copydefault();
                    aFe1lSDKCopydefault2.getRevenue.execute(aFe1lSDKCopydefault2.new AnonymousClass5(aFg1rSDK));
                }
            }
            AFh1uSDK aFh1uSDKAfErrorLogForExcManagerOnly = AFa1tSDK.this.AFAdRevenueData().afErrorLogForExcManagerOnly();
            byte b = 0;
            if (aFh1uSDKAfErrorLogForExcManagerOnly != null && z) {
                aFh1uSDKAfErrorLogForExcManagerOnly.getRevenue((AFf1uSDK) aFe1sSDK, new f(this, b));
            }
            if (aFe1rSDK == AFe1rSDK.SUCCESS) {
                AFa1tSDK aFa1tSDK = AFa1tSDK.this;
                aFa1tSDK.getRevenue(aFa1tSDK.component1).getMediationNetwork("sentSuccessfully", "true");
                if (!(aFe1sSDK instanceof AFf1tSDK) && (revenue2 = new AFg1ySDK(AFa1tSDK.this.component1).getRevenue()) != null && revenue2.getMediationNetwork) {
                    String str = revenue2.getRevenue;
                    AFLogger.INSTANCE.d(AFg1cSDK.UNINSTALL, "Resending Uninstall token to AF servers: ".concat(String.valueOf(str)));
                    AFc1dSDK aFc1dSDKAFAdRevenueData = ((AFa1tSDK) AFa1tSDK.getMonetizationNetwork(new Object[0], -631580017, 631580017, (int) System.currentTimeMillis())).AFAdRevenueData();
                    AFf1tSDK aFf1tSDK = new AFf1tSDK(str, aFc1dSDKAFAdRevenueData);
                    AFe1lSDK aFe1lSDKCopydefault3 = aFc1dSDKAFAdRevenueData.copydefault();
                    aFe1lSDKCopydefault3.getRevenue.execute(aFe1lSDKCopydefault3.new AnonymousClass5(aFf1tSDK));
                }
                ResponseNetwork responseNetwork = ((AFe1dSDK) aFf1rSDK).component1;
                if (responseNetwork != null && (revenue = AFa1qSDK.getRevenue((String) responseNetwork.getBody())) != null) {
                    AFa1tSDK.this.component4 = revenue.optBoolean("send_background", false);
                }
                if (z) {
                    AFa1tSDK.this.getMediationNetwork = System.currentTimeMillis();
                }
            }
        }

        @Override // com.appsflyer.internal.AFe1qSDK
        public final void getMediationNetwork(AFe1sSDK<?> aFe1sSDK) {
        }

        @Override // com.appsflyer.internal.AFe1qSDK
        public final void getMonetizationNetwork(AFe1sSDK<?> aFe1sSDK) {
            if (aFe1sSDK instanceof AFf1uSDK) {
                AFa1tSDK.this.AFAdRevenueData().areAllFieldsValid().getCurrencyIso4217Code(((AFf1rSDK) aFe1sSDK).component2.component2);
            }
        }
    }

    class AFa1ySDK implements Runnable {
        private final AFh1rSDK getCurrencyIso4217Code;

        public AFa1ySDK(AFh1rSDK aFh1rSDK) {
            this.getCurrencyIso4217Code = aFh1rSDK;
        }

        @Override // java.lang.Runnable
        public final void run() {
            AFa1tSDK aFa1tSDK = AFa1tSDK.this;
            AFa1tSDK.getMonetizationNetwork(new Object[]{aFa1tSDK, this.getCurrencyIso4217Code}, 974724333, -974724320, System.identityHashCode(aFa1tSDK));
        }
    }

    static {
        areAllFieldsValid();
        getMonetizationNetwork = "348";
        getRevenue = "6.17";
        AFAdRevenueData = null;
        areAllFieldsValid = new AFa1tSDK();
        AFInAppEventType = (AFInAppEventParameterName + 83) % NotificationCompat.FLAG_HIGH_PRIORITY;
    }

    public AFa1tSDK() {
        AFAdRevenueData().v().AFAdRevenueData();
        AFAdRevenueData().v().getMonetizationNetwork();
        AFe1lSDK aFe1lSDKCopydefault = AFAdRevenueData().copydefault();
        aFe1lSDKCopydefault.AFAdRevenueData.add(new AFa1vSDK());
    }

    private static /* synthetic */ Object AFAdRevenueData(Object[] objArr) {
        String str = (String) objArr[0];
        try {
            if (new JSONObject(str).has("pid")) {
                AFInAppEventType = (AFInAppEventParameterName + pd.h1) % NotificationCompat.FLAG_HIGH_PRIORITY;
                getMonetizationNetwork(new Object[]{"preInstallName", str}, -692563571, 692563575, (int) System.currentTimeMillis());
                return null;
            }
            AFLogger.afWarnLog("Cannot set preinstall attribution data without a media source");
            int i = AFInAppEventType + 125;
            AFInAppEventParameterName = i % NotificationCompat.FLAG_HIGH_PRIORITY;
            if (i % 2 == 0) {
                return null;
            }
            throw null;
        } catch (JSONException e) {
            AFLogger.afErrorLog("Error parsing JSON for preinstall", e);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void AFAdRevenueData(com.appsflyer.internal.AFh1rSDK r5) {
        /*
            r4 = this;
            int r0 = com.appsflyer.internal.AFa1tSDK.AFInAppEventParameterName
            int r0 = r0 + 3
            int r1 = r0 % 128
            com.appsflyer.internal.AFa1tSDK.AFInAppEventType = r1
            int r0 = r0 % 2
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L16
            java.lang.String r0 = r5.areAllFieldsValid
            r3 = 19
            int r3 = r3 / r1
            if (r0 != 0) goto L1b
            goto L1a
        L16:
            java.lang.String r0 = r5.areAllFieldsValid
            if (r0 != 0) goto L1b
        L1a:
            r1 = r2
        L1b:
            boolean r0 = r4.getMediationNetwork()
            if (r0 == 0) goto L2f
            int r4 = com.appsflyer.internal.AFa1tSDK.AFInAppEventType
            int r4 = r4 + 87
            int r4 = r4 % 128
            com.appsflyer.internal.AFa1tSDK.AFInAppEventParameterName = r4
            java.lang.String r4 = "CustomerUserId not set, reporting is disabled"
            com.appsflyer.AFLogger.afInfoLog(r4, r2)
            return
        L2f:
            if (r1 == 0) goto L70
            com.appsflyer.AppsFlyerProperties r0 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r1 = "launchProtectEnabled"
            boolean r0 = r0.getBoolean(r1, r2)
            if (r0 == 0) goto L5d
            boolean r0 = r4.component1()
            if (r0 == 0) goto L62
            int r4 = com.appsflyer.internal.AFa1tSDK.AFInAppEventParameterName
            int r4 = r4 + 117
            int r4 = r4 % 128
            com.appsflyer.internal.AFa1tSDK.AFInAppEventType = r4
            com.appsflyer.attribution.AppsFlyerRequestListener r5 = r5.getCurrencyIso4217Code
            if (r5 == 0) goto L5c
            int r4 = r4 + 113
            int r4 = r4 % 128
            com.appsflyer.internal.AFa1tSDK.AFInAppEventParameterName = r4
            r4 = 10
            java.lang.String r0 = "Event timeout. Check 'minTimeBetweenSessions' param"
            r5.onError(r4, r0)
        L5c:
            return
        L5d:
            java.lang.String r0 = "Allowing multiple launches within a 5 second time window."
            com.appsflyer.AFLogger.afInfoLog(r0)
        L62:
            long r0 = java.lang.System.currentTimeMillis()
            r4.component2 = r0
            int r0 = com.appsflyer.internal.AFa1tSDK.AFInAppEventParameterName
            int r0 = r0 + 101
            int r0 = r0 % 128
            com.appsflyer.internal.AFa1tSDK.AFInAppEventType = r0
        L70:
            com.appsflyer.internal.AFc1dSDK r0 = r4.AFAdRevenueData()
            java.util.concurrent.ScheduledExecutorService r0 = r0.AFAdRevenueData()
            com.appsflyer.internal.AFa1tSDK$AFa1ySDK r1 = new com.appsflyer.internal.AFa1tSDK$AFa1ySDK
            r1.<init>(r5)
            r4 = 0
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            com.appsflyer.internal.AFj1dSDK.getMediationNetwork(r0, r1, r4, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1tSDK.AFAdRevenueData(com.appsflyer.internal.AFh1rSDK):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void AFAdRevenueData(AFi1fSDK aFi1fSDK) {
        AFf1wSDK aFf1wSDK = new AFf1wSDK(aFi1fSDK, AFAdRevenueData().getRevenue(), AFAdRevenueData());
        AFe1lSDK aFe1lSDKCopydefault = AFAdRevenueData().copydefault();
        aFe1lSDKCopydefault.getRevenue.execute(aFe1lSDKCopydefault.new AnonymousClass5(aFf1wSDK));
        int i = AFInAppEventType + pd.l1;
        AFInAppEventParameterName = i % NotificationCompat.FLAG_HIGH_PRIORITY;
        if (i % 2 != 0) {
            int i2 = 50 / 0;
        }
    }

    private static void AFAdRevenueData(String str) {
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFg1cSDK aFg1cSDK = AFg1cSDK.SDK_LIFECYCLE;
        StringBuilder sb = new StringBuilder("ERROR: AppsFlyer SDK is not initialized! The API call '");
        sb.append(str);
        sb.append("()' must be called after the 'init(String, AppsFlyerConversionListener)' API method, which should be called on the Application's onCreate.");
        aFLogger.w(aFg1cSDK, sb.toString());
        int i = AFInAppEventType + 115;
        AFInAppEventParameterName = i % NotificationCompat.FLAG_HIGH_PRIORITY;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object AFLogger(Object[] objArr) {
        AFa1tSDK aFa1tSDK = (AFa1tSDK) objArr[0];
        String[] strArr = (String[]) objArr[1];
        int i = AFInAppEventParameterName + 69;
        AFInAppEventType = i % NotificationCompat.FLAG_HIGH_PRIORITY;
        if (i % 2 != 0) {
            aFa1tSDK.AFAdRevenueData().copy().getMediationNetwork("setUserEmails", strArr);
            aFa1tSDK.setUserEmails(AppsFlyerProperties.EmailsCryptType.NONE, strArr);
            return null;
        }
        aFa1tSDK.AFAdRevenueData().copy().getMediationNetwork("setUserEmails", strArr);
        aFa1tSDK.setUserEmails(AppsFlyerProperties.EmailsCryptType.NONE, strArr);
        throw null;
    }

    private static void a(int[] iArr, int i, Object[] objArr) {
        AFk1kSDK aFk1kSDK = new AFk1kSDK();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length << 1];
        int[] iArr2 = AFKeystoreWrapper;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i2 = 0;
            while (i2 < length) {
                int i3 = ($11 + 113) % NotificationCompat.FLAG_HIGH_PRIORITY;
                $10 = i3;
                iArr3[i2] = (int) (iArr2[i2] ^ 3670241895213185600L);
                i2++;
                $11 = (i3 + 83) % NotificationCompat.FLAG_HIGH_PRIORITY;
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = AFKeystoreWrapper;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            for (int i4 = 0; i4 < length3; i4++) {
                iArr6[i4] = (int) (iArr5[i4] ^ 3670241895213185600L);
            }
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        aFk1kSDK.getCurrencyIso4217Code = 0;
        $10 = ($11 + 21) % NotificationCompat.FLAG_HIGH_PRIORITY;
        while (true) {
            int i5 = aFk1kSDK.getCurrencyIso4217Code;
            if (i5 >= iArr.length) {
                objArr[0] = new String(cArr2, 0, i);
                return;
            }
            int i6 = iArr[i5];
            char c = (char) (i6 >> 16);
            cArr[0] = c;
            char c2 = (char) i6;
            cArr[1] = c2;
            char c3 = (char) (iArr[i5 + 1] >> 16);
            cArr[2] = c3;
            char c4 = (char) iArr[i5 + 1];
            cArr[3] = c4;
            aFk1kSDK.AFAdRevenueData = (c << 16) + c2;
            aFk1kSDK.getMonetizationNetwork = (c3 << 16) + c4;
            AFk1kSDK.getMediationNetwork(iArr4);
            for (int i7 = 0; i7 < 16; i7++) {
                $11 = ($10 + 47) % NotificationCompat.FLAG_HIGH_PRIORITY;
                int i8 = aFk1kSDK.AFAdRevenueData ^ iArr4[i7];
                aFk1kSDK.AFAdRevenueData = i8;
                int iAFAdRevenueData = AFk1kSDK.AFAdRevenueData(i8) ^ aFk1kSDK.getMonetizationNetwork;
                int i9 = aFk1kSDK.AFAdRevenueData;
                aFk1kSDK.AFAdRevenueData = iAFAdRevenueData;
                aFk1kSDK.getMonetizationNetwork = i9;
            }
            int i10 = aFk1kSDK.AFAdRevenueData;
            int i11 = aFk1kSDK.getMonetizationNetwork;
            aFk1kSDK.AFAdRevenueData = i11;
            aFk1kSDK.getMonetizationNetwork = i10;
            int i12 = i10 ^ iArr4[16];
            aFk1kSDK.getMonetizationNetwork = i12;
            int i13 = i11 ^ iArr4[17];
            aFk1kSDK.AFAdRevenueData = i13;
            cArr[0] = (char) (i13 >>> 16);
            cArr[1] = (char) i13;
            cArr[2] = (char) (i12 >>> 16);
            cArr[3] = (char) i12;
            AFk1kSDK.getMediationNetwork(iArr4);
            int i14 = aFk1kSDK.getCurrencyIso4217Code;
            cArr2[i14 << 1] = cArr[0];
            cArr2[(i14 << 1) + 1] = cArr[1];
            cArr2[(i14 << 1) + 2] = cArr[2];
            cArr2[(i14 << 1) + 3] = cArr[3];
            aFk1kSDK.getCurrencyIso4217Code = i14 + 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object areAllFieldsValid(java.lang.Object[] r5) {
        /*
            r0 = 0
            r1 = r5[r0]
            com.appsflyer.internal.AFa1tSDK r1 = (com.appsflyer.internal.AFa1tSDK) r1
            r2 = 1
            r5 = r5[r2]
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            int r3 = com.appsflyer.internal.AFa1tSDK.AFInAppEventParameterName
            int r3 = r3 + 29
            int r4 = r3 % 128
            com.appsflyer.internal.AFa1tSDK.AFInAppEventType = r4
            int r3 = r3 % 2
            java.lang.String r4 = "setDisableAdvertisingIdentifiers: "
            if (r3 != 0) goto L2d
            java.lang.String r3 = java.lang.String.valueOf(r5)
            java.lang.String r3 = r4.concat(r3)
            com.appsflyer.AFLogger.afDebugLog(r3)
            r3 = 66
            int r3 = r3 / r0
            if (r5 != 0) goto L3b
            goto L3a
        L2d:
            java.lang.String r3 = java.lang.String.valueOf(r5)
            java.lang.String r3 = r4.concat(r3)
            com.appsflyer.AFLogger.afDebugLog(r3)
            if (r5 != 0) goto L3b
        L3a:
            r0 = r2
        L3b:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            com.appsflyer.internal.AFb1jSDK.getRevenue = r0
            com.appsflyer.internal.AFc1dSDK r0 = r1.AFAdRevenueData()
            com.appsflyer.internal.AFc1kSDK r2 = r0.afInfoLog()
            r2.areAllFieldsValid = r5
            r2 = 0
            if (r5 == 0) goto L55
            com.appsflyer.internal.AFc1kSDK r5 = r0.afInfoLog()
            r5.component3 = r2
            return r2
        L55:
            com.appsflyer.internal.AFe1lSDK r5 = r0.copydefault()
            com.appsflyer.internal.AFe1eSDK r0 = new com.appsflyer.internal.AFe1eSDK
            com.appsflyer.internal.AFc1dSDK r1 = r1.AFAdRevenueData()
            r0.<init>(r1)
            java.util.concurrent.Executor r1 = r5.getRevenue
            com.appsflyer.internal.AFe1lSDK$5 r3 = new com.appsflyer.internal.AFe1lSDK$5
            r3.<init>(r0)
            r1.execute(r3)
            int r5 = com.appsflyer.internal.AFa1tSDK.AFInAppEventParameterName
            int r5 = r5 + 57
            int r0 = r5 % 128
            com.appsflyer.internal.AFa1tSDK.AFInAppEventType = r0
            int r5 = r5 % 2
            if (r5 == 0) goto L79
            return r2
        L79:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1tSDK.areAllFieldsValid(java.lang.Object[]):java.lang.Object");
    }

    public static void areAllFieldsValid() {
        AFKeystoreWrapper = new int[]{1173848566, -581264425, 1049631762, -184971919, -1510845523, 293648529, -317712227, 1299495101, -345507000, 2098071530, -62356939, -1430410937, 823748430, 809610160, -1818352164, -849605125, 1727658104, 1621127117};
    }

    public static synchronized SharedPreferences c_(Context context) {
        SharedPreferences sharedPreferences;
        AFInAppEventParameterName = (AFInAppEventType + 63) % NotificationCompat.FLAG_HIGH_PRIORITY;
        if (((AFa1tSDK) getMonetizationNetwork(new Object[0], -631580017, 631580017, (int) System.currentTimeMillis())).hashCode == null) {
            StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
            try {
                ((AFa1tSDK) getMonetizationNetwork(new Object[0], -631580017, 631580017, (int) System.currentTimeMillis())).hashCode = context.getApplicationContext().getSharedPreferences("appsflyer-data", 0);
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                AFInAppEventParameterName = (AFInAppEventType + 35) % NotificationCompat.FLAG_HIGH_PRIORITY;
            } catch (Throwable th) {
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                throw th;
            }
        }
        sharedPreferences = ((AFa1tSDK) getMonetizationNetwork(new Object[0], -631580017, 631580017, (int) System.currentTimeMillis())).hashCode;
        AFInAppEventParameterName = (AFInAppEventType + pd.K0) % NotificationCompat.FLAG_HIGH_PRIORITY;
        return sharedPreferences;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
    
        if ((r3 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if ((r4 instanceof android.app.Activity) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        if ((r4 instanceof android.app.Activity) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001a, code lost:
    
        r0 = new com.appsflyer.internal.AFh1qSDK((android.app.Activity) r4, AFAdRevenueData().w());
        r3 = com.appsflyer.internal.AFa1tSDK.AFInAppEventType + ads_mobile_sdk.pd.W0;
        com.appsflyer.internal.AFa1tSDK.AFInAppEventParameterName = r3 % androidx.core.app.NotificationCompat.FLAG_HIGH_PRIORITY;
     */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.appsflyer.internal.AFh1qSDK component1(android.content.Context r4) {
        /*
            r3 = this;
            int r0 = com.appsflyer.internal.AFa1tSDK.AFInAppEventType
            int r0 = r0 + 9
            int r1 = r0 % 128
            com.appsflyer.internal.AFa1tSDK.AFInAppEventParameterName = r1
            int r0 = r0 % 2
            r1 = 0
            if (r0 == 0) goto L16
            boolean r0 = r4 instanceof android.app.Activity
            r2 = 87
            int r2 = r2 / 0
            if (r0 == 0) goto L37
            goto L1a
        L16:
            boolean r0 = r4 instanceof android.app.Activity
            if (r0 == 0) goto L37
        L1a:
            com.appsflyer.internal.AFh1qSDK r0 = new com.appsflyer.internal.AFh1qSDK
            android.app.Activity r4 = (android.app.Activity) r4
            com.appsflyer.internal.AFc1dSDK r3 = r3.AFAdRevenueData()
            com.appsflyer.internal.AFi1kSDK r3 = r3.w()
            r0.<init>(r4, r3)
            int r3 = com.appsflyer.internal.AFa1tSDK.AFInAppEventType
            int r3 = r3 + 105
            int r4 = r3 % 128
            com.appsflyer.internal.AFa1tSDK.AFInAppEventParameterName = r4
            int r3 = r3 % 2
            if (r3 != 0) goto L36
            return r0
        L36:
            throw r1
        L37:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1tSDK.component1(android.content.Context):com.appsflyer.internal.AFh1qSDK");
    }

    private static /* synthetic */ Object component1(Object[] objArr) throws PackageManager.NameNotFoundException {
        Context context = (Context) objArr[0];
        AFInAppEventParameterName = (AFInAppEventType + pd.W0) % NotificationCompat.FLAG_HIGH_PRIORITY;
        try {
            if (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context) == 0) {
                int i = AFInAppEventParameterName + 35;
                AFInAppEventType = i % NotificationCompat.FLAG_HIGH_PRIORITY;
                return i % 2 == 0 ? Boolean.FALSE : Boolean.TRUE;
            }
        } catch (Throwable th) {
            AFLogger.afErrorLog("WARNING:  Google play services is unavailable. ", th);
        }
        try {
            context.getPackageManager().getPackageInfo("com.google.android.gms", 0);
            return Boolean.TRUE;
        } catch (PackageManager.NameNotFoundException e) {
            AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "WARNING:  Google Play Services is unavailable. ", e);
            return Boolean.FALSE;
        }
    }

    private boolean component1() {
        return ((Boolean) getMonetizationNetwork(new Object[]{this}, -1610644480, 1610644503, System.identityHashCode(this))).booleanValue();
    }

    private static /* synthetic */ Object component2(Object[] objArr) {
        AFa1tSDK aFa1tSDK = (AFa1tSDK) objArr[0];
        AppsFlyerProperties.EmailsCryptType emailsCryptType = (AppsFlyerProperties.EmailsCryptType) objArr[1];
        String[] strArr = (String[]) objArr[2];
        ArrayList arrayList = new ArrayList(strArr.length + 1);
        arrayList.add(emailsCryptType.toString());
        arrayList.addAll(Arrays.asList(strArr));
        aFa1tSDK.AFAdRevenueData().copy().getMediationNetwork("setUserEmails", (String[]) arrayList.toArray(new String[strArr.length + 1]));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.EMAIL_CRYPT_TYPE, emailsCryptType.getValue());
        HashMap map = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        String str = null;
        for (String str2 : strArr) {
            AFInAppEventType = (AFInAppEventParameterName + 35) % NotificationCompat.FLAG_HIGH_PRIORITY;
            if (AnonymousClass3.getRevenue[emailsCryptType.ordinal()] != 2) {
                arrayList2.add(AFj1cSDK.getMonetizationNetwork(str2));
                AFInAppEventParameterName = (AFInAppEventType + pd.l1) % NotificationCompat.FLAG_HIGH_PRIORITY;
                str = "sha256_el_arr";
            } else {
                arrayList2.add(str2);
                str = "plain_el_arr";
            }
        }
        map.put(str, arrayList2);
        AppsFlyerProperties.getInstance().setUserEmails(new JSONObject(map).toString());
        int i = AFInAppEventParameterName + 87;
        AFInAppEventType = i % NotificationCompat.FLAG_HIGH_PRIORITY;
        if (i % 2 != 0) {
            return null;
        }
        throw null;
    }

    private void component2() {
        int i = AFInAppEventType + 37;
        AFInAppEventParameterName = i % NotificationCompat.FLAG_HIGH_PRIORITY;
        try {
            if (i % 2 != 0) {
                AFAdRevenueData().force();
                throw null;
            }
            final AFi1fSDK aFi1fSDKForce = AFAdRevenueData().force();
            if (aFi1fSDKForce != null) {
                AFInAppEventParameterName = (AFInAppEventType + 77) % NotificationCompat.FLAG_HIGH_PRIORITY;
                if (aFi1fSDKForce.getMediationNetwork()) {
                    aFi1fSDKForce.AFAdRevenueData(new AFi1cSDK() { // from class: com.appsflyer.internal.c
                        @Override // com.appsflyer.internal.AFi1cSDK
                        public final void onRequestFinished() {
                            this.a.AFAdRevenueData(aFi1fSDKForce);
                        }
                    });
                }
            }
        } catch (Throwable th) {
            AFLogger.afErrorLogForExcManagerOnly("Error at attempt to request PIA token", th);
            AFLogger.afRDLog("Get PIA token failed with exception:".concat(String.valueOf(th)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static /* synthetic */ Object component3(Object[] objArr) {
        String str;
        Object[] objArr2 = 0;
        final AFa1tSDK aFa1tSDK = (AFa1tSDK) objArr[0];
        final byte b = 1;
        String str2 = (String) objArr[1];
        AppsFlyerConversionListener appsFlyerConversionListener = (AppsFlyerConversionListener) objArr[2];
        Context context = (Context) objArr[3];
        int i = AFInAppEventType + 117;
        AFInAppEventParameterName = i % NotificationCompat.FLAG_HIGH_PRIORITY;
        if (i % 2 != 0) {
            boolean z = aFa1tSDK.toString;
            throw null;
        }
        if (!aFa1tSDK.toString) {
            aFa1tSDK.toString = true;
            aFa1tSDK.AFAdRevenueData().registerClient().AFAdRevenueData(str2);
            if (context != null) {
                AFInAppEventType = (AFInAppEventParameterName + 25) % NotificationCompat.FLAG_HIGH_PRIORITY;
                aFa1tSDK.getMediationNetwork(context);
                Application applicationO_ = AFj1iSDK.O_(context);
                if (applicationO_ != null) {
                    aFa1tSDK.component1 = applicationO_;
                    ExecutorService monetizationNetwork = aFa1tSDK.AFAdRevenueData().getMonetizationNetwork();
                    final Object[] objArr3 = objArr2 == true ? 1 : 0;
                    monetizationNetwork.execute(new Runnable(aFa1tSDK) { // from class: com.appsflyer.internal.a
                        public final /* synthetic */ AFa1tSDK b;

                        {
                            this.b = aFa1tSDK;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b2 = objArr3;
                            AFa1tSDK aFa1tSDK2 = this.b;
                            switch (b2) {
                                case 0:
                                    aFa1tSDK2.equals();
                                    break;
                                default:
                                    aFa1tSDK2.copydefault();
                                    break;
                            }
                        }
                    });
                    aFa1tSDK.AFAdRevenueData().areAllFieldsValid().getMediationNetwork = System.currentTimeMillis();
                    AFe1lSDK aFe1lSDKCopydefault = aFa1tSDK.AFAdRevenueData().copydefault();
                    aFe1lSDKCopydefault.getRevenue.execute(aFe1lSDKCopydefault.new AnonymousClass5(new AFe1eSDK(aFa1tSDK.AFAdRevenueData())));
                    AFi1tSDK aFi1tSDKI = aFa1tSDK.AFAdRevenueData().i();
                    aFi1tSDKI.getMediationNetwork = Build.VERSION.SDK_INT >= 31 ? new AFi1sSDK(aFi1tSDKI.getCurrencyIso4217Code) : new AFi1qSDK(aFi1tSDKI.getCurrencyIso4217Code);
                    aFa1tSDK.AFAdRevenueData().afRDLog().AFAdRevenueData(new b(aFa1tSDK));
                    aFa1tSDK.AFAdRevenueData().component1().getCurrencyIso4217Code(aFa1tSDK.getMonetizationNetwork());
                    AFj1sSDK aFj1sSDKAFLogger = aFa1tSDK.AFAdRevenueData().AFLogger();
                    Runnable runnable = new Runnable(aFa1tSDK) { // from class: com.appsflyer.internal.a
                        public final /* synthetic */ AFa1tSDK b;

                        {
                            this.b = aFa1tSDK;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b2 = b;
                            AFa1tSDK aFa1tSDK2 = this.b;
                            switch (b2) {
                                case 0:
                                    aFa1tSDK2.equals();
                                    break;
                                default:
                                    aFa1tSDK2.copydefault();
                                    break;
                            }
                        }
                    };
                    AFi1aSDK aFi1aSDKAFAdRevenueData = aFj1sSDKAFLogger.AFAdRevenueData(runnable);
                    Runnable runnableAFAdRevenueData = aFj1sSDKAFLogger.AFAdRevenueData(aFi1aSDKAFAdRevenueData, runnable);
                    aFj1sSDKAFLogger.getMediationNetwork(aFi1aSDKAFAdRevenueData);
                    aFj1sSDKAFLogger.getMediationNetwork(new AFj1oSDK(aFj1sSDKAFLogger.getMediationNetwork.getRevenue(), runnableAFAdRevenueData));
                    aFj1sSDKAFLogger.getMediationNetwork(new AFj1vSDK(runnableAFAdRevenueData, aFj1sSDKAFLogger.getMediationNetwork, new AFj1wSDK()));
                    aFj1sSDKAFLogger.getMediationNetwork(new AFj1tSDK(runnableAFAdRevenueData, aFj1sSDKAFLogger.getMediationNetwork));
                    aFj1sSDKAFLogger.getMediationNetwork(new AFj1uSDK(aFj1sSDKAFLogger.getMediationNetwork.getMonetizationNetwork(), aFj1sSDKAFLogger.getMediationNetwork.getRevenue(), runnableAFAdRevenueData));
                    aFj1sSDKAFLogger.getMediationNetwork(runnableAFAdRevenueData);
                    if (!aFj1sSDKAFLogger.getMonetizationNetwork()) {
                        Context context2 = aFj1sSDKAFLogger.getMediationNetwork.AFInAppEventType().getMonetizationNetwork;
                        AFc1dSDK aFc1dSDK = aFj1sSDKAFLogger.getMediationNetwork;
                        List<ResolveInfo> listQueryIntentContentProviders = context2.getPackageManager().queryIntentContentProviders(new Intent("com.appsflyer.referrer.INSTALL_PROVIDER"), 0);
                        if (listQueryIntentContentProviders != null && !listQueryIntentContentProviders.isEmpty()) {
                            ArrayList arrayList = new ArrayList();
                            Iterator<ResolveInfo> it = listQueryIntentContentProviders.iterator();
                            while (it.hasNext()) {
                                AFInAppEventParameterName = (AFInAppEventType + 59) % NotificationCompat.FLAG_HIGH_PRIORITY;
                                ProviderInfo providerInfo = it.next().providerInfo;
                                if (providerInfo != null) {
                                    arrayList.add(new AFj1rSDK(providerInfo, runnableAFAdRevenueData, aFc1dSDK));
                                } else {
                                    AFLogger.INSTANCE.w(AFg1cSDK.PREINSTALL, "com.appsflyer.referrer.INSTALL_PROVIDER Action is set for non ContentProvider component");
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                aFj1sSDKAFLogger.getCurrencyIso4217Code.addAll(arrayList);
                                AFLogger aFLogger = AFLogger.INSTANCE;
                                AFg1cSDK aFg1cSDK = AFg1cSDK.PREINSTALL;
                                StringBuilder sb = new StringBuilder("Detected ");
                                sb.append(arrayList.size());
                                sb.append(" valid preinstall provider(s)");
                                aFLogger.d(aFg1cSDK, sb.toString());
                            }
                        }
                    }
                    for (AFj1qSDK aFj1qSDK : aFj1sSDKAFLogger.getRevenue()) {
                        AFInAppEventType = (AFInAppEventParameterName + 29) % NotificationCompat.FLAG_HIGH_PRIORITY;
                        aFj1qSDK.getRevenue(aFj1sSDKAFLogger.getMediationNetwork.AFInAppEventType().getMonetizationNetwork);
                    }
                    aFa1tSDK.AFAdRevenueData().registerClient().AFAdRevenueData(aFa1tSDK.AFAdRevenueData().getRevenue());
                    if (aFa1tSDK.AFAdRevenueData().afWarnLog().getCurrencyIso4217Code()) {
                        aFa1tSDK.AFAdRevenueData().afWarnLog().getMediationNetwork();
                    }
                }
            } else {
                AFLogger.INSTANCE.w(AFg1cSDK.REFERRER, "context is null, Google Install Referrer will be not initialized");
            }
            AFd1pSDK aFd1pSDKCopy = aFa1tSDK.AFAdRevenueData().copy();
            if (appsFlyerConversionListener == null) {
                str = "null";
            } else {
                AFInAppEventParameterName = (AFInAppEventType + pd.T0) % NotificationCompat.FLAG_HIGH_PRIORITY;
                str = "conversionDataListener";
            }
            aFd1pSDKCopy.getMediationNetwork("init", str2, str);
            AFLogger.INSTANCE.force(AFg1cSDK.GENERAL, "Initializing AppsFlyer SDK: (v6.17.0." + getMonetizationNetwork + ")");
            aFa1tSDK.getCurrencyIso4217Code = appsFlyerConversionListener;
            return aFa1tSDK;
        }
        return aFa1tSDK;
    }

    @NonNull
    private AFj1qSDK[] component3() {
        int i = AFInAppEventType + 121;
        AFInAppEventParameterName = i % NotificationCompat.FLAG_HIGH_PRIORITY;
        int i2 = i % 2;
        AFj1sSDK aFj1sSDKAFLogger = AFAdRevenueData().AFLogger();
        if (i2 != 0) {
            aFj1sSDKAFLogger.getRevenue();
            throw null;
        }
        AFj1qSDK[] revenue = aFj1sSDKAFLogger.getRevenue();
        int i3 = AFInAppEventParameterName + 65;
        AFInAppEventType = i3 % NotificationCompat.FLAG_HIGH_PRIORITY;
        if (i3 % 2 != 0) {
            return revenue;
        }
        throw null;
    }

    private static /* synthetic */ Object component4(Object[] objArr) {
        AFa1tSDK aFa1tSDK = (AFa1tSDK) objArr[0];
        String str = (String) objArr[1];
        Map<String, String> map = (Map) objArr[2];
        AFInAppEventType = (AFInAppEventParameterName + 123) % NotificationCompat.FLAG_HIGH_PRIORITY;
        AFa1oSDK aFa1oSDKD = aFa1tSDK.AFAdRevenueData().d();
        aFa1oSDKD.getCurrencyIso4217Code = str;
        aFa1oSDKD.getRevenue = map;
        int i = AFInAppEventParameterName + pd.K0;
        AFInAppEventType = i % NotificationCompat.FLAG_HIGH_PRIORITY;
        if (i % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static void component4(Context context) {
        List listAsList;
        int i = AFInAppEventParameterName + 5;
        AFInAppEventType = i % NotificationCompat.FLAG_HIGH_PRIORITY;
        try {
            if (i % 2 == 0) {
                listAsList = Arrays.asList(context.getPackageManager().getPackageInfo(context.getPackageName(), 13800).requestedPermissions);
                if (!listAsList.contains("android.permission.INTERNET")) {
                    AFLogger.INSTANCE.w(AFg1cSDK.GENERAL, "Permission android.permission.INTERNET is missing in the AndroidManifest.xml");
                }
            } else {
                listAsList = Arrays.asList(context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions);
                if (!listAsList.contains("android.permission.INTERNET")) {
                    AFLogger.INSTANCE.w(AFg1cSDK.GENERAL, "Permission android.permission.INTERNET is missing in the AndroidManifest.xml");
                }
            }
            if (!listAsList.contains("android.permission.ACCESS_NETWORK_STATE")) {
                int i2 = AFInAppEventType + 23;
                AFInAppEventParameterName = i2 % NotificationCompat.FLAG_HIGH_PRIORITY;
                if (i2 % 2 != 0) {
                    AFLogger.INSTANCE.w(AFg1cSDK.GENERAL, "Permission android.permission.ACCESS_NETWORK_STATE is missing in the AndroidManifest.xml");
                    throw null;
                }
                AFLogger.INSTANCE.w(AFg1cSDK.GENERAL, "Permission android.permission.ACCESS_NETWORK_STATE is missing in the AndroidManifest.xml");
            }
            if (Build.VERSION.SDK_INT > 32 && !listAsList.contains("com.google.android.gms.permission.AD_ID")) {
                AFLogger.INSTANCE.w(AFg1cSDK.GENERAL, "Permission com.google.android.gms.permission.AD_ID is missing in the AndroidManifest.xml");
                AFInAppEventType = (AFInAppEventParameterName + 71) % NotificationCompat.FLAG_HIGH_PRIORITY;
            }
            AFInAppEventParameterName = (AFInAppEventType + 125) % NotificationCompat.FLAG_HIGH_PRIORITY;
        } catch (Exception e) {
            AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "Exception while validation permissions. ", e);
        }
    }

    private static /* synthetic */ Object copy(Object[] objArr) {
        AFa1tSDK aFa1tSDK = (AFa1tSDK) objArr[0];
        Context context = (Context) objArr[1];
        String str = (String) objArr[2];
        Map<String, Object> map = (Map) objArr[3];
        AFh1fSDK aFh1fSDK = new AFh1fSDK();
        aFh1fSDK.areAllFieldsValid = str;
        aFh1fSDK.getMonetizationNetwork = map;
        aFa1tSDK.getMonetizationNetwork(aFh1fSDK, aFa1tSDK.component1(context));
        int i = AFInAppEventParameterName + 15;
        AFInAppEventType = i % NotificationCompat.FLAG_HIGH_PRIORITY;
        if (i % 2 == 0) {
            int i2 = 49 / 0;
        }
        return null;
    }

    private static void copy() {
        int i = AFInAppEventType + 55;
        AFInAppEventParameterName = i % NotificationCompat.FLAG_HIGH_PRIORITY;
        if (i % 2 == 0) {
            AFLogger.INSTANCE.w(AFg1cSDK.SDK_LIFECYCLE, "ERROR: AppsFlyer SDK is not initialized! You must provide AppsFlyer Dev-Key either in the 'init' API method (should be called on Application's onCreate),or in the start() API (should be called on Activity's onCreate).");
        } else {
            AFLogger.INSTANCE.w(AFg1cSDK.SDK_LIFECYCLE, "ERROR: AppsFlyer SDK is not initialized! You must provide AppsFlyer Dev-Key either in the 'init' API method (should be called on Application's onCreate),or in the start() API (should be called on Activity's onCreate).");
            throw null;
        }
    }

    private static /* synthetic */ Object copydefault(Object[] objArr) {
        AFa1tSDK aFa1tSDK = (AFa1tSDK) objArr[0];
        int i = AFInAppEventParameterName + 1;
        AFInAppEventType = i % NotificationCompat.FLAG_HIGH_PRIORITY;
        if (i % 2 == 0) {
            aFa1tSDK.AFAdRevenueData().afDebugLog().AFAdRevenueData();
            throw null;
        }
        aFa1tSDK.AFAdRevenueData().afDebugLog().AFAdRevenueData();
        AFInAppEventParameterName = (AFInAppEventType + 17) % NotificationCompat.FLAG_HIGH_PRIORITY;
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void copydefault() {
        getMonetizationNetwork(new Object[]{this, new AFh1kSDK()}, 974724333, -974724320, System.identityHashCode(this));
        int i = AFInAppEventType + 71;
        AFInAppEventParameterName = i % NotificationCompat.FLAG_HIGH_PRIORITY;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d_(Context context, Intent intent) {
        getMonetizationNetwork(new Object[]{this, context, intent}, 507699176, -507699170, System.identityHashCode(this));
    }

    private static /* synthetic */ Object equals(Object[] objArr) {
        AFa1tSDK aFa1tSDK = (AFa1tSDK) objArr[0];
        AFInAppEventParameterName = (AFInAppEventType + 115) % NotificationCompat.FLAG_HIGH_PRIORITY;
        boolean zAFAdRevenueData = aFa1tSDK.AFAdRevenueData().registerClient().AFAdRevenueData();
        int i = AFInAppEventType + 9;
        AFInAppEventParameterName = i % NotificationCompat.FLAG_HIGH_PRIORITY;
        if (i % 2 == 0) {
            return Boolean.valueOf(zAFAdRevenueData);
        }
        int i2 = 9 / 0;
        return Boolean.valueOf(zAFAdRevenueData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void equals() {
        AFInAppEventType = (AFInAppEventParameterName + 27) % NotificationCompat.FLAG_HIGH_PRIORITY;
        AFAdRevenueData().AFInAppEventParameterName().AFAdRevenueData();
        component2();
        int i = AFInAppEventType + 17;
        AFInAppEventParameterName = i % NotificationCompat.FLAG_HIGH_PRIORITY;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private static int getCurrencyIso4217Code(AFc1qSDK aFc1qSDK, boolean z) {
        AFInAppEventType = (AFInAppEventParameterName + 125) % NotificationCompat.FLAG_HIGH_PRIORITY;
        int monetizationNetwork = getMonetizationNetwork(aFc1qSDK, "appsFlyerInAppEventCount", z);
        int i = AFInAppEventParameterName + 123;
        AFInAppEventType = i % NotificationCompat.FLAG_HIGH_PRIORITY;
        if (i % 2 != 0) {
            return monetizationNetwork;
        }
        throw null;
    }

    public static AFa1tSDK getCurrencyIso4217Code() {
        return (AFa1tSDK) getMonetizationNetwork(new Object[0], -631580017, 631580017, (int) System.currentTimeMillis());
    }

    private static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr) {
        String str = (String) objArr[0];
        String str2 = (String) objArr[1];
        int i = AFInAppEventParameterName + 1;
        AFInAppEventType = i % NotificationCompat.FLAG_HIGH_PRIORITY;
        if (i % 2 == 0) {
            AppsFlyerProperties.getInstance().set(str, str2);
            int i2 = 44 / 0;
        } else {
            AppsFlyerProperties.getInstance().set(str, str2);
        }
        AFInAppEventType = (AFInAppEventParameterName + 81) % NotificationCompat.FLAG_HIGH_PRIORITY;
        return null;
    }

    private void getCurrencyIso4217Code(Context context, AFh1xSDK aFh1xSDK) {
        getMediationNetwork(context);
        AFh1vSDK aFh1vSDKAreAllFieldsValid = AFAdRevenueData().areAllFieldsValid();
        AFh1tSDK revenue = AFh1tSDK.getRevenue(context);
        if (aFh1vSDKAreAllFieldsValid.getCurrencyIso4217Code()) {
            int i = AFInAppEventType + 5;
            AFInAppEventParameterName = i % NotificationCompat.FLAG_HIGH_PRIORITY;
            int i2 = i % 2;
            aFh1vSDKAreAllFieldsValid.AFAdRevenueData.put("api_name", aFh1xSDK.toString());
            aFh1vSDKAreAllFieldsValid.getMediationNetwork(revenue);
            if (i2 != 0) {
                throw null;
            }
        }
        aFh1vSDKAreAllFieldsValid.AFAdRevenueData();
        AFInAppEventParameterName = (AFInAppEventType + 19) % NotificationCompat.FLAG_HIGH_PRIORITY;
    }

    private void getCurrencyIso4217Code(Context context, String str) {
        getMonetizationNetwork(new Object[]{this, context, str}, 1659672083, -1659672066, System.identityHashCode(this));
    }

    private void getCurrencyIso4217Code(Context context, String str, Map<String, Object> map) {
        getMonetizationNetwork(new Object[]{this, context, str, map}, 1732368696, -1732368678, System.identityHashCode(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void getCurrencyIso4217Code(AFf1nSDK aFf1nSDK) {
        AFInAppEventParameterName = (AFInAppEventType + 1) % NotificationCompat.FLAG_HIGH_PRIORITY;
        AFc1dSDK aFc1dSDKAFAdRevenueData = AFAdRevenueData();
        if (aFf1nSDK == AFf1nSDK.SUCCESS) {
            int i = AFInAppEventParameterName + 75;
            AFInAppEventType = i % NotificationCompat.FLAG_HIGH_PRIORITY;
            if (i % 2 == 0) {
                aFc1dSDKAFAdRevenueData.afRDLog().getCurrencyIso4217Code();
                throw null;
            }
            aFc1dSDKAFAdRevenueData.afRDLog().getCurrencyIso4217Code();
        }
        if (aFc1dSDKAFAdRevenueData.copy().getMonetizationNetwork()) {
            aFc1dSDKAFAdRevenueData.v().AFAdRevenueData();
        } else {
            AFInAppEventParameterName = (AFInAppEventType + 69) % NotificationCompat.FLAG_HIGH_PRIORITY;
            aFc1dSDKAFAdRevenueData.v().getMediationNetwork();
        }
    }

    private static void getCurrencyIso4217Code(@NonNull AFh1rSDK aFh1rSDK, @Nullable AFh1qSDK aFh1qSDK) {
        int i = (AFInAppEventType + 73) % NotificationCompat.FLAG_HIGH_PRIORITY;
        AFInAppEventParameterName = i;
        if (aFh1qSDK != null) {
            int i2 = i + 79;
            AFInAppEventType = i2 % NotificationCompat.FLAG_HIGH_PRIORITY;
            if (i2 % 2 != 0) {
                aFh1rSDK.getMediationNetwork = aFh1qSDK.getCurrencyIso4217Code;
                aFh1rSDK.component4 = aFh1qSDK.getMediationNetwork;
            } else {
                aFh1rSDK.getMediationNetwork = aFh1qSDK.getCurrencyIso4217Code;
                aFh1rSDK.component4 = aFh1qSDK.getMediationNetwork;
                throw null;
            }
        }
    }

    private static void getCurrencyIso4217Code(String str, String str2) {
        getMonetizationNetwork(new Object[]{str, str2}, -692563571, 692563575, (int) System.currentTimeMillis());
    }

    private static void getCurrencyIso4217Code(String str, boolean z) {
        int i = AFInAppEventParameterName + 19;
        AFInAppEventType = i % NotificationCompat.FLAG_HIGH_PRIORITY;
        if (i % 2 != 0) {
            AppsFlyerProperties.getInstance().set(str, z);
        } else {
            AppsFlyerProperties.getInstance().set(str, z);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void getCurrencyIso4217Code(java.util.Map<java.lang.String, java.lang.Object> r4) {
        /*
            r3 = this;
            com.appsflyer.AppsFlyerProperties r0 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r1 = "collectAndroidIdForceByUser"
            r2 = 0
            boolean r0 = r0.getBoolean(r1, r2)
            if (r0 != 0) goto L8c
            com.appsflyer.AppsFlyerProperties r0 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r1 = "collectIMEIForceByUser"
            boolean r0 = r0.getBoolean(r1, r2)
            if (r0 != 0) goto L8c
            java.lang.String r0 = "advertiserId"
            java.lang.Object r0 = r4.get(r0)
            if (r0 == 0) goto L8c
            int r0 = com.appsflyer.internal.AFa1tSDK.AFInAppEventType
            int r0 = r0 + 41
            int r0 = r0 % 128
            com.appsflyer.internal.AFa1tSDK.AFInAppEventParameterName = r0
            com.appsflyer.internal.AFc1dSDK r0 = r3.AFAdRevenueData()     // Catch: java.lang.Exception -> L86
            com.appsflyer.internal.AFc1kSDK r0 = r0.afInfoLog()     // Catch: java.lang.Exception -> L86
            java.lang.String r0 = r0.AFAdRevenueData     // Catch: java.lang.Exception -> L86
            boolean r0 = com.appsflyer.internal.AFk1ySDK.getMediationNetwork(r0)     // Catch: java.lang.Exception -> L86
            if (r0 == 0) goto L66
            int r0 = com.appsflyer.internal.AFa1tSDK.AFInAppEventType
            int r0 = r0 + 29
            int r1 = r0 % 128
            com.appsflyer.internal.AFa1tSDK.AFInAppEventParameterName = r1
            int r0 = r0 % 2
            java.lang.String r1 = "android_id"
            if (r0 == 0) goto L53
            java.lang.Object r0 = r4.remove(r1)     // Catch: java.lang.Exception -> L86
            r1 = 63
            int r1 = r1 / r2
            if (r0 == 0) goto L66
            goto L59
        L51:
            r3 = move-exception
            throw r3
        L53:
            java.lang.Object r0 = r4.remove(r1)     // Catch: java.lang.Exception -> L86
            if (r0 == 0) goto L66
        L59:
            int r0 = com.appsflyer.internal.AFa1tSDK.AFInAppEventType
            int r0 = r0 + 117
            int r0 = r0 % 128
            com.appsflyer.internal.AFa1tSDK.AFInAppEventParameterName = r0
            java.lang.String r0 = "validateGaidAndIMEI :: removing: android_id"
            com.appsflyer.AFLogger.afInfoLog(r0)     // Catch: java.lang.Exception -> L86
        L66:
            com.appsflyer.internal.AFc1dSDK r3 = r3.AFAdRevenueData()     // Catch: java.lang.Exception -> L86
            com.appsflyer.internal.AFf1gSDK r3 = r3.registerClient()     // Catch: java.lang.Exception -> L86
            java.lang.String r3 = r3.getRevenue()     // Catch: java.lang.Exception -> L86
            boolean r3 = com.appsflyer.internal.AFk1ySDK.getMediationNetwork(r3)     // Catch: java.lang.Exception -> L86
            if (r3 == 0) goto L85
            java.lang.String r3 = "imei"
            java.lang.Object r3 = r4.remove(r3)     // Catch: java.lang.Exception -> L86
            if (r3 == 0) goto L85
            java.lang.String r3 = "validateGaidAndIMEI :: removing: imei"
            com.appsflyer.AFLogger.afInfoLog(r3)     // Catch: java.lang.Exception -> L86
        L85:
            return
        L86:
            r3 = move-exception
            java.lang.String r4 = "failed to remove IMEI or AndroidID key from params; "
            com.appsflyer.AFLogger.afErrorLog(r4, r3)
        L8c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1tSDK.getCurrencyIso4217Code(java.util.Map):void");
    }

    public static boolean getCurrencyIso4217Code(Context context) {
        return ((Boolean) getMonetizationNetwork(new Object[]{context}, -1675611583, 1675611591, (int) System.currentTimeMillis())).booleanValue();
    }

    private static boolean getCurrencyIso4217Code(String str) {
        int i = AFInAppEventParameterName + 35;
        AFInAppEventType = i % NotificationCompat.FLAG_HIGH_PRIORITY;
        int i2 = i % 2;
        boolean z = AppsFlyerProperties.getInstance().getBoolean(str, false);
        AFInAppEventType = (AFInAppEventParameterName + 5) % NotificationCompat.FLAG_HIGH_PRIORITY;
        return z;
    }

    private static /* synthetic */ Object getMediationNetwork(Object[] objArr) {
        AFa1tSDK aFa1tSDK = (AFa1tSDK) objArr[0];
        Context context = (Context) objArr[1];
        String str = (String) objArr[2];
        final AppsFlyerRequestListener appsFlyerRequestListener = (AppsFlyerRequestListener) objArr[3];
        if (aFa1tSDK.AFAdRevenueData().afDebugLog().getCurrencyIso4217Code()) {
            return null;
        }
        if (!aFa1tSDK.toString) {
            AFInAppEventParameterName = (AFInAppEventType + 33) % NotificationCompat.FLAG_HIGH_PRIORITY;
            AFAdRevenueData("start");
            if (str == null) {
                int i = AFInAppEventType + 19;
                AFInAppEventParameterName = i % NotificationCompat.FLAG_HIGH_PRIORITY;
                if (i % 2 != 0) {
                    throw null;
                }
                if (appsFlyerRequestListener != null) {
                    appsFlyerRequestListener.onError(41, "No dev key");
                }
                return null;
            }
        }
        aFa1tSDK.getMediationNetwork(context);
        final AFh1vSDK aFh1vSDKAreAllFieldsValid = aFa1tSDK.AFAdRevenueData().areAllFieldsValid();
        aFh1vSDKAreAllFieldsValid.getMediationNetwork(AFh1tSDK.getRevenue(context));
        if (aFa1tSDK.component1 == null) {
            AFInAppEventType = (AFInAppEventParameterName + 23) % NotificationCompat.FLAG_HIGH_PRIORITY;
            Application applicationO_ = AFj1iSDK.O_(context);
            if (applicationO_ == null) {
                return null;
            }
            int i2 = AFInAppEventType + 119;
            AFInAppEventParameterName = i2 % NotificationCompat.FLAG_HIGH_PRIORITY;
            int i3 = i2 % 2;
            aFa1tSDK.component1 = applicationO_;
            if (i3 != 0) {
                throw null;
            }
        }
        aFa1tSDK.AFAdRevenueData().copy().getMediationNetwork("start", str);
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFg1cSDK aFg1cSDK = AFg1cSDK.GENERAL;
        String str2 = getMonetizationNetwork;
        aFLogger.i(aFg1cSDK, "Starting AppsFlyer: (v6.17.0." + str2 + ")");
        StringBuilder sb = new StringBuilder("Build Number: ");
        sb.append(str2);
        aFLogger.i(aFg1cSDK, sb.toString());
        AppsFlyerProperties.getInstance().loadProperties(aFa1tSDK.AFAdRevenueData().component2());
        if (!TextUtils.isEmpty(str)) {
            AFInAppEventParameterName = (AFInAppEventType + 45) % NotificationCompat.FLAG_HIGH_PRIORITY;
            aFa1tSDK.AFAdRevenueData().registerClient().AFAdRevenueData(str);
            AFInAppEventParameterName = (AFInAppEventType + pd.j1) % NotificationCompat.FLAG_HIGH_PRIORITY;
        } else if (TextUtils.isEmpty(aFa1tSDK.AFAdRevenueData().registerClient().getMediationNetwork())) {
            copy();
            if (appsFlyerRequestListener != null) {
                appsFlyerRequestListener.onError(41, "No dev key");
            }
            return null;
        }
        aFa1tSDK.AFAdRevenueData().component1().getCurrencyIso4217Code(aFa1tSDK.getMonetizationNetwork());
        aFa1tSDK.component4();
        getMonetizationNetwork(aFa1tSDK.component1.getBaseContext());
        aFa1tSDK.AFAdRevenueData().e().getRevenue();
        aFa1tSDK.copy.afDebugLog().AFAdRevenueData(context, new AFb1bSDK.AFa1zSDK() { // from class: com.appsflyer.internal.AFa1tSDK.1
            @Override // com.appsflyer.internal.AFb1bSDK.AFa1zSDK
            public final void getCurrencyIso4217Code() {
                Context context2 = AFa1tSDK.this.AFAdRevenueData().AFInAppEventType().getMonetizationNetwork;
                AFLogger.afInfoLog("onBecameBackground");
                AFh1vSDK aFh1vSDK = aFh1vSDKAreAllFieldsValid;
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j = aFh1vSDK.component3;
                if (j != 0) {
                    long j2 = jCurrentTimeMillis - j;
                    if (j2 > 0 && j2 < 1000) {
                        j2 = 1000;
                    }
                    long j3 = j2 / 1000;
                    aFh1vSDK.toString = j3;
                    aFh1vSDK.getCurrencyIso4217Code.getMonetizationNetwork("prev_session_dur", j3);
                } else {
                    AFLogger.afInfoLog("Metrics: fg ts is missing");
                }
                AFLogger.afInfoLog("callStatsBackground background call");
                AFa1tSDK.this.AFAdRevenueData().afRDLog().AFAdRevenueData();
                AFd1pSDK aFd1pSDKCopy = AFa1tSDK.this.AFAdRevenueData().copy();
                if (aFd1pSDKCopy.component4()) {
                    aFd1pSDKCopy.getMediationNetwork();
                    if (context2 != null && !AppsFlyerLib.getInstance().isStopped()) {
                        aFd1pSDKCopy.o_(context2.getPackageName(), context2.getPackageManager());
                    }
                    aFd1pSDKCopy.AFAdRevenueData();
                } else {
                    AFLogger.afDebugLog("RD status is OFF");
                }
                AFa1tSDK.this.AFAdRevenueData().equals().getRevenue();
                AFa1tSDK.this.AFAdRevenueData().afVerboseLog().getMonetizationNetwork();
                AFa1tSDK.this.AFAdRevenueData().getMediationNetwork().getRevenue();
                AFh1uSDK aFh1uSDKAfErrorLogForExcManagerOnly = AFa1tSDK.this.AFAdRevenueData().afErrorLogForExcManagerOnly();
                if (aFh1uSDKAfErrorLogForExcManagerOnly != null) {
                    aFh1uSDKAfErrorLogForExcManagerOnly.getMediationNetwork();
                }
            }

            @Override // com.appsflyer.internal.AFb1bSDK.AFa1zSDK
            public final void getRevenue(@NonNull AFh1qSDK aFh1qSDK) {
                Intent intent;
                aFh1vSDKAreAllFieldsValid.AFAdRevenueData();
                AFc1dSDK aFc1dSDKAFAdRevenueData = AFa1tSDK.this.AFAdRevenueData();
                aFc1dSDKAFAdRevenueData.component1().getCurrencyIso4217Code(AFa1tSDK.this.getMonetizationNetwork());
                AFa1tSDK.this.component4();
                int iAFAdRevenueData = aFc1dSDKAFAdRevenueData.getRevenue().getMonetizationNetwork.AFAdRevenueData("appsFlyerCount", 0);
                AFLogger.afInfoLog("onBecameForeground");
                if (iAFAdRevenueData < 2) {
                    AFa1tSDK.this.AFAdRevenueData().equals().getCurrencyIso4217Code();
                }
                AFh1iSDK aFh1iSDK = new AFh1iSDK();
                if (aFh1qSDK != null) {
                    AFa1tSDK.this.AFAdRevenueData().d().e_(AFa1jSDK.AFAdRevenueData(aFh1iSDK), aFh1qSDK.getRevenue, aFc1dSDKAFAdRevenueData.AFInAppEventType().getMonetizationNetwork);
                    AFh1uSDK aFh1uSDKAfErrorLogForExcManagerOnly = aFc1dSDKAFAdRevenueData.afErrorLogForExcManagerOnly();
                    if (aFh1uSDKAfErrorLogForExcManagerOnly != null && (intent = aFh1qSDK.getRevenue) != null) {
                        aFh1uSDKAfErrorLogForExcManagerOnly.u_(intent, AFa1tSDK.this.AFAdRevenueData().d());
                    }
                }
                AFa1tSDK aFa1tSDK2 = AFa1tSDK.this;
                aFh1iSDK.getCurrencyIso4217Code = appsFlyerRequestListener;
                aFa1tSDK2.getMonetizationNetwork(aFh1iSDK, aFh1qSDK);
                AFa1tSDK.this.AFAdRevenueData().getMediationNetwork().getRevenue();
                AFa1tSDK.this.AFAdRevenueData().getMediationNetwork().AFAdRevenueData.getCurrencyIso4217Code("didSendRevenueTriggerOnLastBackground", false);
            }
        });
        int i4 = AFInAppEventParameterName + pd.W0;
        AFInAppEventType = i4 % NotificationCompat.FLAG_HIGH_PRIORITY;
        if (i4 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static String getMediationNetwork(Activity activity) {
        Intent intent;
        int i = AFInAppEventType + 37;
        AFInAppEventParameterName = i % NotificationCompat.FLAG_HIGH_PRIORITY;
        String string = null;
        if (i % 2 != 0) {
            throw null;
        }
        if (activity != null && (intent = activity.getIntent()) != null) {
            AFInAppEventType = (AFInAppEventParameterName + 99) % NotificationCompat.FLAG_HIGH_PRIORITY;
            try {
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    int i2 = AFInAppEventType + 39;
                    AFInAppEventParameterName = i2 % NotificationCompat.FLAG_HIGH_PRIORITY;
                    if (i2 % 2 != 0) {
                        String string2 = extras.getString("af");
                        try {
                            throw null;
                        } catch (Throwable th) {
                            string = string2;
                            th = th;
                            AFLogger.INSTANCE.e(AFg1cSDK.ENGAGEMENT, th.getMessage(), th);
                            return string;
                        }
                    }
                    string = extras.getString("af");
                    if (string != null) {
                        AFLogger.INSTANCE.w(AFg1cSDK.ENGAGEMENT, "Push Notification received af payload = ".concat(string));
                        extras.remove("af");
                        activity.setIntent(intent.putExtras(extras));
                        AFInAppEventType = (AFInAppEventParameterName + 29) % NotificationCompat.FLAG_HIGH_PRIORITY;
                    }
                }
                return string;
            } catch (Throwable th2) {
                th = th2;
            }
        }
        return string;
    }

    private void getMediationNetwork(String str) {
        AFh1rSDK aFh1rSDKAFAdRevenueData = new AFh1jSDK().AFAdRevenueData(AFAdRevenueData().getRevenue().getMonetizationNetwork.AFAdRevenueData("appsFlyerCount", 0));
        aFh1rSDKAFAdRevenueData.component3 = str;
        if (str != null) {
            AFInAppEventType = (AFInAppEventParameterName + 31) % NotificationCompat.FLAG_HIGH_PRIORITY;
            if (str.length() > 5) {
                AFInAppEventParameterName = (AFInAppEventType + 59) % NotificationCompat.FLAG_HIGH_PRIORITY;
                if (AFAdRevenueData().AFLogger().getCurrencyIso4217Code(aFh1rSDKAFAdRevenueData)) {
                    AFj1dSDK.getMediationNetwork(AFAdRevenueData().AFAdRevenueData(), new AFa1ySDK(aFh1rSDKAFAdRevenueData), 5L, TimeUnit.MILLISECONDS);
                }
            }
        }
    }

    private static void getMediationNetwork(JSONObject jSONObject) {
        String str;
        ArrayList arrayList = new ArrayList();
        Iterator<String> itKeys = jSONObject.keys();
        while (true) {
            if (!itKeys.hasNext()) {
                break;
            }
            try {
                JSONArray jSONArray = new JSONArray((String) jSONObject.get(itKeys.next()));
                for (int i = 0; i < jSONArray.length(); i++) {
                    arrayList.add(Long.valueOf(jSONArray.getLong(i)));
                }
            } catch (JSONException e) {
                AFLogger.afErrorLogForExcManagerOnly("error at timeStampArr", e);
            }
        }
        Collections.sort(arrayList);
        Iterator<String> itKeys2 = jSONObject.keys();
        loop2: while (true) {
            str = null;
            while (itKeys2.hasNext()) {
                AFInAppEventParameterName = (AFInAppEventType + 45) % NotificationCompat.FLAG_HIGH_PRIORITY;
                if (str != null) {
                    break loop2;
                }
                String next = itKeys2.next();
                try {
                    JSONArray jSONArray2 = new JSONArray((String) jSONObject.get(next));
                    int i2 = 0;
                    while (i2 < jSONArray2.length()) {
                        if (jSONArray2.getLong(i2) == ((Long) arrayList.get(0)).longValue() || jSONArray2.getLong(i2) == ((Long) arrayList.get(1)).longValue()) {
                            break;
                        }
                        AFInAppEventParameterName = (AFInAppEventType + 53) % NotificationCompat.FLAG_HIGH_PRIORITY;
                        if (jSONArray2.getLong(i2) != ((Long) arrayList.get(arrayList.size() - 1)).longValue()) {
                            i2++;
                            AFInAppEventType = (AFInAppEventParameterName + 15) % NotificationCompat.FLAG_HIGH_PRIORITY;
                            str = next;
                        }
                    }
                } catch (JSONException e2) {
                    AFLogger.afErrorLogForExcManagerOnly("error at manageExtraReferrers", e2);
                }
            }
            break loop2;
        }
        if (str != null) {
            int i3 = AFInAppEventType + 115;
            AFInAppEventParameterName = i3 % NotificationCompat.FLAG_HIGH_PRIORITY;
            int i4 = i3 % 2;
            jSONObject.remove(str);
            if (i4 != 0) {
                int i5 = 31 / 0;
            }
        }
    }

    private static int getMonetizationNetwork(AFc1qSDK aFc1qSDK, String str, boolean z) {
        AFInAppEventType = (AFInAppEventParameterName + 35) % NotificationCompat.FLAG_HIGH_PRIORITY;
        int iAFAdRevenueData = aFc1qSDK.AFAdRevenueData(str, 0);
        if (z) {
            iAFAdRevenueData++;
            aFc1qSDK.getMediationNetwork(str, iAFAdRevenueData);
        }
        int i = AFInAppEventParameterName + 61;
        AFInAppEventType = i % NotificationCompat.FLAG_HIGH_PRIORITY;
        if (i % 2 != 0) {
            return iAFAdRevenueData;
        }
        throw null;
    }

    public static int getMonetizationNetwork(AFc1qSDK aFc1qSDK, boolean z) {
        return ((Integer) getMonetizationNetwork(new Object[]{aFc1qSDK, Boolean.valueOf(z)}, -1175980247, 1175980268, (int) System.currentTimeMillis())).intValue();
    }

    private static /* synthetic */ Object getMonetizationNetwork(Object[] objArr) {
        AFa1tSDK aFa1tSDK = (AFa1tSDK) objArr[0];
        Map map = (Map) objArr[1];
        int i = AFInAppEventParameterName + pd.K0;
        AFInAppEventType = i % NotificationCompat.FLAG_HIGH_PRIORITY;
        if (i % 2 == 0) {
            throw null;
        }
        if (map != null) {
            aFa1tSDK.AFAdRevenueData().copy().getMediationNetwork("setAdditionalData", map.toString());
            AppsFlyerProperties.getInstance().setCustomData(new JSONObject(map).toString());
            AFInAppEventParameterName = (AFInAppEventType + 45) % NotificationCompat.FLAG_HIGH_PRIORITY;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object getMonetizationNetwork(java.lang.Object[] r10, int r11, int r12, int r13) {
        /*
            Method dump skipped, instructions count: 1096
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1tSDK.getMonetizationNetwork(java.lang.Object[], int, int, int):java.lang.Object");
    }

    public static String getMonetizationNetwork(AFc1qSDK aFc1qSDK, String str) {
        int i = AFInAppEventType + 99;
        AFInAppEventParameterName = i % NotificationCompat.FLAG_HIGH_PRIORITY;
        if (i % 2 != 0) {
            aFc1qSDK.AFAdRevenueData("CACHED_CHANNEL", (String) null);
            throw null;
        }
        String strAFAdRevenueData = aFc1qSDK.AFAdRevenueData("CACHED_CHANNEL", (String) null);
        if (strAFAdRevenueData != null) {
            return strAFAdRevenueData;
        }
        aFc1qSDK.getMediationNetwork("CACHED_CHANNEL", str);
        AFInAppEventType = (AFInAppEventParameterName + pd.K0) % NotificationCompat.FLAG_HIGH_PRIORITY;
        return str;
    }

    private static String getMonetizationNetwork(String str) {
        AFInAppEventParameterName = (AFInAppEventType + pd.l1) % NotificationCompat.FLAG_HIGH_PRIORITY;
        String string = AppsFlyerProperties.getInstance().getString(str);
        int i = AFInAppEventType + 1;
        AFInAppEventParameterName = i % NotificationCompat.FLAG_HIGH_PRIORITY;
        if (i % 2 == 0) {
            return string;
        }
        throw null;
    }

    @SuppressLint({"DiscouragedApi"})
    private static void getMonetizationNetwork(Context context) {
        try {
            if ((context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.flags & 32768) != 0) {
                if (Build.VERSION.SDK_INT < 31) {
                    if (context.getResources().getIdentifier("appsflyer_backup_rules", "xml", context.getPackageName()) != 0) {
                        AFLogger.INSTANCE.i(AFg1cSDK.GENERAL, "appsflyer_backup_rules.xml detected, using AppsFlyer defined backup rules for AppsFlyer SDK data", true);
                        return;
                    } else {
                        AFLogger.INSTANCE.w(AFg1cSDK.GENERAL, "'allowBackup' is set to true; appsflyer_backup_rules.xml is NOT detected.\nAppsFlyer shared preferences should be excluded from auto backup by adding: <exclude domain=\"sharedpref\" path=\"appsflyer-data\"/> to the Application's <full-backup-content> rules.\nIf Appsflyer's Purchase Connector is in use then you also must add the following to your rules: <exclude domain=\"sharedpref\" path=\"appsflyer-purchase-data\"/> AND <exclude domain=\"database\" path=\"afpurchases.db\"/>", true);
                        return;
                    }
                }
                AFInAppEventType = (AFInAppEventParameterName + 61) % NotificationCompat.FLAG_HIGH_PRIORITY;
                if (context.getResources().getIdentifier("appsflyer_data_extraction_rules", "xml", context.getPackageName()) == 0) {
                    AFLogger.INSTANCE.w(AFg1cSDK.GENERAL, "'allowBackup' is set to true; appsflyer_data_extraction_rules.xml is NOT detected.\nAppsFlyer shared preferences should be excluded from auto backup by adding: <exclude domain=\"sharedpref\" path=\"appsflyer-data\"/> to the Application's <data-extraction-rules> both in <device-transfer> and <cloud-backup>.\nIf Appsflyer's Purchase Connector is in use then you also must add to <device-transfer> and <cloud-backup> the following excludes: <exclude domain=\"sharedpref\" path=\"appsflyer-purchase-data\"/> AND <exclude domain=\"database\" path=\"afpurchases.db\"/>", true);
                    AFInAppEventParameterName = (AFInAppEventType + 79) % NotificationCompat.FLAG_HIGH_PRIORITY;
                    return;
                }
                int i = AFInAppEventType + 119;
                AFInAppEventParameterName = i % NotificationCompat.FLAG_HIGH_PRIORITY;
                if (i % 2 != 0) {
                    AFLogger.INSTANCE.i(AFg1cSDK.GENERAL, "appsflyer_data_extraction_rules.xml detected, using AppsFlyer data extraction rules for AppsFlyer SDK data", false);
                } else {
                    AFLogger.INSTANCE.i(AFg1cSDK.GENERAL, "appsflyer_data_extraction_rules.xml detected, using AppsFlyer data extraction rules for AppsFlyer SDK data", true);
                }
            }
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "Exception while checking BackupRules: ", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
    
        AFAdRevenueData().v().getCurrencyIso4217Code();
        com.appsflyer.internal.AFa1tSDK.AFInAppEventParameterName = (com.appsflyer.internal.AFa1tSDK.AFInAppEventType + 43) % androidx.core.app.NotificationCompat.FLAG_HIGH_PRIORITY;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0034, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0010, code lost:
    
        if (r3 != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0013, code lost:
    
        if (r3 != false) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0015, code lost:
    
        AFAdRevenueData().v().getRevenue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0020, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ void getMonetizationNetwork(boolean r3) {
        /*
            r2 = this;
            int r0 = com.appsflyer.internal.AFa1tSDK.AFInAppEventParameterName
            int r0 = r0 + 95
            int r1 = r0 % 128
            com.appsflyer.internal.AFa1tSDK.AFInAppEventType = r1
            int r0 = r0 % 2
            if (r0 != 0) goto L13
            r0 = 41
            int r0 = r0 / 0
            if (r3 == 0) goto L21
            goto L15
        L13:
            if (r3 == 0) goto L21
        L15:
            com.appsflyer.internal.AFc1dSDK r2 = r2.AFAdRevenueData()
            com.appsflyer.internal.AFg1bSDK r2 = r2.v()
            r2.getRevenue()
            return
        L21:
            com.appsflyer.internal.AFc1dSDK r2 = r2.AFAdRevenueData()
            com.appsflyer.internal.AFg1bSDK r2 = r2.v()
            r2.getCurrencyIso4217Code()
            int r2 = com.appsflyer.internal.AFa1tSDK.AFInAppEventType
            int r2 = r2 + 43
            int r2 = r2 % 128
            com.appsflyer.internal.AFa1tSDK.AFInAppEventParameterName = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1tSDK.getMonetizationNetwork(boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object getRevenue(java.lang.Object[] r14) {
        /*
            Method dump skipped, instructions count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1tSDK.getRevenue(java.lang.Object[]):java.lang.Object");
    }

    public static String getRevenue() {
        AFInAppEventType = (AFInAppEventParameterName + 61) % NotificationCompat.FLAG_HIGH_PRIORITY;
        String monetizationNetwork = getMonetizationNetwork(AppsFlyerProperties.APP_USER_ID);
        AFInAppEventType = (AFInAppEventParameterName + 11) % NotificationCompat.FLAG_HIGH_PRIORITY;
        return monetizationNetwork;
    }

    @Nullable
    private String getRevenue(Context context, String str) {
        int i = (AFInAppEventType + 15) % NotificationCompat.FLAG_HIGH_PRIORITY;
        AFInAppEventParameterName = i;
        if (context == null) {
            AFInAppEventType = (i + 7) % NotificationCompat.FLAG_HIGH_PRIORITY;
            return null;
        }
        getMediationNetwork(context);
        String currencyIso4217Code = AFAdRevenueData().getRevenue().getCurrencyIso4217Code(str);
        int i2 = AFInAppEventType + 65;
        AFInAppEventParameterName = i2 % NotificationCompat.FLAG_HIGH_PRIORITY;
        if (i2 % 2 != 0) {
            int i3 = 41 / 0;
        }
        return currencyIso4217Code;
    }

    public static String getRevenue(SimpleDateFormat simpleDateFormat, long j) {
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        String str = simpleDateFormat.format(new Date(j));
        int i = AFInAppEventParameterName + 61;
        AFInAppEventType = i % NotificationCompat.FLAG_HIGH_PRIORITY;
        if (i % 2 != 0) {
            return str;
        }
        throw null;
    }

    public static Map<String, Object> getRevenue(Map<String, Object> map) {
        Map<String, Object> map2;
        if (map.containsKey("meta")) {
            int i = AFInAppEventType + 117;
            AFInAppEventParameterName = i % NotificationCompat.FLAG_HIGH_PRIORITY;
            int i2 = i % 2;
            map2 = (Map) map.get("meta");
            if (i2 != 0) {
                throw null;
            }
        } else {
            HashMap map3 = new HashMap();
            map.put("meta", map3);
            map2 = map3;
        }
        int i3 = AFInAppEventParameterName + 45;
        AFInAppEventType = i3 % NotificationCompat.FLAG_HIGH_PRIORITY;
        if (i3 % 2 != 0) {
            return map2;
        }
        throw null;
    }

    private void getRevenue(AppsFlyerConversionListener appsFlyerConversionListener) {
        int i = AFInAppEventParameterName + 113;
        int i2 = i % NotificationCompat.FLAG_HIGH_PRIORITY;
        AFInAppEventType = i2;
        if (i % 2 == 0) {
            throw null;
        }
        if (appsFlyerConversionListener == null) {
            AFInAppEventParameterName = (i2 + 125) % NotificationCompat.FLAG_HIGH_PRIORITY;
        } else {
            this.getCurrencyIso4217Code = appsFlyerConversionListener;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void getRevenue(AFc1dSDK aFc1dSDK) {
        int i = AFInAppEventParameterName + 95;
        AFInAppEventType = i % NotificationCompat.FLAG_HIGH_PRIORITY;
        int i2 = i % 2;
        aFc1dSDK.AFInAppEventParameterName().getMediationNetwork();
        if (i2 == 0) {
            throw null;
        }
    }

    private static void getRevenue(String str) {
        getMonetizationNetwork(new Object[]{str}, 998031041, -998031039, (int) System.currentTimeMillis());
    }

    private static /* synthetic */ Object hashCode(Object[] objArr) {
        AFa1tSDK aFa1tSDK = (AFa1tSDK) objArr[0];
        Context context = (Context) objArr[1];
        String str = (String) objArr[2];
        AFh1iSDK aFh1iSDK = new AFh1iSDK();
        aFa1tSDK.getMediationNetwork(context);
        aFh1iSDK.areAllFieldsValid = null;
        aFh1iSDK.getMonetizationNetwork = null;
        aFh1iSDK.component3 = str;
        aFh1iSDK.getMediationNetwork = null;
        aFa1tSDK.AFAdRevenueData(aFh1iSDK);
        int i = AFInAppEventParameterName + pd.T0;
        AFInAppEventType = i % NotificationCompat.FLAG_HIGH_PRIORITY;
        if (i % 2 == 0) {
            int i2 = 32 / 0;
        }
        return null;
    }

    private static /* synthetic */ Object toString(Object[] objArr) {
        AFa1tSDK aFa1tSDK = (AFa1tSDK) objArr[0];
        Context context = (Context) objArr[1];
        String str = (String) objArr[2];
        AFInAppEventParameterName = (AFInAppEventType + 71) % NotificationCompat.FLAG_HIGH_PRIORITY;
        aFa1tSDK.start(context, str, null);
        int i = AFInAppEventParameterName + 65;
        AFInAppEventType = i % NotificationCompat.FLAG_HIGH_PRIORITY;
        if (i % 2 != 0) {
            return null;
        }
        throw null;
    }

    public final AFc1dSDK AFAdRevenueData() {
        int i = AFInAppEventParameterName;
        AFc1eSDK aFc1eSDK = this.copy;
        int i2 = i + 85;
        AFInAppEventType = i2 % NotificationCompat.FLAG_HIGH_PRIORITY;
        if (i2 % 2 == 0) {
            int i3 = 84 / 0;
        }
        return aFc1eSDK;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void addPushNotificationDeepLinkPath(String... strArr) {
        AFInAppEventParameterName = (AFInAppEventType + 41) % NotificationCompat.FLAG_HIGH_PRIORITY;
        List<String> listAsList = Arrays.asList(strArr);
        List<List<String>> list = AFAdRevenueData().d().getMediationNetwork;
        if (!list.contains(listAsList)) {
            list.add(listAsList);
        }
        AFInAppEventType = (AFInAppEventParameterName + 33) % NotificationCompat.FLAG_HIGH_PRIORITY;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void anonymizeUser(boolean z) {
        int i = AFInAppEventType + 1;
        AFInAppEventParameterName = i % NotificationCompat.FLAG_HIGH_PRIORITY;
        int i2 = i % 2;
        AFd1pSDK aFd1pSDKCopy = AFAdRevenueData().copy();
        if (i2 != 0) {
            String[] strArr = new String[0];
            strArr[1] = String.valueOf(z);
            aFd1pSDKCopy.getMediationNetwork("anonymizeUser", strArr);
        } else {
            aFd1pSDKCopy.getMediationNetwork("anonymizeUser", String.valueOf(z));
        }
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, z);
        AFInAppEventParameterName = (AFInAppEventType + 69) % NotificationCompat.FLAG_HIGH_PRIORITY;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void appendParametersToDeepLinkingURL(String str, Map<String, String> map) {
        getMonetizationNetwork(new Object[]{this, str, map}, 1307261109, -1307261102, System.identityHashCode(this));
    }

    public final void b_(Context context, Intent intent) {
        AFj1jSDK aFj1jSDK = new AFj1jSDK(intent);
        if (aFj1jSDK.getRevenue("appsflyer_preinstall") != null) {
            getMonetizationNetwork(new Object[]{aFj1jSDK.getRevenue("appsflyer_preinstall")}, 998031041, -998031039, (int) System.currentTimeMillis());
        }
        AFLogger.afInfoLog("****** onReceive called *******");
        AppsFlyerProperties.getInstance();
        String revenue = aFj1jSDK.getRevenue("referrer");
        AFLogger.afInfoLog("Play store referrer: ".concat(String.valueOf(revenue)));
        if (revenue != null) {
            int i = AFInAppEventParameterName + 41;
            AFInAppEventType = i % NotificationCompat.FLAG_HIGH_PRIORITY;
            if (i % 2 == 0) {
                getRevenue(context).getMediationNetwork("referrer", revenue);
                AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
                appsFlyerProperties.set("AF_REFERRER", revenue);
                appsFlyerProperties.getMediationNetwork = revenue;
                AppsFlyerProperties.getInstance().AFAdRevenueData();
                throw null;
            }
            getRevenue(context).getMediationNetwork("referrer", revenue);
            AppsFlyerProperties appsFlyerProperties2 = AppsFlyerProperties.getInstance();
            appsFlyerProperties2.set("AF_REFERRER", revenue);
            appsFlyerProperties2.getMediationNetwork = revenue;
            if (AppsFlyerProperties.getInstance().AFAdRevenueData()) {
                AFLogger.afInfoLog("onReceive: isLaunchCalled");
                getCurrencyIso4217Code(context, AFh1xSDK.onReceive);
                getMediationNetwork(revenue);
            }
        }
        int i2 = AFInAppEventType + 63;
        AFInAppEventParameterName = i2 % NotificationCompat.FLAG_HIGH_PRIORITY;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    public final void component4() {
        AFInAppEventType = (AFInAppEventParameterName + 123) % NotificationCompat.FLAG_HIGH_PRIORITY;
        if (!AFe1bSDK.component3()) {
            AFc1dSDK aFc1dSDKAFAdRevenueData = AFAdRevenueData();
            AFe1lSDK aFe1lSDKCopydefault = aFc1dSDKAFAdRevenueData.copydefault();
            aFe1lSDKCopydefault.getRevenue.execute(aFe1lSDKCopydefault.new AnonymousClass5(new AFe1bSDK(aFc1dSDKAFAdRevenueData)));
            return;
        }
        int i = AFInAppEventType + 93;
        AFInAppEventParameterName = i % NotificationCompat.FLAG_HIGH_PRIORITY;
        if (i % 2 != 0) {
            int i2 = 25 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void disableAppSetId() {
        getMonetizationNetwork(new Object[]{this}, -2040336732, 2040336751, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void enableFacebookDeferredApplinks(boolean z) {
        int i = AFInAppEventParameterName + pd.h1;
        AFInAppEventType = i % NotificationCompat.FLAG_HIGH_PRIORITY;
        int i2 = i % 2;
        AFAdRevenueData().e().getCurrencyIso4217Code(z);
        if (i2 == 0) {
            throw null;
        }
        int i3 = AFInAppEventType + 1;
        AFInAppEventParameterName = i3 % NotificationCompat.FLAG_HIGH_PRIORITY;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void enableTCFDataCollection(boolean z) {
        int i = AFInAppEventParameterName + 43;
        AFInAppEventType = i % NotificationCompat.FLAG_HIGH_PRIORITY;
        if (i % 2 != 0) {
            getMonetizationNetwork(new Object[]{AppsFlyerProperties.ENABLE_TCF_DATA_COLLECTION, Boolean.toString(z)}, -692563571, 692563575, (int) System.currentTimeMillis());
        } else {
            getMonetizationNetwork(new Object[]{AppsFlyerProperties.ENABLE_TCF_DATA_COLLECTION, Boolean.toString(z)}, -692563571, 692563575, (int) System.currentTimeMillis());
            int i2 = 36 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0039, code lost:
    
        if ((r3 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003b, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
    
        getMediationNetwork(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
    
        return com.appsflyer.internal.AFb1iSDK.getRevenue(AFAdRevenueData().getRevenue().getMonetizationNetwork);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001c, code lost:
    
        if (r4 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002c, code lost:
    
        if (r4 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002e, code lost:
    
        r3 = com.appsflyer.internal.AFa1tSDK.AFInAppEventType + 69;
        com.appsflyer.internal.AFa1tSDK.AFInAppEventParameterName = r3 % androidx.core.app.NotificationCompat.FLAG_HIGH_PRIORITY;
     */
    @Override // com.appsflyer.AppsFlyerLib
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String getAppsFlyerUID(@androidx.annotation.NonNull android.content.Context r4) {
        /*
            r3 = this;
            int r0 = com.appsflyer.internal.AFa1tSDK.AFInAppEventParameterName
            int r0 = r0 + 103
            int r1 = r0 % 128
            com.appsflyer.internal.AFa1tSDK.AFInAppEventType = r1
            int r0 = r0 % 2
            r1 = 0
            java.lang.String r2 = "getAppsFlyerUID"
            if (r0 != 0) goto L1f
            com.appsflyer.internal.AFc1dSDK r0 = r3.AFAdRevenueData()
            com.appsflyer.internal.AFd1pSDK r0 = r0.copy()
            java.lang.String[] r1 = new java.lang.String[r1]
            r0.getMediationNetwork(r2, r1)
            if (r4 != 0) goto L3d
            goto L2e
        L1f:
            com.appsflyer.internal.AFc1dSDK r0 = r3.AFAdRevenueData()
            com.appsflyer.internal.AFd1pSDK r0 = r0.copy()
            java.lang.String[] r1 = new java.lang.String[r1]
            r0.getMediationNetwork(r2, r1)
            if (r4 != 0) goto L3d
        L2e:
            int r3 = com.appsflyer.internal.AFa1tSDK.AFInAppEventType
            int r3 = r3 + 69
            int r4 = r3 % 128
            com.appsflyer.internal.AFa1tSDK.AFInAppEventParameterName = r4
            int r3 = r3 % 2
            r4 = 0
            if (r3 != 0) goto L3c
            return r4
        L3c:
            throw r4
        L3d:
            r3.getMediationNetwork(r4)
            com.appsflyer.internal.AFc1dSDK r3 = r3.AFAdRevenueData()
            com.appsflyer.internal.AFc1pSDK r3 = r3.getRevenue()
            com.appsflyer.internal.AFc1qSDK r3 = r3.getMonetizationNetwork
            java.lang.String r3 = com.appsflyer.internal.AFb1iSDK.getRevenue(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1tSDK.getAppsFlyerUID(android.content.Context):java.lang.String");
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getAttributionId(Context context) {
        return (String) getMonetizationNetwork(new Object[]{this, context}, -1689317276, 1689317287, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getHostName() {
        AFInAppEventType = (AFInAppEventParameterName + 21) % NotificationCompat.FLAG_HIGH_PRIORITY;
        String mediationNetwork = AFAdRevenueData().AFKeystoreWrapper().getMediationNetwork();
        AFInAppEventType = (AFInAppEventParameterName + 71) % NotificationCompat.FLAG_HIGH_PRIORITY;
        return mediationNetwork;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getHostPrefix() {
        AFInAppEventParameterName = (AFInAppEventType + 3) % NotificationCompat.FLAG_HIGH_PRIORITY;
        String currencyIso4217Code = AFAdRevenueData().AFKeystoreWrapper().getCurrencyIso4217Code();
        int i = AFInAppEventParameterName + 67;
        AFInAppEventType = i % NotificationCompat.FLAG_HIGH_PRIORITY;
        if (i % 2 != 0) {
            return currencyIso4217Code;
        }
        throw null;
    }

    @NonNull
    public final Map<String, Object> getMediationNetwork(AFh1rSDK aFh1rSDK) {
        String str;
        Context context = AFAdRevenueData().AFInAppEventType().getMonetizationNetwork;
        AFc1qSDK revenue = getRevenue(context);
        AFg1qSDK aFg1qSDKComponent3 = AFAdRevenueData().component3();
        boolean zAFAdRevenueData = AFAdRevenueData().registerClient().AFAdRevenueData();
        boolean mediationNetwork = aFh1rSDK.getMediationNetwork();
        Map<String, Object> map = aFh1rSDK.AFAdRevenueData;
        long time = new Date().getTime();
        Object[] objArr = new Object[1];
        a(new int[]{1293966833, -1332243105, 2001922811, -600378744, 548813369, -684723692}, 13 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr);
        map.put(((String) objArr[0]).intern(), Long.toString(time));
        try {
            if (zAFAdRevenueData) {
                AFInAppEventParameterName = (AFInAppEventType + 83) % NotificationCompat.FLAG_HIGH_PRIORITY;
                AFLogger.INSTANCE.i(AFg1cSDK.GENERAL, "AppsFlyer SDK Reporting has been stopped", true);
            } else {
                AFLogger aFLogger = AFLogger.INSTANCE;
                AFg1cSDK aFg1cSDK = AFg1cSDK.GENERAL;
                StringBuilder sb = new StringBuilder("******* sendTrackingWithEvent: ");
                if (mediationNetwork) {
                    str = "Launch";
                    AFInAppEventType = (AFInAppEventParameterName + 7) % NotificationCompat.FLAG_HIGH_PRIORITY;
                } else {
                    str = aFh1rSDK.areAllFieldsValid;
                }
                sb.append(str);
                aFLogger.i(aFg1cSDK, sb.toString(), true);
            }
            component4(context);
            int iIntValue = ((Integer) getMonetizationNetwork(new Object[]{revenue, Boolean.valueOf(mediationNetwork)}, -1175980247, 1175980268, (int) System.currentTimeMillis())).intValue();
            int currencyIso4217Code = getCurrencyIso4217Code(revenue, aFh1rSDK.areAllFieldsValid != null);
            if (mediationNetwork) {
                int i = AFInAppEventType;
                AFInAppEventParameterName = (i + 69) % NotificationCompat.FLAG_HIGH_PRIORITY;
                if (iIntValue == 1) {
                    AFInAppEventParameterName = (i + 61) % NotificationCompat.FLAG_HIGH_PRIORITY;
                    AppsFlyerProperties.getInstance().getCurrencyIso4217Code = true;
                }
            }
            aFg1qSDKComponent3.getRevenue(map, iIntValue, currencyIso4217Code);
            return map;
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "Error while preparing to send event", th, true, true, true);
            return map;
        }
    }

    public final void getMediationNetwork(@NonNull Context context) {
        int i = AFInAppEventType;
        AFInAppEventParameterName = (i + 121) % NotificationCompat.FLAG_HIGH_PRIORITY;
        AFc1eSDK aFc1eSDK = this.copy;
        if (context != null) {
            int i2 = (i + 113) % NotificationCompat.FLAG_HIGH_PRIORITY;
            AFInAppEventParameterName = i2;
            AFc1iSDK aFc1iSDK = aFc1eSDK.AFAdRevenueData;
            if (context != null) {
                AFInAppEventType = (i2 + 117) % NotificationCompat.FLAG_HIGH_PRIORITY;
                aFc1iSDK.getMonetizationNetwork = context.getApplicationContext();
                AFInAppEventType = (AFInAppEventParameterName + 19) % NotificationCompat.FLAG_HIGH_PRIORITY;
            }
        }
    }

    public final void getMediationNetwork(Context context, String str) {
        JSONArray jSONArray;
        JSONObject jSONObject;
        AFInAppEventType = (AFInAppEventParameterName + 43) % NotificationCompat.FLAG_HIGH_PRIORITY;
        AFLogger.afDebugLog("received a new (extra) referrer: ".concat(String.valueOf(str)));
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            String strAFAdRevenueData = getRevenue(context).AFAdRevenueData("extraReferrers", (String) null);
            if (strAFAdRevenueData == null) {
                jSONObject = new JSONObject();
                jSONArray = new JSONArray();
            } else {
                JSONObject jSONObject2 = new JSONObject(strAFAdRevenueData);
                jSONArray = jSONObject2.has(str) ? new JSONArray((String) jSONObject2.get(str)) : new JSONArray();
                jSONObject = jSONObject2;
            }
            if (jSONArray.length() < 5) {
                int i = AFInAppEventType + 25;
                AFInAppEventParameterName = i % NotificationCompat.FLAG_HIGH_PRIORITY;
                if (i % 2 != 0) {
                    jSONArray.put(jCurrentTimeMillis);
                    int i2 = 87 / 0;
                } else {
                    jSONArray.put(jCurrentTimeMillis);
                }
            }
            if (jSONObject.length() >= 4) {
                getMediationNetwork(jSONObject);
            }
            jSONObject.put(str, jSONArray.toString());
            getRevenue(context).getMediationNetwork("extraReferrers", jSONObject.toString());
            AFInAppEventType = (AFInAppEventParameterName + 121) % NotificationCompat.FLAG_HIGH_PRIORITY;
        } catch (JSONException e) {
            AFLogger.afErrorLogForExcManagerOnly("error at addReferrer", e);
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder("Couldn't save referrer - ");
            sb.append(str);
            sb.append(": ");
            AFLogger.afErrorLog(sb.toString(), th);
        }
    }

    public final boolean getMediationNetwork() {
        AFInAppEventType = (AFInAppEventParameterName + 47) % NotificationCompat.FLAG_HIGH_PRIORITY;
        if (!getCurrencyIso4217Code(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID)) {
            return false;
        }
        int i = AFInAppEventType + 69;
        AFInAppEventParameterName = i % NotificationCompat.FLAG_HIGH_PRIORITY;
        if (i % 2 == 0) {
            return getRevenue() == null;
        }
        getRevenue();
        throw null;
    }

    public final synchronized AFf1mSDK getMonetizationNetwork() {
        AFf1mSDK bVar;
        int i = AFInAppEventType;
        int i2 = i + 17;
        AFInAppEventParameterName = i2 % NotificationCompat.FLAG_HIGH_PRIORITY;
        int i3 = i2 % 2;
        bVar = this.equals;
        if (i3 != 0) {
            throw null;
        }
        if (bVar == null) {
            bVar = new b(this);
            this.equals = bVar;
            AFInAppEventParameterName = (i + 119) % NotificationCompat.FLAG_HIGH_PRIORITY;
        }
        return bVar;
    }

    public final void getMonetizationNetwork(@NonNull AFh1rSDK aFh1rSDK, @Nullable AFh1qSDK aFh1qSDK) {
        getCurrencyIso4217Code(aFh1rSDK, aFh1qSDK);
        if (AFAdRevenueData().registerClient().getMediationNetwork() != null) {
            String referrer = AppsFlyerProperties.getInstance().getReferrer(AFAdRevenueData().component2());
            if (referrer == null) {
                referrer = "";
            } else {
                AFInAppEventType = (AFInAppEventParameterName + 9) % NotificationCompat.FLAG_HIGH_PRIORITY;
            }
            aFh1rSDK.component3 = referrer;
            AFAdRevenueData(aFh1rSDK);
            return;
        }
        AFInAppEventParameterName = (AFInAppEventType + 45) % NotificationCompat.FLAG_HIGH_PRIORITY;
        AFLogger.afWarnLog("[LogEvent/Launch] AppsFlyer's SDK cannot send any event without providing DevKey.");
        AppsFlyerRequestListener appsFlyerRequestListener = aFh1rSDK.getCurrencyIso4217Code;
        if (appsFlyerRequestListener != null) {
            int i = AFInAppEventType + pd.W0;
            AFInAppEventParameterName = i % NotificationCompat.FLAG_HIGH_PRIORITY;
            appsFlyerRequestListener.onError(i % 2 != 0 ? pd.i1 : 41, "No dev key");
        }
        AFInAppEventParameterName = (AFInAppEventType + 11) % NotificationCompat.FLAG_HIGH_PRIORITY;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getOutOfStore(Context context) {
        AFInAppEventParameterName = (AFInAppEventType + 115) % NotificationCompat.FLAG_HIGH_PRIORITY;
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.AF_STORE_FROM_API);
        if (string != null) {
            AFInAppEventType = (AFInAppEventParameterName + pd.h1) % NotificationCompat.FLAG_HIGH_PRIORITY;
            return string;
        }
        String revenue = getRevenue(context, "AF_STORE");
        if (revenue == null) {
            AFLogger.afInfoLog("No out-of-store value set");
            return null;
        }
        int i = AFInAppEventParameterName + 99;
        AFInAppEventType = i % NotificationCompat.FLAG_HIGH_PRIORITY;
        if (i % 2 == 0) {
            int i2 = 63 / 0;
        }
        return revenue;
    }

    public final AFc1qSDK getRevenue(Context context) {
        int i = AFInAppEventParameterName + 11;
        AFInAppEventType = i % NotificationCompat.FLAG_HIGH_PRIORITY;
        int i2 = i % 2;
        getMediationNetwork(context);
        AFc1dSDK aFc1dSDKAFAdRevenueData = AFAdRevenueData();
        if (i2 == 0) {
            aFc1dSDKAFAdRevenueData.component2();
            throw null;
        }
        AFc1qSDK aFc1qSDKComponent2 = aFc1dSDKAFAdRevenueData.component2();
        int i3 = AFInAppEventParameterName + 121;
        AFInAppEventType = i3 % NotificationCompat.FLAG_HIGH_PRIORITY;
        if (i3 % 2 != 0) {
            return aFc1qSDKComponent2;
        }
        throw null;
    }

    public final void getRevenue(AFh1rSDK aFh1rSDK) {
        getMonetizationNetwork(new Object[]{this, aFh1rSDK}, 974724333, -974724320, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getSdkVersion() {
        int i = AFInAppEventParameterName + 97;
        AFInAppEventType = i % NotificationCompat.FLAG_HIGH_PRIORITY;
        int i2 = i % 2;
        AFd1pSDK aFd1pSDKCopy = AFAdRevenueData().copy();
        if (i2 == 0) {
            aFd1pSDKCopy.getMediationNetwork("getSdkVersion", new String[1]);
        } else {
            aFd1pSDKCopy.getMediationNetwork("getSdkVersion", new String[0]);
        }
        String strComponent1 = AFc1pSDK.component1();
        AFInAppEventParameterName = (AFInAppEventType + 87) % NotificationCompat.FLAG_HIGH_PRIORITY;
        return strComponent1;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final AppsFlyerLib init(@NonNull String str, AppsFlyerConversionListener appsFlyerConversionListener, @NonNull Context context) {
        return (AppsFlyerLib) getMonetizationNetwork(new Object[]{this, str, appsFlyerConversionListener, context}, -235242605, 235242617, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final boolean isPreInstalledApp(Context context) {
        int i = AFInAppEventParameterName + 77;
        AFInAppEventType = i % NotificationCompat.FLAG_HIGH_PRIORITY;
        int i2 = i % 2;
        getMediationNetwork(context);
        AFAdRevenueData().getRevenue();
        if (i2 != 0) {
            return AFc1pSDK.AFAdRevenueData(context);
        }
        AFc1pSDK.AFAdRevenueData(context);
        throw null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final boolean isStopped() {
        return ((Boolean) getMonetizationNetwork(new Object[]{this}, -1621727139, 1621727154, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logAdRevenue(@NonNull AFAdRevenueData aFAdRevenueData, @Nullable Map<String, Object> map) {
        AFInAppEventType = (AFInAppEventParameterName + 95) % NotificationCompat.FLAG_HIGH_PRIORITY;
        if (!this.toString) {
            AFAdRevenueData("logAdRevenue");
            return;
        }
        if (!aFAdRevenueData.areAllFieldsValid()) {
            int i = AFInAppEventType + 81;
            AFInAppEventParameterName = i % NotificationCompat.FLAG_HIGH_PRIORITY;
            if (i % 2 != 0) {
                AFLogger.INSTANCE.w(AFg1cSDK.AD_REVENUE, "Invalid ad revenue parameters provided");
                throw null;
            }
            AFLogger.INSTANCE.w(AFg1cSDK.AD_REVENUE, "Invalid ad revenue parameters provided");
            AFInAppEventType = (AFInAppEventParameterName + pd.l1) % NotificationCompat.FLAG_HIGH_PRIORITY;
            return;
        }
        if (AFAdRevenueData().registerClient().AFAdRevenueData()) {
            AFInAppEventParameterName = (AFInAppEventType + 93) % NotificationCompat.FLAG_HIGH_PRIORITY;
            AFLogger.INSTANCE.w(AFg1cSDK.AD_REVENUE, "SDK is stopped");
        } else {
            if (!AFk1ySDK.getMediationNetwork(AFAdRevenueData().registerClient().getMediationNetwork())) {
                AFAdRevenueData(new AFh1lSDK(aFAdRevenueData, map));
                return;
            }
            AFInAppEventParameterName = (AFInAppEventType + 41) % NotificationCompat.FLAG_HIGH_PRIORITY;
            copy();
            int i2 = AFInAppEventParameterName + 51;
            AFInAppEventType = i2 % NotificationCompat.FLAG_HIGH_PRIORITY;
            if (i2 % 2 == 0) {
                int i3 = 27 / 0;
            }
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logEvent(Context context, String str, Map<String, Object> map) {
        AFInAppEventParameterName = (AFInAppEventType + pd.K0) % NotificationCompat.FLAG_HIGH_PRIORITY;
        logEvent(context, str, map, null);
        int i = AFInAppEventType + 57;
        AFInAppEventParameterName = i % NotificationCompat.FLAG_HIGH_PRIORITY;
        if (i % 2 != 0) {
            int i2 = 63 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logEvent(@NonNull Context context, String str, Map<String, Object> map, AppsFlyerRequestListener appsFlyerRequestListener) {
        HashMap map2 = map == null ? null : new HashMap(map);
        getMediationNetwork(context);
        AFh1fSDK aFh1fSDK = new AFh1fSDK();
        aFh1fSDK.areAllFieldsValid = str;
        aFh1fSDK.getCurrencyIso4217Code = appsFlyerRequestListener;
        if (map2 != null && map2.containsKey(AFInAppEventParameterName.TOUCH_OBJ)) {
            HashMap map3 = new HashMap();
            Object obj = map2.get(AFInAppEventParameterName.TOUCH_OBJ);
            if (obj instanceof MotionEvent) {
                MotionEvent motionEvent = (MotionEvent) obj;
                HashMap map4 = new HashMap();
                map4.put("x", Float.valueOf(motionEvent.getX()));
                map4.put("y", Float.valueOf(motionEvent.getY()));
                map3.put("loc", map4);
                map3.put("pf", Float.valueOf(motionEvent.getPressure()));
                map3.put("rad", Float.valueOf(motionEvent.getTouchMajor() / 2.0f));
            } else {
                map3.put("error", "Parsing failed due to invalid input in 'af_touch_obj'.");
                AFLogger.INSTANCE.w(AFg1cSDK.PREDICT, "Parsing failed due to invalid input in 'af_touch_obj'.", true);
            }
            Map<String, ?> mapSingletonMap = Collections.singletonMap("tch_data", map3);
            map2.remove(AFInAppEventParameterName.TOUCH_OBJ);
            aFh1fSDK.getMediationNetwork(mapSingletonMap);
        }
        aFh1fSDK.getMonetizationNetwork = map2;
        AFd1pSDK aFd1pSDKCopy = AFAdRevenueData().copy();
        Map map5 = aFh1fSDK.getMonetizationNetwork;
        if (map5 == null) {
            map5 = new HashMap();
        }
        aFd1pSDKCopy.getMediationNetwork("logEvent", str, new JSONObject(map5).toString());
        if (str == null) {
            getCurrencyIso4217Code(context, AFh1xSDK.logEvent);
        }
        getMonetizationNetwork(aFh1fSDK, component1(context));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logLocation(Context context, double d, double d2) {
        AFAdRevenueData().copy().getMediationNetwork("logLocation", String.valueOf(d), String.valueOf(d2));
        HashMap map = new HashMap();
        map.put(AFInAppEventParameterName.LONGITUDE, Double.toString(d2));
        map.put(AFInAppEventParameterName.LATITUDE, Double.toString(d));
        getMonetizationNetwork(new Object[]{this, context, AFInAppEventType.LOCATION_COORDINATES, map}, 1732368696, -1732368678, System.identityHashCode(this));
        int i = AFInAppEventParameterName + 93;
        AFInAppEventType = i % NotificationCompat.FLAG_HIGH_PRIORITY;
        if (i % 2 == 0) {
            int i2 = 71 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logSession(Context context) {
        AFInAppEventParameterName = (AFInAppEventType + 67) % NotificationCompat.FLAG_HIGH_PRIORITY;
        AFAdRevenueData().copy().getMediationNetwork("logSession", new String[0]);
        AFAdRevenueData().copy().getCurrencyIso4217Code();
        getCurrencyIso4217Code(context, AFh1xSDK.logSession);
        getMonetizationNetwork(new Object[]{this, context, null, null}, 1732368696, -1732368678, System.identityHashCode(this));
        int i = AFInAppEventParameterName + 87;
        AFInAppEventType = i % NotificationCompat.FLAG_HIGH_PRIORITY;
        if (i % 2 == 0) {
            int i2 = 16 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void onPause(Context context) {
        getMonetizationNetwork(new Object[]{this, context}, -1480636038, 1480636052, System.identityHashCode(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    @Override // com.appsflyer.AppsFlyerLib
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void performOnAppAttribution(@androidx.annotation.NonNull android.content.Context r3, @androidx.annotation.NonNull java.net.URI r4) {
        /*
            r2 = this;
            int r0 = com.appsflyer.internal.AFa1tSDK.AFInAppEventParameterName
            int r0 = r0 + 35
            int r1 = r0 % 128
            com.appsflyer.internal.AFa1tSDK.AFInAppEventType = r1
            int r0 = r0 % 2
            java.lang.String r1 = "\""
            if (r0 != 0) goto L15
            r0 = 52
            int r0 = r0 / 0
            if (r4 == 0) goto L6d
            goto L17
        L15:
            if (r4 == 0) goto L6d
        L17:
            java.lang.String r0 = r4.toString()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L6d
            if (r3 != 0) goto L42
            com.appsflyer.internal.AFc1dSDK r2 = r2.AFAdRevenueData()
            com.appsflyer.internal.AFa1oSDK r2 = r2.d()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r0 = "Context is \""
            r4.<init>(r0)
            r4.append(r3)
            r4.append(r1)
            java.lang.String r3 = r4.toString()
            com.appsflyer.deeplink.DeepLinkResult$Error r4 = com.appsflyer.deeplink.DeepLinkResult.Error.NETWORK
            r2.AFAdRevenueData(r3, r4)
            return
        L42:
            r2.getMediationNetwork(r3)
            com.appsflyer.internal.AFc1dSDK r3 = r2.AFAdRevenueData()
            com.appsflyer.internal.AFa1oSDK r3 = r3.d()
            com.appsflyer.internal.AFc1dSDK r2 = r2.AFAdRevenueData()
            com.appsflyer.internal.AFa1gSDK r2 = r2.afVerboseLog()
            com.appsflyer.internal.AFa1jSDK r2 = com.appsflyer.internal.AFa1jSDK.getCurrencyIso4217Code(r2)
            java.lang.String r4 = r4.toString()
            android.net.Uri r4 = android.net.Uri.parse(r4)
            r3.f_(r2, r4)
            int r2 = com.appsflyer.internal.AFa1tSDK.AFInAppEventType
            int r2 = r2 + 113
            int r2 = r2 % 128
            com.appsflyer.internal.AFa1tSDK.AFInAppEventParameterName = r2
            return
        L6d:
            com.appsflyer.internal.AFc1dSDK r2 = r2.AFAdRevenueData()
            com.appsflyer.internal.AFa1oSDK r2 = r2.d()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r0 = "Link is \""
            r3.<init>(r0)
            r3.append(r4)
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            com.appsflyer.deeplink.DeepLinkResult$Error r4 = com.appsflyer.deeplink.DeepLinkResult.Error.NETWORK
            r2.AFAdRevenueData(r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1tSDK.performOnAppAttribution(android.content.Context, java.net.URI):void");
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void performOnDeepLinking(@NonNull Intent intent, @NonNull Context context) {
        int i = AFInAppEventType;
        int i2 = i + 55;
        AFInAppEventParameterName = i2 % NotificationCompat.FLAG_HIGH_PRIORITY;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (intent == null) {
            AFAdRevenueData().d().AFAdRevenueData("performOnDeepLinking was called with null intent", DeepLinkResult.Error.DEVELOPER_ERROR);
            return;
        }
        if (context == null) {
            AFInAppEventParameterName = (i + 29) % NotificationCompat.FLAG_HIGH_PRIORITY;
            AFAdRevenueData().d().AFAdRevenueData("performOnDeepLinking was called with null context", DeepLinkResult.Error.DEVELOPER_ERROR);
            return;
        }
        Context applicationContext = context.getApplicationContext();
        getMediationNetwork(applicationContext);
        AFAdRevenueData().getMonetizationNetwork().execute(new d(this, applicationContext, intent, (byte) 0));
        int i3 = AFInAppEventType + 59;
        AFInAppEventParameterName = i3 % NotificationCompat.FLAG_HIGH_PRIORITY;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void registerConversionListener(Context context, AppsFlyerConversionListener appsFlyerConversionListener) {
        int i = AFInAppEventType + 79;
        AFInAppEventParameterName = i % NotificationCompat.FLAG_HIGH_PRIORITY;
        if (i % 2 != 0) {
            AFAdRevenueData().copy().getMediationNetwork("registerConversionListener", new String[0]);
        } else {
            AFAdRevenueData().copy().getMediationNetwork("registerConversionListener", new String[0]);
        }
        getRevenue(appsFlyerConversionListener);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void registerValidatorListener(Context context, AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener) {
        AFAdRevenueData().copy().getMediationNetwork("registerValidatorListener", new String[0]);
        AFLogger.afDebugLog("registerValidatorListener called");
        if (appsFlyerInAppPurchaseValidatorListener != null) {
            AFAdRevenueData = appsFlyerInAppPurchaseValidatorListener;
            AFInAppEventParameterName = (AFInAppEventType + 11) % NotificationCompat.FLAG_HIGH_PRIORITY;
            return;
        }
        int i = AFInAppEventParameterName + 25;
        AFInAppEventType = i % NotificationCompat.FLAG_HIGH_PRIORITY;
        int i2 = i % 2;
        AFLogger.afDebugLog("registerValidatorListener null listener");
        if (i2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void sendInAppPurchaseData(android.content.Context r3, java.util.Map<java.lang.String, java.lang.Object> r4, com.appsflyer.PurchaseHandler.PurchaseValidationCallback r5) {
        /*
            r2 = this;
            int r0 = com.appsflyer.internal.AFa1tSDK.AFInAppEventParameterName
            int r0 = r0 + 101
            int r1 = r0 % 128
            com.appsflyer.internal.AFa1tSDK.AFInAppEventType = r1
            int r0 = r0 % 2
            java.lang.String r1 = "purchases"
            r2.getMediationNetwork(r3)
            com.appsflyer.internal.AFc1dSDK r2 = r2.AFAdRevenueData()
            com.appsflyer.PurchaseHandler r2 = r2.component4()
            if (r0 != 0) goto L25
            r3 = 0
            java.lang.String[] r0 = new java.lang.String[r3]
            r0[r3] = r1
            boolean r3 = r2.AFAdRevenueData(r4, r5, r0)
            if (r3 == 0) goto L42
            goto L2f
        L25:
            java.lang.String[] r3 = new java.lang.String[]{r1}
            boolean r3 = r2.AFAdRevenueData(r4, r5, r3)
            if (r3 == 0) goto L42
        L2f:
            com.appsflyer.internal.AFe1cSDK r3 = new com.appsflyer.internal.AFe1cSDK
            com.appsflyer.internal.AFc1dSDK r0 = r2.getCurrencyIso4217Code
            r3.<init>(r4, r5, r0)
            com.appsflyer.internal.AFe1lSDK r2 = r2.getRevenue
            java.util.concurrent.Executor r4 = r2.getRevenue
            com.appsflyer.internal.AFe1lSDK$5 r5 = new com.appsflyer.internal.AFe1lSDK$5
            r5.<init>(r3)
            r4.execute(r5)
        L42:
            int r2 = com.appsflyer.internal.AFa1tSDK.AFInAppEventParameterName
            int r2 = r2 + 27
            int r3 = r2 % 128
            com.appsflyer.internal.AFa1tSDK.AFInAppEventType = r3
            int r2 = r2 % 2
            if (r2 == 0) goto L4f
            return
        L4f:
            r2 = 0
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1tSDK.sendInAppPurchaseData(android.content.Context, java.util.Map, com.appsflyer.PurchaseHandler$PurchaseValidationCallback):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void sendPurchaseData(android.content.Context r3, java.util.Map<java.lang.String, java.lang.Object> r4, com.appsflyer.PurchaseHandler.PurchaseValidationCallback r5) {
        /*
            r2 = this;
            int r0 = com.appsflyer.internal.AFa1tSDK.AFInAppEventParameterName
            int r0 = r0 + 43
            int r1 = r0 % 128
            com.appsflyer.internal.AFa1tSDK.AFInAppEventType = r1
            int r0 = r0 % 2
            java.lang.String r1 = "subscriptions"
            r2.getMediationNetwork(r3)
            com.appsflyer.internal.AFc1dSDK r2 = r2.AFAdRevenueData()
            com.appsflyer.PurchaseHandler r2 = r2.component4()
            if (r0 != 0) goto L26
            r3 = 0
            java.lang.String[] r3 = new java.lang.String[r3]
            r0 = 1
            r3[r0] = r1
            boolean r3 = r2.AFAdRevenueData(r4, r5, r3)
            if (r3 == 0) goto L43
            goto L30
        L26:
            java.lang.String[] r3 = new java.lang.String[]{r1}
            boolean r3 = r2.AFAdRevenueData(r4, r5, r3)
            if (r3 == 0) goto L43
        L30:
            com.appsflyer.internal.AFe1hSDK r3 = new com.appsflyer.internal.AFe1hSDK
            com.appsflyer.internal.AFc1dSDK r0 = r2.getCurrencyIso4217Code
            r3.<init>(r4, r5, r0)
            com.appsflyer.internal.AFe1lSDK r2 = r2.getRevenue
            java.util.concurrent.Executor r4 = r2.getRevenue
            com.appsflyer.internal.AFe1lSDK$5 r5 = new com.appsflyer.internal.AFe1lSDK$5
            r5.<init>(r3)
            r4.execute(r5)
        L43:
            int r2 = com.appsflyer.internal.AFa1tSDK.AFInAppEventType
            int r2 = r2 + 21
            int r2 = r2 % 128
            com.appsflyer.internal.AFa1tSDK.AFInAppEventParameterName = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1tSDK.sendPurchaseData(android.content.Context, java.util.Map, com.appsflyer.PurchaseHandler$PurchaseValidationCallback):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x016b  */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void sendPushNotificationData(@androidx.annotation.Nullable android.app.Activity r19) {
        /*
            Method dump skipped, instructions count: 415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1tSDK.sendPushNotificationData(android.app.Activity):void");
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAdditionalData(Map<String, Object> map) {
        getMonetizationNetwork(new Object[]{this, map}, -2145945282, 2145945283, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAndroidIdData(String str) {
        AFInAppEventParameterName = (AFInAppEventType + 13) % NotificationCompat.FLAG_HIGH_PRIORITY;
        AFAdRevenueData().copy().getMediationNetwork("setAndroidIdData", str);
        AFAdRevenueData().afInfoLog().AFAdRevenueData = str;
        int i = AFInAppEventType + 41;
        AFInAppEventParameterName = i % NotificationCompat.FLAG_HIGH_PRIORITY;
        if (i % 2 != 0) {
            int i2 = 38 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAppId(String str) {
        AFInAppEventParameterName = (AFInAppEventType + 53) % NotificationCompat.FLAG_HIGH_PRIORITY;
        AFAdRevenueData().copy().getMediationNetwork("setAppId", str);
        getMonetizationNetwork(new Object[]{AppsFlyerProperties.APP_ID, str}, -692563571, 692563575, (int) System.currentTimeMillis());
        AFInAppEventType = (AFInAppEventParameterName + 95) % NotificationCompat.FLAG_HIGH_PRIORITY;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0044  */
    @Override // com.appsflyer.AppsFlyerLib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setAppInviteOneLink(java.lang.String r6) {
        /*
            r5 = this;
            int r0 = com.appsflyer.internal.AFa1tSDK.AFInAppEventType
            int r0 = r0 + 15
            int r1 = r0 % 128
            com.appsflyer.internal.AFa1tSDK.AFInAppEventParameterName = r1
            int r0 = r0 % 2
            java.lang.String r1 = "oneLinkSlug"
            java.lang.String r2 = "setAppInviteOneLink = "
            java.lang.String r3 = "setAppInviteOneLink"
            com.appsflyer.internal.AFc1dSDK r5 = r5.AFAdRevenueData()
            com.appsflyer.internal.AFd1pSDK r5 = r5.copy()
            if (r0 == 0) goto L30
            r0 = 1
            java.lang.String[] r4 = new java.lang.String[r0]
            r4[r0] = r6
            r5.getMediationNetwork(r3, r4)
            java.lang.String r5 = java.lang.String.valueOf(r6)
            java.lang.String r5 = r2.concat(r5)
            com.appsflyer.AFLogger.afInfoLog(r5)
            if (r6 == 0) goto L52
            goto L44
        L30:
            java.lang.String[] r0 = new java.lang.String[]{r6}
            r5.getMediationNetwork(r3, r0)
            java.lang.String r5 = java.lang.String.valueOf(r6)
            java.lang.String r5 = r2.concat(r5)
            com.appsflyer.AFLogger.afInfoLog(r5)
            if (r6 == 0) goto L52
        L44:
            com.appsflyer.AppsFlyerProperties r5 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r5 = r5.getString(r1)
            boolean r5 = r6.equals(r5)
            if (r5 != 0) goto L75
        L52:
            com.appsflyer.AppsFlyerProperties r5 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r0 = "onelinkDomain"
            r5.remove(r0)
            com.appsflyer.AppsFlyerProperties r5 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r0 = "onelinkVersion"
            r5.remove(r0)
            com.appsflyer.AppsFlyerProperties r5 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r0 = "onelinkScheme"
            r5.remove(r0)
            int r5 = com.appsflyer.internal.AFa1tSDK.AFInAppEventType
            int r5 = r5 + 29
            int r5 = r5 % 128
            com.appsflyer.internal.AFa1tSDK.AFInAppEventParameterName = r5
        L75:
            java.lang.Object[] r5 = new java.lang.Object[]{r1, r6}
            long r0 = java.lang.System.currentTimeMillis()
            int r6 = (int) r0
            r0 = -692563571(0xffffffffd6b8518d, float:-1.013302E14)
            r1 = 692563575(0x2947ae77, float:4.43382E-14)
            getMonetizationNetwork(r5, r0, r1, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1tSDK.setAppInviteOneLink(java.lang.String):void");
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCollectAndroidID(boolean z) {
        AFInAppEventParameterName = (AFInAppEventType + 99) % NotificationCompat.FLAG_HIGH_PRIORITY;
        AFAdRevenueData().copy().getMediationNetwork("setCollectAndroidID", String.valueOf(z));
        getMonetizationNetwork(new Object[]{AppsFlyerProperties.COLLECT_ANDROID_ID, Boolean.toString(z)}, -692563571, 692563575, (int) System.currentTimeMillis());
        getMonetizationNetwork(new Object[]{AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, Boolean.toString(z)}, -692563571, 692563575, (int) System.currentTimeMillis());
        int i = AFInAppEventType + pd.j1;
        AFInAppEventParameterName = i % NotificationCompat.FLAG_HIGH_PRIORITY;
        if (i % 2 != 0) {
            int i2 = 3 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCollectIMEI(boolean z) {
        AFInAppEventType = (AFInAppEventParameterName + 45) % NotificationCompat.FLAG_HIGH_PRIORITY;
        AFAdRevenueData().copy().getMediationNetwork("setCollectIMEI", String.valueOf(z));
        getMonetizationNetwork(new Object[]{AppsFlyerProperties.COLLECT_IMEI, Boolean.toString(z)}, -692563571, 692563575, (int) System.currentTimeMillis());
        getMonetizationNetwork(new Object[]{AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, Boolean.toString(z)}, -692563571, 692563575, (int) System.currentTimeMillis());
        int i = AFInAppEventType + 117;
        AFInAppEventParameterName = i % NotificationCompat.FLAG_HIGH_PRIORITY;
        if (i % 2 != 0) {
            int i2 = 95 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void setCollectOaid(boolean z) {
        AFInAppEventType = (AFInAppEventParameterName + 125) % NotificationCompat.FLAG_HIGH_PRIORITY;
        AFAdRevenueData().copy().getMediationNetwork("setCollectOaid", String.valueOf(z));
        getMonetizationNetwork(new Object[]{AppsFlyerProperties.COLLECT_OAID, Boolean.toString(z)}, -692563571, 692563575, (int) System.currentTimeMillis());
        int i = AFInAppEventType + 85;
        AFInAppEventParameterName = i % NotificationCompat.FLAG_HIGH_PRIORITY;
        if (i % 2 != 0) {
            int i2 = 31 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setConsentData(@NonNull AppsFlyerConsent appsFlyerConsent) {
        AFInAppEventParameterName = (AFInAppEventType + 77) % NotificationCompat.FLAG_HIGH_PRIORITY;
        Objects.requireNonNull(appsFlyerConsent);
        AFAdRevenueData().afInfoLog().component2 = appsFlyerConsent;
        AFInAppEventType = (AFInAppEventParameterName + 45) % NotificationCompat.FLAG_HIGH_PRIORITY;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCurrencyCode(String str) {
        AFInAppEventParameterName = (AFInAppEventType + 73) % NotificationCompat.FLAG_HIGH_PRIORITY;
        AFAdRevenueData().copy().getMediationNetwork("setCurrencyCode", str);
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.CURRENCY_CODE, str);
        AFInAppEventType = (AFInAppEventParameterName + 9) % NotificationCompat.FLAG_HIGH_PRIORITY;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCustomerIdAndLogSession(String str, @NonNull Context context) {
        if (context != null) {
            if (!getMediationNetwork()) {
                setCustomerUserId(str);
                AFLogger.afInfoLog("waitForCustomerUserId is false; setting CustomerUserID: ".concat(String.valueOf(str)), true);
                return;
            }
            setCustomerUserId(str);
            StringBuilder sb = new StringBuilder("CustomerUserId set: ");
            sb.append(str);
            sb.append(" - Initializing AppsFlyer Tacking");
            AFLogger.afInfoLog(sb.toString(), true);
            String referrer = AppsFlyerProperties.getInstance().getReferrer(AFAdRevenueData().component2());
            getCurrencyIso4217Code(context, AFh1xSDK.setCustomerIdAndLogSession);
            AFAdRevenueData().registerClient().getMediationNetwork();
            if (referrer == null) {
                AFInAppEventType = (AFInAppEventParameterName + 35) % NotificationCompat.FLAG_HIGH_PRIORITY;
                referrer = "";
            }
            if (context instanceof Activity) {
                ((Activity) context).getIntent();
                AFInAppEventType = (AFInAppEventParameterName + pd.h1) % NotificationCompat.FLAG_HIGH_PRIORITY;
            }
            getMonetizationNetwork(new Object[]{this, context, referrer}, 1659672083, -1659672066, System.identityHashCode(this));
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCustomerUserId(String str) {
        AFInAppEventParameterName = (AFInAppEventType + 65) % NotificationCompat.FLAG_HIGH_PRIORITY;
        AFAdRevenueData().copy().getMediationNetwork("setCustomerUserId", str);
        AFLogger.afInfoLog("setCustomerUserId = ".concat(String.valueOf(str)));
        getMonetizationNetwork(new Object[]{AppsFlyerProperties.APP_USER_ID, str}, -692563571, 692563575, (int) System.currentTimeMillis());
        getCurrencyIso4217Code(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false);
        AFInAppEventParameterName = (AFInAppEventType + 33) % NotificationCompat.FLAG_HIGH_PRIORITY;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setDebugLog(boolean z) {
        AFLogger.LogLevel logLevel;
        AFInAppEventType = (AFInAppEventParameterName + 115) % NotificationCompat.FLAG_HIGH_PRIORITY;
        if (z) {
            logLevel = AFLogger.LogLevel.DEBUG;
            AFInAppEventParameterName = (AFInAppEventType + pd.T0) % NotificationCompat.FLAG_HIGH_PRIORITY;
        } else {
            logLevel = AFLogger.LogLevel.NONE;
        }
        setLogLevel(logLevel);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setDisableAdvertisingIdentifiers(boolean z) {
        getMonetizationNetwork(new Object[]{this, Boolean.valueOf(z)}, 2015599714, -2015599705, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setDisableNetworkData(boolean z) {
        AFInAppEventType = (AFInAppEventParameterName + 61) % NotificationCompat.FLAG_HIGH_PRIORITY;
        AFLogger.afDebugLog("setDisableNetworkData: ".concat(String.valueOf(z)));
        getCurrencyIso4217Code(AppsFlyerProperties.DISABLE_NETWORK_DATA, z);
        AFInAppEventParameterName = (AFInAppEventType + 19) % NotificationCompat.FLAG_HIGH_PRIORITY;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setExtension(String str) {
        int i = AFInAppEventParameterName + pd.T0;
        AFInAppEventType = i % NotificationCompat.FLAG_HIGH_PRIORITY;
        int i2 = i % 2;
        AFd1pSDK aFd1pSDKCopy = AFAdRevenueData().copy();
        if (i2 == 0) {
            String[] strArr = new String[0];
            strArr[0] = str;
            aFd1pSDKCopy.getMediationNetwork("setExtension", strArr);
        } else {
            aFd1pSDKCopy.getMediationNetwork("setExtension", str);
        }
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.EXTENSION, str);
        int i3 = AFInAppEventParameterName + 1;
        AFInAppEventType = i3 % NotificationCompat.FLAG_HIGH_PRIORITY;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setHost(@Nullable String str, @NonNull String str2) {
        AFInAppEventType = (AFInAppEventParameterName + 13) % NotificationCompat.FLAG_HIGH_PRIORITY;
        if (AFk1ySDK.getCurrencyIso4217Code(str2)) {
            AFLogger.afWarnLog("hostname was empty or null - call for setHost is skipped");
            return;
        }
        int i = AFInAppEventType + 27;
        AFInAppEventParameterName = i % NotificationCompat.FLAG_HIGH_PRIORITY;
        if (i % 2 != 0) {
            throw null;
        }
        AFe1zSDK.getMediationNetwork(new AFe1vSDK(str != null ? str.trim() : "", str2.trim()));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setImeiData(String str) {
        AFInAppEventParameterName = (AFInAppEventType + 37) % NotificationCompat.FLAG_HIGH_PRIORITY;
        AFAdRevenueData().copy().getMediationNetwork("setImeiData", str);
        AFAdRevenueData().registerClient().getMediationNetwork(str);
        AFInAppEventType = (AFInAppEventParameterName + 125) % NotificationCompat.FLAG_HIGH_PRIORITY;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setInstallId(@NonNull String str) {
        AFAdRevenueData().copy().getMediationNetwork("setInstallId", new String[0]);
        if (!this.toString) {
            AFLogger.INSTANCE.d(AFg1cSDK.GENERAL, "AppsFlyerLib.init() method should be called first");
            return;
        }
        if (!AFAdRevenueData().getRevenue().getMonetizationNetwork("APPSFLYER_ALLOW_CUSTOM_INSTALL_ID", false)) {
            AFLogger.INSTANCE.d(AFg1cSDK.GENERAL, "APPSFLYER_ALLOW_CUSTOM_INSTALL_ID Manifest flag should be set to true first");
            return;
        }
        if (str == null) {
            AFLogger.INSTANCE.d(AFg1cSDK.GENERAL, "AppsFlyer installId can't be null");
            AFInAppEventParameterName = (AFInAppEventType + 95) % NotificationCompat.FLAG_HIGH_PRIORITY;
            return;
        }
        AFb1iSDK.getCurrencyIso4217Code(str, AFAdRevenueData().component2());
        int i = AFInAppEventType + 25;
        AFInAppEventParameterName = i % NotificationCompat.FLAG_HIGH_PRIORITY;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setIsUpdate(boolean z) {
        int i = AFInAppEventParameterName + 31;
        AFInAppEventType = i % NotificationCompat.FLAG_HIGH_PRIORITY;
        int i2 = i % 2;
        AFd1pSDK aFd1pSDKCopy = AFAdRevenueData().copy();
        if (i2 == 0) {
            String[] strArr = new String[0];
            strArr[1] = String.valueOf(z);
            aFd1pSDKCopy.getMediationNetwork("setIsUpdate", strArr);
        } else {
            aFd1pSDKCopy.getMediationNetwork("setIsUpdate", String.valueOf(z));
        }
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.IS_UPDATE, z);
        AFInAppEventType = (AFInAppEventParameterName + 51) % NotificationCompat.FLAG_HIGH_PRIORITY;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setLogLevel(@NonNull AFLogger.LogLevel logLevel) {
        boolean z;
        if (logLevel.getLevel() > AFLogger.LogLevel.NONE.getLevel()) {
            z = true;
        } else {
            AFInAppEventType = (AFInAppEventParameterName + 51) % NotificationCompat.FLAG_HIGH_PRIORITY;
            z = false;
        }
        AFAdRevenueData().copy().getMediationNetwork("log", String.valueOf(z));
        AppsFlyerProperties.getInstance().set("logLevel", logLevel.getLevel());
        if (z) {
            AFAdRevenueData().v().component4();
            return;
        }
        int i = AFInAppEventParameterName + 121;
        AFInAppEventType = i % NotificationCompat.FLAG_HIGH_PRIORITY;
        int i2 = i % 2;
        AFAdRevenueData().v().getMonetizationNetwork();
        if (i2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setMinTimeBetweenSessions(int i) {
        int i2 = AFInAppEventParameterName + 5;
        AFInAppEventType = i2 % NotificationCompat.FLAG_HIGH_PRIORITY;
        int i3 = i2 % 2;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        long j = i;
        if (i3 != 0) {
            this.component3 = timeUnit.toMillis(j);
        } else {
            this.component3 = timeUnit.toMillis(j);
            int i4 = 15 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setOaidData(String str) {
        int i = AFInAppEventType + 85;
        AFInAppEventParameterName = i % NotificationCompat.FLAG_HIGH_PRIORITY;
        int i2 = i % 2;
        AFd1pSDK aFd1pSDKCopy = AFAdRevenueData().copy();
        if (i2 != 0) {
            String[] strArr = new String[1];
            strArr[1] = str;
            aFd1pSDKCopy.getMediationNetwork("setOaidData", strArr);
        } else {
            aFd1pSDKCopy.getMediationNetwork("setOaidData", str);
        }
        AFb1jSDK.getMonetizationNetwork = str;
        AFInAppEventParameterName = (AFInAppEventType + pd.K0) % NotificationCompat.FLAG_HIGH_PRIORITY;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setOneLinkCustomDomain(String... strArr) {
        String str;
        int i = AFInAppEventParameterName + 125;
        AFInAppEventType = i % NotificationCompat.FLAG_HIGH_PRIORITY;
        if (i % 2 == 0) {
            Object[] objArr = new Object[0];
            objArr[1] = Arrays.toString(strArr);
            str = String.format("setOneLinkCustomDomain %s", objArr);
        } else {
            str = "setOneLinkCustomDomain " + Arrays.toString(strArr);
        }
        AFLogger.afDebugLog(str);
        AFAdRevenueData().d().component4 = strArr;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setOutOfStore(String str) {
        int i = AFInAppEventParameterName + 81;
        int i2 = i % NotificationCompat.FLAG_HIGH_PRIORITY;
        AFInAppEventType = i2;
        if (i % 2 == 0) {
            throw null;
        }
        if (str == null) {
            AFLogger.afWarnLog("Cannot set setOutOfStore with null", true);
            return;
        }
        int i3 = i2 + 25;
        AFInAppEventParameterName = i3 % NotificationCompat.FLAG_HIGH_PRIORITY;
        if (i3 % 2 != 0) {
            String lowerCase = str.toLowerCase(Locale.getDefault());
            AppsFlyerProperties.getInstance().set(AppsFlyerProperties.AF_STORE_FROM_API, lowerCase);
            AFLogger.afInfoLog("Store API set with value: ".concat(String.valueOf(lowerCase)), false);
        } else {
            String lowerCase2 = str.toLowerCase(Locale.getDefault());
            AppsFlyerProperties.getInstance().set(AppsFlyerProperties.AF_STORE_FROM_API, lowerCase2);
            AFLogger.afInfoLog("Store API set with value: ".concat(String.valueOf(lowerCase2)), true);
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPartnerData(@NonNull String str, Map<String, Object> map) {
        getMonetizationNetwork(new Object[]{this, str, map}, 841587779, -841587759, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPhoneNumber(String str) {
        int i = AFInAppEventParameterName + 113;
        AFInAppEventType = i % NotificationCompat.FLAG_HIGH_PRIORITY;
        int i2 = i % 2;
        AFAdRevenueData().afInfoLog().getMediationNetwork = AFj1cSDK.getMonetizationNetwork(str);
        if (i2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPluginInfo(@NonNull PluginInfo pluginInfo) {
        int i = AFInAppEventType + 71;
        AFInAppEventParameterName = i % NotificationCompat.FLAG_HIGH_PRIORITY;
        int i2 = i % 2;
        Objects.requireNonNull(pluginInfo);
        AFAdRevenueData().unregisterClient().AFAdRevenueData(pluginInfo);
        if (i2 != 0) {
            int i3 = 39 / 0;
        }
        int i4 = AFInAppEventParameterName + 95;
        AFInAppEventType = i4 % NotificationCompat.FLAG_HIGH_PRIORITY;
        if (i4 % 2 == 0) {
            int i5 = 38 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPreinstallAttribution(String str, String str2, String str3) throws JSONException {
        AFLogger.afDebugLog("setPreinstallAttribution API called");
        JSONObject jSONObject = new JSONObject();
        try {
            if (str != null) {
                int i = AFInAppEventType + 3;
                AFInAppEventParameterName = i % NotificationCompat.FLAG_HIGH_PRIORITY;
                if (i % 2 != 0) {
                    jSONObject.put("pid", str);
                    int i2 = 70 / 0;
                } else {
                    jSONObject.put("pid", str);
                }
            }
            if (str2 != null) {
                jSONObject.put("c", str2);
            }
            if (str3 != null) {
                jSONObject.put("af_siteid", str3);
            }
        } catch (JSONException e) {
            AFLogger.afErrorLog(e.getMessage(), e);
        }
        if (jSONObject.has("pid")) {
            AFInAppEventType = (AFInAppEventParameterName + 85) % NotificationCompat.FLAG_HIGH_PRIORITY;
            getMonetizationNetwork(new Object[]{"preInstallName", jSONObject.toString()}, -692563571, 692563575, (int) System.currentTimeMillis());
            return;
        }
        AFLogger.afWarnLog("Cannot set preinstall attribution data without a media source");
        int i3 = AFInAppEventType + 5;
        AFInAppEventParameterName = i3 % NotificationCompat.FLAG_HIGH_PRIORITY;
        if (i3 % 2 != 0) {
            int i4 = 19 / 0;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setResolveDeepLinkURLs(String... strArr) {
        AFInAppEventType = (AFInAppEventParameterName + 9) % NotificationCompat.FLAG_HIGH_PRIORITY;
        AFLogger.afDebugLog("setResolveDeepLinkURLs " + Arrays.toString(strArr));
        AFa1oSDK aFa1oSDKD = AFAdRevenueData().d();
        aFa1oSDKD.component2.clear();
        aFa1oSDKD.component2.addAll(Arrays.asList(strArr));
        AFInAppEventParameterName = (AFInAppEventType + 41) % NotificationCompat.FLAG_HIGH_PRIORITY;
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void setSharingFilter(@NonNull String... strArr) {
        AFInAppEventType = (AFInAppEventParameterName + 9) % NotificationCompat.FLAG_HIGH_PRIORITY;
        setSharingFilterForPartners(strArr);
        int i = AFInAppEventParameterName + 9;
        AFInAppEventType = i % NotificationCompat.FLAG_HIGH_PRIORITY;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final void setSharingFilterForAllPartners() {
        int i = AFInAppEventType + 87;
        AFInAppEventParameterName = i % NotificationCompat.FLAG_HIGH_PRIORITY;
        if (i % 2 != 0) {
            setSharingFilterForPartners("all");
        } else {
            setSharingFilterForPartners("all");
        }
        int i2 = AFInAppEventParameterName + 27;
        AFInAppEventType = i2 % NotificationCompat.FLAG_HIGH_PRIORITY;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setSharingFilterForPartners(String... strArr) {
        AFAdRevenueData().afInfoLog().getRevenue = new AFb1uSDK(strArr);
        AFInAppEventParameterName = (AFInAppEventType + 77) % NotificationCompat.FLAG_HIGH_PRIORITY;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setUserEmails(AppsFlyerProperties.EmailsCryptType emailsCryptType, String... strArr) {
        getMonetizationNetwork(new Object[]{this, emailsCryptType, strArr}, -363126917, 363126927, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setUserEmails(String... strArr) {
        getMonetizationNetwork(new Object[]{this, strArr}, 1505056603, -1505056581, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void start(@NonNull Context context) {
        AFInAppEventType = (AFInAppEventParameterName + 15) % NotificationCompat.FLAG_HIGH_PRIORITY;
        start(context, null);
        AFInAppEventType = (AFInAppEventParameterName + pd.h1) % NotificationCompat.FLAG_HIGH_PRIORITY;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void start(@NonNull Context context, String str) {
        getMonetizationNetwork(new Object[]{this, context, str}, -1758296594, 1758296610, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void start(@NonNull Context context, String str, AppsFlyerRequestListener appsFlyerRequestListener) {
        getMonetizationNetwork(new Object[]{this, context, str, appsFlyerRequestListener}, -1542206359, 1542206364, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void stop(boolean z, Context context) {
        getMediationNetwork(context);
        AFc1dSDK aFc1dSDKAFAdRevenueData = AFAdRevenueData();
        aFc1dSDKAFAdRevenueData.registerClient().getMediationNetwork(z);
        aFc1dSDKAFAdRevenueData.getMonetizationNetwork().submit(new e(aFc1dSDKAFAdRevenueData, (byte) 0));
        if (z) {
            int i = AFInAppEventParameterName + 15;
            AFInAppEventType = i % NotificationCompat.FLAG_HIGH_PRIORITY;
            int i2 = i % 2;
            AFc1qSDK aFc1qSDKComponent2 = aFc1dSDKAFAdRevenueData.component2();
            if (i2 == 0) {
                aFc1qSDKComponent2.getCurrencyIso4217Code("is_stop_tracking_used", false);
            } else {
                aFc1qSDKComponent2.getCurrencyIso4217Code("is_stop_tracking_used", true);
            }
        }
        AFInAppEventParameterName = (AFInAppEventType + 51) % NotificationCompat.FLAG_HIGH_PRIORITY;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void subscribeForDeepLink(@NonNull DeepLinkListener deepLinkListener) {
        AFInAppEventParameterName = (AFInAppEventType + 47) % NotificationCompat.FLAG_HIGH_PRIORITY;
        subscribeForDeepLink(deepLinkListener, 3000L);
        AFInAppEventParameterName = (AFInAppEventType + 3) % NotificationCompat.FLAG_HIGH_PRIORITY;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void subscribeForDeepLink(@NonNull DeepLinkListener deepLinkListener, long j) {
        AFInAppEventType = (AFInAppEventParameterName + 7) % NotificationCompat.FLAG_HIGH_PRIORITY;
        AFAdRevenueData().d().getMonetizationNetwork = deepLinkListener;
        AFAdRevenueData().d().component3 = j;
        AFInAppEventParameterName = (AFInAppEventType + 7) % NotificationCompat.FLAG_HIGH_PRIORITY;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void unregisterConversionListener() {
        AFInAppEventParameterName = (AFInAppEventType + 79) % NotificationCompat.FLAG_HIGH_PRIORITY;
        AFAdRevenueData().copy().getMediationNetwork("unregisterConversionListener", new String[0]);
        this.getCurrencyIso4217Code = null;
        int i = AFInAppEventType + 75;
        AFInAppEventParameterName = i % NotificationCompat.FLAG_HIGH_PRIORITY;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void updateServerUninstallToken(Context context, String str) {
        getMediationNetwork(context);
        AFg1ySDK aFg1ySDK = new AFg1ySDK(context);
        if (str == null || str.trim().isEmpty()) {
            AFLogger.INSTANCE.w(AFg1cSDK.UNINSTALL, "Firebase Token is either empty or null and was not registered.");
            return;
        }
        AFLogger.INSTANCE.i(AFg1cSDK.UNINSTALL, "Firebase Refreshed Token = ".concat(str));
        AFf1aSDK revenue = aFg1ySDK.getRevenue();
        if (revenue == null || !str.equals(revenue.getRevenue)) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            boolean z = revenue == null || jCurrentTimeMillis - revenue.AFAdRevenueData > 2000;
            AFf1aSDK aFf1aSDK = new AFf1aSDK(str, jCurrentTimeMillis, !z);
            aFg1ySDK.AFAdRevenueData.getMediationNetwork("afUninstallToken", aFf1aSDK.getRevenue);
            aFg1ySDK.AFAdRevenueData.getMonetizationNetwork("afUninstallToken_received_time", aFf1aSDK.AFAdRevenueData);
            aFg1ySDK.AFAdRevenueData.getCurrencyIso4217Code("afUninstallToken_queued", aFf1aSDK.getMediationNetwork);
            if (z) {
                AFc1dSDK aFc1dSDKAFAdRevenueData = ((AFa1tSDK) getMonetizationNetwork(new Object[0], -631580017, 631580017, (int) System.currentTimeMillis())).AFAdRevenueData();
                AFf1tSDK aFf1tSDK = new AFf1tSDK(str, aFc1dSDKAFAdRevenueData);
                AFe1lSDK aFe1lSDKCopydefault = aFc1dSDKAFAdRevenueData.copydefault();
                aFe1lSDKCopydefault.getRevenue.execute(aFe1lSDKCopydefault.new AnonymousClass5(aFf1tSDK));
            }
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void validateAndLogInAppPurchase(Context context, String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        getMonetizationNetwork(new Object[]{this, context, str, str2, str3, str4, str5, map}, 203099708, -203099705, System.identityHashCode(this));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void validateAndLogInAppPurchase(@NonNull AFPurchaseDetails aFPurchaseDetails, @Nullable Map<String, String> map, @Nullable AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback) {
        AFe1lSDK aFe1lSDKCopydefault = this.copy.copydefault();
        aFe1lSDKCopydefault.getRevenue.execute(aFe1lSDKCopydefault.new AnonymousClass5(new AFe1fSDK(this.copy, AppsFlyerProperties.getInstance(), aFPurchaseDetails, map, appsFlyerInAppPurchaseValidationCallback)));
        AFInAppEventType = (AFInAppEventParameterName + 65) % NotificationCompat.FLAG_HIGH_PRIORITY;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void waitForCustomerUserId(boolean z) {
        AFInAppEventParameterName = (AFInAppEventType + 1) % NotificationCompat.FLAG_HIGH_PRIORITY;
        AFLogger.afInfoLog("initAfterCustomerUserID: ".concat(String.valueOf(z)), true);
        getCurrencyIso4217Code(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, z);
        AFInAppEventParameterName = (AFInAppEventType + 39) % NotificationCompat.FLAG_HIGH_PRIORITY;
    }
}
