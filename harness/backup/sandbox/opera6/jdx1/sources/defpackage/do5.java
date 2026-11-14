package defpackage;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.sequences.Sequence;

/* loaded from: classes.dex */
public final class do5 implements Sequence {
    public final AtomicReference a;

    public do5(Sequence sequence) {
        this.a = new AtomicReference(sequence);
    }

    public final Iterator iterator() {
        Sequence sequence = (Sequence) this.a.getAndSet(null);
        if (sequence != null) {
            return sequence.iterator();
        }
        qp2.n("This sequence can be consumed only once.");
        return null;
    }
}
