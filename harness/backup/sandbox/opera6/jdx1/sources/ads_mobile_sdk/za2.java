package ads_mobile_sdk;

import defpackage.jjj;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class za2 implements zcp {
    public final dr2 a;

    public za2(dr2 dr2Var) {
        this.a = dr2Var;
    }

    public final void a(jjj jjjVar) {
        dr2 dr2Var = this.a;
        jjjVar.parentAdConfig = dr2Var.a;
        jjjVar.parentCommonConfig = dr2Var.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof za2) && Intrinsics.a(this.a, ((za2) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ParentAdConfigSignal(recursiveAdData=" + this.a + ")";
    }
}
