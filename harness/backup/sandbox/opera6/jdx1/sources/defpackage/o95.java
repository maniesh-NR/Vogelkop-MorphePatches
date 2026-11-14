package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class o95 extends n95 {
    public static void s(Collection collection, Object[] objArr) {
        collection.addAll(Arrays.asList(objArr));
    }

    public static void t(Iterable iterable, Collection collection) {
        if (iterable instanceof Collection) {
            collection.addAll((Collection) iterable);
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }

    public static final boolean u(Iterable iterable, Function1 function1, boolean z) {
        Iterator it = iterable.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            if (((Boolean) function1.invoke(it.next())).booleanValue() == z) {
                it.remove();
                z2 = true;
            }
        }
        return z2;
    }

    public static void v(List list, Function1 function1) {
        int size;
        if (!(list instanceof RandomAccess)) {
            if ((list instanceof ptb) && !(list instanceof qtb)) {
                y9m.j0(list, "kotlin.collections.MutableIterable");
                throw null;
            }
            try {
                u(list, function1, true);
                return;
            } catch (ClassCastException e) {
                Intrinsics.d(y9m.class.getName(), e);
                throw e;
            }
        }
        int iH = j95.h(list);
        int i = 0;
        if (iH >= 0) {
            int i2 = 0;
            while (true) {
                Object obj = list.get(i);
                if (!((Boolean) function1.invoke(obj)).booleanValue()) {
                    if (i2 != i) {
                        list.set(i2, obj);
                    }
                    i2++;
                }
                if (i == iH) {
                    break;
                } else {
                    i++;
                }
            }
            i = i2;
        }
        if (i >= list.size() || i > (size = list.size() - 1)) {
            return;
        }
        while (true) {
            list.remove(size);
            if (size == i) {
                return;
            } else {
                size--;
            }
        }
    }

    public static void w(List list) {
        if (list.isEmpty()) {
            h9o.h("List is empty.");
        } else {
            list.remove(0);
        }
    }

    public static Object x(List list) {
        if (!list.isEmpty()) {
            return list.remove(list.size() - 1);
        }
        h9o.h("List is empty.");
        return null;
    }

    public static Object y(List list) {
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(list.size() - 1);
    }
}
