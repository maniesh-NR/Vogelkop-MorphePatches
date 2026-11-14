package ads_mobile_sdk;

import defpackage.jjj;
import defpackage.pq;
import defpackage.xfh;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class tq2 implements zcp {
    public final defpackage.bu1 a;
    public final int b;
    public final pq c;

    public tq2(defpackage.bu1 bu1Var, int i, pq pqVar) {
        this.a = bu1Var;
        this.b = i;
        this.c = pqVar;
    }

    public final void a(jjj jjjVar) {
        int i = this.b;
        if (i > 0) {
            jjjVar.numberOfRegisteredWebViews = Integer.valueOf(i);
        }
        jjjVar.qualitySignals = new xfh(this.a);
        jjjVar.adUnitQualitySignals = this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tq2)) {
            return false;
        }
        tq2 tq2Var = (tq2) obj;
        return Intrinsics.a(this.a, tq2Var.a) && this.b == tq2Var.b && this.c.equals(tq2Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + n6h.a(this.b, this.a.hashCode() * 31);
    }

    public final String toString() {
        return "QualitySignal(appStats=" + this.a + ", numberOfRegisteredWebViews=" + this.b + ", adUnitQualitySignals=" + this.c + ")";
    }
}
