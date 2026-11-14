package ads_mobile_sdk;

import defpackage.jjj;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class kg0 implements zcp {
    public final String a;
    public final boolean b;

    public kg0(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final void a(jjj jjjVar) {
        String str = this.a;
        if (str.length() > 0) {
            jjjVar.creativeToken = str;
        }
        if (this.b) {
            jjjVar.debugSignalsEnabled = "1";
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kg0)) {
            return false;
        }
        kg0 kg0Var = (kg0) obj;
        return Intrinsics.a(this.a, kg0Var.a) && this.b == kg0Var.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        boolean z = this.b;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return iHashCode + i;
    }

    public final String toString() {
        return "DebugSignal(creativePreviewToken=" + this.a + ", isTroubleshooting=" + this.b + ")";
    }
}
