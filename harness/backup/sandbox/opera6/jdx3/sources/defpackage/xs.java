package defpackage;

import com.opera.android.settings.SettingsManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/* loaded from: classes.dex */
public final class xs extends l7n {
    public final qb7 b;
    public final tw2 c;
    public final SettingsManager d;
    public final tr8 e;
    public int f;
    public final h42 g;
    public st[] h;
    public kq8 i;

    public xs(qb7 qb7Var, tw2 tw2Var, SettingsManager settingsManager, tr8 tr8Var) {
        this.b = qb7Var;
        this.c = tw2Var;
        this.d = settingsManager;
        this.e = tr8Var;
        h42 h42Var = new h42();
        this.g = h42Var;
        this.h = new st[0];
        h42Var.s(tr8Var.e, new pb(new z3(this, (byte) 8), (byte) 3));
    }

    public final void e() {
        ((HashMap) this.b.c).clear();
    }

    public final void f() {
        if (this.h.length == 0) {
            return;
        }
        v08 v08Var = (Set) this.e.e.g();
        if (v08Var == null) {
            v08Var = v08.a;
        }
        st[] stVarArr = this.h;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (st stVar : stVarArr) {
            if (!v08Var.contains(stVar.b)) {
                arrayList.add(stVar);
            }
        }
        ArrayList arrayList2 = new ArrayList(k95.o(arrayList, 10));
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            arrayList2.add(new is((st) obj, gt.b, ds.c));
        }
        this.g.r(arrayList2);
    }
}
