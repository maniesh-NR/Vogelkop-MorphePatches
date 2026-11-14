package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class bi4 implements ivh {
    public final /* synthetic */ AtomicReference a;

    public bi4(AtomicReference atomicReference) {
        this.a = atomicReference;
    }

    @Override // defpackage.ivh
    public final void D(owh owhVar, long j, w61 w61Var) throws Exception {
        qya qyaVar = (qya) this.a.getAndSet(null);
        if (qyaVar != null) {
            qyaVar.close();
        }
    }

    @Override // defpackage.ivh
    public final void E(lvh lvhVar) throws Exception {
        qya qyaVar = (qya) this.a.getAndSet(null);
        if (qyaVar != null) {
            qyaVar.close();
        }
    }

    @Override // defpackage.ivh
    public final void s(owh owhVar, long j, w61 w61Var) throws Exception {
        qya qyaVar = (qya) this.a.getAndSet(null);
        if (qyaVar != null) {
            qyaVar.close();
        }
    }

    @Override // defpackage.ivh
    public final void t(owh owhVar, long j, hwh hwhVar) throws Exception {
        qya qyaVar = (qya) this.a.getAndSet(null);
        if (qyaVar != null) {
            qyaVar.close();
        }
    }
}
