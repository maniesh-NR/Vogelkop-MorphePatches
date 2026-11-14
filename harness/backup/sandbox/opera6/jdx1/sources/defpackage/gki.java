package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class gki {
    public final LinkedHashMap a;
    public final x79 b;

    public gki() {
        this.a = new LinkedHashMap();
        this.b = new x79(n08.a);
    }

    public gki(u9d u9dVar) {
        this.a = new LinkedHashMap();
        this.b = new x79(u9dVar);
    }

    public final Object a(String str) {
        Object value;
        x79 x79Var = this.b;
        LinkedHashMap linkedHashMap = (LinkedHashMap) x79Var.a;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) x79Var.d;
        try {
            nak nakVar = (nak) linkedHashMap2.get(str);
            return (nakVar == null || (value = nakVar.getValue()) == null) ? linkedHashMap.get(str) : value;
        } catch (ClassCastException unused) {
            linkedHashMap.remove(str);
            ((LinkedHashMap) x79Var.c).remove(str);
            linkedHashMap2.remove(str);
            return null;
        }
    }

    public final void b(Object obj, String str) {
        if (obj != null) {
            List list = iki.a;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (((Class) it.next()).isInstance(obj)) {
                    }
                }
            }
            bxl.d(fki.q(obj.getClass(), "Can't put value with type ", " into saved state"));
            return;
        }
        List list2 = iki.a;
        Object obj2 = this.a.get(str);
        ode odeVar = obj2 instanceof ode ? (ode) obj2 : null;
        if (odeVar != null) {
            odeVar.r(obj);
        }
        this.b.V(obj, str);
    }
}
