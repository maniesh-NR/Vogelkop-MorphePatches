package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class zp0 extends jf0 {
    public static final ef0[] f;
    public static final df0[] g;

    static {
        ef0 ef0Var = ef0.b;
        f = new ef0[]{ef0Var, ef0Var, ef0Var};
        df0 df0Var = df0.d;
        g = new df0[]{df0Var, df0Var, df0Var};
    }

    @Override // defpackage.jf0
    public final df0 a(int i) {
        return g[i];
    }

    @Override // defpackage.jf0
    public final ef0 b(int i) {
        return f[i];
    }

    @Override // defpackage.jf0
    public final jf0 m(jf0 jf0Var) {
        zp0 zp0Var = (zp0) jf0Var;
        Object objH = jf0.h((Long) zp0Var.n(0), (Long) n(0));
        if (objH != null) {
            q(0, 1, objH);
        }
        Object objH2 = jf0.h((Long) zp0Var.n(1), (Long) n(1));
        if (objH2 != null) {
            q(1, 1, objH2);
        }
        Map map = (Map) zp0Var.n(2);
        Map map2 = (Map) n(2);
        if (map == null) {
            map = map2;
        } else if (map2 != null) {
            HashMap map3 = new HashMap(map);
            for (Map.Entry entry : map2.entrySet()) {
                if (entry.getValue() != null) {
                    List list = (List) map3.get(entry.getKey());
                    if (list == null) {
                        map3.put((String) entry.getKey(), (List) entry.getValue());
                    } else {
                        String str = (String) entry.getKey();
                        List list2 = (List) entry.getValue();
                        ArrayList arrayList = new ArrayList(list2.size() + list.size());
                        arrayList.addAll(list);
                        arrayList.addAll(list2);
                        map3.put(str, arrayList);
                    }
                }
            }
            map = map3;
        }
        if (map != null) {
            q(2, 1, map);
        }
        return this;
    }
}
