package defpackage;

import J.N;
import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public final class mxk extends lim implements ywk {
    public final dxk a;
    public final zwk b;
    public final Handler c = new Handler(Looper.getMainLooper());
    public final qlk d = new qlk(this, (byte) 14);

    public mxk(dxk dxkVar, zwk zwkVar) {
        this.a = dxkVar;
        this.b = zwkVar;
    }

    @Override // defpackage.ywk
    public final void G(int i) {
        if (i != 2) {
            return;
        }
        R(false);
    }

    public final void R(boolean z) {
        int iMhJnoDjg;
        this.b.getClass();
        if (zwk.f()) {
            avj avjVar = cak.d;
            if (avj.b(1) && ((iMhJnoDjg = N.MhJnoDjg()) == 3 || iMhJnoDjg == 5)) {
                return;
            }
            Handler handler = this.c;
            qlk qlkVar = this.d;
            handler.removeCallbacks(qlkVar);
            handler.postDelayed(qlkVar, z ? 5000L : 15000L);
        }
    }

    @Override // defpackage.as6
    public final void onPause(ndc ndcVar) {
        this.c.removeCallbacks(this.d);
        this.b.H(this);
    }

    @Override // defpackage.as6
    public final void onResume(ndc ndcVar) {
        this.b.F(this);
        R(true);
    }
}
