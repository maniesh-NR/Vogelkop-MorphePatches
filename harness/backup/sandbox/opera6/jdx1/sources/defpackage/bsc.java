package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class bsc {
    public static final AtomicLong g = new AtomicLong();
    public final nd6 a;
    public final Uri b;
    public final Map c;
    public final long d;
    public final long e;
    public final long f;

    public bsc(nd6 nd6Var, long j) {
        this(nd6Var, nd6Var.a, Collections.EMPTY_MAP, j, 0L, 0L);
    }

    public bsc(nd6 nd6Var, Uri uri, Map map, long j, long j2, long j3) {
        this.a = nd6Var;
        this.b = uri;
        this.c = map;
        this.d = j;
        this.e = j2;
        this.f = j3;
    }
}
