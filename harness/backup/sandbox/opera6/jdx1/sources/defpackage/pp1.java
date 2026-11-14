package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public abstract class pp1 {
    public static final op1 a = new op1(new n97((byte) 2));
    public static final int b = -100;
    public static bwc c = null;
    public static bwc d = null;
    public static Boolean e = null;
    public static boolean f = false;
    public static final t72 g = new t72(0);
    public static final Object h = new Object();
    public static final Object i = new Object();

    public static boolean c(Context context) {
        if (e == null) {
            try {
                int i2 = st1.a;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) st1.class), 640).metaData;
                if (bundle != null) {
                    e = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                e = Boolean.FALSE;
            }
        }
        return e.booleanValue();
    }

    public static void f(xp1 xp1Var) {
        synchronized (h) {
            t72 t72Var = g;
            t72Var.getClass();
            m72 m72Var = new m72(t72Var);
            while (m72Var.hasNext()) {
                pp1 pp1Var = (pp1) ((WeakReference) m72Var.next()).get();
                if (pp1Var == xp1Var || pp1Var == null) {
                    m72Var.remove();
                }
            }
        }
    }

    public abstract View a(String str, Context context, AttributeSet attributeSet);

    public abstract void b();

    public abstract void d();

    public abstract void e();

    public abstract boolean g(int i2);

    public abstract void h(int i2);

    public abstract void i(View view);

    public abstract void j(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void k(CharSequence charSequence);

    public abstract se l(re reVar);

    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return a(str, context, attributeSet);
    }
}
