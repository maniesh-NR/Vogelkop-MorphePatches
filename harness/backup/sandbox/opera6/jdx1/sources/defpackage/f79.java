package defpackage;

import android.os.Build;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public abstract class f79 {
    public static final ConcurrentHashMap a;
    public static final CopyOnWriteArraySet b;

    static {
        int i = Build.VERSION.SDK_INT;
        a = i >= 36 ? new ConcurrentHashMap() : null;
        b = i >= 36 ? new CopyOnWriteArraySet() : null;
    }
}
