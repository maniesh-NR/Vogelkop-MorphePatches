package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class fe5 implements ndc {
    public final pde a;
    public final qdc b = new qdc(this, true);
    public final k9 c = new k9((Object) this, (byte) 27);
    public boolean d;
    public Boolean e;

    public fe5(pde pdeVar) {
        this.a = pdeVar;
    }

    public final void a(boolean z) {
        if (Boolean.valueOf(z).equals(this.e)) {
            return;
        }
        this.e = Boolean.valueOf(z);
        b();
    }

    public final void b() {
        qcc qccVar;
        boolean z = this.d;
        pde pdeVar = this.a;
        if (z) {
            pdeVar.p(this.c);
            qccVar = qcc.a;
        } else if (Intrinsics.a(this.e, Boolean.FALSE)) {
            qcc qccVar2 = (qcc) pdeVar.g();
            h58 h58Var = qcc.g;
            int iOrdinal = qccVar2.ordinal();
            if (iOrdinal > 3) {
                iOrdinal = 3;
            }
            qccVar = (qcc) h58Var.get(iOrdinal);
        } else {
            qccVar = (qcc) pdeVar.g();
        }
        this.b.g(qccVar);
    }

    public final tcc getLifecycle() {
        return this.b;
    }
}
