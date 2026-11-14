package ads_mobile_sdk;

import java.util.Arrays;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class oh3 {
    public final UUID a;
    public final ub2[] b;

    public oh3(UUID uuid, ub2[] ub2VarArr) {
        this.a = uuid;
        this.b = ub2VarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oh3)) {
            return false;
        }
        oh3 oh3Var = (oh3) obj;
        return Intrinsics.a(this.a, oh3Var.a) && Intrinsics.a(this.b, oh3Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TraceSnapshot(rootTraceId=" + this.a + ", perTraceMeta=" + Arrays.toString(this.b) + ")";
    }
}
