package androidx.fragment.app;

import defpackage.am9;
import defpackage.bm9;
import defpackage.xm9;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Objects;

/* loaded from: classes.dex */
public final class v implements bm9 {
    public final /* synthetic */ w a;

    public v(w wVar) {
        this.a = wVar;
    }

    @Override // defpackage.bm9
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        ArrayList arrayList3;
        ArrayList arrayList4;
        boolean Z;
        w wVar = this.a;
        ArrayList arrayList5 = wVar.o;
        if (w.N(2)) {
            Objects.toString(wVar.a);
        }
        int i = 0;
        if (wVar.d.isEmpty()) {
            arrayList3 = arrayList;
            arrayList4 = arrayList2;
            Z = false;
        } else {
            a aVar = (a) am2.k(1, wVar.d);
            wVar.h = aVar;
            ArrayList arrayList6 = aVar.c;
            int size = arrayList6.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList6.get(i2);
                i2++;
                Fragment fragment = ((xm9) obj).b;
                if (fragment != null) {
                    fragment.mTransitioning = true;
                }
            }
            arrayList3 = arrayList;
            arrayList4 = arrayList2;
            Z = wVar.Z(arrayList3, arrayList4, null, -1, 0);
        }
        if (!arrayList5.isEmpty() && arrayList3.size() > 0) {
            ((Boolean) arrayList4.get(arrayList3.size() - 1)).getClass();
            LinkedHashSet<Fragment> linkedHashSet = new LinkedHashSet();
            int size2 = arrayList3.size();
            int i3 = 0;
            while (i3 < size2) {
                Object obj2 = arrayList3.get(i3);
                i3++;
                linkedHashSet.addAll(w.H((a) obj2));
            }
            int size3 = arrayList5.size();
            while (i < size3) {
                Object obj3 = arrayList5.get(i);
                i++;
                am9 am9Var = (am9) obj3;
                for (Fragment fragment2 : linkedHashSet) {
                    am9Var.getClass();
                }
            }
        }
        return Z;
    }
}
