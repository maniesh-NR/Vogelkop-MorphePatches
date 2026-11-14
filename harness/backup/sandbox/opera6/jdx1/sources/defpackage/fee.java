package defpackage;

import android.util.ArrayMap;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class fee extends wrf {
    public static fee k() {
        return new fee(new TreeMap(wrf.b));
    }

    public static fee l(tj5 tj5Var) {
        TreeMap treeMap = new TreeMap(wrf.b);
        for (an2 an2Var : tj5Var.d()) {
            Set<sj5> setE = tj5Var.e(an2Var);
            ArrayMap arrayMap = new ArrayMap();
            for (sj5 sj5Var : setE) {
                arrayMap.put(sj5Var, tj5Var.j(an2Var, sj5Var));
            }
            treeMap.put(an2Var, arrayMap);
        }
        return new fee(treeMap);
    }

    public final void q(an2 an2Var, sj5 sj5Var, Object obj) {
        sj5 sj5Var2;
        TreeMap treeMap = this.a;
        Map map = (Map) treeMap.get(an2Var);
        if (map == null) {
            ArrayMap arrayMap = new ArrayMap();
            treeMap.put(an2Var, arrayMap);
            arrayMap.put(sj5Var, obj);
            return;
        }
        sj5 sj5Var3 = (sj5) Collections.min(map.keySet());
        if (Objects.equals(map.get(sj5Var3), obj) || sj5Var3 != (sj5Var2 = sj5.c) || sj5Var != sj5Var2) {
            map.put(sj5Var, obj);
            return;
        }
        StringBuilder sb = new StringBuilder("Option values conflicts: ");
        sb.append(an2Var.a);
        sb.append(", existing value (");
        sb.append(sj5Var3);
        Object obj2 = map.get(sj5Var3);
        sb.append(")=");
        sb.append(obj2);
        sb.append(", conflicting (");
        sb.append(sj5Var);
        sb.append(")=");
        sb.append(obj);
        throw new IllegalArgumentException(sb.toString());
    }

    public final void s(an2 an2Var, Object obj) {
        q(an2Var, sj5.d, obj);
    }

    public final void w(an2 an2Var) {
        this.a.remove(an2Var);
    }
}
