package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class ygh {
    public final ArrayList a;

    public ygh(ArrayList arrayList) {
        this.a = new ArrayList(arrayList);
    }

    public static void d(ygh yghVar) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = yghVar.a;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            arrayList.add(((tgh) obj).getClass().getSimpleName());
        }
        String.join(" | ", arrayList);
    }

    public final boolean a(Class cls) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            if (cls.isAssignableFrom(((tgh) obj).getClass())) {
                return true;
            }
        }
        return false;
    }

    public final tgh b(Class cls) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            tgh tghVar = (tgh) obj;
            if (tghVar.getClass() == cls) {
                return tghVar;
            }
        }
        return null;
    }

    public final ArrayList c(Class cls) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.a;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            tgh tghVar = (tgh) obj;
            if (cls.isAssignableFrom(tghVar.getClass())) {
                arrayList.add(tghVar);
            }
        }
        return arrayList;
    }
}
