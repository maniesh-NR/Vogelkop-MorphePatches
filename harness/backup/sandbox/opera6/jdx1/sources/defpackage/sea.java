package defpackage;

import android.os.SystemClock;

/* loaded from: classes.dex */
public final class sea {
    public int a;
    public boolean b;
    public long c;
    public final Object d;

    public sea(cfa cfaVar, long j, int i) {
        this.d = cfaVar;
        this.c = j;
        this.a = i;
        this.b = (cfaVar instanceof zea) && ((zea) cfaVar).m;
    }

    public sea(tah tahVar) {
        this.d = tahVar;
    }

    public final void a() {
        tah tahVar = (tah) this.d;
        szk szkVar = (szk) tahVar.g;
        qi8 qi8Var = (qi8) tahVar.c;
        int iG = qi8Var.G();
        if (!qi8Var.getPlayWhenReady() || qi8Var.getPlaybackState() == 1 || qi8Var.getPlaybackState() == 4 || iG == 0 || iG == 1) {
            if (this.b) {
                szkVar.d(4);
            }
            this.b = false;
            return;
        }
        ((kzk) tahVar.e).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.b && this.a == iG) {
            if (jElapsedRealtime - this.c >= 600000) {
                ((mi8) tahVar.b).a.T0(zh8.h(1003, new kjk(4, 600000)));
                return;
            }
            return;
        }
        this.b = true;
        this.c = jElapsedRealtime;
        this.a = iG;
        szkVar.d(4);
        szkVar.a.sendEmptyMessageDelayed(4, 600000L);
    }
}
