package defpackage;

import android.os.Bundle;
import android.os.SystemClock;

/* loaded from: classes.dex */
public final class e4j {
    public static final String e;
    public static final String f;
    public static final String g;
    public static final String h;
    public final int a;
    public final Bundle b;
    public final long c;
    public final a4j d;

    static {
        String str = tym.a;
        e = "0";
        f = "1";
        g = "2";
        h = "3";
    }

    public e4j(int i) {
        this(i, Bundle.EMPTY, SystemClock.elapsedRealtime(), null);
    }

    public e4j(int i, Bundle bundle, long j, a4j a4jVar) {
        z4o.w(a4jVar == null || i < 0);
        this.a = i;
        this.b = new Bundle(bundle);
        this.c = j;
        if (a4jVar == null && i < 0) {
            a4jVar = new a4j(i);
        }
        this.d = a4jVar;
    }

    public static e4j a(Bundle bundle) {
        int i = bundle.getInt(e, -1);
        Bundle bundle2 = bundle.getBundle(f);
        long j = bundle.getLong(g, SystemClock.elapsedRealtime());
        Bundle bundle3 = bundle.getBundle(h);
        a4j a4jVarA = bundle3 != null ? a4j.a(bundle3) : i != 0 ? new a4j(i) : null;
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        return new e4j(i, bundle2, j, a4jVarA);
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putInt(e, this.a);
        bundle.putBundle(f, this.b);
        bundle.putLong(g, this.c);
        a4j a4jVar = this.d;
        if (a4jVar != null) {
            bundle.putBundle(h, a4jVar.b());
        }
        return bundle;
    }
}
