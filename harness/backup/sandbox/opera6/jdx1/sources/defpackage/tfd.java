package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public interface tfd {
    default int a(shb shbVar, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        byte b = 0;
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new lr6((pfd) list.get(i2), thb.b, xhb.a, b));
        }
        return b(new jib(shbVar, shbVar.getLayoutDirection()), arrayList, ap5.b(0, 0, 0, i, 7)).getWidth();
    }

    ufd b(vfd vfdVar, List list, long j);

    default int c(shb shbVar, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        byte b = 0;
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new lr6((pfd) list.get(i2), thb.a, xhb.a, b));
        }
        return b(new jib(shbVar, shbVar.getLayoutDirection()), arrayList, ap5.b(0, 0, 0, i, 7)).getWidth();
    }

    default int d(shb shbVar, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        byte b = 0;
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new lr6((pfd) list.get(i2), thb.b, xhb.b, b));
        }
        return b(new jib(shbVar, shbVar.getLayoutDirection()), arrayList, ap5.b(0, i, 0, 0, 13)).getHeight();
    }

    default int e(shb shbVar, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        byte b = 0;
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new lr6((pfd) list.get(i2), thb.a, xhb.b, b));
        }
        return b(new jib(shbVar, shbVar.getLayoutDirection()), arrayList, ap5.b(0, i, 0, 0, 13)).getHeight();
    }
}
