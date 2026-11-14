package defpackage;

import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class p7e extends t59 {
    public final void i(Object obj, Object obj2) {
        q7e q7eVar = (q7e) obj;
        q7eVar.getClass();
        ArrayDeque arrayDeque = q7e.b;
        synchronized (arrayDeque) {
            arrayDeque.offer(q7eVar);
        }
    }
}
