package com.appsflyer.internal;

import ads_mobile_sdk.pd;
import android.content.Context;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.AFf1eSDK;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class AFf1gSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char[] component1 = {63633, 62277, 61193, 56317, 55253, 50050, 48743, 43590, 42524, 37626, 36515, 31377};
    private static long component3 = -7623911999770266845L;
    private static int copydefault = 0;
    private static int hashCode = 1;
    private long AFAdRevenueData;

    @Nullable
    private volatile String component2;
    private volatile String component4;

    @NonNull
    private final AFf1eSDK getCurrencyIso4217Code;
    Map<String, Object> getMediationNetwork;

    @NonNull
    private final AFc1iSDK getRevenue;
    private boolean getMonetizationNetwork = false;
    private volatile boolean areAllFieldsValid = false;

    public AFf1gSDK(@NonNull AFc1iSDK aFc1iSDK, @NonNull AFf1eSDK aFf1eSDK) {
        this.getRevenue = aFc1iSDK;
        this.getCurrencyIso4217Code = aFf1eSDK;
    }

    public static void AFAdRevenueData(AFh1rSDK aFh1rSDK) {
        getCurrencyIso4217Code(new Object[]{aFh1rSDK}, -211782083, 211782085, (int) System.currentTimeMillis());
    }

    private static void a(int i, int i2, char c, Object[] objArr) {
        int i3;
        AFk1hSDK aFk1hSDK = new AFk1hSDK();
        long[] jArr = new long[i];
        aFk1hSDK.getMediationNetwork = 0;
        $10 = ($11 + 67) % NotificationCompat.FLAG_HIGH_PRIORITY;
        while (true) {
            int i4 = aFk1hSDK.getMediationNetwork;
            if (i4 >= i) {
                break;
            }
            $11 = ($10 + pd.K0) % NotificationCompat.FLAG_HIGH_PRIORITY;
            jArr[i4] = (((char) (component1[i2 + i4] ^ (-750476924154939152L))) ^ (i4 * (component3 ^ (-750476924154939152L)))) ^ c;
            aFk1hSDK.getMediationNetwork = i4 + 1;
        }
        char[] cArr = new char[i];
        while (true) {
            aFk1hSDK.getMediationNetwork = 0;
            while (true) {
                i3 = aFk1hSDK.getMediationNetwork;
                if (i3 >= i) {
                    objArr[0] = new String(cArr);
                    return;
                }
                int i5 = $10 + 83;
                $11 = i5 % NotificationCompat.FLAG_HIGH_PRIORITY;
                if (i5 % 2 == 0) {
                    break;
                }
                cArr[i3] = (char) jArr[i3];
                aFk1hSDK.getMediationNetwork = i3 + 1;
            }
            cArr[i3] = (char) jArr[i3];
        }
    }

    private boolean component1() {
        copydefault = (hashCode + 71) % NotificationCompat.FLAG_HIGH_PRIORITY;
        Map<String, Object> map = this.getMediationNetwork;
        if (map != null && !map.isEmpty()) {
            return true;
        }
        int i = hashCode + 117;
        copydefault = i % NotificationCompat.FLAG_HIGH_PRIORITY;
        if (i % 2 == 0) {
            return false;
        }
        throw null;
    }

    private long component2() {
        int i = (copydefault + 59) % NotificationCompat.FLAG_HIGH_PRIORITY;
        hashCode = i;
        long j = this.AFAdRevenueData;
        int i2 = i + 9;
        copydefault = i2 % NotificationCompat.FLAG_HIGH_PRIORITY;
        if (i2 % 2 == 0) {
            return j;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0073, code lost:
    
        if (r0 == null) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object getCurrencyIso4217Code(java.lang.Object[] r9) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFf1gSDK.getCurrencyIso4217Code(java.lang.Object[]):java.lang.Object");
    }

    public static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i2;
        int i5 = ~i3;
        int i6 = ((i4 | (~((~i) | i3)) | (~(i5 | i))) * 45) + (((~(i4 | i3)) | (~(i2 | i))) * (-45)) + (((~(i4 | i5)) | i) * (-90)) + (i2 * 46) + (i * 46);
        return i6 != 1 ? i6 != 2 ? getCurrencyIso4217Code(objArr) : getRevenue(objArr) : getMediationNetwork(objArr);
    }

    private long getMediationNetwork(AFc1pSDK aFc1pSDK) {
        StringBuilder sb = new StringBuilder();
        sb.append(AFb1iSDK.getRevenue(aFc1pSDK.getMonetizationNetwork));
        sb.append(component2());
        long mediationNetwork = AFj1cSDK.getMediationNetwork(AFj1cSDK.getCurrencyIso4217Code(sb.toString()));
        hashCode = (copydefault + pd.W0) % NotificationCompat.FLAG_HIGH_PRIORITY;
        return mediationNetwork;
    }

    private static /* synthetic */ Object getMediationNetwork(Object[] objArr) {
        AFf1gSDK aFf1gSDK = (AFf1gSDK) objArr[0];
        copydefault = (hashCode + 89) % NotificationCompat.FLAG_HIGH_PRIORITY;
        aFf1gSDK.getMediationNetwork.put("ttr", Long.valueOf(System.currentTimeMillis() - aFf1gSDK.AFAdRevenueData));
        aFf1gSDK.getMediationNetwork.put("lvl_timestamp", Long.valueOf(aFf1gSDK.component2()));
        int i = hashCode + 15;
        copydefault = i % NotificationCompat.FLAG_HIGH_PRIORITY;
        if (i % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static boolean getMonetizationNetwork(Context context) {
        if (!AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false)) {
            int i = hashCode + 79;
            copydefault = i % NotificationCompat.FLAG_HIGH_PRIORITY;
            if (i % 2 == 0 ? !AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false) : !AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, true)) {
                if (AFa1tSDK.getCurrencyIso4217Code(context)) {
                    return false;
                }
            }
        }
        hashCode = (copydefault + 53) % NotificationCompat.FLAG_HIGH_PRIORITY;
        return true;
    }

    private static /* synthetic */ Object getRevenue(Object[] objArr) throws Throwable {
        try {
            new AFb1sSDK((AFh1rSDK) objArr[0]).afInfoLog();
            copydefault = (hashCode + 3) % NotificationCompat.FLAG_HIGH_PRIORITY;
            return null;
        } catch (Exception e) {
            AFLogger.afErrorLogForExcManagerOnly("native: reflection init failed", e);
            return null;
        }
    }

    public static void getRevenue(Map<String, Object> map, AFc1pSDK aFc1pSDK) throws NumberFormatException {
        int i = hashCode + 15;
        copydefault = i % NotificationCompat.FLAG_HIGH_PRIORITY;
        if (i % 2 != 0) {
            AFk1ySDK.getMediationNetwork(aFc1pSDK.getMediationNetwork);
            throw null;
        }
        int i2 = 0;
        if (AFk1ySDK.getMediationNetwork(aFc1pSDK.getMediationNetwork)) {
            String currencyIso4217Code = aFc1pSDK.getCurrencyIso4217Code("com.appsflyer.security.uuid");
            if (AFk1ySDK.getMediationNetwork(currencyIso4217Code)) {
                int i3 = copydefault + 121;
                hashCode = i3 % NotificationCompat.FLAG_HIGH_PRIORITY;
                if (i3 % 2 == 0) {
                    AFc1pSDK.getRevenue();
                    throw null;
                }
                currencyIso4217Code = AFc1pSDK.getRevenue();
            }
            aFc1pSDK.getMediationNetwork = currencyIso4217Code.substring(0, 8);
        }
        String str = aFc1pSDK.getMediationNetwork;
        try {
            Object[] objArr = new Object[1];
            a(12, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1, (char) TextUtils.indexOf("", "", 0), objArr);
            long j = Long.parseLong(String.valueOf(map.get(((String) objArr[0]).intern())));
            char[] charArray = str.toCharArray();
            int i4 = ((int) (j % 94)) + 33;
            while (i2 < charArray.length) {
                int i5 = copydefault + 61;
                hashCode = i5 % NotificationCompat.FLAG_HIGH_PRIORITY;
                if (i5 % 2 == 0) {
                    charArray[i2] = (char) (charArray[i2] ^ i4);
                    i2 += 117;
                } else {
                    charArray[i2] = (char) (charArray[i2] ^ i4);
                    i2++;
                }
            }
            map.put("sbid", new String(charArray));
            int i6 = copydefault + 9;
            hashCode = i6 % NotificationCompat.FLAG_HIGH_PRIORITY;
            if (i6 % 2 == 0) {
                throw null;
            }
        } catch (Exception e) {
            AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "Exception occurred while generating sbid ", e);
        }
    }

    public final Map<String, Object> AFAdRevenueData(Map<String, Object> map) {
        AFc1gSDK aFc1gSDK = new AFc1gSDK(map, this.getRevenue.getMonetizationNetwork);
        int i = copydefault + 19;
        hashCode = i % NotificationCompat.FLAG_HIGH_PRIORITY;
        if (i % 2 != 0) {
            return aFc1gSDK;
        }
        throw null;
    }

    public final void AFAdRevenueData(AFc1pSDK aFc1pSDK) {
        this.AFAdRevenueData = System.currentTimeMillis();
        this.getMonetizationNetwork = this.getCurrencyIso4217Code.getMediationNetwork(getMediationNetwork(aFc1pSDK), this.getRevenue.getMonetizationNetwork, new AFf1eSDK.AFa1vSDK() { // from class: com.appsflyer.internal.AFf1gSDK.5
            @Override // com.appsflyer.internal.AFf1eSDK.AFa1vSDK
            public final void AFAdRevenueData(String str, Exception exc) {
                AFf1gSDK.this.getMediationNetwork = new ConcurrentHashMap();
                String message = exc.getMessage();
                if (message == null) {
                    message = "unknown";
                }
                AFf1gSDK aFf1gSDK = AFf1gSDK.this;
                AFf1gSDK.getCurrencyIso4217Code(new Object[]{aFf1gSDK}, 2120438481, -2120438480, System.identityHashCode(aFf1gSDK));
                AFf1gSDK.this.getMediationNetwork.put("error", message);
                AFLogger.afErrorLog(str, exc, true, true, false);
            }

            @Override // com.appsflyer.internal.AFf1eSDK.AFa1vSDK
            public final void AFAdRevenueData(@NonNull String str, @NonNull String str2) {
                AFf1gSDK.this.getMediationNetwork = new ConcurrentHashMap();
                AFf1gSDK.this.getMediationNetwork.put("signedData", str);
                AFf1gSDK.this.getMediationNetwork.put("signature", str2);
                AFf1gSDK aFf1gSDK = AFf1gSDK.this;
                AFf1gSDK.getCurrencyIso4217Code(new Object[]{aFf1gSDK}, 2120438481, -2120438480, System.identityHashCode(aFf1gSDK));
                AFLogger.afInfoLog("Successfully retrieved Google LVL data.");
            }
        });
        hashCode = (copydefault + 33) % NotificationCompat.FLAG_HIGH_PRIORITY;
    }

    public final void AFAdRevenueData(String str) {
        copydefault = (hashCode + pd.W0) % NotificationCompat.FLAG_HIGH_PRIORITY;
        this.component4 = str;
        copydefault = (hashCode + 85) % NotificationCompat.FLAG_HIGH_PRIORITY;
    }

    public final boolean AFAdRevenueData() {
        int i = copydefault + 59;
        hashCode = i % NotificationCompat.FLAG_HIGH_PRIORITY;
        int i2 = i % 2;
        boolean z = this.areAllFieldsValid;
        if (i2 != 0) {
            return z;
        }
        throw null;
    }

    public final void areAllFieldsValid() {
        getCurrencyIso4217Code(new Object[]{this}, 2120438481, -2120438480, System.identityHashCode(this));
    }

    @NonNull
    public final Map<String, Object> getCurrencyIso4217Code() {
        HashMap map = new HashMap();
        if (component1()) {
            int i = copydefault + 13;
            hashCode = i % NotificationCompat.FLAG_HIGH_PRIORITY;
            int i2 = i % 2;
            map.put("lvl", this.getMediationNetwork);
            if (i2 != 0) {
                return map;
            }
            throw null;
        }
        if (this.getMonetizationNetwork) {
            this.getMediationNetwork = new HashMap();
            getCurrencyIso4217Code(new Object[]{this}, 2120438481, -2120438480, System.identityHashCode(this));
            this.getMediationNetwork.put("error", "pending LVL response");
            map.put("lvl", this.getMediationNetwork);
            copydefault = (hashCode + 35) % NotificationCompat.FLAG_HIGH_PRIORITY;
        }
        return map;
    }

    @Nullable
    public final String getMediationNetwork() {
        int i = copydefault + 39;
        hashCode = i % NotificationCompat.FLAG_HIGH_PRIORITY;
        int i2 = i % 2;
        String str = this.component4;
        if (i2 != 0) {
            return str;
        }
        throw null;
    }

    @Nullable
    public final String getMediationNetwork(AFc1qSDK aFc1qSDK) {
        return (String) getCurrencyIso4217Code(new Object[]{this, aFc1qSDK}, -1198101809, 1198101809, System.identityHashCode(this));
    }

    public final void getMediationNetwork(@NonNull String str) {
        int i = hashCode + pd.j1;
        copydefault = i % NotificationCompat.FLAG_HIGH_PRIORITY;
        int i2 = i % 2;
        this.component2 = str;
        if (i2 != 0) {
            int i3 = 29 / 0;
        }
    }

    public final void getMediationNetwork(boolean z) {
        hashCode = (copydefault + 51) % NotificationCompat.FLAG_HIGH_PRIORITY;
        this.areAllFieldsValid = z;
        int i = hashCode + 59;
        copydefault = i % NotificationCompat.FLAG_HIGH_PRIORITY;
        if (i % 2 != 0) {
            int i2 = 58 / 0;
        }
    }

    public final Map<String, Object> getMonetizationNetwork(Map<String, Object> map) {
        try {
            try {
                Object[] objArr = {map, this.getRevenue.getMonetizationNetwork};
                Map map2 = AFa1kSDK.i;
                Object declaredConstructor = map2.get(611220697);
                if (declaredConstructor == null) {
                    declaredConstructor = ((Class) AFa1kSDK.getCurrencyIso4217Code((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 122, (char) (ViewConfiguration.getFadingEdgeLength() >> 16), 36 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)))).getDeclaredConstructor(Map.class, Context.class);
                    map2.put(611220697, declaredConstructor);
                }
                Map<String, Object> map3 = (Map) ((Constructor) declaredConstructor).newInstance(objArr);
                int i = copydefault + 45;
                hashCode = i % NotificationCompat.FLAG_HIGH_PRIORITY;
                if (i % 2 != 0) {
                    return map3;
                }
                throw null;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        } catch (Throwable th2) {
            AFLogger.afErrorLogForExcManagerOnly("AFCksmV3: reflection init failed", th2);
            return new HashMap();
        }
    }

    public final boolean getMonetizationNetwork() {
        int i = copydefault;
        hashCode = (i + 49) % NotificationCompat.FLAG_HIGH_PRIORITY;
        if (this.getMonetizationNetwork) {
            int i2 = i + 81;
            hashCode = i2 % NotificationCompat.FLAG_HIGH_PRIORITY;
            int i3 = i2 % 2;
            boolean zComponent1 = component1();
            if (i3 == 0) {
                int i4 = 94 / 0;
                if (!zComponent1) {
                    return true;
                }
            } else if (!zComponent1) {
                return true;
            }
        }
        int i5 = hashCode + 113;
        copydefault = i5 % NotificationCompat.FLAG_HIGH_PRIORITY;
        if (i5 % 2 == 0) {
            return false;
        }
        throw null;
    }

    @Nullable
    public final String getRevenue() {
        int i = hashCode + 43;
        copydefault = i % NotificationCompat.FLAG_HIGH_PRIORITY;
        int i2 = i % 2;
        String str = this.component2;
        if (i2 != 0) {
            throw null;
        }
        copydefault = (hashCode + 69) % NotificationCompat.FLAG_HIGH_PRIORITY;
        return str;
    }
}
