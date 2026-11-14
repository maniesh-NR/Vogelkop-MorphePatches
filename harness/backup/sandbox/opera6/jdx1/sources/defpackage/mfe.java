package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class mfe {
    public final AtomicReference a = new AtomicReference(null);
    public final pfe b = new pfe();

    public static Object a(mfe mfeVar, Function1 function1, kuk kukVar) {
        gfe gfeVar = gfe.a;
        mfeVar.getClass();
        return sgb.q(new ogb(gfeVar, mfeVar, function1, null, (byte) 1), kukVar);
    }

    public final void b(jfe jfeVar) {
        while (true) {
            AtomicReference atomicReference = this.a;
            jfe jfeVar2 = (jfe) atomicReference.get();
            if (jfeVar2 != null && jfeVar.a.compareTo(jfeVar2.a) < 0) {
                throw new CancellationException("Current mutation had a higher priority");
            }
            while (!atomicReference.compareAndSet(jfeVar2, jfeVar)) {
                if (atomicReference.get() != jfeVar2) {
                    break;
                }
            }
            if (jfeVar2 != null) {
                jfeVar2.b.k(new j89("Mutation interrupted", (byte) 0));
                return;
            }
            return;
        }
    }
}
