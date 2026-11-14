package defpackage;

/* loaded from: classes.dex */
public final class djm implements as6 {
    public final tcc a;
    public final oje b;
    public boolean c;

    public djm(tcc tccVar, oje ojeVar) {
        this.a = tccVar;
        this.b = ojeVar;
        tccVar.a(this);
    }

    public final void a() {
        qcc qccVar;
        int iOrdinal = this.a.i.ordinal();
        if (iOrdinal == 0) {
            qccVar = qcc.a;
        } else if (iOrdinal == 1) {
            qccVar = qcc.b;
        } else if (iOrdinal == 2 || iOrdinal == 3) {
            qccVar = qcc.c;
        } else {
            if (iOrdinal != 4) {
                h9o.p();
                return;
            }
            qccVar = this.c ? qcc.e : qcc.c;
        }
        qdc qdcVar = this.b.d;
        if (qdcVar.i == qcc.b && qccVar == qcc.a) {
            qdcVar.g(qcc.c);
        }
        qdcVar.g(qccVar);
    }

    @Override // defpackage.as6
    public final void onDestroy(ndc ndcVar) {
        this.a.b(this);
        a();
    }

    @Override // defpackage.as6
    public final void onPause(ndc ndcVar) {
        a();
    }

    @Override // defpackage.as6
    public final void onResume(ndc ndcVar) {
        a();
    }
}
