package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class f5a implements Iterator, ptb {
    public final iqj a;
    public final int b;
    public int c;
    public final int d;

    public f5a(iqj iqjVar, int i, int i2) {
        this.a = iqjVar;
        this.b = i2;
        this.c = i;
        this.d = iqjVar.h;
        if (iqjVar.g) {
            kqj.e();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c < this.b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        iqj iqjVar = this.a;
        int i = iqjVar.h;
        int i2 = this.d;
        if (i != i2) {
            kqj.e();
        }
        int i3 = this.c;
        this.c = iqjVar.a[(i3 * 5) + 3] + i3;
        return new jqj(iqjVar, i3, i2);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
