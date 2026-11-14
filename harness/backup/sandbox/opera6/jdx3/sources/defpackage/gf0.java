package defpackage;

import j$.util.Collection;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public final class gf0 extends AbstractSet implements Collection {
    public final Set a;
    public final byte b;
    public final /* synthetic */ jf0 c;

    /* JADX WARN: Multi-variable type inference failed */
    public gf0(jf0 jf0Var, int i, Set set) {
        Objects.requireNonNull(jf0Var);
        this.c = jf0Var;
        this.b = i;
        this.a = set;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new ff0(this.c, this.b, this.a.iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.size();
    }
}
