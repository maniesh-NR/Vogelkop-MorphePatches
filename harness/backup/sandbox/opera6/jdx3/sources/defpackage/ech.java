package defpackage;

import java.util.HashSet;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class ech {
    public final AtomicReference a = new AtomicReference();
    public final xg b = new xg();

    public final void a(int i) {
        HashSet hashSet = new HashSet();
        if ((i & 2) != 0) {
            sch schVar = sch.a;
            hashSet.add(new tch(snf.a));
        }
        hashSet.forEach(new pv1(this.b, (byte) 6));
    }
}
