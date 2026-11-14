package defpackage;

import android.util.Range;
import android.util.Rational;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class vfh {
    public static final HashMap b;
    public static final HashMap c;
    public final HashMap a = new HashMap();

    static {
        HashMap map = new HashMap();
        b = map;
        map.put(mo2.h, Range.create(2160, 4319));
        map.put(mo2.g, Range.create(1080, 1439));
        map.put(mo2.f, Range.create(720, 1079));
        map.put(mo2.e, Range.create(241, 719));
        HashMap map2 = new HashMap();
        c = map2;
        map2.put(0, ua2.a);
        map2.put(1, ua2.c);
    }

    public vfh(HashMap map, List list) {
        HashMap map2;
        Integer num;
        mo2 mo2Var;
        HashMap map3 = b;
        Iterator it = map3.keySet().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            map2 = c;
            if (!zHasNext) {
                break;
            }
            mo2 mo2Var2 = (mo2) it.next();
            this.a.put(new lo2(mo2Var2, -1), new ArrayList());
            Iterator it2 = map2.keySet().iterator();
            while (it2.hasNext()) {
                this.a.put(new lo2(mo2Var2, ((Integer) it2.next()).intValue()), new ArrayList());
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            List list2 = (List) this.a.get(new lo2((mo2) entry.getKey(), -1));
            Objects.requireNonNull(list2);
            list2.add((Size) entry.getValue());
        }
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            Size size = (Size) it3.next();
            Iterator it4 = map3.entrySet().iterator();
            while (true) {
                num = null;
                if (!it4.hasNext()) {
                    mo2Var = null;
                    break;
                }
                Map.Entry entry2 = (Map.Entry) it4.next();
                if (((Range) entry2.getValue()).contains((Range) Integer.valueOf(size.getHeight()))) {
                    mo2Var = (mo2) entry2.getKey();
                    break;
                }
            }
            if (mo2Var != null) {
                Iterator it5 = map2.entrySet().iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        break;
                    }
                    Map.Entry entry3 = (Map.Entry) it5.next();
                    if (ua2.a(size, (Rational) entry3.getValue(), qpj.b)) {
                        num = (Integer) entry3.getKey();
                        break;
                    }
                }
                if (num != null) {
                    List list3 = (List) this.a.get(new lo2(mo2Var, num.intValue()));
                    Objects.requireNonNull(list3);
                    list3.add(size);
                }
            }
        }
        for (Map.Entry entry4 : this.a.entrySet()) {
            Size size2 = (Size) map.get(((lo2) entry4.getKey()).a);
            if (size2 != null) {
                Size size3 = qpj.a;
                final int height = size2.getHeight() * size2.getWidth();
                Collections.sort((List) entry4.getValue(), new Comparator() { // from class: ufh
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        int iA = qpj.a((Size) obj);
                        int i = height;
                        return Math.abs(iA - i) - Math.abs(qpj.a((Size) obj2) - i);
                    }
                });
            }
        }
    }
}
