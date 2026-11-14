package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class bv5 extends jo7 {
    public final ech c;

    public bv5(umi umiVar, ech echVar) {
        super(umiVar);
        this.c = echVar;
    }

    @Override // defpackage.jo7, defpackage.mch
    public final void a(io7 io7Var, int i, nch nchVar, jch jchVar) {
        ech echVar = this.c;
        AtomicReference atomicReference = echVar.a;
        dch dchVar = (dch) atomicReference.get();
        if (dchVar == null) {
            dchVar = new dch(echVar, this.a, this.b);
            atomicReference.set(dchVar);
        }
        dchVar.c.add(this);
        dchVar.d.add(this);
        super.a(io7Var, i, nchVar, jchVar);
    }

    @Override // defpackage.kch, defpackage.mch
    public final void f() {
        dch dchVar = (dch) this.c.a.get();
        if (dchVar == null || !dchVar.d.remove(this)) {
            return;
        }
        dchVar.a();
    }

    @Override // defpackage.jo7
    public final void g(jch jchVar, boolean z) {
        this.a.d(new bu3((byte) 3, this, jchVar, z)).a(null);
    }
}
