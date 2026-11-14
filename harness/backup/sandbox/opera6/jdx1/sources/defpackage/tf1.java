package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class tf1 {
    public static final sf1 a = new sf1("");

    public static final List a(sf1 sf1Var, int i, int i2, k51 k51Var) {
        List list;
        if (i == i2 || (list = sf1Var.a) == null) {
            return null;
        }
        int i3 = 0;
        if (i == 0 && i2 >= sf1Var.b.length()) {
            if (k51Var == null) {
                return list;
            }
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            while (i3 < size) {
                Object obj = list.get(i3);
                if (((Boolean) k51Var.invoke(((rf1) obj).a)).booleanValue()) {
                    arrayList.add(obj);
                }
                i3++;
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        int size2 = list.size();
        while (i3 < size2) {
            rf1 rf1Var = (rf1) list.get(i3);
            if (k51Var != null ? ((Boolean) k51Var.invoke(rf1Var.a)).booleanValue() : true) {
                int i4 = rf1Var.b;
                int i5 = rf1Var.c;
                if (b(i, i2, i4, i5)) {
                    arrayList2.add(new rf1(rf1Var.d, djh.c(rf1Var.b, i, i2) - i, djh.c(i5, i, i2) - i, (of1) rf1Var.a));
                }
            }
            i3++;
        }
        return arrayList2;
    }

    public static final boolean b(int i, int i2, int i3, int i4) {
        return (((i == i2) | (i3 == i4)) & (i == i3)) | ((i < i4) & (i3 < i2));
    }
}
