package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class af4 {
    public final p12 a;
    public final ScheduledExecutorService b;

    public af4(p12 p12Var, ScheduledExecutorService scheduledExecutorService) {
        this.a = p12Var;
        this.b = scheduledExecutorService;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof af4) {
            af4 af4Var = (af4) obj;
            if (this.a == af4Var.a && Intrinsics.a(this.b, af4Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ListenerWrapper(listener=" + this.a + ", executor=" + this.b + ')';
    }
}
