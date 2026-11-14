package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class zsk {
    public static final Map f;
    public final String a;
    public final String b;
    public final byte c;
    public final int d;
    public final int e;

    static {
        HashMap map = new HashMap();
        map.put("premium_6month", new zsk("premium_6month", 6, 2132019225, 2132019224, "p6m"));
        map.put("premium_3month", new zsk("premium_3month", 3, 2132020597, 2132020596, "p3m"));
        map.put("premium_monthly", new zsk("premium_monthly", 1, 2132019805, 2132019803, "p1m"));
        f = Collections.unmodifiableMap(map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public zsk(String str, int i, int i2, int i3, String str2) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
        this.e = i3;
    }
}
