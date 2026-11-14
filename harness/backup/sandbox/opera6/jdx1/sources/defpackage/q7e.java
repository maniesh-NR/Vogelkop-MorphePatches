package defpackage;

import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class q7e {
    public static final ArrayDeque b = new ArrayDeque(0);
    public Object a;

    public static q7e a(Object obj) {
        q7e q7eVar;
        ArrayDeque arrayDeque = b;
        synchronized (arrayDeque) {
            q7eVar = (q7e) arrayDeque.poll();
        }
        if (q7eVar == null) {
            q7eVar = new q7e();
        }
        q7eVar.a = obj;
        return q7eVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof q7e) && this.a.equals(((q7e) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
