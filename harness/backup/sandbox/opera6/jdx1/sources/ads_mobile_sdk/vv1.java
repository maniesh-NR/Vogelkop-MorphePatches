package ads_mobile_sdk;

import defpackage.prb;

/* loaded from: classes.dex */
public final class vv1 {
    public final prb a;
    public final prb b;
    public final prb c;
    public final prb d;
    public final prb e;

    public vv1(prb prbVar, prb prbVar2, prb prbVar3, prb prbVar4, prb prbVar5) {
        this.a = prbVar;
        this.b = prbVar2;
        this.c = prbVar3;
        this.d = prbVar4;
        this.e = prbVar5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vv1)) {
            return false;
        }
        vv1 vv1Var = (vv1) obj;
        return this.a.equals(vv1Var.a) && this.b.equals(vv1Var.b) && this.c.equals(vv1Var.c) && this.d.equals(vv1Var.d) && this.e.equals(vv1Var.e);
    }

    public final int hashCode() {
        return this.e.a.hashCode() + ((this.d.a.hashCode() + ((this.c.a.hashCode() + ((this.b.a.hashCode() + (this.a.a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "NativeAdSignals(assetViewsSignal=" + this.a + ", nativeAdViewSignal=" + this.b + ", scrollViewSignal=" + this.c + ", lockScreenSignal=" + this.d + ", adScreenSignal=" + this.e + ")";
    }
}
