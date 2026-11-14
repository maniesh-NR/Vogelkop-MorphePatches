package defpackage;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class t2n extends rb4 {
    public boolean a = true;
    public final /* synthetic */ AtomicBoolean b;
    public final /* synthetic */ l94 c;
    public final /* synthetic */ q3j d;

    public t2n(AtomicBoolean atomicBoolean, l94 l94Var, q3j q3jVar) {
        this.b = atomicBoolean;
        this.c = l94Var;
        this.d = q3jVar;
    }

    public final void b(int i, yb4 yb4Var) {
        Object obj;
        if (this.a) {
            this.a = false;
            yb4Var.e();
            SystemClock.uptimeMillis();
            SystemClock.elapsedRealtime();
        }
        AtomicBoolean atomicBoolean = this.b;
        if (atomicBoolean.get() || (obj = yb4Var.d().a.get("androidx.camera.video.VideoCapture.streamUpdate")) == null) {
            return;
        }
        int iIntValue = ((Integer) obj).intValue();
        l94 l94Var = this.c;
        if (iIntValue == l94Var.hashCode() && l94Var.b((Object) null) && !atomicBoolean.getAndSet(true)) {
            x7d.l().execute(new npl(this, this.d, (byte) 19));
        }
    }
}
