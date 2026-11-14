package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class amb extends ff9 {
    public final /* synthetic */ Iterable a;
    public final /* synthetic */ byte b;

    /* JADX WARN: Multi-variable type inference failed */
    public amb(Iterable iterable, int i) {
        this.a = iterable;
        this.b = i;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterator it = this.a.iterator();
        it.getClass();
        byte b = this.b;
        z4o.v("limit is negative", b >= 0);
        return new dmb(it, b);
    }
}
