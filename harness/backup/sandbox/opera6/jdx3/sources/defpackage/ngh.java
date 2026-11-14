package defpackage;

import android.util.Pair;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes.dex */
public abstract class ngh {
    public static final Method b;
    public static final Method c;
    public static final r16 a = new r16();
    public static final ConcurrentLinkedQueue d = new ConcurrentLinkedQueue();

    static {
        try {
            Class<?> cls = Class.forName("android.app.QueuedWork");
            for (Pair pair : Arrays.asList(new Pair("addFinisher", "removeFinisher"), new Pair("add", "remove"))) {
                try {
                    Method declaredMethod = cls.getDeclaredMethod((String) pair.first, Runnable.class);
                    b = declaredMethod;
                    declaredMethod.setAccessible(true);
                    Method declaredMethod2 = cls.getDeclaredMethod((String) pair.second, Runnable.class);
                    c = declaredMethod2;
                    declaredMethod2.setAccessible(true);
                    break;
                } catch (NoSuchMethodException unused) {
                }
            }
            if (b == null || c == null) {
                b = null;
                c = null;
                ks3.B("QWW", "Missing method");
            }
        } catch (Exception e) {
            ks3.D(e);
            b = null;
            c = null;
        }
    }
}
