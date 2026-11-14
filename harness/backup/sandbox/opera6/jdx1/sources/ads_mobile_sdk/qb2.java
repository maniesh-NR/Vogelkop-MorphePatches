package ads_mobile_sdk;

import defpackage.bdg;
import defpackage.jjj;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class qb2 implements zcp {
    public final pb2 a;

    public qb2(pb2 pb2Var) {
        this.a = pb2Var;
    }

    public final void a(jjj jjjVar) {
        fz0 fz0Var;
        String str;
        pb2 pb2Var = this.a;
        if (pb2Var == null || (str = (fz0Var = pb2Var.a).a) == null) {
            return;
        }
        long j = fz0Var.b;
        if (j > 0) {
            bdg bdgVar = jjjVar.personallyIdentifiableInformation;
            bdgVar.perAppIdV2 = str;
            bdgVar.paidV2CreationTimeMilliseconds = Long.valueOf(j);
            bdgVar.paidV2PubOption = Boolean.valueOf(pb2Var.b);
            bdgVar.paidV2UserOption = Boolean.valueOf(pb2Var.c);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qb2) && Intrinsics.a(this.a, ((qb2) obj).a);
    }

    public final int hashCode() {
        pb2 pb2Var = this.a;
        if (pb2Var == null) {
            return 0;
        }
        return pb2Var.hashCode();
    }

    public final String toString() {
        return "PerAppIdV2Signal(paidV2=" + this.a + ")";
    }
}
