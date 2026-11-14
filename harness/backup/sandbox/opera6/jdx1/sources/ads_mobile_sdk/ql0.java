package ads_mobile_sdk;

import defpackage.jjj;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class ql0 implements zcp {
    public final String a;

    public ql0(String str) {
        this.a = str;
    }

    public final void a(jjj jjjVar) {
        String str = this.a;
        if (StringsKt.N(str)) {
            return;
        }
        jjjVar.experimentIds = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ql0) && Intrinsics.a(this.a, ((ql0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return sko.k("ExperimentIdsSignal(experimentIds=", this.a, ")");
    }
}
