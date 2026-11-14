package defpackage;

import java.util.ArrayDeque;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class aal extends r22 {
    public b2l e;

    public final void Q(b87 b87Var, b2l b2lVar) {
        b(new z9l(b2lVar, 1, b87Var, false), b87Var.getDefaultPriority());
    }

    public final void R(cej cejVar, b2l b2lVar) {
        b(new z9l(b2lVar, 2, cejVar, false), cejVar.getDefaultPriority());
    }

    public final void S(o93 o93Var, b2l b2lVar, boolean z) {
        z9l z9lVar = new z9l(b2lVar, 3, o93Var, z);
        b(z9lVar, z9lVar.getDefaultPriority());
    }

    public final void T(b2l b2lVar) {
        hjm hjmVar;
        Iterator it = ((ArrayDeque) this.a).iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            hjmVar = hjm.b;
            if (!zHasNext) {
                break;
            }
            z9l z9lVar = (z9l) it.next();
            if (z9lVar.a == b2lVar) {
                it.remove();
                z9lVar.finish(hjmVar);
            }
        }
        Iterator it2 = ((ArrayDeque) this.b).iterator();
        while (it2.hasNext()) {
            z9l z9lVar2 = (z9l) it2.next();
            if (z9lVar2.a == b2lVar) {
                it2.remove();
                z9lVar2.finish(hjmVar);
            }
        }
        if (b2lVar != this.e) {
            return;
        }
        qim qimVar = (qim) this.c;
        while (true) {
            u7k u7kVar = qimVar.n;
            if (u7kVar == null) {
                return;
            }
            ((z9l) u7kVar.a).finish(hjmVar);
            qimVar.n = null;
        }
    }
}
