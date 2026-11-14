package ads_mobile_sdk;

import defpackage.z1m;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class v12 {
    public boolean a;
    public long d;
    public nn3 f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v12)) {
            return false;
        }
        v12 v12Var = (v12) obj;
        return this.a == v12Var.a && this.d == v12Var.d && Intrinsics.a(this.f, v12Var.f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    public final int hashCode() {
        boolean z = this.a;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int iE = z1m.e(r0 * 29791, 961, this.d);
        nn3 nn3Var = this.f;
        return iE + (nn3Var == null ? 0 : nn3Var.hashCode());
    }

    public final String toString() {
        return "NativeVideoViewabilityState(isVisible=" + this.a + ", isPaused=false, isStopped=false, timestamp=" + this.d + ", doneReason=null, viewabilityEvent=" + this.f + ")";
    }
}
