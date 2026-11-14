package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class oml implements qmi {
    public final n5o a;
    public final rmi b;
    public final oml c;
    public final AtomicReference d = new AtomicReference();

    public oml(nml nmlVar) {
        this.a = nmlVar.b;
        this.b = nmlVar.c;
        this.c = nmlVar.d;
    }

    public final void a(Object obj, jri jriVar) {
        b(obj, 0L, TimeUnit.MILLISECONDS, jriVar);
    }

    public final void b(Object obj, long j, TimeUnit timeUnit, jri jriVar) {
    }

    @Override // defpackage.qmi
    public final boolean cancel(boolean z) {
        qmi qmiVar = (qmi) this.d.get();
        if (qmiVar == null) {
            return false;
        }
        boolean zCancel = qmiVar.cancel(z);
        oml omlVar = this.c;
        if (omlVar != null) {
            omlVar.cancel(z);
        }
        return zCancel;
    }

    @Override // defpackage.qmi
    public final boolean isCancelled() {
        qmi qmiVar = (qmi) this.d.get();
        return qmiVar != null && qmiVar.isCancelled();
    }
}
