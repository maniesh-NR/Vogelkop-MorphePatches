package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class pk9 extends th {
    public final /* synthetic */ AtomicReference a;

    public pk9(AtomicReference atomicReference) {
        this.a = atomicReference;
    }

    @Override // defpackage.th
    public final void a(Object obj, nh nhVar) {
        th thVar = (th) this.a.get();
        if (thVar != null) {
            thVar.a(obj, nhVar);
        } else {
            qp2.n("Operation cannot be started before fragment is in created state");
        }
    }
}
