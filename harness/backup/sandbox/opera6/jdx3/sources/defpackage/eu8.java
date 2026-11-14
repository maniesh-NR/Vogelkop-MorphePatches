package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class eu8 implements fa2, aa2, dy {
    public final RecyclerView a;
    public final vzk b;
    public final ow8 c;
    public final hx d;
    public final k5k e;
    public final wy f;
    public final ks6 g = new ks6(this, 9);
    public eyi h;
    public kze i;

    public eu8(RecyclerView recyclerView, ow8 ow8Var, hx hxVar, k5k k5kVar, wy wyVar) {
        this.a = recyclerView;
        vzk vzkVar = wyVar.e;
        this.b = vzkVar;
        vzkVar.h(this);
        this.c = ow8Var;
        this.d = hxVar;
        this.e = k5kVar;
        k5kVar.g = this;
        recyclerView.o(k5kVar);
        this.f = wyVar;
        s(((cy) vzkVar.a).c());
    }

    @Override // defpackage.fa2
    public final aa2 S() {
        return this;
    }

    public final boolean a() {
        if (this.i == null) {
            wy wyVar = this.f;
            kze kzeVar = wyVar.A;
            if (kzeVar == null) {
                kzeVar = new kze(Boolean.valueOf(wyVar.T()));
                wyVar.A = kzeVar;
            }
            this.i = kzeVar;
            kzeVar.k(this.g);
        }
        return ((Boolean) this.i.g()).booleanValue();
    }

    public final List c(int i, List list) {
        Iterator it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            int iC = ((uo) it.next()).a.c();
            if (iC > i2) {
                i2 = iC;
            }
        }
        if (i2 == 0) {
            return Collections.EMPTY_LIST;
        }
        h1b h1bVarS = h1b.s(this.c.a);
        ArrayList arrayList = new ArrayList(i2);
        int i3 = 0;
        while (arrayList.size() < i2) {
            int i4 = i3 % 2 == 0 ? i - (i3 / 2) : ((i3 + 1) / 2) + i;
            i3++;
            if (i4 < 0 || i4 >= h1bVarS.size()) {
                break;
            }
            Object obj = h1bVarS.get(i4);
            if (obj instanceof j82) {
                oqe oqeVar = ((pue) ((j82) obj)).c;
                if (oqeVar instanceof msh) {
                    arrayList.add(((msh) oqeVar).k.toString());
                } else if (oqeVar instanceof ere) {
                    List list2 = ((ere) oqeVar).f;
                    if (!list2.isEmpty()) {
                        arrayList.add(((msh) list2.get(0)).k.toString());
                    }
                }
            }
        }
        return arrayList;
    }

    @Override // defpackage.aa2
    public final void d(int i, ArrayList arrayList) {
        eyi eyiVar;
        if (a() || (eyiVar = this.h) == null) {
            return;
        }
        for (lyf lyfVar : eyiVar.h(i, arrayList.size())) {
            int iIntValue = ((Integer) lyfVar.a).intValue();
            if (iIntValue >= i) {
                List list = (List) lyfVar.b;
                mq mqVarA = this.e.a(list, c(iIntValue, list));
                if (mqVarA != null) {
                    arrayList.add(iIntValue, mqVarA);
                }
            }
        }
    }

    public final void e(mq mqVar, mq mqVar2) {
        this.c.W(mqVar, mqVar2);
    }

    @Override // defpackage.fa2
    public final Class g() {
        return mq.class;
    }

    @Override // defpackage.fa2
    public final ea2 j() {
        return this.d;
    }

    @Override // defpackage.fa2
    public final void onDestroy() {
        kze kzeVar = this.i;
        if (kzeVar != null) {
            kzeVar.p(this.g);
            this.i = null;
        }
        ((Set) this.b.c).remove(this);
        k5k k5kVar = this.e;
        k5kVar.g = null;
        this.a.t0(k5kVar);
        ArrayList arrayList = k5kVar.a;
        ArrayList arrayList2 = new ArrayList(arrayList);
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            mq mqVar = (mq) obj;
            for (j5k j5kVar : k5kVar.c.values()) {
                j5kVar.b.remove(mqVar);
                j5kVar.a.remove(mqVar);
            }
            if (arrayList.remove(mqVar)) {
                mqVar.f();
            }
        }
        k5kVar.b.j(false);
    }

    @Override // defpackage.dy
    public final void s(ml mlVar) {
        int iMax;
        eyi eyiVar;
        int i = 0;
        boolean z = this.h == null;
        du8 du8Var = new du8(this.f);
        rn9 rn9Var = mlVar.c;
        if (rn9Var == null) {
            eyiVar = null;
        } else {
            gl glVar = (gl) rn9Var.d;
            ArrayList arrayList = new ArrayList();
            List<el> list = (List) rn9Var.c;
            wy wyVar = du8Var.c;
            if (list != null) {
                iMax = 0;
                for (el elVar : list) {
                    iMax = Math.max(iMax, elVar.g);
                    arrayList.add(new fqj(elVar.g, new uo(wyVar.q.a(elVar), elVar)));
                }
            } else {
                iMax = 0;
            }
            ArrayList arrayList2 = new ArrayList();
            if (glVar != null) {
                List list2 = glVar.b;
                if (!list2.isEmpty()) {
                    int i2 = glVar.a + 1;
                    int i3 = 0;
                    while (i3 < list2.size()) {
                        dl dlVar = (dl) list2.get(i3);
                        i3++;
                        arrayList2.add(new gqj((i2 * i3) + iMax, i2, new uo(wyVar.q.a(dlVar), dlVar)));
                    }
                }
            }
            eyiVar = new eyi(arrayList, arrayList2, rn9Var.b);
        }
        this.h = eyiVar;
        if (eyiVar == null || !z || a()) {
            return;
        }
        ow8 ow8Var = this.c;
        ArrayList arrayList3 = ow8Var.a;
        ArrayList arrayList4 = ow8Var.a;
        if (arrayList3.size() > 0) {
            ArrayList arrayList5 = new ArrayList(arrayList4.size());
            boolean zEquals = j82.class.equals(ja2.class);
            for (int size = arrayList4.size() - 1; size >= 0; size--) {
                ja2 ja2Var = (ja2) arrayList4.get(size);
                if (zEquals || j82.class.isInstance(ja2Var)) {
                    arrayList5.add(0, Integer.valueOf(size));
                }
            }
            Collections.sort(arrayList5);
            for (lyf lyfVar : this.h.h(0, arrayList5.size())) {
                int iIntValue = ((Integer) lyfVar.a).intValue() - i;
                int iIntValue2 = iIntValue < arrayList5.size() ? ((Integer) arrayList5.get(iIntValue)).intValue() + i : arrayList4.size();
                List list3 = (List) lyfVar.b;
                mq mqVarA = this.e.a(list3, c(iIntValue2, list3));
                if (mqVarA != null) {
                    ow8Var.H(iIntValue2, mqVarA);
                    i++;
                }
            }
        }
    }
}
