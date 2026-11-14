package defpackage;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class o7n {
    public final urj a = new urj((byte) 3);
    public final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashSet c = new LinkedHashSet();
    public volatile boolean d;

    public static void a(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                z1m.w(autoCloseable);
            } catch (Exception e) {
                rqd.p(e);
            }
        }
    }
}
