package defpackage;

import android.os.SystemClock;
import java.util.Objects;

/* loaded from: classes.dex */
public final class ijk {
    public Object a;
    public int b;
    public int c;
    public long d;
    public long e;
    public boolean f;
    public long g;
    public final /* synthetic */ tah h;

    public ijk(tah tahVar) {
        this.h = tahVar;
    }

    public final void a() {
        long j;
        tah tahVar = this.h;
        szk szkVar = (szk) tahVar.g;
        qi8 qi8Var = (qi8) tahVar.c;
        if (qi8Var.getPlaybackState() != 2 || !qi8Var.getPlayWhenReady() || qi8Var.G() != 0) {
            if (this.f) {
                szkVar.d(1);
            }
            this.f = false;
            return;
        }
        gql currentTimeline = qi8Var.getCurrentTimeline();
        Object objL = currentTimeline.p() ? null : currentTimeline.l(qi8Var.getCurrentPeriodIndex());
        int currentAdGroupIndex = qi8Var.getCurrentAdGroupIndex();
        int currentAdIndexInAdGroup = qi8Var.getCurrentAdIndexInAdGroup();
        long bufferedPosition = qi8Var.getBufferedPosition();
        long jMax = Math.max(0L, qi8Var.d() - Math.max(0L, bufferedPosition - qi8Var.getCurrentPosition()));
        if (objL != null && currentAdGroupIndex == -1) {
            bufferedPosition -= tym.c0(currentTimeline.g(objL, (dql) tahVar.f).e);
        }
        ((kzk) tahVar.e).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f && Objects.equals(objL, this.a) && currentAdGroupIndex == this.b && currentAdIndexInAdGroup == this.c) {
            j = 600000;
            if (bufferedPosition == this.d && jMax == this.e) {
                if (jElapsedRealtime - this.g >= 600000) {
                    ((mi8) tahVar.b).a.T0(zh8.h(1003, new kjk(1, 600000)));
                    return;
                }
                return;
            }
        } else {
            j = 600000;
        }
        this.f = true;
        this.g = jElapsedRealtime;
        this.a = objL;
        this.b = currentAdGroupIndex;
        this.c = currentAdIndexInAdGroup;
        this.d = bufferedPosition;
        this.e = jMax;
        szkVar.d(1);
        szkVar.a.sendEmptyMessageDelayed(1, j);
    }
}
