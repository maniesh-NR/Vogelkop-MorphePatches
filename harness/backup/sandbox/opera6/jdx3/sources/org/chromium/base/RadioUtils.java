package org.chromium.base;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Process;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;

/* loaded from: classes.dex */
public final class RadioUtils {
    public static Boolean a;
    public static Boolean b;

    public static int getCellDataActivity() {
        TraceEvent traceEventN = TraceEvent.n("RadioUtils::getCellDataActivity", (String) null);
        try {
            try {
                int dataActivity = ((TelephonyManager) t8.a.getSystemService("phone")).getDataActivity();
                if (traceEventN != null) {
                    traceEventN.close();
                }
                return dataActivity;
            } catch (SecurityException unused) {
                if (traceEventN == null) {
                    return -1;
                }
                traceEventN.close();
                return -1;
            }
        } catch (Throwable th) {
            if (traceEventN != null) {
                try {
                    traceEventN.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static int getCellSignalLevel() {
        TraceEvent traceEventN = TraceEvent.n("RadioUtils::getCellSignalLevel", (String) null);
        try {
            int level = -1;
            try {
                SignalStrength signalStrength = ((TelephonyManager) t8.a.getSystemService("phone")).getSignalStrength();
                if (signalStrength != null) {
                    level = signalStrength.getLevel();
                }
            } catch (SecurityException unused) {
            }
            if (traceEventN != null) {
                traceEventN.close();
            }
            return level;
        } catch (Throwable th) {
            if (traceEventN != null) {
                try {
                    traceEventN.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static boolean isSupported() {
        int iCheckPermission;
        Boolean boolValueOf = a;
        int iCheckPermission2 = -1;
        if (boolValueOf == null) {
            try {
                iCheckPermission = t8.a.checkPermission("android.permission.ACCESS_NETWORK_STATE", Process.myPid(), Process.myUid());
            } catch (RuntimeException unused) {
                iCheckPermission = -1;
            }
            boolValueOf = Boolean.valueOf(iCheckPermission == 0);
            a = boolValueOf;
        }
        if (!boolValueOf.booleanValue()) {
            return false;
        }
        Boolean boolValueOf2 = b;
        if (boolValueOf2 == null) {
            try {
                iCheckPermission2 = t8.a.checkPermission("android.permission.ACCESS_WIFI_STATE", Process.myPid(), Process.myUid());
            } catch (RuntimeException unused2) {
            }
            boolValueOf2 = Boolean.valueOf(iCheckPermission2 == 0);
            b = boolValueOf2;
        }
        return boolValueOf2.booleanValue();
    }

    public static boolean isWifiConnected() {
        TraceEvent traceEventN = TraceEvent.n("RadioUtils::isWifiConnected", (String) null);
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) t8.a.getSystemService("connectivity");
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork != null) {
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
                if (networkCapabilities == null) {
                    if (traceEventN != null) {
                    }
                    return false;
                }
                boolean zHasTransport = networkCapabilities.hasTransport(1);
                if (traceEventN != null) {
                    traceEventN.close();
                }
                return zHasTransport;
            }
            if (traceEventN == null) {
                return false;
            }
            traceEventN.close();
            return false;
        } catch (Throwable th) {
            if (traceEventN != null) {
                try {
                    traceEventN.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
