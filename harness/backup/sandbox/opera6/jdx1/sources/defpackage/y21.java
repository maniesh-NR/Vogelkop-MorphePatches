package defpackage;

import android.os.SystemClock;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class y21 {
    public final k65 a;
    public final long b;
    public final yc4 c;
    public final Throwable d;

    public y21(k65 k65Var, yc4 yc4Var, Exception exc, int i) {
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        yc4Var = (i & 4) != 0 ? null : yc4Var;
        exc = (i & 8) != 0 ? null : exc;
        this.a = k65Var;
        this.b = jElapsedRealtimeNanos;
        this.c = yc4Var;
        this.d = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y21)) {
            return false;
        }
        y21 y21Var = (y21) obj;
        return this.a == y21Var.a && this.b == y21Var.b && Intrinsics.a(this.c, y21Var.c) && Intrinsics.a(this.d, y21Var.d);
    }

    public final int hashCode() {
        int iE = z1m.e(this.a.hashCode() * 31, 31, this.b);
        yc4 yc4Var = this.c;
        int iHashCode = (iE + (yc4Var == null ? 0 : Integer.hashCode(yc4Var.a))) * 31;
        Throwable th = this.d;
        return iHashCode + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "ClosingInfo(reason=" + this.a + ", closingTimestamp=" + ((Object) qql.a(this.b)) + ", errorCode=" + this.c + ", exception=" + this.d + ')';
    }
}
