package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class atl implements ndc {
    public final /* synthetic */ byte a = 0;
    public final qdc b;
    public final qdc c;

    public atl(hjf hjfVar) {
        qdc qdcVar = new qdc(this, true);
        this.b = qdcVar;
        this.c = qdcVar;
        oup.l0(hjfVar.getLifecycle(), (Function1) null, new qfl(this, (byte) 7), (Function1) null, (Function1) null, 13);
    }

    public atl(l7n l7nVar) {
        qdc qdcVar = new qdc(this, true);
        this.b = qdcVar;
        this.c = qdcVar;
        qdcVar.g(qcc.e);
        m7n m7nVar = new m7n(this, (byte) 1);
        o7n o7nVar = l7nVar.a;
        if (o7nVar.d) {
            o7n.a(m7nVar);
            return;
        }
        synchronized (o7nVar.a) {
            o7nVar.c.add(m7nVar);
        }
    }

    public final tcc getLifecycle() {
        switch (this.a) {
        }
        return this.c;
    }
}
