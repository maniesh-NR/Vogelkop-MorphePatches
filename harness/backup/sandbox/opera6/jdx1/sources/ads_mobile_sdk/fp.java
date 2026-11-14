package ads_mobile_sdk;

import defpackage.qlo;
import java.lang.ref.WeakReference;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class fp implements qlo {
    public final WeakReference a;
    public final g0 b;

    public fp(WeakReference weakReference, g0 g0Var) {
        this.a = weakReference;
        this.b = g0Var;
    }

    @Override // defpackage.qlo
    public final Object b(long j, kuk kukVar) {
        jp jpVar = (jp) this.a.get();
        if (jpVar != null) {
            Object objB = jpVar.b(j, kukVar);
            return objB == px5.a ? objB : Unit.a;
        }
        g0 g0Var = this.b;
        synchronized (g0Var) {
            g0Var.h.remove(this);
        }
        return Unit.a;
    }

    @Override // defpackage.qlo
    public final Object d(long j, kuk kukVar) {
        jp jpVar = (jp) this.a.get();
        if (jpVar != null) {
            Object objD = jpVar.d(j, kukVar);
            return objD == px5.a ? objD : Unit.a;
        }
        g0 g0Var = this.b;
        synchronized (g0Var) {
            g0Var.h.remove(this);
        }
        return Unit.a;
    }
}
