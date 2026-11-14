package defpackage;

import android.content.Context;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class gt5 {
    public static final Object a = new Object();
    public static final HashMap b = new HashMap();

    public static Context a(Context context) {
        Context applicationContext = context.getApplicationContext();
        int iHashCode = context.getApplicationContext().hashCode();
        int i = Build.VERSION.SDK_INT;
        Context context2 = null;
        String str = String.format("%d-%d-%s", Integer.valueOf(iHashCode), Integer.valueOf(i >= 34 ? g8.p(context) : 0), i >= 30 ? r9n.f(context) : null);
        synchronized (a) {
            HashMap map = b;
            WeakReference weakReference = (WeakReference) map.get(str);
            if (weakReference != null) {
                Context context3 = (Context) weakReference.get();
                if (context3 != null) {
                    context2 = context3;
                } else {
                    map.remove(str);
                }
            }
            if (context2 != null) {
                return context2;
            }
            if (i >= 34) {
                applicationContext = g8.e(g8.p(context), applicationContext);
            }
            if (i >= 30) {
                String strF = r9n.f(context);
                if (!Objects.equals(strF, r9n.f(applicationContext))) {
                    applicationContext = r9n.d(applicationContext, strF);
                }
            }
            map.put(str, new WeakReference(applicationContext));
            return applicationContext;
        }
    }
}
