package ads_mobile_sdk;

import defpackage.bdg;
import defpackage.jjj;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class lb2 implements zcp {
    public final fz0 a;

    public lb2(fz0 fz0Var) {
        this.a = fz0Var;
    }

    public final void a(jjj jjjVar) {
        String str;
        fz0 fz0Var = this.a;
        if (fz0Var == null || (str = fz0Var.a) == null) {
            return;
        }
        long j = fz0Var.b;
        if (j > 0) {
            long j2 = (j - 978307200000L) / 1000;
            bdg bdgVar = jjjVar.personallyIdentifiableInformation;
            bdgVar.perAppIdV1 = str;
            bdgVar.paidV1CreationTimeMilliseconds = Long.valueOf(j);
            bdgVar.paidV1CreationTimeSeconds = j2 < 0 ? 0L : Long.valueOf(j2);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lb2) && Intrinsics.a(this.a, ((lb2) obj).a);
    }

    public final int hashCode() {
        fz0 fz0Var = this.a;
        if (fz0Var == null) {
            return 0;
        }
        return fz0Var.hashCode();
    }

    public final String toString() {
        return "PerAppIdV1Signal(paidV1Info=" + this.a + ")";
    }
}
