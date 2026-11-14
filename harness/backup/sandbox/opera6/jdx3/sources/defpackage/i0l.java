package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.opera.android.Lazy;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public abstract class i0l {
    public static long a;
    public static final nx1 b = new nx1(8);
    public static final nx1 c = new nx1(9);
    public static final Object d = new Object();
    public static final ii e = new ii(24);

    public static long a(Context context) {
        long j = a;
        if (j != 0) {
            return j;
        }
        long memoryClass = ((ActivityManager) context.getSystemService("activity")).getMemoryClass() << 20;
        a = memoryClass;
        return memoryClass;
    }

    public static String b(Context context) {
        return ((bu6) b.d(context)).a(context, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String c(android.content.Context r4) {
        /*
            nx1 r0 = defpackage.i0l.b
            java.lang.Object r0 = r0.d(r4)
            bu6 r0 = (defpackage.bu6) r0
            byte r0 = r0.a
            r1 = 0
            switch(r0) {
                case 0: goto L1d;
                default: goto Le;
            }
        Le:
            s6e r0 = defpackage.s6e.b(r4)
            vq8 r0 = r0.b
            java.lang.Object r0 = r0.d
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = defpackage.aik.o(r0)
            goto L35
        L1d:
            java.lang.String r0 = "phone"
            java.lang.Object r0 = r4.getSystemService(r0)
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0
            if (r0 == 0) goto L34
            java.lang.String r0 = r0.getSimCountryIso()     // Catch: java.lang.RuntimeException -> L34
            if (r0 == 0) goto L34
            int r2 = r0.length()     // Catch: java.lang.RuntimeException -> L34
            r3 = 2
            if (r2 == r3) goto L35
        L34:
            r0 = r1
        L35:
            java.lang.String r2 = "sys_utils"
            r3 = 0
            android.content.SharedPreferences r4 = r4.getSharedPreferences(r2, r3)
            java.lang.Object r2 = defpackage.i0l.d
            monitor-enter(r2)
            java.lang.String r3 = "sysutil.sim_country"
            java.lang.String r1 = r4.getString(r3, r1)     // Catch: java.lang.Throwable -> L64
            boolean r3 = android.text.TextUtils.equals(r0, r1)     // Catch: java.lang.Throwable -> L64
            if (r3 != 0) goto L60
            boolean r3 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L64
            if (r3 != 0) goto L60
            android.content.SharedPreferences$Editor r4 = r4.edit()     // Catch: java.lang.Throwable -> L64
            java.lang.String r1 = "sysutil.sim_country"
            android.content.SharedPreferences$Editor r4 = r4.putString(r1, r0)     // Catch: java.lang.Throwable -> L64
            r4.apply()     // Catch: java.lang.Throwable -> L64
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L64
            return r0
        L60:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L64
            return r1
        L62:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L64
            throw r4
        L64:
            r4 = move-exception
            goto L62
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i0l.c(android.content.Context):java.lang.String");
    }

    public static String d(Context context) {
        String strSubstring;
        TelephonyManager telephonyManager;
        switch (((bu6) b.d(context)).a) {
            case 0:
                try {
                    telephonyManager = (TelephonyManager) context.getSystemService("phone");
                } catch (Throwable unused) {
                }
                if (telephonyManager != null && telephonyManager.getSimState() == 5) {
                    strSubstring = telephonyManager.getSimOperator().substring(0, 3);
                    break;
                } else {
                    strSubstring = "";
                    break;
                }
                break;
            default:
                strSubstring = (String) s6e.b(context).b.b;
                break;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("sys_utils", 0);
        synchronized (d) {
            String string = sharedPreferences.getString("sysutil.mcc", "");
            if (TextUtils.equals(strSubstring, string) || TextUtils.isEmpty(strSubstring)) {
                return string;
            }
            sharedPreferences.edit().putString("sysutil.mcc", strSubstring).apply();
            return strSubstring;
        }
    }

    public static String e(Context context) {
        String strSubstring;
        TelephonyManager telephonyManager;
        switch (((bu6) b.d(context)).a) {
            case 0:
                try {
                    telephonyManager = (TelephonyManager) context.getSystemService("phone");
                } catch (Throwable unused) {
                }
                if (telephonyManager != null && telephonyManager.getSimState() == 5) {
                    strSubstring = telephonyManager.getSimOperator().substring(3);
                    break;
                } else {
                    strSubstring = "";
                    break;
                }
                break;
            default:
                strSubstring = (String) s6e.b(context).b.c;
                break;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("sys_utils", 0);
        synchronized (d) {
            String string = sharedPreferences.getString("sysutil.mnc", "");
            if (TextUtils.equals(strSubstring, string) || TextUtils.isEmpty(strSubstring)) {
                return string;
            }
            sharedPreferences.edit().putString("sysutil.mnc", strSubstring).apply();
            return strSubstring;
        }
    }

    public static String f(String str) throws Throwable {
        Throwable th;
        InputStream inputStream;
        try {
            inputStream = new ProcessBuilder("/system/bin/getprop", str).start().getInputStream();
            try {
                String strZ = xvg.z(inputStream);
                String[] strArr = aik.a;
                int iIndexOf = strZ.indexOf(10);
                if (iIndexOf != -1) {
                    if (iIndexOf > 0 && strZ.charAt(iIndexOf - 1) == '\r') {
                        iIndexOf--;
                    }
                    strZ = strZ.substring(0, iIndexOf);
                }
                xvg.l(inputStream);
                return strZ;
            } catch (IOException unused) {
                xvg.l(inputStream);
                return null;
            } catch (Throwable th2) {
                th = th2;
                xvg.l(inputStream);
                throw th;
            }
        } catch (IOException unused2) {
            inputStream = null;
        } catch (Throwable th3) {
            th = th3;
            inputStream = null;
        }
    }

    public static boolean g() {
        return ((Boolean) e.get()).booleanValue();
    }

    public static Lazy h(Context context) {
        return (Lazy) c.d(context);
    }
}
