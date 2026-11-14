package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class gdn extends ha2 {
    public final ArrayList k;
    public final ArrayList l;
    public List m;
    public fdn n;
    public boolean o;
    public List p;
    public boolean q;
    public boolean r;

    public gdn(tni tniVar, List list, List list2, List list3, fdn fdnVar, boolean z, boolean z2) {
        super(tniVar);
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new qmf((fdn) it.next()));
        }
        this.l = arrayList;
        ArrayList arrayList2 = new ArrayList(list2.size());
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            fdn fdnVar2 = (fdn) it2.next();
            x1b x1bVar = pdn.a;
            if (x1bVar.e.equals(fdnVar2.a)) {
                arrayList2.add(new mxc(fdnVar2));
            } else {
                arrayList2.add(nxc.e(fdnVar2));
            }
        }
        this.k = arrayList2;
        this.m = Y(fdnVar, list3);
        this.n = fdnVar;
        this.o = z;
        this.r = z2;
        this.p = new ArrayList();
    }

    public static List Y(fdn fdnVar, List list) {
        if (list.size() == 1 && ((fdn) list.get(0)).equals(fdnVar)) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            fdn fdnVar2 = (fdn) it.next();
            if (!fdnVar2.e || fdnVar2.equals(fdnVar)) {
                x1b x1bVar = pdn.a;
                if (x1bVar.e.equals(fdnVar2.a)) {
                    arrayList.add(new mxc(fdnVar2));
                } else if (fdnVar2.equals(fdnVar)) {
                    arrayList.add(new lxc(fdnVar2));
                } else {
                    arrayList.add(nxc.e(fdnVar2));
                }
            }
        }
        return arrayList;
    }

    public final void Z(boolean z) {
        this.q = z;
        ArrayList arrayList = this.a;
        if (z) {
            arrayList.clear();
            arrayList.addAll(this.p);
        } else {
            arrayList.clear();
            boolean z2 = this.r;
            ArrayList arrayList2 = this.l;
            ArrayList arrayList3 = this.k;
            if (z2) {
                if (!arrayList2.isEmpty()) {
                    arrayList.add(new kzb(2132022146));
                    arrayList.addAll(arrayList2);
                }
                if (!arrayList3.isEmpty()) {
                    arrayList.add(new kzb(2132022210));
                    arrayList.addAll(arrayList3);
                }
            } else {
                if (!this.o) {
                    arrayList.addAll(arrayList2);
                }
                if (!this.m.isEmpty() && this.o) {
                    arrayList.add(new kzb(2132022261));
                    arrayList.addAll(this.m);
                }
                if (!arrayList3.isEmpty()) {
                    arrayList.add(new kzb(2132022121));
                    arrayList.add(new lxc(this.n));
                    arrayList.addAll(arrayList3);
                }
            }
        }
        notifyDataSetChanged();
    }
}
