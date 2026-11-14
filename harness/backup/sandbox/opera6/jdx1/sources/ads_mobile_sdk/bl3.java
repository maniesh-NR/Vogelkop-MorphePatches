package ads_mobile_sdk;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class bl3 implements Iterator, ptb {
    public final /* synthetic */ Iterator a;

    public bl3(Iterator it) {
        this.a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
