package com.appsflyer.internal;

import ads_mobile_sdk.pd;
import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes.dex */
public final class AFd1kSDK implements AFd1pSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static long areAllFieldsValid = 0;
    private static char copy = 0;
    private static int equals = 1;
    private static final int getRevenue;
    private static int hashCode;
    private static int toString;
    private final AFc1dSDK component1;
    private List<String> getCurrencyIso4217Code = new ArrayList();
    private boolean getMonetizationNetwork = true;

    @NonNull
    private final Map<String, Object> AFAdRevenueData = new HashMap();
    private SecureRandom component3 = new SecureRandom();
    private boolean component2 = !AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DPM, false);
    private int getMediationNetwork = 0;
    private boolean component4 = false;

    static {
        component3();
        getRevenue = 98166;
        int i = equals + 117;
        toString = i % NotificationCompat.FLAG_HIGH_PRIORITY;
        if (i % 2 != 0) {
            int i2 = 69 / 0;
        }
    }

    public AFd1kSDK(AFc1dSDK aFc1dSDK) {
        this.component1 = aFc1dSDK;
    }

    private synchronized boolean AFAdRevenueData(@Nullable AFi1xSDK aFi1xSDK, @Nullable AFi1xSDK aFi1xSDK2) {
        int i;
        if (aFi1xSDK == null) {
            AFInAppEventParameterName();
            return false;
        }
        if (aFi1xSDK.getCurrencyIso4217Code()) {
            if (this.component1.getRevenue().getMonetizationNetwork.AFAdRevenueData("appsFlyerCount", 0) > aFi1xSDK.getMonetizationNetwork) {
                i = (equals + 3) % NotificationCompat.FLAG_HIGH_PRIORITY;
            } else {
                if (!getRevenue(aFi1xSDK, aFi1xSDK2)) {
                    return false;
                }
                if (AFAdRevenueData(aFi1xSDK.getRevenue)) {
                    if (getCurrencyIso4217Code(aFi1xSDK.AFAdRevenueData)) {
                        return true;
                    }
                    int i2 = toString + 113;
                    equals = i2 % NotificationCompat.FLAG_HIGH_PRIORITY;
                    return i2 % 2 == 0;
                }
                int i3 = equals;
                int i4 = i3 + 113;
                toString = i4 % NotificationCompat.FLAG_HIGH_PRIORITY;
                z = i4 % 2 != 0;
                i = (i3 + 21) % NotificationCompat.FLAG_HIGH_PRIORITY;
            }
            toString = i;
        } else {
            int i5 = toString + 77;
            equals = i5 % NotificationCompat.FLAG_HIGH_PRIORITY;
            if (i5 % 2 == 0) {
                throw null;
            }
        }
        return z;
    }

    private boolean AFAdRevenueData(String str) {
        int i = equals + 125;
        toString = i % NotificationCompat.FLAG_HIGH_PRIORITY;
        if (i % 2 != 0) {
            int i2 = 31 / 0;
            if (AFk1ySDK.getCurrencyIso4217Code(str)) {
                return true;
            }
        } else if (AFk1ySDK.getCurrencyIso4217Code(str)) {
            return true;
        }
        Context context = this.component1.getRevenue().getRevenue.getMonetizationNetwork;
        boolean zEquals = str.equals(AFj1iSDK.getMediationNetwork(context, context.getPackageName()));
        int i3 = toString + 93;
        equals = i3 % NotificationCompat.FLAG_HIGH_PRIORITY;
        if (i3 % 2 == 0) {
            int i4 = 13 / 0;
        }
        return zEquals;
    }

    private void AFInAppEventParameterName() {
        toString = (equals + 89) % NotificationCompat.FLAG_HIGH_PRIORITY;
        this.component1.component2().getMonetizationNetwork("participantInProxy");
        equals = (toString + 121) % NotificationCompat.FLAG_HIGH_PRIORITY;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void a(int i, char c, String str, String str2, String str3, Object[] objArr) {
        char[] charArray;
        char[] charArray2;
        if (str3 != null) {
            int i2 = $11 + 31;
            $10 = i2 % NotificationCompat.FLAG_HIGH_PRIORITY;
            if (i2 % 2 != 0) {
                str3.toCharArray();
                throw null;
            }
            charArray = str3.toCharArray();
        } else {
            charArray = str3;
        }
        char[] cArr = charArray;
        if (str2 != 0) {
            charArray2 = str2.toCharArray();
            $10 = ($11 + 29) % NotificationCompat.FLAG_HIGH_PRIORITY;
        } else {
            charArray2 = str2;
        }
        char[] cArr2 = charArray2;
        char[] charArray3 = str != null ? str.toCharArray() : str;
        AFk1jSDK aFk1jSDK = new AFk1jSDK();
        int length = charArray3.length;
        char[] cArr3 = new char[length];
        int length2 = cArr.length;
        char[] cArr4 = new char[length2];
        System.arraycopy(charArray3, 0, cArr3, 0, length);
        System.arraycopy(cArr, 0, cArr4, 0, length2);
        cArr3[0] = (char) (cArr3[0] ^ c);
        cArr4[2] = (char) (cArr4[2] + ((char) i));
        int length3 = cArr2.length;
        char[] cArr5 = new char[length3];
        aFk1jSDK.getMediationNetwork = 0;
        while (true) {
            int i3 = aFk1jSDK.getMediationNetwork;
            if (i3 >= length3) {
                objArr[0] = new String(cArr5);
                return;
            }
            int i4 = (i3 + 3) % 4;
            int i5 = cArr3[i3 % 4] * 32718;
            char c2 = cArr4[(i3 + 2) % 4];
            char c3 = (char) ((i5 + c2) % 65535);
            aFk1jSDK.AFAdRevenueData = c3;
            cArr4[i4] = (char) (((cArr3[i4] * 32718) + c2) / 65535);
            cArr3[i4] = c3;
            cArr5[i3] = (char) ((((cArr2[i3] ^ c3) ^ (areAllFieldsValid ^ (-866183138771165766L))) ^ ((int) (hashCode ^ (-866183138771165766L)))) ^ ((char) (copy ^ (-866183138771165766L))));
            aFk1jSDK.getMediationNetwork = i3 + 1;
        }
    }

    private synchronized void areAllFieldsValid() {
        int i = toString + 63;
        equals = i % NotificationCompat.FLAG_HIGH_PRIORITY;
        int i2 = i % 2;
        boolean z = this.component4;
        if (i2 == 0) {
            throw null;
        }
        if (z) {
            return;
        }
        this.component4 = true;
        try {
            getCurrencyIso4217Code("r_debugging_on", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
            equals = (toString + 3) % NotificationCompat.FLAG_HIGH_PRIORITY;
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(AFg1cSDK.PROXY, "Error while starting remote debugger", th, true, true, true);
        }
        return;
    }

    private static String component1() {
        int i = toString;
        int i2 = i + 77;
        equals = i2 % NotificationCompat.FLAG_HIGH_PRIORITY;
        if (i2 % 2 == 0) {
            throw null;
        }
        equals = (i + 33) % NotificationCompat.FLAG_HIGH_PRIORITY;
        return "6.17.0";
    }

    private float component2() {
        equals = (toString + 65) % NotificationCompat.FLAG_HIGH_PRIORITY;
        float fNextFloat = this.component3.nextFloat();
        int i = equals + 119;
        toString = i % NotificationCompat.FLAG_HIGH_PRIORITY;
        if (i % 2 != 0) {
            int i2 = 16 / 0;
        }
        return fNextFloat;
    }

    public static void component3() {
        areAllFieldsValid = -866183138771165766L;
        hashCode = 1193057722;
        copy = (char) 29794;
    }

    @NonNull
    private synchronized Map<String, Object> copy() {
        Map<String, Object> map;
        equals = (toString + 47) % NotificationCompat.FLAG_HIGH_PRIORITY;
        this.AFAdRevenueData.put("data", this.getCurrencyIso4217Code);
        equals();
        map = this.AFAdRevenueData;
        toString = (equals + pd.l1) % NotificationCompat.FLAG_HIGH_PRIORITY;
        return map;
    }

    private boolean copydefault() {
        return ((Boolean) getMediationNetwork(new Object[]{this}, -1999031441, 1999031443, System.identityHashCode(this))).booleanValue();
    }

    private synchronized void equals() {
        this.getCurrencyIso4217Code = new ArrayList();
        this.getMediationNetwork = 0;
        toString = (equals + 115) % NotificationCompat.FLAG_HIGH_PRIORITY;
    }

    @Nullable
    private static AFi1xSDK getCurrencyIso4217Code(@Nullable AFi1wSDK aFi1wSDK) {
        if (aFi1wSDK != null) {
            int i = equals + 49;
            int i2 = i % NotificationCompat.FLAG_HIGH_PRIORITY;
            toString = i2;
            int i3 = i % 2;
            AFh1cSDK aFh1cSDK = aFi1wSDK.getMonetizationNetwork;
            if (i3 != 0) {
                throw null;
            }
            if (aFh1cSDK != null) {
                AFi1xSDK aFi1xSDK = aFh1cSDK.AFAdRevenueData;
                equals = (i2 + 51) % NotificationCompat.FLAG_HIGH_PRIORITY;
                return aFi1xSDK;
            }
        }
        return null;
    }

    private static /* synthetic */ Object getCurrencyIso4217Code(Object[] objArr) {
        AFd1kSDK aFd1kSDK = (AFd1kSDK) objArr[0];
        if (aFd1kSDK.component2) {
            int i = equals;
            toString = (i + 49) % NotificationCompat.FLAG_HIGH_PRIORITY;
            if (aFd1kSDK.getMonetizationNetwork || aFd1kSDK.component4) {
                int i2 = i + 57;
                toString = i2 % NotificationCompat.FLAG_HIGH_PRIORITY;
                if (i2 % 2 == 0) {
                    return Boolean.TRUE;
                }
                throw null;
            }
        }
        return Boolean.FALSE;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0030 A[Catch: all -> 0x007d, TRY_ENTER, TRY_LEAVE, TryCatch #1 {, blocks: (B:5:0x000a, B:14:0x0030, B:23:0x0056), top: B:42:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0056 A[Catch: all -> 0x007d, TRY_ENTER, TRY_LEAVE, TryCatch #1 {, blocks: (B:5:0x000a, B:14:0x0030, B:23:0x0056), top: B:42:0x000a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private synchronized void getCurrencyIso4217Code(java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r2.AFAdRevenueData     // Catch: java.lang.Throwable -> L81
            java.lang.String r1 = "sdk_version"
            r0.put(r1, r3)     // Catch: java.lang.Throwable -> L81
            if (r4 == 0) goto L2e
            int r3 = com.appsflyer.internal.AFd1kSDK.toString     // Catch: java.lang.Throwable -> L7d
            int r3 = r3 + 61
            int r0 = r3 % 128
            com.appsflyer.internal.AFd1kSDK.equals = r0     // Catch: java.lang.Throwable -> L7d
            int r3 = r3 % 2
            if (r3 != 0) goto L21
            int r3 = r4.length()     // Catch: java.lang.Throwable -> L81
            r0 = 47
            int r0 = r0 / 0
            if (r3 <= 0) goto L2e
            goto L27
        L21:
            int r3 = r4.length()     // Catch: java.lang.Throwable -> L81
            if (r3 <= 0) goto L2e
        L27:
            java.util.Map<java.lang.String, java.lang.Object> r3 = r2.AFAdRevenueData     // Catch: java.lang.Throwable -> L81
            java.lang.String r0 = "devkey"
            r3.put(r0, r4)     // Catch: java.lang.Throwable -> L81
        L2e:
            if (r5 == 0) goto L54
            int r3 = com.appsflyer.internal.AFd1kSDK.toString     // Catch: java.lang.Throwable -> L7d
            int r3 = r3 + 19
            int r4 = r3 % 128
            com.appsflyer.internal.AFd1kSDK.equals = r4     // Catch: java.lang.Throwable -> L7d
            int r3 = r3 % 2
            if (r3 != 0) goto L47
            int r3 = r5.length()     // Catch: java.lang.Throwable -> L81
            r4 = 74
            int r4 = r4 / 0
            if (r3 <= 0) goto L54
            goto L4d
        L47:
            int r3 = r5.length()     // Catch: java.lang.Throwable -> L81
            if (r3 <= 0) goto L54
        L4d:
            java.util.Map<java.lang.String, java.lang.Object> r3 = r2.AFAdRevenueData     // Catch: java.lang.Throwable -> L81
            java.lang.String r4 = "originalAppsFlyerId"
            r3.put(r4, r5)     // Catch: java.lang.Throwable -> L81
        L54:
            if (r6 == 0) goto L7f
            int r3 = com.appsflyer.internal.AFd1kSDK.toString     // Catch: java.lang.Throwable -> L7d
            int r3 = r3 + 61
            int r4 = r3 % 128
            com.appsflyer.internal.AFd1kSDK.equals = r4     // Catch: java.lang.Throwable -> L7d
            int r3 = r3 % 2
            if (r3 != 0) goto L6d
            int r3 = r6.length()     // Catch: java.lang.Throwable -> L81
            r4 = 79
            int r4 = r4 / 0
            if (r3 <= 0) goto L7f
            goto L73
        L6d:
            int r3 = r6.length()     // Catch: java.lang.Throwable -> L81
            if (r3 <= 0) goto L7f
        L73:
            java.util.Map<java.lang.String, java.lang.Object> r3 = r2.AFAdRevenueData     // Catch: java.lang.Throwable -> L81
            java.lang.String r4 = "uid"
            r3.put(r4, r6)     // Catch: java.lang.Throwable -> L81
            goto L7f
        L7b:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L7d
            throw r3
        L7d:
            r3 = move-exception
            goto L7b
        L7f:
            monitor-exit(r2)
            return
        L81:
            monitor-exit(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFd1kSDK.getCurrencyIso4217Code(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    private synchronized void getCurrencyIso4217Code(String str, String str2, String... strArr) {
        String string;
        int i;
        if (copydefault()) {
            equals = (toString + 75) % NotificationCompat.FLAG_HIGH_PRIORITY;
            if (this.getMediationNetwork < 98304) {
                try {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    String strJoin = TextUtils.join(", ", strArr);
                    if (str != null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(jCurrentTimeMillis);
                        sb.append(" ");
                        sb.append(Thread.currentThread().getId());
                        sb.append(" _/AppsFlyer_6.17.0 [");
                        sb.append(str);
                        sb.append("] ");
                        sb.append(str2);
                        sb.append(" ");
                        sb.append(strJoin);
                        string = sb.toString();
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(jCurrentTimeMillis);
                        sb2.append(" ");
                        sb2.append(Thread.currentThread().getId());
                        sb2.append(" ");
                        sb2.append(str2);
                        sb2.append("/AppsFlyer_6.17.0 ");
                        sb2.append(strJoin);
                        string = sb2.toString();
                        toString = (equals + 73) % NotificationCompat.FLAG_HIGH_PRIORITY;
                    }
                    int length = this.getMediationNetwork + (string.length() << 1);
                    int i2 = getRevenue;
                    boolean z = false;
                    if (length > i2) {
                        string = string.substring(0, (i2 - this.getMediationNetwork) / 2);
                        z = true;
                    }
                    this.getCurrencyIso4217Code.add(string);
                    this.getMediationNetwork += string.length() << 1;
                    if (z) {
                        int i3 = toString + 47;
                        equals = i3 % NotificationCompat.FLAG_HIGH_PRIORITY;
                        int i4 = i3 % 2;
                        List<String> list = this.getCurrencyIso4217Code;
                        if (i4 == 0) {
                            list.add("+~+~ The limit has been exceeded, and no more data is available. +~+~");
                            i = this.getMediationNetwork + 7164;
                        } else {
                            list.add("+~+~ The limit has been exceeded, and no more data is available. +~+~");
                            i = this.getMediationNetwork + 138;
                        }
                        this.getMediationNetwork = i;
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    private static boolean getCurrencyIso4217Code(String str) {
        toString = (equals + 65) % NotificationCompat.FLAG_HIGH_PRIORITY;
        if (!AFk1ySDK.getCurrencyIso4217Code(str)) {
            new AFd1sSDK();
            return AFd1sSDK.getMediationNetwork(component1(), str);
        }
        int i = toString + 97;
        equals = i % NotificationCompat.FLAG_HIGH_PRIORITY;
        return i % 2 != 0;
    }

    public static /* synthetic */ Object getMediationNetwork(Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i;
        int i5 = ~i2;
        int i6 = ~(i4 | i5);
        int i7 = ~i3;
        int i8 = i6 | (~(i4 | i7)) | (~(i5 | i7));
        int i9 = i | i2;
        int i10 = ((i8 | (~(i9 | i3))) * (-84)) + (i2 * 85) + (i * 85);
        int i11 = i | (~(i5 | i3));
        int i12 = ~(i7 | i2);
        int i13 = ((i12 | (~i9)) * 84) + ((i11 | i12) * (-84)) + i10;
        if (i13 == 1) {
            AFd1kSDK aFd1kSDK = (AFd1kSDK) objArr[0];
            String str = (String) objArr[1];
            String[] strArr = (String[]) objArr[2];
            equals = (toString + 69) % NotificationCompat.FLAG_HIGH_PRIORITY;
            aFd1kSDK.getCurrencyIso4217Code("public_api_call", str, strArr);
            toString = (equals + 1) % NotificationCompat.FLAG_HIGH_PRIORITY;
            return null;
        }
        if (i13 == 2) {
            return getCurrencyIso4217Code(objArr);
        }
        if (i13 == 3) {
            return getMonetizationNetwork(objArr);
        }
        AFd1kSDK aFd1kSDK2 = (AFd1kSDK) objArr[0];
        boolean zAFAdRevenueData = aFd1kSDK2.AFAdRevenueData(getCurrencyIso4217Code(aFd1kSDK2.component1.component1().getMediationNetwork.getCurrencyIso4217Code), getCurrencyIso4217Code(aFd1kSDK2.component1.component1().getMediationNetwork.AFAdRevenueData));
        if (zAFAdRevenueData) {
            equals = (toString + 57) % NotificationCompat.FLAG_HIGH_PRIORITY;
            aFd1kSDK2.areAllFieldsValid();
        } else {
            aFd1kSDK2.getRevenue();
            aFd1kSDK2.getMediationNetwork();
        }
        equals = (toString + 31) % NotificationCompat.FLAG_HIGH_PRIORITY;
        return Boolean.valueOf(zAFAdRevenueData);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0069 A[Catch: all -> 0x0087, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:5:0x0052, B:10:0x0069), top: B:29:0x0052 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private synchronized void getMediationNetwork(java.lang.String r12, java.lang.String r13, java.lang.String r14) {
        /*
            r11 = this;
            monitor-enter(r11)
            java.util.Map<java.lang.String, java.lang.Object> r0 = r11.AFAdRevenueData     // Catch: java.lang.Throwable -> L9b
            java.lang.String r1 = ""
            r2 = 48
            r3 = 0
            int r1 = android.text.TextUtils.indexOf(r1, r2, r3, r3)     // Catch: java.lang.Throwable -> L9b
            r4 = 428417108(0x19892054, float:1.4178525E-23)
            int r5 = r4 - r1
            java.lang.String r1 = ""
            int r1 = android.text.TextUtils.indexOf(r1, r2, r3)     // Catch: java.lang.Throwable -> L9b
            r2 = 45453(0xb18d, float:6.3693E-41)
            int r2 = r2 - r1
            char r6 = (char) r2     // Catch: java.lang.Throwable -> L9b
            java.lang.String r7 = "嗊褠踙\ue7b1"
            java.lang.String r8 = "ᒸي醼뇗ൎ"
            java.lang.String r9 = "\u0000\u0000\u0000\u0000"
            r1 = 1
            java.lang.Object[] r10 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L9b
            a(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L9b
            r1 = r10[r3]     // Catch: java.lang.Throwable -> L9b
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L9b
            java.lang.String r1 = r1.intern()     // Catch: java.lang.Throwable -> L9b
            java.lang.String r2 = android.os.Build.BRAND     // Catch: java.lang.Throwable -> L9b
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L9b
            java.util.Map<java.lang.String, java.lang.Object> r0 = r11.AFAdRevenueData     // Catch: java.lang.Throwable -> L9b
            java.lang.String r1 = "model"
            java.lang.String r2 = android.os.Build.MODEL     // Catch: java.lang.Throwable -> L9b
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L9b
            java.util.Map<java.lang.String, java.lang.Object> r0 = r11.AFAdRevenueData     // Catch: java.lang.Throwable -> L9b
            java.lang.String r1 = "platform"
            java.lang.String r2 = "Android"
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L9b
            java.util.Map<java.lang.String, java.lang.Object> r0 = r11.AFAdRevenueData     // Catch: java.lang.Throwable -> L9b
            java.lang.String r1 = "platform_version"
            java.lang.String r2 = android.os.Build.VERSION.RELEASE     // Catch: java.lang.Throwable -> L9b
            r0.put(r1, r2)     // Catch: java.lang.Throwable -> L9b
            if (r12 == 0) goto L67
            int r0 = com.appsflyer.internal.AFd1kSDK.toString     // Catch: java.lang.Throwable -> L87
            int r0 = r0 + 111
            int r0 = r0 % 128
            com.appsflyer.internal.AFd1kSDK.equals = r0     // Catch: java.lang.Throwable -> L87
            int r0 = r12.length()     // Catch: java.lang.Throwable -> L9b
            if (r0 <= 0) goto L67
            java.util.Map<java.lang.String, java.lang.Object> r0 = r11.AFAdRevenueData     // Catch: java.lang.Throwable -> L9b
            java.lang.String r1 = "advertiserId"
            r0.put(r1, r12)     // Catch: java.lang.Throwable -> L9b
        L67:
            if (r13 == 0) goto L8a
            int r12 = com.appsflyer.internal.AFd1kSDK.toString     // Catch: java.lang.Throwable -> L87
            int r12 = r12 + 27
            int r0 = r12 % 128
            com.appsflyer.internal.AFd1kSDK.equals = r0     // Catch: java.lang.Throwable -> L87
            int r12 = r12 % 2
            if (r12 == 0) goto L83
            int r12 = r13.length()     // Catch: java.lang.Throwable -> L9b
            if (r12 <= 0) goto L8a
            java.util.Map<java.lang.String, java.lang.Object> r12 = r11.AFAdRevenueData     // Catch: java.lang.Throwable -> L9b
            java.lang.String r0 = "imei"
            r12.put(r0, r13)     // Catch: java.lang.Throwable -> L9b
            goto L8a
        L83:
            r12 = 0
            throw r12     // Catch: java.lang.Throwable -> L9b
        L85:
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L87
            throw r12
        L87:
            r0 = move-exception
            r12 = r0
            goto L85
        L8a:
            if (r14 == 0) goto L99
            int r12 = r14.length()     // Catch: java.lang.Throwable -> L9b
            if (r12 <= 0) goto L99
            java.util.Map<java.lang.String, java.lang.Object> r12 = r11.AFAdRevenueData     // Catch: java.lang.Throwable -> L9b
            java.lang.String r13 = "android_id"
            r12.put(r13, r14)     // Catch: java.lang.Throwable -> L9b
        L99:
            monitor-exit(r11)
            return
        L9b:
            monitor-exit(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFd1kSDK.getMediationNetwork(java.lang.String, java.lang.String, java.lang.String):void");
    }

    private static /* synthetic */ Object getMonetizationNetwork(Object[] objArr) {
        AFd1kSDK aFd1kSDK = (AFd1kSDK) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = toString + 41;
        equals = i % NotificationCompat.FLAG_HIGH_PRIORITY;
        if (i % 2 == 0) {
            aFd1kSDK.component1.component2().getCurrencyIso4217Code("participantInProxy", zBooleanValue);
            int i2 = 89 / 0;
        } else {
            aFd1kSDK.component1.component2().getCurrencyIso4217Code("participantInProxy", zBooleanValue);
        }
        toString = (equals + 31) % NotificationCompat.FLAG_HIGH_PRIORITY;
        return null;
    }

    private synchronized void getMonetizationNetwork(String str, String str2, String str3, String str4) {
        int i = toString;
        int i2 = i + 71;
        equals = i2 % NotificationCompat.FLAG_HIGH_PRIORITY;
        try {
            if (i2 % 2 == 0) {
                throw null;
            }
            if (str != null) {
                equals = (i + 35) % NotificationCompat.FLAG_HIGH_PRIORITY;
                if (str.length() > 0) {
                    int i3 = toString + pd.j1;
                    equals = i3 % NotificationCompat.FLAG_HIGH_PRIORITY;
                    int i4 = i3 % 2;
                    Map<String, Object> map = this.AFAdRevenueData;
                    if (i4 == 0) {
                        map.put("app_id", str);
                        int i5 = 52 / 0;
                    } else {
                        map.put("app_id", str);
                    }
                }
            }
            if (str2 != null && str2.length() > 0) {
                this.AFAdRevenueData.put("app_version", str2);
            }
            if (str3 != null && str3.length() > 0) {
                this.AFAdRevenueData.put(AppsFlyerProperties.CHANNEL, str3);
                toString = (equals + 55) % NotificationCompat.FLAG_HIGH_PRIORITY;
            }
            if (str4 != null && str4.length() > 0) {
                this.AFAdRevenueData.put("preInstall", str4);
            }
        } catch (Throwable unused) {
        }
    }

    private void getMonetizationNetwork(boolean z) {
        getMediationNetwork(new Object[]{this, Boolean.valueOf(z)}, 124011145, -124011142, System.identityHashCode(this));
    }

    private boolean getMonetizationNetwork(float f) {
        double d = f;
        if (d >= 1.0d) {
            return true;
        }
        if (d <= 0.0d) {
            equals = (toString + 39) % NotificationCompat.FLAG_HIGH_PRIORITY;
            return false;
        }
        if (component2() > f) {
            return false;
        }
        toString = (equals + 67) % NotificationCompat.FLAG_HIGH_PRIORITY;
        return true;
    }

    private boolean getRevenue(@NonNull AFi1xSDK aFi1xSDK, @Nullable AFi1xSDK aFi1xSDK2) {
        equals = (toString + 87) % NotificationCompat.FLAG_HIGH_PRIORITY;
        if (aFi1xSDK.equals(aFi1xSDK2)) {
            equals = (toString + 63) % NotificationCompat.FLAG_HIGH_PRIORITY;
            return registerClient();
        }
        boolean monetizationNetwork = getMonetizationNetwork(aFi1xSDK.getMediationNetwork);
        getMediationNetwork(new Object[]{this, Boolean.valueOf(monetizationNetwork)}, 124011145, -124011142, System.identityHashCode(this));
        return monetizationNetwork;
    }

    private static String[] getRevenue(String str, StackTraceElement[] stackTraceElementArr) {
        int i = toString;
        equals = (i + 55) % NotificationCompat.FLAG_HIGH_PRIORITY;
        if (stackTraceElementArr != null) {
            String[] strArr = new String[stackTraceElementArr.length + 1];
            strArr[0] = str;
            for (int i2 = 1; i2 < stackTraceElementArr.length; i2++) {
                strArr[i2] = stackTraceElementArr[i2].toString();
            }
            return strArr;
        }
        int i3 = i + 91;
        equals = i3 % NotificationCompat.FLAG_HIGH_PRIORITY;
        if (i3 % 2 != 0) {
            return new String[]{str};
        }
        String[] strArr2 = new String[0];
        strArr2[1] = str;
        return strArr2;
    }

    private Map<String, Object> p_(String str, PackageManager packageManager) {
        int i = equals + 95;
        toString = i % NotificationCompat.FLAG_HIGH_PRIORITY;
        int i2 = i % 2;
        AFc1dSDK aFc1dSDK = this.component1;
        if (i2 != 0) {
            q_(str, packageManager, aFc1dSDK.registerClient(), this.component1.afInfoLog());
            copy();
            throw null;
        }
        q_(str, packageManager, aFc1dSDK.registerClient(), this.component1.afInfoLog());
        Map<String, Object> mapCopy = copy();
        int i3 = equals + 29;
        toString = i3 % NotificationCompat.FLAG_HIGH_PRIORITY;
        if (i3 % 2 == 0) {
            return mapCopy;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0047 A[Catch: all -> 0x00d5, PHI: r1
      0x0047: PHI (r1v4 com.appsflyer.AppsFlyerProperties) = (r1v3 com.appsflyer.AppsFlyerProperties), (r1v5 com.appsflyer.AppsFlyerProperties) binds: [B:14:0x0036, B:9:0x0022] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #2 {, blocks: (B:4:0x0003, B:6:0x0010, B:17:0x0047, B:19:0x00a2, B:20:0x00b8, B:12:0x0026, B:13:0x0027, B:8:0x0021), top: B:33:0x0003, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0038 A[EXC_TOP_SPLITTER, PHI: r3
      0x0038: PHI (r3v2 java.lang.String) = (r3v1 java.lang.String), (r3v9 java.lang.String) binds: [B:14:0x0036, B:9:0x0022] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private synchronized void q_(java.lang.String r6, android.content.pm.PackageManager r7, com.appsflyer.internal.AFf1gSDK r8, com.appsflyer.internal.AFc1kSDK r9) {
        /*
            r5 = this;
            java.lang.String r0 = "remote_debug_static_data"
            monitor-enter(r5)
            int r1 = com.appsflyer.internal.AFd1kSDK.toString     // Catch: java.lang.Throwable -> Ld5
            int r1 = r1 + 43
            int r2 = r1 % 128
            com.appsflyer.internal.AFd1kSDK.equals = r2     // Catch: java.lang.Throwable -> Ld5
            int r1 = r1 % 2
            r2 = 0
            if (r1 != 0) goto L27
            com.appsflyer.AppsFlyerProperties r1 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch: java.lang.Throwable -> Ld5
            java.lang.String r3 = "remote_debug_static_data"
            java.lang.String r3 = r1.getString(r3)     // Catch: java.lang.Throwable -> Ld5
            java.util.Map<java.lang.String, java.lang.Object> r4 = r5.AFAdRevenueData     // Catch: java.lang.Throwable -> Ld5
            r4.clear()     // Catch: java.lang.Throwable -> Ld5
            r4 = 38
            int r4 = r4 / r2
            if (r3 == 0) goto L47
            goto L38
        L25:
            r6 = move-exception
            throw r6     // Catch: java.lang.Throwable -> Ld5
        L27:
            com.appsflyer.AppsFlyerProperties r1 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch: java.lang.Throwable -> Ld5
            java.lang.String r3 = "remote_debug_static_data"
            java.lang.String r3 = r1.getString(r3)     // Catch: java.lang.Throwable -> Ld5
            java.util.Map<java.lang.String, java.lang.Object> r4 = r5.AFAdRevenueData     // Catch: java.lang.Throwable -> Ld5
            r4.clear()     // Catch: java.lang.Throwable -> Ld5
            if (r3 == 0) goto L47
        L38:
            java.util.Map<java.lang.String, java.lang.Object> r6 = r5.AFAdRevenueData     // Catch: java.lang.Throwable -> Lb8
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Lb8
            r7.<init>(r3)     // Catch: java.lang.Throwable -> Lb8
            java.util.Map r7 = com.appsflyer.internal.AFg1lSDK.getMonetizationNetwork(r7)     // Catch: java.lang.Throwable -> Lb8
            r6.putAll(r7)     // Catch: java.lang.Throwable -> Lb8
            goto Lb8
        L47:
            com.appsflyer.internal.AFc1dSDK r3 = r5.component1     // Catch: java.lang.Throwable -> Ld5
            com.appsflyer.internal.AFc1pSDK r3 = r3.getRevenue()     // Catch: java.lang.Throwable -> Ld5
            java.lang.String r3 = r3.AFAdRevenueData()     // Catch: java.lang.Throwable -> Ld5
            java.lang.String r8 = r8.getRevenue()     // Catch: java.lang.Throwable -> Ld5
            java.lang.String r9 = r9.AFAdRevenueData     // Catch: java.lang.Throwable -> Ld5
            r5.getMediationNetwork(r3, r8, r9)     // Catch: java.lang.Throwable -> Ld5
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld5
            java.lang.String r9 = "6.17.0."
            r8.<init>(r9)     // Catch: java.lang.Throwable -> Ld5
            java.lang.String r9 = com.appsflyer.internal.AFa1tSDK.getMonetizationNetwork     // Catch: java.lang.Throwable -> Ld5
            r8.append(r9)     // Catch: java.lang.Throwable -> Ld5
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> Ld5
            com.appsflyer.internal.AFc1dSDK r9 = r5.component1     // Catch: java.lang.Throwable -> Ld5
            com.appsflyer.internal.AFf1gSDK r9 = r9.registerClient()     // Catch: java.lang.Throwable -> Ld5
            java.lang.String r9 = r9.getMediationNetwork()     // Catch: java.lang.Throwable -> Ld5
            java.lang.String r3 = "KSAppsFlyerId"
            java.lang.String r3 = r1.getString(r3)     // Catch: java.lang.Throwable -> Ld5
            com.appsflyer.internal.AFc1dSDK r4 = r5.component1     // Catch: java.lang.Throwable -> Ld5
            com.appsflyer.internal.AFc1pSDK r4 = r4.getRevenue()     // Catch: java.lang.Throwable -> Ld5
            com.appsflyer.internal.AFc1qSDK r4 = r4.getMonetizationNetwork     // Catch: java.lang.Throwable -> Ld5
            java.lang.String r4 = com.appsflyer.internal.AFb1iSDK.getRevenue(r4)     // Catch: java.lang.Throwable -> Ld5
            r5.getCurrencyIso4217Code(r8, r9, r3, r4)     // Catch: java.lang.Throwable -> Ld5
            android.content.pm.PackageInfo r7 = r7.getPackageInfo(r6, r2)     // Catch: java.lang.Throwable -> La2
            int r7 = r7.versionCode     // Catch: java.lang.Throwable -> La2
            java.lang.String r8 = "channel"
            java.lang.String r8 = r1.getString(r8)     // Catch: java.lang.Throwable -> La2
            java.lang.String r9 = "preInstallName"
            java.lang.String r9 = r1.getString(r9)     // Catch: java.lang.Throwable -> La2
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch: java.lang.Throwable -> La2
            r5.getMonetizationNetwork(r6, r7, r8, r9)     // Catch: java.lang.Throwable -> La2
        La2:
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Ld5
            java.util.Map<java.lang.String, java.lang.Object> r7 = r5.AFAdRevenueData     // Catch: java.lang.Throwable -> Ld5
            r6.<init>(r7)     // Catch: java.lang.Throwable -> Ld5
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> Ld5
            r1.set(r0, r6)     // Catch: java.lang.Throwable -> Ld5
            int r6 = com.appsflyer.internal.AFd1kSDK.toString     // Catch: java.lang.Throwable -> Ld5
            int r6 = r6 + 43
            int r6 = r6 % 128
            com.appsflyer.internal.AFd1kSDK.equals = r6     // Catch: java.lang.Throwable -> Ld5
        Lb8:
            java.util.Map<java.lang.String, java.lang.Object> r6 = r5.AFAdRevenueData     // Catch: java.lang.Throwable -> Ld5
            java.lang.String r7 = "launch_counter"
            com.appsflyer.internal.AFc1dSDK r8 = r5.component1     // Catch: java.lang.Throwable -> Ld5
            com.appsflyer.internal.AFc1pSDK r8 = r8.getRevenue()     // Catch: java.lang.Throwable -> Ld5
            com.appsflyer.internal.AFc1qSDK r8 = r8.getMonetizationNetwork     // Catch: java.lang.Throwable -> Ld5
            java.lang.String r9 = "appsFlyerCount"
            int r8 = r8.AFAdRevenueData(r9, r2)     // Catch: java.lang.Throwable -> Ld5
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch: java.lang.Throwable -> Ld5
            r6.put(r7, r8)     // Catch: java.lang.Throwable -> Ld5
            monitor-exit(r5)
            return
        Ld3:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> Ld5
            throw r6
        Ld5:
            r6 = move-exception
            goto Ld3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFd1kSDK.q_(java.lang.String, android.content.pm.PackageManager, com.appsflyer.internal.AFf1gSDK, com.appsflyer.internal.AFc1kSDK):void");
    }

    private boolean registerClient() {
        int i = toString + 9;
        equals = i % NotificationCompat.FLAG_HIGH_PRIORITY;
        int i2 = i % 2;
        return this.component1.component2().getMediationNetwork("participantInProxy", false);
    }

    @Override // com.appsflyer.internal.AFd1pSDK
    public final synchronized void AFAdRevenueData() {
        toString = (equals + 31) % NotificationCompat.FLAG_HIGH_PRIORITY;
        this.AFAdRevenueData.clear();
        this.getCurrencyIso4217Code.clear();
        this.getMediationNetwork = 0;
        int i = toString + pd.W0;
        equals = i % NotificationCompat.FLAG_HIGH_PRIORITY;
        if (i % 2 == 0) {
            int i2 = 83 / 0;
        }
    }

    @Override // com.appsflyer.internal.AFd1pSDK
    public final boolean component4() {
        int i = equals;
        int i2 = i + pd.K0;
        toString = i2 % NotificationCompat.FLAG_HIGH_PRIORITY;
        int i3 = i2 % 2;
        boolean z = this.component4;
        if (i3 != 0) {
            throw null;
        }
        toString = (i + 119) % NotificationCompat.FLAG_HIGH_PRIORITY;
        return z;
    }

    @Override // com.appsflyer.internal.AFd1pSDK
    public final void getCurrencyIso4217Code() {
        int i = toString + 23;
        int i2 = i % NotificationCompat.FLAG_HIGH_PRIORITY;
        equals = i2;
        this.component2 = i % 2 == 0;
        int i3 = i2 + 63;
        toString = i3 % NotificationCompat.FLAG_HIGH_PRIORITY;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFd1pSDK
    public final void getCurrencyIso4217Code(String str, String str2) {
        int i = toString + 17;
        equals = i % NotificationCompat.FLAG_HIGH_PRIORITY;
        if (i % 2 == 0) {
            String[] strArr = new String[0];
            strArr[0] = str2;
            getCurrencyIso4217Code("server_request", str, strArr);
        } else {
            getCurrencyIso4217Code("server_request", str, str2);
        }
        int i2 = toString + pd.T0;
        equals = i2 % NotificationCompat.FLAG_HIGH_PRIORITY;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFd1pSDK
    public final synchronized void getMediationNetwork() {
        int i = (toString + 35) % NotificationCompat.FLAG_HIGH_PRIORITY;
        equals = i;
        if (this.component4) {
            this.component4 = false;
            this.getMonetizationNetwork = false;
            getCurrencyIso4217Code("r_debugging_off", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
            return;
        }
        int i2 = i + 23;
        toString = i2 % NotificationCompat.FLAG_HIGH_PRIORITY;
        int i3 = i2 % 2;
        boolean z = this.getMonetizationNetwork;
        if (i3 != 0) {
            throw null;
        }
        if (!z) {
            return;
        }
        this.component4 = false;
        this.getMonetizationNetwork = false;
        try {
            getCurrencyIso4217Code("r_debugging_off", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(AFg1cSDK.PROXY, "Error while stopping remote debugger", th, true, true, true);
        }
        return;
    }

    @Override // com.appsflyer.internal.AFd1pSDK
    public final void getMediationNetwork(String str, String... strArr) {
        getMediationNetwork(new Object[]{this, str, strArr}, 595413115, -595413114, System.identityHashCode(this));
    }

    @Override // com.appsflyer.internal.AFd1pSDK
    public final void getMonetizationNetwork(String str, String str2) {
        int i = toString + 53;
        equals = i % NotificationCompat.FLAG_HIGH_PRIORITY;
        if (i % 2 == 0) {
            String[] strArr = new String[1];
            strArr[1] = str2;
            getCurrencyIso4217Code(null, str, strArr);
        } else {
            getCurrencyIso4217Code(null, str, str2);
        }
        int i2 = equals + 45;
        toString = i2 % NotificationCompat.FLAG_HIGH_PRIORITY;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFd1pSDK
    public final void getMonetizationNetwork(Throwable th) {
        StackTraceElement[] stackTrace;
        equals = (toString + 45) % NotificationCompat.FLAG_HIGH_PRIORITY;
        Throwable cause = th.getCause();
        String simpleName = th.getClass().getSimpleName();
        String message = cause == null ? th.getMessage() : cause.getMessage();
        if (cause == null) {
            int i = equals + 73;
            toString = i % NotificationCompat.FLAG_HIGH_PRIORITY;
            if (i % 2 != 0) {
                th.getStackTrace();
                throw null;
            }
            stackTrace = th.getStackTrace();
        } else {
            stackTrace = cause.getStackTrace();
            equals = (toString + 3) % NotificationCompat.FLAG_HIGH_PRIORITY;
        }
        getCurrencyIso4217Code("exception", simpleName, getRevenue(message, stackTrace));
    }

    @Override // com.appsflyer.internal.AFd1pSDK
    public final boolean getMonetizationNetwork() {
        return ((Boolean) getMediationNetwork(new Object[]{this}, -1790300573, 1790300573, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.appsflyer.internal.AFd1pSDK
    public final synchronized void getRevenue() {
        equals = (toString + 125) % NotificationCompat.FLAG_HIGH_PRIORITY;
        this.getMonetizationNetwork = false;
        AFAdRevenueData();
        equals();
        toString = (equals + 121) % NotificationCompat.FLAG_HIGH_PRIORITY;
    }

    @Override // com.appsflyer.internal.AFd1pSDK
    public final void getRevenue(String str, int i, String str2) {
        equals = (toString + 29) % NotificationCompat.FLAG_HIGH_PRIORITY;
        getCurrencyIso4217Code("server_response", str, String.valueOf(i), str2);
        int i2 = equals + 121;
        toString = i2 % NotificationCompat.FLAG_HIGH_PRIORITY;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.appsflyer.internal.AFd1pSDK
    public final void o_(String str, PackageManager packageManager) {
        int i = equals + 117;
        toString = i % NotificationCompat.FLAG_HIGH_PRIORITY;
        try {
            if (i % 2 != 0) {
                this.component1.getCurrencyIso4217Code().getRevenue(p_(str, packageManager), this.component1.registerClient().getMediationNetwork());
                throw null;
            }
            AFd1mSDK revenue = this.component1.getCurrencyIso4217Code().getRevenue(p_(str, packageManager), this.component1.registerClient().getMediationNetwork());
            if (revenue == null) {
                AFLogger.afErrorLogForExcManagerOnly("could not send null proxy data", new NullPointerException("request was null"));
                return;
            }
            this.component1.getMonetizationNetwork().execute(new e(revenue, (byte) 1));
            int i2 = toString + 19;
            equals = i2 % NotificationCompat.FLAG_HIGH_PRIORITY;
            if (i2 % 2 == 0) {
                throw null;
            }
        } catch (Throwable th) {
            AFLogger.afErrorLogForExcManagerOnly("could not send proxy data", th);
        }
    }
}
