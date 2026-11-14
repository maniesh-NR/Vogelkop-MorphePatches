package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class qdh {
    public final ii a;
    public final ghf b;
    public final ArrayList c = new ArrayList();

    public qdh(ii iiVar, ghf ghfVar) {
        this.a = iiVar;
        this.b = ghfVar;
    }

    public final void a(tqi tqiVar, idh idhVar) {
        r79 r79Var = new r79(y1j.c(new d82(tqiVar.h, (byte) 1), new rmg(idhVar, (byte) 10)), new u4h((byte) 7), new bli((byte) 10));
        ldh ldhVar = new ldh(1, this, qdh.class, "createNetworkRequestCall", "createNetworkRequestCall(Ljava/lang/String;)Lokhttp3/Call;", 0, (byte) 1);
        Iterator it = r79Var.iterator();
        while (it.hasNext()) {
            ((v84) ldhVar.invoke(this.b.L((String) it.next(), p6l.a))).enqueue(new j06((byte) 26));
        }
    }

    public final void b(tqi tqiVar) {
        ArrayList arrayList = this.c;
        if (arrayList.contains(tqiVar)) {
            return;
        }
        a(tqiVar, idh.b);
        arrayList.add(tqiVar);
    }
}
