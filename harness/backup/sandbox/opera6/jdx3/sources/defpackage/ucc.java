package defpackage;

import android.os.SystemClock;

/* loaded from: classes.dex */
public final class ucc implements as6 {
    public final s2 a;
    public boolean b;
    public long c = -1;

    public ucc(s2 s2Var) {
        this.a = s2Var;
    }

    public final void a(Object obj) {
        if (this.b) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        long j = this.c;
        if (j < 0 || jUptimeMillis < 0 || j > jUptimeMillis) {
            return;
        }
        this.a.invoke(obj, Long.valueOf(jUptimeMillis - j));
        this.b = true;
    }

    @Override // defpackage.as6
    public final void onPause(ndc ndcVar) {
        a(bh0.e);
    }

    @Override // defpackage.as6
    public final void onResume(ndc ndcVar) {
        this.c = SystemClock.uptimeMillis();
    }
}
