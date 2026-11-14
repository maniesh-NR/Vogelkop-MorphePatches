package com.leanplum.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.TypedValue;
import com.leanplum.Leanplum;
import com.leanplum.LeanplumActivityHelper;
import com.leanplum.LeanplumDeviceIdMode;
import com.leanplum.internal.Constants;
import com.leanplum.monitoring.ExceptionHandler;
import com.leanplum.utils.SharedPreferencesUtil;
import defpackage.qp2;
import defpackage.sko;
import java.io.File;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.UnsupportedCharsetException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class Util {
    private static final String ACCESS_WIFI_STATE_PERMISSION = "android.permission.ACCESS_WIFI_STATE";
    private static String appName = null;
    private static boolean hasPlayServices = false;
    private static boolean hasPlayServicesCalled = false;
    private static String versionName;

    public static class DeviceIdInfo {
        public final String id;
        public boolean limitAdTracking;

        public DeviceIdInfo(String str) {
            this.id = str;
        }

        public DeviceIdInfo(String str, boolean z) {
            this.id = str;
            this.limitAdTracking = z;
        }
    }

    private static String capitalize(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        char cCharAt = str.charAt(0);
        if (Character.isUpperCase(cCharAt)) {
            return str;
        }
        return Character.toUpperCase(cCharAt) + str.substring(1);
    }

    private static String checkDeviceId(String str, String str2) {
        if (str2 == null || isValidDeviceId(str2)) {
            return str2;
        }
        Log.e(p3p.w("Invalid device id generated (", str, "): ", str2), new Object[0]);
        return null;
    }

    public static int generateIdFromResourceName(String str) {
        String[] strArrSplit = str.split("/");
        if (strArrSplit.length == 2) {
            Resources resources = Leanplum.getContext().getResources();
            String str2 = strArrSplit[0];
            String str3 = strArrSplit[1];
            String[] strArrSplit2 = str3.split("\\.(?=[^\\.]+$)");
            if (strArrSplit2.length == 2) {
                str3 = strArrSplit2[0];
            }
            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
                return resources.getIdentifier(str3, str2, Leanplum.getContext().getPackageName());
            }
        }
        Log.d("Could not extract resource id from provided resource name: ", str);
        return 0;
    }

    private static String generateRandomDeviceId() {
        String str = UUID.randomUUID().toString() + "-LP";
        Log.d("Using generated device id: ".concat(str), new Object[0]);
        return str;
    }

    public static String generateResourceNameFromId(int i) throws Resources.NotFoundException {
        try {
            if (i <= 0) {
                Log.d("Provided resource id is invalid.", new Object[0]);
                return null;
            }
            Resources resources = Leanplum.getContext().getResources();
            String resourceEntryName = resources.getResourceEntryName(i);
            String resourceTypeName = resources.getResourceTypeName(i);
            TypedValue typedValue = new TypedValue();
            resources.getValue(i, typedValue, true);
            String[] strArrSplit = typedValue.string.toString().split("\\.(?=[^\\.]+$)");
            String str = "";
            if (strArrSplit.length == 2) {
                str = "." + strArrSplit[1];
            }
            return resourceTypeName + "/" + resourceEntryName + str;
        } catch (Exception e) {
            Log.e("Failed to generate resource name from provided resource id: %s", e.getMessage());
            Log.exception(e);
            return null;
        }
    }

    private static DeviceIdInfo getAdvertisingId(Context context) {
        Object objInvoke;
        String strCheckDeviceId;
        try {
            Object[] objArr = {"androidx.ads.identifier.AdvertisingIdClient", "com.google.android.gms.ads.identifier.AdvertisingIdClient"};
            for (int i = 0; i < 2; i++) {
                String str = objArr[i];
                try {
                    objInvoke = Class.forName(str).getMethod("getAdvertisingIdInfo", Context.class).invoke(null, context);
                    if (str.equals(objArr[0])) {
                        objInvoke = objInvoke.getClass().getMethod("get", Long.TYPE, TimeUnit.class).invoke(objInvoke, 5, TimeUnit.SECONDS);
                    }
                    strCheckDeviceId = checkDeviceId("advertising id", (String) objInvoke.getClass().getMethod("getId", null).invoke(objInvoke, null));
                } catch (Throwable unused) {
                    Log.i("Couldn't get AdvertisingID using class: " + str, new Object[0]);
                }
                if (strCheckDeviceId != null) {
                    boolean zBooleanValue = ((Boolean) objInvoke.getClass().getMethod("isLimitAdTrackingEnabled", null).invoke(objInvoke, null)).booleanValue();
                    Log.d("Using advertising device id: " + strCheckDeviceId, new Object[0]);
                    return new DeviceIdInfo(strCheckDeviceId, zBooleanValue);
                }
                continue;
            }
        } catch (Throwable th) {
            Log.e("Error getting advertising ID. Google Play Services are not available: ", th);
        }
        return null;
    }

    private static String getAndroidId(Context context) {
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        if (string == null || string.isEmpty()) {
            Log.d("Skipping Android device id; no id returned.", new Object[0]);
            return null;
        }
        if ("9774d56d682e549c".equals(string)) {
            Log.d("Skipping Android device id; got invalid device id: ".concat(string), new Object[0]);
            return null;
        }
        Log.d("Using Android device id: ".concat(string), new Object[0]);
        return checkDeviceId("android id", string);
    }

    public static String getApplicationName(Context context) {
        String str = appName;
        if (str != null) {
            return str;
        }
        int i = context.getApplicationInfo().labelRes;
        if (i == 0) {
            String string = context.getApplicationInfo().loadLabel(context.getPackageManager()).toString();
            appName = string;
            return string;
        }
        String string2 = context.getString(i);
        appName = string2;
        return string2;
    }

    public static Long getDaysSinceInstall() {
        Context context = Leanplum.getContext();
        if (context == null) {
            return null;
        }
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).firstInstallTime;
            if (jCurrentTimeMillis < j) {
                return null;
            }
            return Long.valueOf(Math.min((jCurrentTimeMillis - j) / Clock.DAY_MILLIS, 31L));
        } catch (PackageManager.NameNotFoundException e) {
            Log.d("Failed to find package info: " + e, new Object[0]);
            return null;
        }
    }

    public static DeviceIdInfo getDeviceId(LeanplumDeviceIdMode leanplumDeviceIdMode) {
        Context context = Leanplum.getContext();
        if (leanplumDeviceIdMode.equals(LeanplumDeviceIdMode.ADVERTISING_ID)) {
            try {
                DeviceIdInfo advertisingId = getAdvertisingId(context);
                if (advertisingId != null) {
                    return advertisingId;
                }
            } catch (Exception e) {
                Log.e("Error getting advertising ID: %s", e);
            }
        }
        if ((isSimulator() || leanplumDeviceIdMode.equals(LeanplumDeviceIdMode.ANDROID_ID)) && getAndroidId(context) != null) {
            return new DeviceIdInfo(getAndroidId(context));
        }
        String wifiMacAddressHash = getWifiMacAddressHash(context);
        if (wifiMacAddressHash != null) {
            return new DeviceIdInfo(wifiMacAddressHash);
        }
        String androidId = getAndroidId(context);
        return androidId != null ? new DeviceIdInfo(androidId) : new DeviceIdInfo(generateRandomDeviceId());
    }

    public static String getDeviceModel() {
        if (isSimulator()) {
            return "Android Emulator";
        }
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        return str2.startsWith(str) ? capitalize(str2) : p3p.n(new StringBuilder(), capitalize(str), " ", str2);
    }

    public static String getDeviceName() {
        return isSimulator() ? "Android Emulator" : getDeviceModel();
    }

    public static String getLocale() {
        String language = Locale.getDefault().getLanguage();
        if ("".equals(language)) {
            language = "xx";
        }
        String country = Locale.getDefault().getCountry();
        if ("".equals(country)) {
            country = "XX";
        }
        return sko.v(language, "_", country);
    }

    public static String getSystemName() {
        return "Android OS";
    }

    public static String getSystemVersion() {
        return Build.VERSION.RELEASE;
    }

    public static String getVersionName() {
        String str = versionName;
        if (str != null) {
            return str;
        }
        Context context = Leanplum.getContext();
        try {
            if (TextUtils.isEmpty(versionName)) {
                versionName = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            }
        } catch (Exception unused) {
            Log.d("Could not extract versionName from Manifest or PackageInfo.", new Object[0]);
        }
        return versionName;
    }

    private static String getWifiMacAddressHash(Context context) {
        if (context.checkCallingOrSelfPermission(ACCESS_WIFI_STATE_PERMISSION) != 0) {
            Log.d("Skipping wifi device id; no wifi state permissions.", new Object[0]);
            return null;
        }
        try {
            WifiInfo connectionInfo = ((WifiManager) context.getApplicationContext().getSystemService("wifi")).getConnectionInfo();
            if (connectionInfo == null) {
                Log.d("Skipping wifi device id; null WifiInfo.", new Object[0]);
                return null;
            }
            String macAddress = connectionInfo.getMacAddress();
            if (macAddress == null || macAddress.isEmpty()) {
                Log.d("Skipping wifi device id; no mac address returned.", new Object[0]);
                return null;
            }
            if ("02:00:00:00:00:00".equals(macAddress)) {
                Log.d("Skipping wifi device id; Marshmallow and later returns a fake MAC address.", new Object[0]);
                return null;
            }
            String strMd5 = md5(connectionInfo.getMacAddress());
            Log.d("Using wifi device id: " + strMd5, new Object[0]);
            return checkDeviceId("mac address", strMd5);
        } catch (Exception unused) {
            Log.d("Error getting wifi MAC address.", new Object[0]);
            return null;
        }
    }

    public static boolean hasPlayServices() throws PackageManager.NameNotFoundException {
        if (hasPlayServicesCalled) {
            return hasPlayServices;
        }
        PackageManager packageManager = Leanplum.getContext().getPackageManager();
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo("com.google.android.gms", 64);
            if (packageInfo.versionCode < 4242000) {
                Log.i("Google Play services version is too old: " + packageInfo.versionCode, new Object[0]);
                hasPlayServicesCalled = true;
                hasPlayServices = false;
                return false;
            }
            try {
                ApplicationInfo applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                hasPlayServicesCalled = true;
                boolean z = applicationInfo.enabled;
                hasPlayServices = z;
                return z;
            } catch (PackageManager.NameNotFoundException unused) {
                hasPlayServicesCalled = true;
                hasPlayServices = false;
                return false;
            }
        } catch (PackageManager.NameNotFoundException unused2) {
            hasPlayServicesCalled = true;
            hasPlayServices = false;
            return false;
        }
    }

    public static void initExceptionHandling(Context context) {
        ExceptionHandler.getInstance().setContext(context);
    }

    public static void initializePreLeanplumInstall(Map<String, Object> map) {
        Context context = Leanplum.getContext();
        SharedPreferences sharedPreferences = context.getSharedPreferences(Constants.Defaults.LEANPLUM, 0);
        if (sharedPreferences.getBoolean(Constants.Keys.INSTALL_TIME_INITIALIZED, false)) {
            return;
        }
        PackageManager packageManager = context.getPackageManager();
        String packageName = context.getPackageName();
        setInstallTime(map, packageManager, packageName);
        setUpdateTime(map, packageManager, packageName);
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putBoolean(Constants.Keys.INSTALL_TIME_INITIALIZED, true);
        SharedPreferencesUtil.commitChanges(editorEdit);
    }

    public static boolean isConnected() {
        NetworkInfo activeNetworkInfo;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) Leanplum.getContext().getSystemService("connectivity");
            if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
                return false;
            }
            return activeNetworkInfo.isConnectedOrConnecting();
        } catch (Exception e) {
            Log.d("Error getting connectivity info", e);
            return false;
        }
    }

    public static boolean isInBackground() {
        return LeanplumActivityHelper.getCurrentActivity() == null || LeanplumActivityHelper.isActivityPaused();
    }

    public static boolean isSimulator() {
        String lowerCase = Build.MODEL.toLowerCase(Locale.getDefault());
        return lowerCase.contains("google_sdk") || lowerCase.contains("emulator") || lowerCase.contains("sdk");
    }

    public static boolean isValidDeviceId(String str) {
        if (str == null || str.isEmpty() || "9774d56d682e549c".equals(str) || "0f607264fc6318a92b9e13c65db7cd3c".equals(str) || "f607264fc6318a92b9e13c65db7cd3c".equals(str)) {
            Log.d(sko.j("Invalid device id (sentinel): ", str), new Object[0]);
            return false;
        }
        if (str.length() > 400) {
            Log.d("Invalid device id (too long): ".concat(str), new Object[0]);
            return false;
        }
        if (str.contains("[")) {
            Log.d("Invalid device id (contains brackets): ".concat(str), new Object[0]);
            return false;
        }
        if (str.contains("\n")) {
            Log.d("Invalid device id (contains newline): ".concat(str), new Object[0]);
            return false;
        }
        if (str.contains(",")) {
            Log.d("Invalid device id (contains comma): ".concat(str), new Object[0]);
            return false;
        }
        if (!str.contains("\"") && !str.contains("'")) {
            return isValidForCharset(str, "US-ASCII");
        }
        Log.d("Invalid device id (contains quotes): ".concat(str), new Object[0]);
        return false;
    }

    private static boolean isValidForCharset(String str, String str2) {
        CharsetEncoder charsetEncoderNewEncoder;
        try {
            charsetEncoderNewEncoder = Charset.forName(str2).newEncoder();
        } catch (UnsupportedCharsetException unused) {
            Log.d(sko.j("Unsupported charset: ", str2), new Object[0]);
            charsetEncoderNewEncoder = null;
        }
        if (charsetEncoderNewEncoder == null || charsetEncoderNewEncoder.canEncode(str)) {
            return true;
        }
        Log.d(sko.j("Invalid id (contains invalid characters): ", str), new Object[0]);
        return false;
    }

    public static boolean isValidUserId(String str) {
        if (str == null || str.isEmpty()) {
            Log.d(sko.j("Invalid user id (sentinel): ", str), new Object[0]);
            return false;
        }
        if (str.length() > 400) {
            Log.d("Invalid user id (too long): ".concat(str), new Object[0]);
            return false;
        }
        if (str.contains("\n")) {
            Log.d("Invalid user id (contains newline): ".concat(str), new Object[0]);
            return false;
        }
        if (!str.contains("\"") && !str.contains("'")) {
            return isValidForCharset(str, "UTF-8");
        }
        Log.d("Invalid user id (contains quotes): ".concat(str), new Object[0]);
        return false;
    }

    public static boolean isXiaomiDevice() {
        String str = Build.MANUFACTURER;
        return str != null && str.toLowerCase().contains("xiaomi");
    }

    private static String md5(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        messageDigest.update(str.getBytes(Charset.forName("UTF-8")));
        byte[] bArrDigest = messageDigest.digest();
        StringBuilder sb = new StringBuilder();
        for (byte b : bArrDigest) {
            sb.append(String.format("%02x", Byte.valueOf(b)));
        }
        return sb.toString();
    }

    public static <T> T multiIndex(Map<?, ?> map, Object... objArr) {
        if (map == null) {
            return null;
        }
        int length = objArr.length;
        int i = 0;
        Object obj = map;
        while (i < length) {
            Object obj2 = objArr[i];
            Map<?, ?> map2 = (Map) obj;
            if (!map2.containsKey(obj2)) {
                return null;
            }
            i++;
            obj = map2.get(obj2);
        }
        return (T) CollectionUtil.uncheckedCast(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <K, V> Map<K, V> newMap(K k, V v, Object... objArr) {
        if (objArr.length % 2 == 1) {
            qp2.o("Must supply an even number of values.");
            return null;
        }
        HashMap map = new HashMap();
        map.put(k, v);
        for (int i = 0; i < objArr.length; i += 2) {
            map.put(CollectionUtil.uncheckedCast(objArr[i]), CollectionUtil.uncheckedCast(objArr[i + 1]));
        }
        return map;
    }

    private static void setInstallTime(Map<String, Object> map, PackageManager packageManager, String str) {
        try {
            map.put(Constants.Params.INSTALL_DATE, String.valueOf(packageManager.getPackageInfo(str, 0).firstInstallTime / 1000.0d));
        } catch (PackageManager.NameNotFoundException e) {
            Log.d("Failed to find package info: " + e, new Object[0]);
        }
    }

    private static void setUpdateTime(Map<String, Object> map, PackageManager packageManager, String str) {
        try {
            if (new File(packageManager.getApplicationInfo(str, 0).sourceDir).exists()) {
                map.put(Constants.Params.UPDATE_DATE, String.valueOf(r7.lastModified() / 1000.0d));
            }
        } catch (Throwable th) {
            Log.d("Failed to find package info: " + th, new Object[0]);
        }
    }

    public static String sha256(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA256");
        messageDigest.update(str.getBytes(Charset.forName("UTF-8")));
        byte[] bArrDigest = messageDigest.digest();
        StringBuilder sb = new StringBuilder();
        for (byte b : bArrDigest) {
            sb.append(String.format("%02x", Byte.valueOf(b)));
        }
        return sb.toString();
    }
}
