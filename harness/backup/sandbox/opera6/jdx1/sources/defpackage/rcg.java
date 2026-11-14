package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes.dex */
public final class rcg implements mbe {
    public final /* synthetic */ x62 a;

    public rcg(x62 x62Var) {
        this.a = x62Var;
    }

    @Override // defpackage.mbe
    public final ufd b(vfd vfdVar, List list, long j) {
        ArrayList arrayList = (ArrayList) list;
        List list2 = (List) arrayList.get(0);
        List list3 = (List) arrayList.get(1);
        long jA = yo5.a(0, 0, 0, 0, 10, j);
        List list4 = list2;
        ArrayList arrayList2 = new ArrayList(k95.o(list4, 10));
        Iterator it = list4.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf(((pfd) it.next()).N(jA).a));
        }
        List list5 = list3;
        ArrayList arrayList3 = new ArrayList(k95.o(list5, 10));
        Iterator it2 = list5.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((pfd) it2.next()).N(jA));
        }
        x62 x62Var = this.a;
        int iM = vfdVar.M(x62Var.d);
        ArrayList arrayList4 = new ArrayList();
        int size = arrayList2.size();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList2.get(i3);
            i3++;
            int i4 = i + 1;
            if (i < 0) {
                j95.n();
                throw null;
            }
            int iIntValue = ((Number) obj).intValue();
            List list6 = (List) CollectionsKt.R(arrayList4);
            if (list6 == null || i2 + iM + iIntValue > yo5.h(j)) {
                arrayList4.add(j95.j(new Integer[]{Integer.valueOf(i)}));
            } else {
                list6.add(Integer.valueOf(i));
                iIntValue = iIntValue + iM + i2;
            }
            i2 = iIntValue;
            i = i4;
        }
        ArrayList arrayList5 = new ArrayList(k95.o(arrayList4, 10));
        int size2 = arrayList4.size();
        int i5 = 0;
        while (i5 < size2) {
            Object obj2 = arrayList4.get(i5);
            i5++;
            Iterator it3 = ((List) obj2).iterator();
            if (!it3.hasNext()) {
                t3p.y();
                return null;
            }
            int i6 = ((ifg) arrayList3.get(((Number) it3.next()).intValue())).b;
            while (it3.hasNext()) {
                int i7 = ((ifg) arrayList3.get(((Number) it3.next()).intValue())).b;
                if (i6 < i7) {
                    i6 = i7;
                }
            }
            arrayList5.add(Integer.valueOf(i6));
        }
        ArrayList arrayList6 = new ArrayList(k95.o(arrayList4, 10));
        int size3 = arrayList4.size();
        int i8 = 0;
        while (i8 < size3) {
            int i9 = i8 + 1;
            List list7 = (List) arrayList4.get(i8);
            int[] iArr = new int[list7.size()];
            int iH = yo5.h(j);
            int size4 = list7.size();
            int[] iArr2 = new int[size4];
            for (int i10 = 0; i10 < size4; i10++) {
                iArr2[i10] = ((ifg) arrayList3.get(((Number) list7.get(i10)).intValue())).a;
            }
            x62Var.c(vfdVar, iH, iArr2, vfdVar.getLayoutDirection(), iArr);
            arrayList6.add(iArr);
            i8 = i9;
        }
        return vfdVar.b0(yo5.h(j), CollectionsKt.d0(arrayList5), n08.a, new rg(arrayList4, arrayList5, arrayList3, arrayList6, (byte) 13));
    }
}
