package defpackage;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.Set;

/* loaded from: classes.dex */
public final class rrp extends PhantomReference {
    public final Set a;
    public final bw1 b;

    public /* synthetic */ rrp(d25 d25Var, ReferenceQueue referenceQueue, Set set, bw1 bw1Var) {
        super(d25Var, referenceQueue);
        this.a = set;
        this.b = bw1Var;
    }
}
