package defpackage;

/* loaded from: classes.dex */
public final class b9d extends th {
    public final uh a;

    public b9d(uh uhVar) {
        this.a = uhVar;
    }

    @Override // defpackage.th
    public final void a(Object obj, nh nhVar) {
        yh yhVar = this.a.a;
        if (yhVar != null) {
            yhVar.a(obj, nhVar);
        } else {
            qp2.n("Launcher has not been initialized");
        }
    }
}
