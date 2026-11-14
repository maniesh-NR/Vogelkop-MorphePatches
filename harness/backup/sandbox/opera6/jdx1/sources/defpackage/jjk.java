package defpackage;

import android.os.SystemClock;
import java.util.Objects;

/* loaded from: classes.dex */
public final class jjk {
    public final short a;
    public Object b;
    public int c;
    public int d;
    public long e;
    public boolean f;
    public long g;
    public final /* synthetic */ tah h;

    /* JADX WARN: Multi-variable type inference failed */
    public jjk(tah tahVar, int i) {
        this.h = tahVar;
        this.a = i;
    }

    public final void a() {
        tah tahVar = this.h;
        szk szkVar = (szk) tahVar.g;
        qi8 qi8Var = (qi8) tahVar.c;
        if (!qi8Var.e0()) {
            if (this.f) {
                szkVar.d(2);
            }
            this.f = false;
            return;
        }
        gql currentTimeline = qi8Var.getCurrentTimeline();
        Object objL = currentTimeline.p() ? null : currentTimeline.l(qi8Var.getCurrentPeriodIndex());
        int currentAdGroupIndex = qi8Var.getCurrentAdGroupIndex();
        int currentAdIndexInAdGroup = qi8Var.getCurrentAdIndexInAdGroup();
        long currentPosition = qi8Var.getCurrentPosition();
        if (objL != null && currentAdGroupIndex == -1) {
            currentPosition -= tym.c0(currentTimeline.g(objL, (dql) tahVar.f).e);
        }
        ((kzk) tahVar.e).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = this.f;
        short s = this.a;
        if (z && Objects.equals(objL, this.b) && currentAdGroupIndex == this.c && currentAdIndexInAdGroup == this.d && currentPosition == this.e) {
            if (jElapsedRealtime - this.g >= s) {
                ((mi8) tahVar.b).a.T0(zh8.h(1003, new kjk(2, s)));
                return;
            }
            return;
        }
        this.f = true;
        this.g = jElapsedRealtime;
        this.b = objL;
        this.c = currentAdGroupIndex;
        this.d = currentAdIndexInAdGroup;
        this.e = currentPosition;
        szkVar.d(2);
        szkVar.a.sendEmptyMessageDelayed(2, s);
    }
}
