package defpackage;

import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class zk8 {
    public static volatile zk8 b;
    public static final zk8 c = new zk8();
    public final Map a = Collections.EMPTY_MAP;

    public static zk8 a() {
        zk8 zk8Var;
        y6h y6hVar = y6h.c;
        zk8 zk8Var2 = b;
        if (zk8Var2 != null) {
            return zk8Var2;
        }
        synchronized (zk8.class) {
            zk8Var = b;
            if (zk8Var == null) {
                Class cls = wk8.a;
                zk8 zk8Var3 = null;
                if (cls != null) {
                    try {
                        zk8Var3 = (zk8) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                    } catch (Exception unused) {
                    }
                }
                zk8Var = zk8Var3 != null ? zk8Var3 : c;
                b = zk8Var;
            }
        }
        return zk8Var;
    }
}
