package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class vcc implements idc {
    public final ArrayList a;
    public final ndc b;
    public final twa c;
    public boolean d;

    public vcc(ArrayList arrayList, ndc ndcVar, twa twaVar) {
        qcc qccVar = qcc.a;
        this.a = arrayList;
        this.b = ndcVar;
        this.c = twaVar;
        if (ndcVar.getLifecycle().i.d(qcc.b)) {
            ndcVar.getLifecycle().a(this);
        }
    }

    public final void E(ndc ndcVar, occ occVar) {
        ndc ndcVar2 = this.b;
        qcc qccVar = ndcVar2.getLifecycle().i;
        qcc qccVar2 = qcc.a;
        twa twaVar = this.c;
        ArrayList arrayList = this.a;
        if (qccVar == qccVar2) {
            arrayList.remove(twaVar);
            ndcVar2.getLifecycle().b(this);
            return;
        }
        boolean zD = ndcVar2.getLifecycle().i.d(qcc.d);
        boolean z = this.d;
        if (z != zD) {
            this.d = zD;
            if (z) {
                if (zD) {
                    return;
                }
                arrayList.remove(twaVar);
            } else if (zD) {
                arrayList.add(twaVar);
            }
        }
    }
}
