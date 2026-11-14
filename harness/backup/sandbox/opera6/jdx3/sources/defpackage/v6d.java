package defpackage;

import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class v6d {
    public final qq6 a;
    public t6d b = t6d.a;

    public v6d(qq6 qq6Var) {
        this.a = qq6Var;
    }

    public final t6d a() {
        Iterator it = ((LinkedHashSet) this.a.b).iterator();
        int iMax = 0;
        while (it.hasNext()) {
            iMax = Math.max(iMax, ((v6d) it.next()).b.ordinal());
        }
        return (t6d) t6d.f.get(iMax);
    }

    public final void b(t6d t6dVar) {
        if (this.b != t6dVar) {
            t6d t6dVarA = a();
            this.b = t6dVar;
            t6d t6dVar2 = t6d.a;
            qq6 qq6Var = this.a;
            if (t6dVar == t6dVar2) {
                ((LinkedHashSet) qq6Var.b).remove(this);
            } else {
                ((LinkedHashSet) qq6Var.b).add(this);
            }
            t6d t6dVarA2 = a();
            if (t6dVarA2 != t6dVarA) {
                ac8.a(new u6d(t6dVarA2));
            }
        }
    }
}
