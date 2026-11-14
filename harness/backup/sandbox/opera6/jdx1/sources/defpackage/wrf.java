package defpackage;

import android.util.ArrayMap;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* loaded from: classes.dex */
public class wrf implements tj5 {
    public static final c9 b;
    public static final wrf c;
    public final TreeMap a;

    static {
        c9 c9Var = new c9((byte) 25);
        b = c9Var;
        c = new wrf(new TreeMap(c9Var));
    }

    public wrf(TreeMap treeMap) {
        this.a = treeMap;
    }

    public static wrf f(tj5 tj5Var) {
        if (wrf.class.equals(tj5Var.getClass())) {
            return (wrf) tj5Var;
        }
        TreeMap treeMap = new TreeMap(b);
        for (an2 an2Var : tj5Var.d()) {
            Set<sj5> setE = tj5Var.e(an2Var);
            ArrayMap arrayMap = new ArrayMap();
            for (sj5 sj5Var : setE) {
                arrayMap.put(sj5Var, tj5Var.j(an2Var, sj5Var));
            }
            treeMap.put(an2Var, arrayMap);
        }
        return new wrf(treeMap);
    }

    @Override // defpackage.tj5
    public final Object b(an2 an2Var, Object obj) {
        Map map = (Map) this.a.get(an2Var);
        return map == null ? obj : map.get((sj5) Collections.min(map.keySet()));
    }

    @Override // defpackage.tj5
    public final void c(xj xjVar) {
        for (Map.Entry entry : this.a.tailMap(new an2("camera2.captureRequest.option.", Void.class, null)).entrySet()) {
            if (!((an2) entry.getKey()).a.startsWith("camera2.captureRequest.option.")) {
                return;
            }
            an2 an2Var = (an2) entry.getKey();
            tw2 tw2Var = (tw2) xjVar.b;
            tj5 tj5Var = (tj5) xjVar.c;
            ((fee) tw2Var.b).q(an2Var, tj5Var.h(an2Var), tj5Var.i(an2Var));
        }
    }

    @Override // defpackage.tj5
    public final Set d() {
        return Collections.unmodifiableSet(this.a.keySet());
    }

    @Override // defpackage.tj5
    public final Set e(an2 an2Var) {
        Map map = (Map) this.a.get(an2Var);
        return map == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(map.keySet());
    }

    @Override // defpackage.tj5
    public final boolean g(an2 an2Var) {
        return this.a.containsKey(an2Var);
    }

    @Override // defpackage.tj5
    public final sj5 h(an2 an2Var) {
        Map map = (Map) this.a.get(an2Var);
        if (map != null) {
            return (sj5) Collections.min(map.keySet());
        }
        s49.l(an2Var, "Option does not exist: ");
        return null;
    }

    @Override // defpackage.tj5
    public final Object i(an2 an2Var) {
        Map map = (Map) this.a.get(an2Var);
        if (map != null) {
            return map.get((sj5) Collections.min(map.keySet()));
        }
        s49.l(an2Var, "Option does not exist: ");
        return null;
    }

    @Override // defpackage.tj5
    public final Object j(an2 an2Var, sj5 sj5Var) {
        Map map = (Map) this.a.get(an2Var);
        if (map == null) {
            s49.l(an2Var, "Option does not exist: ");
            return null;
        }
        if (map.containsKey(sj5Var)) {
            return map.get(sj5Var);
        }
        kp5.d("Option does not exist: ", an2Var, " with priority=", sj5Var);
        return null;
    }
}
