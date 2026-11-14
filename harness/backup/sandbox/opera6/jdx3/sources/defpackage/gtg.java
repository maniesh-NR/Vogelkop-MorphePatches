package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.SortedSet;

/* loaded from: classes.dex */
public abstract class gtg implements bz {
    public boolean a;
    public final sx b = new sx(this, (byte) 2);
    public final r9g c;

    public gtg(r9g r9gVar) {
        this.c = r9gVar;
    }

    @Override // defpackage.bz
    public final void g(dl dlVar) {
        boolean z;
        if (this.a || k(dlVar.c)) {
            return;
        }
        w7h w7hVar = (w7h) this.c.b;
        if (dlVar instanceof hl) {
            z = false;
        } else {
            i3j i3jVar = w7hVar.n;
            SortedSet sortedSet = dlVar.d;
            SortedSet sortedSet2 = dlVar.e;
            m43 m43Var = new m43(dlVar, null, 1, Collections.EMPTY_LIST);
            i3jVar.getClass();
            ArrayList arrayList = new ArrayList();
            if (i3jVar.v(sortedSet, sortedSet2, m43Var, true, arrayList)) {
                i3jVar.u();
            }
            z = !arrayList.isEmpty();
        }
        if (z) {
            return;
        }
        this.a = true;
        j(this.b, dlVar);
    }

    @Override // defpackage.bz
    public final int i() {
        return 0;
    }

    public void j(sx sxVar, dl dlVar) {
        e(sxVar, new m43(dlVar, null, 1, Collections.EMPTY_LIST));
    }

    public abstract boolean k(String str);
}
