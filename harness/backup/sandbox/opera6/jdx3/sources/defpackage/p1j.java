package defpackage;

import android.os.Handler;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class p1j implements qmi {
    public final /* synthetic */ byte a = 0;
    public final AtomicBoolean b = new AtomicBoolean();
    public final Object c;
    public final /* synthetic */ Object d;

    public p1j(qie qieVar, q1j q1jVar) {
        this.d = qieVar;
        this.c = q1jVar;
    }

    public p1j(uml umlVar, Runnable runnable) {
        this.c = runnable;
        this.d = umlVar;
    }

    @Override // defpackage.qmi
    public final boolean cancel(boolean z) {
        boolean zEquals;
        boolean zRemove;
        switch (this.a) {
            case 0:
                if (this.b.getAndSet(true)) {
                    return false;
                }
                boolean zCancel = ((q1j) this.c).a.cancel(z);
                qie qieVar = (qie) this.d;
                q1j q1jVar = (q1j) this.c;
                synchronized (((ArrayDeque) qieVar.b)) {
                    zEquals = q1jVar.equals(((ArrayDeque) qieVar.b).peek());
                    zRemove = ((ArrayDeque) qieVar.b).remove(q1jVar);
                }
                if (zEquals) {
                    qieVar.o();
                }
                return zCancel | zRemove;
            default:
                Runnable runnable = (Runnable) this.c;
                Handler handler = ((uml) this.d).a;
                if (this.b.getAndSet(true) || !handler.hasMessages(1, runnable)) {
                    return false;
                }
                handler.removeMessages(1, runnable);
                return true;
        }
    }

    @Override // defpackage.qmi
    public final boolean isCancelled() {
        byte b = this.a;
        AtomicBoolean atomicBoolean = this.b;
        switch (b) {
        }
        return atomicBoolean.get();
    }
}
