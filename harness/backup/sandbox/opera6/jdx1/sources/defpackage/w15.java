package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class w15 {
    public final HashMap a = new HashMap();
    public final HashMap b;

    public w15(HashMap map) {
        this.b = map;
        for (Map.Entry entry : map.entrySet()) {
            occ occVar = (occ) entry.getValue();
            List arrayList = (List) this.a.get(occVar);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.a.put(occVar, arrayList);
            }
            arrayList.add((x15) entry.getKey());
        }
    }

    public static void a(List list, ndc ndcVar, occ occVar, mdc mdcVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                x15 x15Var = (x15) list.get(size);
                Method method = x15Var.b;
                try {
                    byte b = x15Var.a;
                    if (b == 0) {
                        method.invoke(mdcVar, null);
                    } else if (b == 1) {
                        method.invoke(mdcVar, ndcVar);
                    } else if (b == 2) {
                        method.invoke(mdcVar, ndcVar, occVar);
                    }
                } catch (IllegalAccessException e) {
                    rqd.p(e);
                    return;
                } catch (InvocationTargetException e2) {
                    h9o.s("Failed to call observer method", e2.getCause());
                    return;
                }
            }
        }
    }
}
