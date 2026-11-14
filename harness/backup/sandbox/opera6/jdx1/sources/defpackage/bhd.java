package defpackage;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.Surface;

/* loaded from: classes.dex */
public final class bhd implements Handler.Callback {
    public final Handler a;
    public final /* synthetic */ chd b;

    public bhd(chd chdVar, jgd jgdVar) {
        this.b = chdVar;
        Handler handlerP = tym.p(this);
        this.a = handlerP;
        jgdVar.p(this, handlerP);
    }

    public final void a(long j) {
        Surface surface;
        chd chdVar = this.b;
        iuh iuhVar = chdVar.F0;
        if (this != chdVar.p1 || chdVar.K == null) {
            return;
        }
        if (j == Long.MAX_VALUE) {
            chdVar.q0 = true;
            return;
        }
        try {
            chdVar.z0(j);
            r4n r4nVar = chdVar.k1;
            if (!r4nVar.equals(r4n.d) && !r4nVar.equals(chdVar.l1)) {
                chdVar.l1 = r4nVar;
                iuhVar.b(r4nVar);
            }
            chdVar.s0.e++;
            a4n a4nVar = chdVar.I0;
            boolean z = a4nVar.e != 3;
            a4nVar.e = 3;
            a4nVar.l.getClass();
            a4nVar.g = tym.N(SystemClock.elapsedRealtime());
            if (z && (surface = chdVar.U0) != null) {
                Handler handler = (Handler) iuhVar.b;
                if (handler != null) {
                    handler.post(new ni2(iuhVar, surface, SystemClock.elapsedRealtime(), (byte) 6));
                }
                chdVar.X0 = true;
            }
            chdVar.e0(j);
        } catch (zh8 e) {
            chdVar.r0 = e;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        int i = message.arg1;
        int i2 = message.arg2;
        String str = tym.a;
        a(((i & 4294967295L) << 32) | (i2 & 4294967295L));
        return true;
    }
}
