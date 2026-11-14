package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public interface mbe {
    default int a(shb shbVar, List list, int i) {
        ArrayList arrayList = (ArrayList) list;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list2 = (List) arrayList.get(i2);
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList3.add(new lr6((pfd) list2.get(i3), thb.b, xhb.a, (byte) 0));
            }
            arrayList2.add(arrayList3);
        }
        return b(new jib(shbVar, shbVar.getLayoutDirection()), arrayList2, ap5.b(0, 0, 0, i, 7)).getWidth();
    }

    ufd b(vfd vfdVar, List list, long j);

    default int c(shb shbVar, List list, int i) {
        ArrayList arrayList = (ArrayList) list;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list2 = (List) arrayList.get(i2);
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList3.add(new lr6((pfd) list2.get(i3), thb.a, xhb.a, (byte) 0));
            }
            arrayList2.add(arrayList3);
        }
        return b(new jib(shbVar, shbVar.getLayoutDirection()), arrayList2, ap5.b(0, 0, 0, i, 7)).getWidth();
    }

    default int d(shb shbVar, List list, int i) {
        ArrayList arrayList = (ArrayList) list;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list2 = (List) arrayList.get(i2);
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList3.add(new lr6((pfd) list2.get(i3), thb.b, xhb.b, (byte) 0));
            }
            arrayList2.add(arrayList3);
        }
        return b(new jib(shbVar, shbVar.getLayoutDirection()), arrayList2, ap5.b(0, i, 0, 0, 13)).getHeight();
    }

    default int e(shb shbVar, List list, int i) {
        ArrayList arrayList = (ArrayList) list;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list2 = (List) arrayList.get(i2);
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList3.add(new lr6((pfd) list2.get(i3), thb.a, xhb.b, (byte) 0));
            }
            arrayList2.add(arrayList3);
        }
        return b(new jib(shbVar, shbVar.getLayoutDirection()), arrayList2, ap5.b(0, i, 0, 0, 13)).getHeight();
    }
}
