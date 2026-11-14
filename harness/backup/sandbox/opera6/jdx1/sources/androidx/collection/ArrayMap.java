package androidx.collection;

import defpackage.hkj;
import defpackage.l72;
import defpackage.n72;
import defpackage.p72;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class ArrayMap extends hkj implements Map {
    public l72 d;
    public n72 e;
    public p72 f;

    @Override // java.util.Map
    public final Set entrySet() {
        l72 l72Var = this.d;
        if (l72Var != null) {
            return l72Var;
        }
        l72 l72Var2 = new l72(this, (byte) 0);
        this.d = l72Var2;
        return l72Var2;
    }

    @Override // java.util.Map
    public final Set keySet() {
        n72 n72Var = this.e;
        if (n72Var != null) {
            return n72Var;
        }
        n72 n72Var2 = new n72(this);
        this.e = n72Var2;
        return n72Var2;
    }

    public final boolean l(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean m(Collection collection) {
        int i = this.c;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i != this.c;
    }

    public final boolean n(Collection collection) {
        int i = this.c;
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (!collection.contains(f(i2))) {
                h(i2);
            }
        }
        return i != this.c;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        b(map.size() + this.c);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        p72 p72Var = this.f;
        if (p72Var != null) {
            return p72Var;
        }
        p72 p72Var2 = new p72(this);
        this.f = p72Var2;
        return p72Var2;
    }
}
