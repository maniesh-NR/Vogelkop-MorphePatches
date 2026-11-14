package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class hdg {
    public final t0g a = hyg.k("");
    public final t0g b = hyg.k((Object) null);
    public final t0g c = hyg.k(rqj.c);
    public final t0g d = hyg.k((Object) null);
    public final kg9 e = new kg9();

    public final void a(g1b g1bVar, String str) {
        Object next;
        this.c.setValue(g1bVar);
        Iterator it = g1bVar.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((ey5) next).c.equalsIgnoreCase(str)) {
                    break;
                }
            }
        }
        this.b.setValue((ey5) next);
    }

    public final void b(shk shkVar) {
        this.d.setValue(shkVar);
    }
}
