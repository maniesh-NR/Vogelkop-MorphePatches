package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public abstract class j6 extends z4 {
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public abstract j6 g(int i, Object obj);

    public abstract j6 h(Object obj);

    public final Iterator iterator() {
        return listIterator(0);
    }

    public j6 j(Collection collection) {
        zbg zbgVarM = m();
        zbgVarM.addAll(collection);
        return zbgVarM.h();
    }

    public final ListIterator listIterator() {
        return listIterator(0);
    }

    public abstract zbg m();

    public abstract j6 n(h6 h6Var);

    public abstract j6 o(int i);

    public abstract j6 p(int i, Object obj);

    public final List subList(int i, int i2) {
        return new e1b(this, i, i2);
    }
}
