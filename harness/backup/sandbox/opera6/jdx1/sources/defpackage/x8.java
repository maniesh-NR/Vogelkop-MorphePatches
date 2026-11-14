package defpackage;

import android.app.Notification;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.Handler;
import android.os.Process;
import android.os.UserHandle;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class x8 {
    public static Method a;
    public static sv2 b;

    public static boolean a(Context context, Intent intent, ServiceConnection serviceConnection, int i, Handler handler) {
        if (a == null) {
            a = Context.class.getDeclaredMethod("bindServiceAsUser", Intent.class, ServiceConnection.class, Integer.TYPE, Handler.class, UserHandle.class);
        }
        while (context instanceof ContextWrapper) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return ((Boolean) a.invoke(context, intent, serviceConnection, Integer.valueOf(i), handler, Process.myUserHandle())).booleanValue();
    }

    public static AccessibilityNodeInfo.MathInfo b(String str) {
        return new AccessibilityNodeInfo.MathInfo(str);
    }

    public static boolean c(Context context, Intent intent, ServiceConnection serviceConnection, int i, Handler handler, Executor executor, String str) {
        sv2 sv2Var = b;
        if (sv2Var != null) {
            sv2Var.a++;
        }
        if (Build.VERSION.SDK_INT >= 31 && str != null) {
            return context.bindIsolatedService(intent, i, str, executor, serviceConnection);
        }
        try {
            return a(context, intent, serviceConnection, i, handler);
        } catch (ReflectiveOperationException e) {
            try {
                return context.bindService(intent, serviceConnection, i);
            } catch (RuntimeException e2) {
                h9o.s(e2.getMessage(), e);
                return false;
            }
        }
    }

    public static void d(Context context, bx4 bx4Var, int i) {
        long j = i;
        if (((-2147483648L) & j) != 0) {
            j = (j & 2147483647L) | 4611686018427387904L;
        }
        Context.BindServiceFlags bindServiceFlagsOf = Context.BindServiceFlags.of(j);
        if (Build.VERSION.SDK_INT >= 37) {
            context.rebindService(bx4Var, bindServiceFlagsOf);
        }
    }

    public static String e(AccessibilityNodeInfo.MathInfo mathInfo, String str) {
        if (mathInfo == null) {
            return null;
        }
        return mathInfo.getAttribute(str);
    }

    public static String f(AccessibilityNodeInfo.MathInfo mathInfo) {
        if (mathInfo == null) {
            return null;
        }
        return mathInfo.getTag();
    }

    public static void g(AccessibilityNodeInfo.MathInfo mathInfo, String str, String str2) {
        if (mathInfo == null) {
            return;
        }
        mathInfo.putAttribute(str, str2);
    }

    public static void h(Notification.Action.Builder builder, int i) {
        builder.setEmphasisHint(i);
    }

    public static final void i(k0j k0jVar, AccessibilityEvent accessibilityEvent) {
        f0j f0jVar = k0jVar.d;
        Object objG = f0jVar.a.g(n0j.M);
        if (objG == null) {
            objG = null;
        }
        if (objG != null) {
            h9o.t();
        } else {
            Object objG2 = f0jVar.a.g(n0j.I);
            accessibilityEvent.setTextChangeTypes(accessibilityEvent.getTextChangeTypes() | (((xjl) (objG2 != null ? objG2 : null)) != null ? 1 : 0));
        }
    }

    public static void j(AccessibilityNodeInfo accessibilityNodeInfo, AccessibilityNodeInfo.MathInfo mathInfo) {
        if (accessibilityNodeInfo == null) {
            return;
        }
        accessibilityNodeInfo.setStructuredDataInfo(mathInfo);
    }

    public static void k(Notification.Action.Builder builder, int i) {
        builder.setStyleHint(i);
    }

    public static int l(AccessibilityNodeInfo.MathInfo mathInfo) {
        if (mathInfo == null) {
            return 0;
        }
        return mathInfo.hashCode();
    }
}
