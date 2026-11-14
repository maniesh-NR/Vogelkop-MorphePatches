package com.appsflyer.internal;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Process;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.AFLogger;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.play.core.integrity.IntegrityManagerFactory;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;

/* loaded from: classes.dex */
public final class AFj1iSDK {
    public static long AFAdRevenueData(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 0).getLongVersionCode();
        } catch (PackageManager.NameNotFoundException e) {
            AFLogger.afErrorLog(e.getMessage(), e);
            return 0L;
        }
    }

    public static boolean AFAdRevenueData(@Nullable Context context) {
        if (context != null) {
            try {
                if (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context) == 0) {
                    return true;
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    public static boolean L_(Context context, Intent intent) {
        return context.getPackageManager().queryIntentServices(intent, 0).size() > 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Map<java.lang.String, java.lang.String> M_(android.content.Context r9, java.util.Map<java.lang.String, java.lang.String> r10, android.net.Uri r11) {
        /*
            java.lang.String r0 = "install_time"
            java.util.Set r1 = r11.getQueryParameterNames()
            java.util.Iterator r1 = r1.iterator()
        La:
            boolean r2 = r1.hasNext()
            r3 = 0
            java.lang.String r4 = "media_source"
            java.lang.String r5 = "agency"
            if (r2 == 0) goto L5c
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r6 = r11.getQueryParameter(r2)
            boolean r7 = r10.containsKey(r2)
            if (r7 != 0) goto L57
            r2.getClass()
            int r7 = r2.hashCode()
            r8 = -1
            switch(r7) {
                case -1420799080: goto L45;
                case 99: goto L3b;
                case 110987: goto L31;
                default: goto L30;
            }
        L30:
            goto L4d
        L31:
            java.lang.String r3 = "pid"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L4d
            r3 = 2
            goto L4e
        L3b:
            java.lang.String r3 = "c"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L4d
            r3 = 1
            goto L4e
        L45:
            java.lang.String r7 = "af_prt"
            boolean r7 = r2.equals(r7)
            if (r7 != 0) goto L4e
        L4d:
            r3 = r8
        L4e:
            switch(r3) {
                case 0: goto L55;
                case 1: goto L52;
                case 2: goto L58;
                default: goto L51;
            }
        L51:
            goto L57
        L52:
            java.lang.String r4 = "campaign"
            goto L58
        L55:
            r4 = r5
            goto L58
        L57:
            r4 = r2
        L58:
            r10.put(r4, r6)
            goto La
        L5c:
            boolean r1 = r10.containsKey(r0)     // Catch: java.lang.Exception -> L8f
            if (r1 != 0) goto L95
            java.lang.String r1 = "yyyy-MM-dd HH:mm:ss"
            java.text.SimpleDateFormat r2 = new java.text.SimpleDateFormat     // Catch: java.lang.Exception -> L8f
            java.util.Locale r6 = java.util.Locale.US     // Catch: java.lang.Exception -> L8f
            r2.<init>(r1, r6)     // Catch: java.lang.Exception -> L8f
            android.content.pm.PackageManager r1 = r9.getPackageManager()     // Catch: java.lang.Exception -> L8f
            java.lang.String r9 = r9.getPackageName()     // Catch: java.lang.Exception -> L8f
            android.content.pm.PackageInfo r9 = r1.getPackageInfo(r9, r3)     // Catch: java.lang.Exception -> L8f
            long r6 = r9.firstInstallTime     // Catch: java.lang.Exception -> L8f
            java.lang.String r9 = "UTC"
            java.util.TimeZone r9 = java.util.TimeZone.getTimeZone(r9)     // Catch: java.lang.Exception -> L8f
            r2.setTimeZone(r9)     // Catch: java.lang.Exception -> L8f
            java.util.Date r9 = new java.util.Date     // Catch: java.lang.Exception -> L8f
            r9.<init>(r6)     // Catch: java.lang.Exception -> L8f
            java.lang.String r9 = r2.format(r9)     // Catch: java.lang.Exception -> L8f
            r10.put(r0, r9)     // Catch: java.lang.Exception -> L8f
            goto L95
        L8f:
            r9 = move-exception
            java.lang.String r0 = "Could not fetch install time. "
            com.appsflyer.AFLogger.afErrorLog(r0, r9)
        L95:
            java.lang.String r9 = "af_deeplink"
            boolean r9 = r10.containsKey(r9)
            if (r9 == 0) goto Laa
            java.lang.String r9 = "af_status"
            boolean r0 = r10.containsKey(r9)
            if (r0 != 0) goto Laa
            java.lang.String r0 = "Non-organic"
            r10.put(r9, r0)
        Laa:
            boolean r9 = r10.containsKey(r5)
            if (r9 == 0) goto Lb3
            r10.remove(r4)
        Lb3:
            java.lang.String r9 = r11.getPath()
            if (r9 == 0) goto Lbe
            java.lang.String r0 = "path"
            r10.put(r0, r9)
        Lbe:
            java.lang.String r9 = r11.getScheme()
            if (r9 == 0) goto Lc9
            java.lang.String r0 = "scheme"
            r10.put(r0, r9)
        Lc9:
            java.lang.String r9 = r11.getHost()
            if (r9 == 0) goto Ld4
            java.lang.String r11 = "host"
            r10.put(r11, r9)
        Ld4:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFj1iSDK.M_(android.content.Context, java.util.Map, android.net.Uri):java.util.Map");
    }

    @SuppressLint({"PackageManagerGetSignatures"})
    public static String N_(PackageManager packageManager, String str) throws NoSuchAlgorithmException {
        Signature[] signatureArr = packageManager.getPackageInfo(str, 64).signatures;
        if (signatureArr == null) {
            return null;
        }
        X509Certificate x509Certificate = (X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()));
        MessageDigest messageDigest = MessageDigest.getInstance("SHA256");
        messageDigest.update(x509Certificate.getEncoded());
        return String.format("%032X", new BigInteger(1, messageDigest.digest()));
    }

    @Nullable
    public static Application O_(@NonNull Context context) {
        if (context instanceof Application) {
            return (Application) context;
        }
        if (context instanceof Activity) {
            return ((Activity) context).getApplication();
        }
        try {
            return (Application) context.getApplicationContext();
        } catch (ClassCastException unused) {
            AFLogger.afErrorLog("Application or Activity Context should be used", new IllegalStateException(), true, true);
            return null;
        }
    }

    public static boolean getCurrencyIso4217Code(@Nullable Context context) {
        if (context == null) {
            return false;
        }
        try {
            AppSet.getClient(context);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static String getMediationNetwork(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            AFLogger.afErrorLog(e.getMessage(), e);
            return "";
        }
    }

    public static boolean getMediationNetwork() {
        return Build.BRAND.equals("OPPO");
    }

    public static boolean getMonetizationNetwork(@Nullable Context context) {
        if (context == null) {
            return false;
        }
        try {
            IntegrityManagerFactory.create(context);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean getMonetizationNetwork(Context context, String str) {
        int iCheckPermission = context.checkPermission(str, Process.myPid(), Process.myUid());
        StringBuilder sb = new StringBuilder("is Permission Available: ");
        sb.append(str);
        sb.append("; res: ");
        sb.append(iCheckPermission);
        AFLogger.afRDLog(sb.toString());
        return iCheckPermission == 0;
    }

    @SuppressLint({"NewApi"})
    public static boolean getRevenue(@Nullable Context context) {
        if (context != null && Build.VERSION.SDK_INT >= 33) {
            try {
                return uac.d(context.getApplicationContext().getSystemService(uac.g())) != null;
            } catch (Throwable th) {
                AFLogger.INSTANCE.e(AFg1cSDK.PRIVACY_SANDBOX, th.getMessage() != null ? th.getMessage() : "", th, false, false);
            }
        }
        return false;
    }
}
