package defpackage;

import android.hardware.camera2.CaptureResult;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class u0i implements ivh {
    public final long a;
    public final Function1 b;
    public final cd5 c = new cd5();
    public volatile Long d;

    public u0i(long j, Function1 function1) {
        this.a = j;
        this.b = function1;
    }

    @Override // defpackage.ivh
    public final void s(owh owhVar, long j, w61 w61Var) {
        if (this.c.h0() || this.c.isCancelled()) {
            return;
        }
        Long l = (Long) w61Var.b.c(CaptureResult.SENSOR_TIMESTAMP);
        if (l != null && this.d == null) {
            this.d = l;
        }
        Long l2 = this.d;
        if (this.a != 0 && l2 != null && l != null && l.longValue() - l2.longValue() > this.a) {
            this.c.j0((Object) null);
        } else if (((Boolean) this.b.invoke(w61Var)).booleanValue()) {
            this.c.j0(w61Var);
        }
    }
}
