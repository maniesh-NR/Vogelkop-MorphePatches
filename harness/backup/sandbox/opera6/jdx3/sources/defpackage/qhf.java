package defpackage;

import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class qhf {
    public static final AtomicInteger a = new AtomicInteger();
    public static final Map b = Collections.synchronizedMap(new WeakHashMap());

    public static void a() {
        Thread.currentThread().getName();
    }
}
