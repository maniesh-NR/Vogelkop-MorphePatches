package defpackage;

import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;

/* loaded from: classes.dex */
public final class ygd implements o4n {
    public final /* synthetic */ chd b;

    public ygd(chd chdVar) {
        this.b = chdVar;
    }

    @Override // defpackage.o4n
    public final void a(r4n r4nVar) {
    }

    @Override // defpackage.o4n
    public final void b() {
        chd chdVar = this.b;
        Surface surface = chdVar.U0;
        if (surface != null) {
            iuh iuhVar = chdVar.F0;
            Handler handler = (Handler) iuhVar.b;
            if (handler != null) {
                handler.post(new ni2(iuhVar, surface, SystemClock.elapsedRealtime(), (byte) 6));
            }
            chdVar.X0 = true;
        }
    }

    @Override // defpackage.o4n
    public final void c() {
        chd chdVar = this.b;
        if (chdVar.U0 != null) {
            chdVar.O0(0, 1);
        }
    }

    @Override // defpackage.o4n
    public final void d() {
        ti8 ti8Var = this.b.G;
        if (ti8Var != null) {
            ti8Var.a();
        }
    }
}
