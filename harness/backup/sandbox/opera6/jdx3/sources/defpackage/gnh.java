package defpackage;

import J.N;
import android.content.Context;
import android.util.SparseIntArray;
import android.widget.LinearLayout;
import com.opera.android.browser.SessionStore;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final class gnh implements p4l {
    public final Context a;
    public final fnh b;
    public final u4l c;
    public final b2l d;
    public final knh e;
    public final ArrayList f;
    public final p4j g;
    public final LinkedHashSet h = new LinkedHashSet();
    public final pde i = new pde(l08.a);

    public gnh(pde pdeVar, Context context, fnh fnhVar, u4l u4lVar, b2l b2lVar, knh knhVar) {
        this.a = context;
        this.b = fnhVar;
        this.c = u4lVar;
        this.d = b2lVar;
        this.e = knhVar;
        ArrayList arrayList = new ArrayList();
        fnhVar.getClass();
        arrayList.clear();
        SessionStore sessionStore = fnhVar.f;
        sessionStore.getClass();
        ArrayList arrayList2 = new ArrayList();
        N.MqkthI77(sessionStore.a, arrayList2);
        arrayList.addAll(arrayList2);
        SparseIntArray sparseIntArray = new SparseIntArray(arrayList.size());
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            int i3 = i + 1;
            if (i < 0) {
                j95.n();
                throw null;
            }
            enh enhVar = (enh) obj;
            int i4 = enhVar.d;
            int i5 = enhVar.c;
            if (i4 != 0) {
                if (sparseIntArray2.indexOfKey(i4) < 0) {
                    sparseIntArray2.put(i4, i);
                }
                sparseIntArray.put(i5, sparseIntArray2.get(i4));
            } else {
                sparseIntArray.put(i5, i);
            }
            i = i3;
        }
        ArrayList arrayList3 = new ArrayList(CollectionsKt.c0(new jk(sparseIntArray, (byte) 7), arrayList));
        this.f = arrayList3;
        p4j p4jVar = new p4j();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size2 = arrayList3.size();
        int i6 = 0;
        while (i6 < size2) {
            Object obj2 = arrayList3.get(i6);
            i6++;
            enh enhVar2 = (enh) obj2;
            linkedHashMap.put(Integer.valueOf(enhVar2.d), Integer.valueOf(((Number) linkedHashMap.getOrDefault(Integer.valueOf(enhVar2.d), 0)).intValue() + 1));
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (((Number) entry.getValue()).intValue() == 1) {
                p4jVar.add(entry.getKey());
            }
        }
        this.g = z4j.a(p4jVar);
        e();
        a26.V(this.c, pdeVar, this);
    }

    @Override // defpackage.p4l
    public final void a(m4l m4lVar) {
        ArrayList arrayList = this.f;
        if (arrayList == null || !arrayList.isEmpty()) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                if (((enh) obj).d == m4lVar.a) {
                    e();
                    return;
                }
            }
        }
    }

    @Override // defpackage.p4l
    public final void b() {
        e();
    }

    public final void c(List list, boolean z) {
        if (list.isEmpty()) {
            return;
        }
        boolean z2 = true;
        if (z) {
            List list2 = list;
            ArrayList arrayList = new ArrayList(k95.o(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((enh) it.next()).b);
            }
            if (arrayList.isEmpty()) {
                z2 = false;
            } else {
                vx3 vx3Var = new vx3(lqm.d);
                arrayList.forEach(new ux3(vx3Var, true));
                vx3Var.c(true);
                vx3Var.k = wx3.Go;
                vx3Var.e(true);
                vx3Var.a(true);
                vx3Var.d(false);
                vx3Var.f = false;
                am2.v(vx3Var);
            }
        } else {
            Iterator it2 = list.iterator();
            boolean z3 = false;
            boolean z4 = true;
            while (it2.hasNext()) {
                enh enhVar = (enh) it2.next();
                if (this.f.remove(enhVar)) {
                    this.b.b(enhVar, this.d, z4);
                    z4 = false;
                    z3 = true;
                }
            }
            e();
            z2 = z3;
        }
        if (z2) {
            list.size();
            knh knhVar = this.e;
            cqp.r0(knhVar.w, new nnh(0));
            vl6 vl6Var = knhVar.B;
            if (vl6Var == null) {
                vl6Var = null;
            }
            vl6Var.S();
        }
    }

    public final void d(List list) {
        Iterator it = list.iterator();
        boolean z = false;
        while (it.hasNext()) {
            enh enhVar = (enh) it.next();
            if (this.f.remove(enhVar)) {
                this.b.b(enhVar, this.d, false);
                z = true;
            }
        }
        if (z) {
            e();
            int size = list.size();
            knh knhVar = this.e;
            y83 y83Var = knhVar.A;
            if (y83Var == null) {
                y83Var = null;
            }
            knhVar.G0(((LinearLayout) y83Var.b).getContext().getResources().getQuantityString(2131886185, size, Integer.valueOf(size)), false);
        }
    }

    public final void e() {
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList2 = this.f;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            enh enhVar = (enh) obj;
            int i2 = enhVar.d;
            if (i2 != 0) {
                if (!this.g.a.containsKey(Integer.valueOf(i2))) {
                    Integer numValueOf = Integer.valueOf(i2);
                    Object obj2 = linkedHashMap.get(numValueOf);
                    Object obj3 = obj2;
                    if (obj2 == null) {
                        ArrayList arrayList3 = new ArrayList();
                        boolean zContains = this.h.contains(Integer.valueOf(i2));
                        u4l u4lVar = this.c;
                        arrayList.add(zContains ? new hj8(u4lVar.a(i2), arrayList3) : new c85(u4lVar.a(i2), arrayList3));
                        linkedHashMap.put(numValueOf, arrayList3);
                        obj3 = arrayList3;
                    }
                    ((List) obj3).add(enhVar);
                }
            }
            arrayList.add(new zmh(enhVar));
        }
        xf8.F0(this.i, arrayList);
    }
}
