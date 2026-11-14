package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class xd2 {
    public static final wd2 h = new wd2();
    public final eme a;
    public final c37 b;
    public List e;
    public int g;
    public final CopyOnWriteArrayList d = new CopyOnWriteArrayList();
    public List f = Collections.EMPTY_LIST;
    public final wd2 c = h;

    public xd2(eme emeVar, c37 c37Var) {
        this.a = emeVar;
        this.b = c37Var;
    }

    public final void a(vl9 vl9Var) {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ygc ygcVar = ((xgc) it.next()).a;
        }
        if (vl9Var != null) {
            vl9Var.run();
        }
    }

    public final void b(List list, vl9 vl9Var) {
        int i = this.g + 1;
        this.g = i;
        List list2 = this.e;
        if (list == list2) {
            if (vl9Var != null) {
                vl9Var.run();
                return;
            }
            return;
        }
        eme emeVar = this.a;
        if (list == null) {
            int size = list2.size();
            this.e = null;
            this.f = Collections.EMPTY_LIST;
            emeVar.f(0, size);
            a(vl9Var);
            return;
        }
        if (list2 != null) {
            ((ExecutorService) this.b.a).execute(new vd2(this, list2, list, i, vl9Var));
            return;
        }
        this.e = list;
        this.f = Collections.unmodifiableList(list);
        emeVar.t(0, list.size());
        a(vl9Var);
    }
}
