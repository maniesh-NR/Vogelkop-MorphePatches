package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class ff0 implements Iterator {
    public final Iterator a;
    public final /* synthetic */ jf0 b;

    public ff0(jf0 jf0Var, int i, Iterator it) {
        Objects.requireNonNull(jf0Var);
        this.b = jf0Var;
        this.a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.a.next();
        return entry;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.a.remove();
        this.b.getClass();
    }
}
