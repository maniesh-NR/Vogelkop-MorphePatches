package defpackage;

/* loaded from: classes.dex */
public final class y3c implements gkk {
    public final kde a;
    public final /* synthetic */ z3c b;
    public final /* synthetic */ Object c;

    public y3c(z3c z3cVar, Object obj) {
        this.b = z3cVar;
        this.c = obj;
        int[] iArr = fcb.a;
        this.a = new kde();
    }

    @Override // defpackage.gkk
    public final void a(j31 j31Var) {
        tah tahVar;
        m3c m3cVar = (m3c) this.b.j.g(this.c);
        b8e b8eVar = (m3cVar == null || (tahVar = m3cVar.F) == null) ? null : (b8e) tahVar.g;
        if (b8eVar == null || !b8eVar.n) {
            return;
        }
        zch.D(b8eVar, "androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode", j31Var);
    }

    @Override // defpackage.gkk
    public final int b() {
        m3c m3cVar = (m3c) this.b.j.g(this.c);
        if (m3cVar != null) {
            return ((dfe) ((bee) m3cVar.n()).b).c;
        }
        return 0;
    }

    @Override // defpackage.gkk
    public final void c(int i, long j) {
        z3c z3cVar = this.b;
        m3c m3cVar = (m3c) z3cVar.j.g(this.c);
        if (m3cVar == null || !m3cVar.H()) {
            return;
        }
        int i2 = ((dfe) ((bee) m3cVar.n()).b).c;
        if (i < 0 || i >= i2) {
            a8b.d("Index (" + i + ") is out of bound of [0, " + i2 + ")");
        }
        if (m3cVar.I()) {
            a8b.a("Pre-measure called on node that is not placed");
        }
        m3c m3cVar2 = z3cVar.a;
        m3cVar2.q = true;
        p3c.a(m3cVar).z((m3c) ((bee) m3cVar.n()).get(i), j);
        m3cVar2.q = false;
        this.a.a(i);
    }

    @Override // defpackage.gkk
    public final void dispose() {
        this.b.g(this.c);
    }
}
