package com.appsflyer.internal;

import ads_mobile_sdk.pd;
import android.content.Context;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes.dex */
public final class AFd1oSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    public static String AFAdRevenueData = null;
    private static int areAllFieldsValid = 0;
    private static int component1 = 0;
    private static int component3 = 0;
    private static int copy = 0;
    private static byte[] copydefault = null;
    private static String getRevenue = null;
    private static int hashCode = 1;
    private static short[] toString;
    private final AFj1fSDK component2;
    private final AFe1zSDK component4;
    private final AFc1pSDK getCurrencyIso4217Code;
    private final AppsFlyerProperties getMediationNetwork;
    private final AFd1lSDK getMonetizationNetwork;

    static {
        getMonetizationNetwork();
        AFAdRevenueData = "https://%sgcdsdk.%s/install_data/v5.0/";
        getRevenue = "https://%sonelink.%s/shortlink-sdk/v2";
        int i = hashCode + 37;
        copy = i % NotificationCompat.FLAG_HIGH_PRIORITY;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public AFd1oSDK(AFd1lSDK aFd1lSDK, AFc1pSDK aFc1pSDK, AppsFlyerProperties appsFlyerProperties, AFe1zSDK aFe1zSDK, AFj1fSDK aFj1fSDK) {
        this.getMonetizationNetwork = aFd1lSDK;
        this.getCurrencyIso4217Code = aFc1pSDK;
        this.getMediationNetwork = appsFlyerProperties;
        this.component4 = aFe1zSDK;
        this.component2 = aFj1fSDK;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x009e A[PHI: r7
      0x009e: PHI (r7v6 int) = (r7v5 int), (r7v52 int) binds: [B:26:0x009c, B:23:0x0091] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a0 A[PHI: r7
      0x00a0: PHI (r7v49 int) = (r7v5 int), (r7v52 int) binds: [B:26:0x009c, B:23:0x0091] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(byte r12, short r13, int r14, int r15, int r16, java.lang.Object[] r17) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFd1oSDK.a(byte, short, int, int, int, java.lang.Object[]):void");
    }

    public static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr, int i, int i2, int i3) {
        String str;
        String str2;
        int i4 = ~i;
        int i5 = ((~(i4 | i2 | i3)) * 521) + (i2 * 522) + (i * (-520));
        int i6 = ~((~i2) | i);
        int i7 = ((i6 | (~(i4 | (~i3) | i2))) * 521) + (i6 * (-1042)) + i5;
        if (i7 == 1) {
            AFd1oSDK aFd1oSDK = (AFd1oSDK) objArr[0];
            AFh1mSDK aFh1mSDK = (AFh1mSDK) objArr[1];
            AFd1nSDK revenue = aFd1oSDK.getRevenue(new AFd1cSDK(aFh1mSDK.component1, aFh1mSDK.AFAdRevenueData(), "POST", Collections.EMPTY_MAP, true), new AFd1eSDK());
            hashCode = (copy + 67) % NotificationCompat.FLAG_HIGH_PRIORITY;
            return revenue;
        }
        String str3 = "";
        if (i7 != 2) {
            AFd1oSDK aFd1oSDK2 = (AFd1oSDK) objArr[0];
            HashMap map = new HashMap();
            map.put("build_number", "6.17.0");
            map.put("counter", Integer.valueOf(aFd1oSDK2.getCurrencyIso4217Code.getMonetizationNetwork.AFAdRevenueData("appsFlyerCount", 0)));
            map.put("model", Build.MODEL);
            Object[] objArr2 = new Object[1];
            a((byte) (83 - MotionEvent.axisFromString("")), (short) (Gravity.getAbsoluteGravity(0, 0) + 43), (-88) - ((Process.getThreadPriority(0) + 20) >> 6), MotionEvent.axisFromString("") + 2017627781, KeyEvent.keyCodeFromString("") + 1432018452, objArr2);
            map.put(((String) objArr2[0]).intern(), Build.BRAND);
            map.put("sdk", Integer.toString(Build.VERSION.SDK_INT));
            Context context = aFd1oSDK2.getCurrencyIso4217Code.getRevenue.getMonetizationNetwork;
            map.put("app_version_name", AFj1iSDK.getMediationNetwork(context, context.getPackageName()));
            map.put("app_id", aFd1oSDK2.getCurrencyIso4217Code.getRevenue.getMonetizationNetwork.getPackageName());
            map.put("platformextension", new AFa1vSDK().getMonetizationNetwork());
            hashCode = (copy + 93) % NotificationCompat.FLAG_HIGH_PRIORITY;
            return map;
        }
        AFd1oSDK aFd1oSDK3 = (AFd1oSDK) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        boolean zBooleanValue2 = ((Boolean) objArr[2]).booleanValue();
        String str4 = (String) objArr[3];
        ((Number) objArr[4]).intValue();
        AFe1zSDK aFe1zSDK = aFd1oSDK3.component4;
        if (zBooleanValue) {
            str = AFe1zSDK.getRevenue;
        } else {
            str = AFe1zSDK.getMediationNetwork;
            copy = (hashCode + 47) % NotificationCompat.FLAG_HIGH_PRIORITY;
        }
        if (zBooleanValue2) {
            hashCode = (copy + 115) % NotificationCompat.FLAG_HIGH_PRIORITY;
            str2 = "stg";
        } else {
            str2 = "";
        }
        if (AFe1zSDK.AFAdRevenueData()) {
            str3 = (String) aFe1zSDK.getMonetizationNetwork.getValue();
        } else {
            copy = (hashCode + 33) % NotificationCompat.FLAG_HIGH_PRIORITY;
        }
        AFd1cSDK aFd1cSDK = new AFd1cSDK(String.format(str, Arrays.copyOf(new Object[]{str3, str2, aFe1zSDK.getMediationNetwork(), str4}, 4)), "GET");
        aFd1cSDK.component4 = 1500;
        return aFd1oSDK3.getRevenue(aFd1cSDK, new AFd1bSDK());
    }

    private Map<String, Object> getMediationNetwork() {
        return (Map) getCurrencyIso4217Code(new Object[]{this}, -1717475171, 1717475171, System.identityHashCode(this));
    }

    private static String getMonetizationNetwork(String str, String str2, String... strArr) throws NoSuchAlgorithmException, InvalidKeyException {
        ArrayList arrayList = new ArrayList(Arrays.asList(strArr));
        arrayList.add(1, "v2");
        String strJoin = TextUtils.join("\u2063", (String[]) arrayList.toArray(new String[0]));
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        sb.append("v2");
        String revenue = AFj1cSDK.getRevenue(strJoin, sb.toString());
        int i = hashCode + 41;
        copy = i % NotificationCompat.FLAG_HIGH_PRIORITY;
        if (i % 2 == 0) {
            return revenue;
        }
        throw null;
    }

    public static void getMonetizationNetwork() {
        component1 = -411944536;
        areAllFieldsValid = 1624197239;
        component3 = -898995602;
        copydefault = new byte[]{-107, -75, -81, 99, 21, -75, 105, -80, 24, 72, -87, 71, -114, 87, 14, -80, 57};
    }

    private <T> AFd1nSDK<T> getRevenue(AFd1cSDK aFd1cSDK, AFe1ySDK<T> aFe1ySDK) {
        AFd1nSDK<T> revenue;
        int i = hashCode + 69;
        copy = i % NotificationCompat.FLAG_HIGH_PRIORITY;
        if (i % 2 != 0) {
            revenue = getRevenue(aFd1cSDK, aFe1ySDK, getRevenue());
            int i2 = 32 / 0;
        } else {
            revenue = getRevenue(aFd1cSDK, aFe1ySDK, getRevenue());
        }
        int i3 = hashCode + 71;
        copy = i3 % NotificationCompat.FLAG_HIGH_PRIORITY;
        if (i3 % 2 == 0) {
            return revenue;
        }
        throw null;
    }

    private <T> AFd1nSDK<T> getRevenue(AFd1cSDK aFd1cSDK, AFe1ySDK<T> aFe1ySDK, boolean z) {
        aFd1cSDK.getMediationNetwork = z;
        AFd1lSDK aFd1lSDK = this.getMonetizationNetwork;
        AFd1nSDK<T> aFd1nSDK = new AFd1nSDK<>(aFd1cSDK, aFd1lSDK.getRevenue, aFd1lSDK.getMonetizationNetwork, aFe1ySDK);
        copy = (hashCode + pd.j1) % NotificationCompat.FLAG_HIGH_PRIORITY;
        return aFd1nSDK;
    }

    private boolean getRevenue() {
        if (this.getMediationNetwork.getBoolean(AppsFlyerProperties.HTTP_CACHE, true)) {
            return false;
        }
        int i = copy;
        int i2 = i + pd.h1;
        hashCode = i2 % NotificationCompat.FLAG_HIGH_PRIORITY;
        boolean z = i2 % 2 != 0;
        hashCode = (i + 79) % NotificationCompat.FLAG_HIGH_PRIORITY;
        return z;
    }

    @NonNull
    public final AFd1nSDK<AFa1mSDK> AFAdRevenueData(AFa1pSDK aFa1pSDK) {
        AFd1nSDK<AFa1mSDK> revenue = getRevenue(new AFd1cSDK(aFa1pSDK.component1, AFg1lSDK.getCurrencyIso4217Code(aFa1pSDK.AFAdRevenueData).toString().getBytes(Charset.defaultCharset()), "POST", Collections.EMPTY_MAP, aFa1pSDK.getMonetizationNetwork()), new AFa1rSDK());
        int i = hashCode + 91;
        copy = i % NotificationCompat.FLAG_HIGH_PRIORITY;
        if (i % 2 != 0) {
            int i2 = 24 / 0;
        }
        return revenue;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a4  */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.appsflyer.internal.AFd1nSDK<java.lang.String> AFAdRevenueData(java.util.Map<java.lang.String, java.lang.Object> r11, java.lang.String r12, @androidx.annotation.Nullable java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFd1oSDK.AFAdRevenueData(java.util.Map, java.lang.String, java.lang.String):com.appsflyer.internal.AFd1nSDK");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0101  */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.appsflyer.internal.AFd1nSDK<java.lang.String> getCurrencyIso4217Code(com.appsflyer.internal.AFh1rSDK r12, java.lang.String r13, com.appsflyer.internal.AFc1iSDK r14) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFd1oSDK.getCurrencyIso4217Code(com.appsflyer.internal.AFh1rSDK, java.lang.String, com.appsflyer.internal.AFc1iSDK):com.appsflyer.internal.AFd1nSDK");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0089  */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.appsflyer.internal.AFd1nSDK<java.lang.String> getCurrencyIso4217Code(java.util.Map<java.lang.String, java.lang.Object> r11, java.lang.String r12, @androidx.annotation.Nullable java.lang.String r13) {
        /*
            r10 = this;
            r0 = 317123644(0x12e6ec3c, float:1.4573277E-27)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1 = 0
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> Lc3
            r4 = 1
            r3[r4] = r12     // Catch: java.lang.Throwable -> Lc3
            r12 = 0
            r3[r12] = r11     // Catch: java.lang.Throwable -> Lc3
            java.util.Map r11 = com.appsflyer.internal.AFa1kSDK.i     // Catch: java.lang.Throwable -> Lc3
            java.lang.Object r4 = r11.get(r0)     // Catch: java.lang.Throwable -> Lc3
            if (r4 != 0) goto L45
            int r4 = android.view.View.combineMeasuredStates(r12, r12)     // Catch: java.lang.Throwable -> Lc3
            int r4 = 196 - r4
            int r5 = android.view.View.resolveSize(r12, r12)     // Catch: java.lang.Throwable -> Lc3
            char r5 = (char) r5     // Catch: java.lang.Throwable -> Lc3
            long r6 = android.widget.ExpandableListView.getPackedPositionForChild(r12, r12)     // Catch: java.lang.Throwable -> Lc3
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            int r6 = 36 - r6
            java.lang.Object r4 = com.appsflyer.internal.AFa1kSDK.getCurrencyIso4217Code(r4, r5, r6)     // Catch: java.lang.Throwable -> Lc3
            java.lang.Class r4 = (java.lang.Class) r4     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r5 = "getMediationNetwork"
            java.lang.Class<java.util.Map> r6 = java.util.Map.class
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            java.lang.Class[] r6 = new java.lang.Class[]{r6, r7}     // Catch: java.lang.Throwable -> Lc3
            java.lang.reflect.Method r4 = r4.getMethod(r5, r6)     // Catch: java.lang.Throwable -> Lc3
            r11.put(r0, r4)     // Catch: java.lang.Throwable -> Lc3
        L45:
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4     // Catch: java.lang.Throwable -> Lc3
            java.lang.Object r11 = r4.invoke(r1, r3)     // Catch: java.lang.Throwable -> Lc3
            r5 = r11
            byte[] r5 = (byte[]) r5     // Catch: java.lang.Throwable -> Lc3
            int r11 = com.appsflyer.internal.AFd1oSDK.hashCode
            int r0 = r11 + 103
            int r0 = r0 % 128
            com.appsflyer.internal.AFd1oSDK.copy = r0
            com.appsflyer.internal.AFj1fSDK r0 = r10.component2
            if (r13 == 0) goto L89
            int r11 = r11 + 3
            int r11 = r11 % 128
            com.appsflyer.internal.AFd1oSDK.copy = r11
            int r11 = r13.length()
            if (r11 == 0) goto L89
            kotlin.text.Regex r11 = new kotlin.text.Regex
            java.lang.String r1 = "4.?(\\d+)?.?(\\d+)"
            r11.<init>(r1)
            boolean r11 = r11.j(r13)
            if (r11 != 0) goto L89
            kotlin.text.Regex r11 = new kotlin.text.Regex
            java.lang.String r1 = "3.?(\\d+)?.?(\\d+)"
            r11.<init>(r1)
            boolean r11 = r11.j(r13)
            if (r11 != 0) goto L89
            com.appsflyer.internal.AFk1xSDK r11 = r0.getMonetizationNetwork
            java.lang.String r13 = "https://%sviap.%s/api/v1/android/validate_purchase_v2?app_id="
            java.lang.String r11 = r11.AFAdRevenueData(r13)
            goto L99
        L89:
            int r11 = com.appsflyer.internal.AFd1oSDK.hashCode
            int r11 = r11 + 75
            int r11 = r11 % 128
            com.appsflyer.internal.AFd1oSDK.copy = r11
            com.appsflyer.internal.AFk1xSDK r11 = r0.getMonetizationNetwork
            java.lang.String r13 = "https://%sviap.%s/api/v1/android/validate_purchase?app_id="
            java.lang.String r11 = r11.AFAdRevenueData(r13)
        L99:
            java.lang.String r11 = r0.getCurrencyIso4217Code(r11)
            java.lang.String r4 = com.appsflyer.internal.AFj1fSDK.getMediationNetwork(r0, r11)
            com.appsflyer.internal.AFd1cSDK r3 = new com.appsflyer.internal.AFd1cSDK
            java.util.Map r7 = java.util.Collections.EMPTY_MAP
            r8 = 1
            java.lang.String r6 = "POST"
            r3.<init>(r4, r5, r6, r7, r8)
            com.appsflyer.internal.AFd1eSDK r11 = new com.appsflyer.internal.AFd1eSDK
            r11.<init>()
            com.appsflyer.internal.AFd1nSDK r10 = r10.getRevenue(r3, r11)
            int r11 = com.appsflyer.internal.AFd1oSDK.hashCode
            int r11 = r11 + 67
            int r13 = r11 % 128
            com.appsflyer.internal.AFd1oSDK.copy = r13
            int r11 = r11 % r2
            if (r11 == 0) goto Lc2
            r11 = 46
            int r11 = r11 / r12
        Lc2:
            return r10
        Lc3:
            r0 = move-exception
            r10 = r0
            java.lang.Throwable r11 = r10.getCause()     // Catch: java.lang.Throwable -> Lcd
            if (r11 == 0) goto Lcc
            throw r11     // Catch: java.lang.Throwable -> Lcd
        Lcc:
            throw r10     // Catch: java.lang.Throwable -> Lcd
        Lcd:
            r0 = move-exception
            r10 = r0
            r5 = r10
            com.appsflyer.AFLogger r2 = com.appsflyer.AFLogger.INSTANCE
            com.appsflyer.internal.AFg1cSDK r3 = com.appsflyer.internal.AFg1cSDK.ENGAGEMENT
            r6 = 0
            r7 = 0
            java.lang.String r4 = "AFFinalizer: reflection init failed."
            r2.e(r3, r4, r5, r6, r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFd1oSDK.getCurrencyIso4217Code(java.util.Map, java.lang.String, java.lang.String):com.appsflyer.internal.AFd1nSDK");
    }

    public final AFd1nSDK<String> getMediationNetwork(AFh1mSDK aFh1mSDK) {
        return (AFd1nSDK) getCurrencyIso4217Code(new Object[]{this, aFh1mSDK}, -44698683, 44698684, System.identityHashCode(this));
    }

    public final AFd1nSDK<String> getMonetizationNetwork(@NonNull String str, @NonNull Map<String, String> map, @Nullable String str2, @NonNull UUID uuid, @NonNull String str3) {
        String string = uuid.toString();
        HashMap map2 = new HashMap();
        map2.put("ttl", "-1");
        map2.put("uuid", string);
        map2.put("data", map);
        map2.put("meta", (Map) getCurrencyIso4217Code(new Object[]{this}, -1717475171, 1717475171, System.identityHashCode(this)));
        if (str2 != null) {
            int i = hashCode + 81;
            copy = i % NotificationCompat.FLAG_HIGH_PRIORITY;
            int i2 = i % 2;
            map2.put("brand_domain", str2);
            if (i2 != 0) {
                int i3 = 19 / 0;
            }
            hashCode = (copy + 1) % NotificationCompat.FLAG_HIGH_PRIORITY;
        }
        String string2 = AFg1lSDK.getCurrencyIso4217Code(map2).toString();
        HashMap map3 = new HashMap();
        Object[] objArr = new Object[1];
        a((byte) (88 - TextUtils.indexOf("", "", 0)), (short) (((Process.getThreadPriority(0) + 20) >> 6) + 22), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) - 88, 2017627768, 1432018419 - (ViewConfiguration.getScrollBarSize() >> 8), objArr);
        map3.put(((String) objArr[0]).intern(), getMonetizationNetwork(str3, string, "POST", string2));
        StringBuilder sb = new StringBuilder(String.format(getRevenue, AppsFlyerLib.getInstance().getHostPrefix(), AFa1tSDK.getCurrencyIso4217Code().getHostName()));
        sb.append("/");
        sb.append(str);
        AFd1nSDK<String> revenue = getRevenue(new AFd1cSDK(sb.toString(), string2.getBytes(Charset.defaultCharset()), "POST", map3, false), new AFd1eSDK(), true);
        int i4 = hashCode + 67;
        copy = i4 % NotificationCompat.FLAG_HIGH_PRIORITY;
        if (i4 % 2 != 0) {
            int i5 = 99 / 0;
        }
        return revenue;
    }

    @Nullable
    public final AFd1nSDK<String> getMonetizationNetwork(Map<String, Object> map, String str) {
        hashCode = (copy + 117) % NotificationCompat.FLAG_HIGH_PRIORITY;
        try {
            Object[] objArr = {map, str};
            Map map2 = AFa1kSDK.i;
            Object method = map2.get(317123644);
            if (method == null) {
                method = ((Class) AFa1kSDK.getCurrencyIso4217Code(Gravity.getAbsoluteGravity(0, 0) + 196, (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 37 - TextUtils.getOffsetAfter("", 0))).getMethod("getMediationNetwork", Map.class, String.class);
                map2.put(317123644, method);
            }
            byte[] bArr = (byte[]) ((Method) method).invoke(null, objArr);
            hashCode = (copy + 69) % NotificationCompat.FLAG_HIGH_PRIORITY;
            AFj1fSDK aFj1fSDK = this.component2;
            return getRevenue(new AFd1cSDK(aFj1fSDK.getCurrencyIso4217Code(aFj1fSDK.getMonetizationNetwork.AFAdRevenueData("https://%svalidate-and-log.%s/api/v1.0/android/validateAndLog?app_id=")), bArr, "POST", Collections.EMPTY_MAP, true), new AFd1eSDK());
        } catch (Throwable th) {
            try {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            } catch (Throwable th2) {
                AFLogger.INSTANCE.e(AFg1cSDK.PURCHASE_VALIDATION, "AFFinalizer: reflection init failed.", th2, false, false);
                return null;
            }
        }
    }

    @Nullable
    public final AFd1mSDK getRevenue(Map<String, Object> map, String str) {
        copy = (hashCode + 65) % NotificationCompat.FLAG_HIGH_PRIORITY;
        try {
            try {
                Object[] objArr = {map, str};
                Map map2 = AFa1kSDK.i;
                Object method = map2.get(317123644);
                if (method == null) {
                    method = ((Class) AFa1kSDK.getCurrencyIso4217Code(197 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), TextUtils.lastIndexOf("", '0', 0, 0) + 38)).getMethod("getMediationNetwork", Map.class, String.class);
                    map2.put(317123644, method);
                }
                byte[] bArr = (byte[]) ((Method) method).invoke(null, objArr);
                if (bArr == null) {
                    AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "AFFinalizer: failed to create bytes.", new IllegalArgumentException("Failed to create bytes from proxyData, bytes are null"), false, false);
                    return null;
                }
                copy = (hashCode + 19) % NotificationCompat.FLAG_HIGH_PRIORITY;
                return new AFd1mSDK(this.getCurrencyIso4217Code, bArr);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        } catch (Throwable th2) {
            AFLogger.INSTANCE.e(AFg1cSDK.GENERAL, "AFFinalizer: reflection init failed.", th2, false, false);
            return null;
        }
    }

    public final AFd1nSDK<String> getRevenue(@NonNull String str) {
        AFd1cSDK aFd1cSDK = new AFd1cSDK(str, null, "GET", Collections.EMPTY_MAP, false);
        aFd1cSDK.component4 = 10000;
        aFd1cSDK.getCurrencyIso4217Code = false;
        AFd1nSDK<String> revenue = getRevenue(aFd1cSDK, new AFd1eSDK());
        int i = hashCode + 19;
        copy = i % NotificationCompat.FLAG_HIGH_PRIORITY;
        if (i % 2 == 0) {
            return revenue;
        }
        throw null;
    }

    public final AFd1nSDK<Map<String, Object>> getRevenue(String str, String str2) {
        AFd1nSDK<Map<String, Object>> revenue = getRevenue(AFd1fSDK.getMonetizationNetwork(this.getCurrencyIso4217Code.getRevenue.getMonetizationNetwork.getPackageName(), AFb1iSDK.getRevenue(this.getCurrencyIso4217Code.getMonetizationNetwork), str, str2), new AFd1iSDK());
        copy = (hashCode + 79) % NotificationCompat.FLAG_HIGH_PRIORITY;
        return revenue;
    }

    public final AFd1nSDK<Map<String, String>> getRevenue(@NonNull String str, @NonNull String str2, @NonNull UUID uuid, @NonNull String str3) {
        String string = uuid.toString();
        StringBuilder sb = new StringBuilder(String.format(getRevenue, AppsFlyerLib.getInstance().getHostPrefix(), ((AFa1tSDK) AFa1tSDK.getMonetizationNetwork(new Object[0], -631580017, 631580017, (int) System.currentTimeMillis())).getHostName()));
        sb.append("/");
        sb.append(str);
        sb.append("?id=");
        sb.append(str2);
        String string2 = sb.toString();
        Map map = (Map) getCurrencyIso4217Code(new Object[]{this}, -1717475171, 1717475171, System.identityHashCode(this));
        String strValueOf = String.valueOf(map.get("build_number"));
        HashMap map2 = new HashMap();
        map2.put("Af-UUID", uuid.toString());
        map2.put("Af-Meta-Sdk-Ver", strValueOf);
        map2.put("Af-Meta-Counter", String.valueOf(map.get("counter")));
        map2.put("Af-Meta-Model", String.valueOf(map.get("model")));
        map2.put("Af-Meta-Platform", String.valueOf(map.get("platformextension")));
        map2.put("Af-Meta-System-Version", String.valueOf(map.get("sdk")));
        Object[] objArr = new Object[1];
        a((byte) 88, (short) (22 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), (-88) - Gravity.getAbsoluteGravity(0, 0), Drawable.resolveOpacity(0, 0) + 2017627768, 1432018418 - ImageFormat.getBitsPerPixel(0), objArr);
        map2.put(((String) objArr[0]).intern(), getMonetizationNetwork(str3, string, "GET", string, str, str2, strValueOf));
        AFd1nSDK<Map<String, String>> revenue = getRevenue(new AFd1cSDK(string2, null, "GET", map2, false), new AFd1dSDK());
        hashCode = (copy + 5) % NotificationCompat.FLAG_HIGH_PRIORITY;
        return revenue;
    }

    @NonNull
    public final AFd1nSDK<AFi1wSDK> getRevenue(boolean z, boolean z2, @NonNull String str, int i) {
        return (AFd1nSDK) getCurrencyIso4217Code(new Object[]{this, Boolean.valueOf(z), Boolean.valueOf(z2), str, Integer.valueOf(i)}, 662152322, -662152320, i);
    }
}
