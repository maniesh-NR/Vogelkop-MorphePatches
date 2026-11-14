package ads_mobile_sdk;

import android.util.Log;
import defpackage.v0k;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class xu0 {
    public static final vr3 a = new vr3(new a3j((byte) 10));

    public static void a(String str, Exception exc) {
        if (a("GoogleMobileAds", 6)) {
            vr3 vr3Var = a;
            vr3Var.getClass();
            u0k u0kVarF = ((v0k) vr3Var.d).f(vr3Var, str);
            while (true) {
                u0k u0kVar = u0kVarF;
                if (!u0kVar.hasNext()) {
                    break;
                }
                Thread.currentThread().getName();
            }
            if (exc != null) {
                Log.getStackTraceString(exc);
            }
        }
    }

    public static void a(String str, RuntimeException runtimeException, int i) {
        if ((i & 2) != 0) {
            runtimeException = null;
        }
        if (a((i & 4) != 0 ? "GoogleMobileAds" : "GoogleMobileAdsNetwork", 4)) {
            vr3 vr3Var = a;
            vr3Var.getClass();
            u0k u0kVarF = ((v0k) vr3Var.d).f(vr3Var, str);
            while (true) {
                u0k u0kVar = u0kVarF;
                if (!u0kVar.hasNext()) {
                    break;
                }
                Thread.currentThread().getName();
            }
            if (runtimeException != null) {
                Log.getStackTraceString(runtimeException);
            }
        }
    }

    public static void a(Function0 function0) {
        if (vq.a == wq.a || !a("GoogleMobileAds", 2)) {
            return;
        }
        u0k it = a.m((CharSequence) function0.invoke()).iterator();
        while (true) {
            u0k u0kVar = it;
            if (!u0kVar.hasNext()) {
                return;
            }
            Thread.currentThread().getName();
        }
    }

    public static boolean a(String str, int i) {
        wq wqVar = vq.a;
        return i >= 5 || Log.isLoggable(str, i);
    }

    public static void b(String str, Throwable th) {
        if (a("GoogleMobileAds", 2)) {
            u0k it = a.m(str).iterator();
            while (true) {
                u0k u0kVar = it;
                if (!u0kVar.hasNext()) {
                    break;
                }
                Thread.currentThread().getName();
            }
            if (th != null) {
                Log.getStackTraceString(th);
            }
        }
    }

    public static void c(String str, Exception exc) {
        if (a("GoogleMobileAds", 5)) {
            u0k it = a.m(str).iterator();
            while (true) {
                u0k u0kVar = it;
                if (!u0kVar.hasNext()) {
                    break;
                }
                Thread.currentThread().getName();
            }
            if (exc != null) {
                Log.getStackTraceString(exc);
            }
        }
    }
}
