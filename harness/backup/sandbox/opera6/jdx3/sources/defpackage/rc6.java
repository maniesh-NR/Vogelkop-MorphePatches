package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class rc6 {
    public static final g34 b = new g34((byte) 1);
    public final HashMap a;

    public rc6(byte b2) {
        switch (b2) {
            case 1:
                this.a = new HashMap();
                break;
            case 2:
                this.a = new HashMap();
                break;
            case 3:
                this.a = new HashMap();
                break;
            default:
                this.a = new HashMap();
                break;
        }
    }

    public final void a(Class cls, xbd xbdVar) {
        this.a.put(cls, xbdVar);
    }

    public final void b(String str, String str2, String str3) {
        HashMap map = this.a;
        if (!map.containsKey(str2)) {
            map.put(str2, new HashMap());
        }
        ((Map) map.get(str2)).put(str, str3);
    }

    public final ppp c() {
        HashMap map = new HashMap();
        for (Map.Entry entry : this.a.entrySet()) {
            map.put((String) entry.getKey(), Collections.unmodifiableMap(new HashMap((Map) entry.getValue())));
        }
        return new ppp(Collections.unmodifiableMap(map));
    }
}
