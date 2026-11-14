package defpackage;

import java.util.Iterator;
import kotlinx.serialization.KSerializer;

/* loaded from: classes.dex */
public final class erb implements Iterator, ptb {
    public final rpb a;
    public final s04 b;
    public final KSerializer c;

    public erb(rpb rpbVar, s04 s04Var, KSerializer kSerializer) {
        this.a = rpbVar;
        this.b = s04Var;
        this.c = kSerializer;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b.x() != 10;
    }

    @Override // java.util.Iterator
    public final Object next() {
        ubc ubcVar = ubc.c;
        KSerializer kSerializer = this.c;
        return new lgk(this.a, ubcVar, this.b, kSerializer.getDescriptor(), (c30) null).q(kSerializer);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
