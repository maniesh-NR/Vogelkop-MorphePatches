package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes.dex */
public final class yid extends IOException {
    public final nd6 a;
    public final Uri b;
    public final Map c;
    public final long d;

    public yid(nd6 nd6Var, Uri uri, Map map, long j, Exception exc) {
        super(exc);
        this.a = nd6Var;
        this.b = uri;
        this.c = map;
        this.d = j;
    }
}
