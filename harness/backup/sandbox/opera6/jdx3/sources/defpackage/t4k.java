package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class t4k implements xxf {
    public final /* synthetic */ c5k a;

    public t4k(c5k c5kVar) {
        this.a = c5kVar;
    }

    @Override // defpackage.xxf
    public final void f() {
        c5k c5kVar = this.a;
        List<bwf> listE = c5kVar.y.e();
        kue kueVar = c5kVar.t;
        kueVar.f = listE;
        Iterator it = kueVar.k.iterator();
        while (true) {
            Object obj = null;
            if (!it.hasNext()) {
                break;
            }
            jue jueVar = (jue) it.next();
            urg urgVar = jueVar.a;
            Iterator it2 = listE.iterator();
            it2.getClass();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (urgVar.test((bwf) next)) {
                    obj = next;
                    break;
                }
            }
            bwf bwfVar = (bwf) obj;
            if (!Objects.equals(bwfVar, jueVar.c)) {
                jueVar.c = bwfVar;
                boolean z = bwfVar != null;
                g7f g7fVar = new g7f(jueVar.b);
                while (g7fVar.hasNext()) {
                    ((iue) g7fVar.next()).O(z);
                }
            }
        }
        kueVar.e.notifyDataSetChanged();
        bx8 bx8Var = c5kVar.A;
        ArrayList arrayList = bx8Var.a;
        ArrayList arrayList2 = new ArrayList(listE.size());
        for (bwf bwfVar2 : listE) {
            int size = arrayList.size();
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    i = -1;
                    break;
                }
                Object obj2 = arrayList.get(i2);
                i2++;
                bwf bwfVar3 = ((zw8) obj2).a;
                if (!bwfVar3.getClass().equals(bwfVar2.getClass()) ? false : bwfVar3.equals(bwfVar2)) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                arrayList2.add(new zw8(bwfVar2));
            } else {
                arrayList2.add((zw8) arrayList.remove(i));
            }
        }
        arrayList.clear();
        arrayList.addAll(arrayList2);
        bx8Var.notifyDataSetChanged();
        nrl nrlVar = c5kVar.O;
        if (nrlVar != null) {
            c5kVar.O = null;
            c5kVar.g((f1p) nrlVar.b, nrlVar.a, false);
        }
    }
}
