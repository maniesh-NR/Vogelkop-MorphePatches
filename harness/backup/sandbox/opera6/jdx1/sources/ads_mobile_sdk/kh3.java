package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class kh3 {
    public final eq2 a;
    public ih1 b;
    public dt2 c;
    public s8 d;

    public kh3(eq2 eq2Var, ih1 ih1Var, dt2 dt2Var, s8 s8Var) {
        this.a = eq2Var;
        this.b = ih1Var;
        this.c = dt2Var;
        this.d = s8Var;
    }

    public final void a(kh3 kh3Var) {
        ih1 ih1Var = kh3Var.b;
        ih1 ih1Var2 = this.b;
        ih1Var2.b = ih1Var.b;
        ih1Var2.a = ih1Var.a;
        ih1Var2.e = ih1Var.e;
        ih1Var2.d = ih1Var.d;
        ih1Var2.c = ih1Var.c;
        ih1Var2.f = ih1Var.f;
        dt2 dt2Var = kh3Var.c;
        dt2 dt2Var2 = this.c;
        dt2Var2.b = dt2Var.b;
        dt2Var2.d = dt2Var.d;
        dt2Var2.e = dt2Var.e;
        dt2Var2.a = dt2Var.a;
        dt2Var2.c = dt2Var.c;
        dt2Var2.f = dt2Var.f;
        s8 s8Var = kh3Var.d;
        s8 s8Var2 = this.d;
        s8Var2.b = s8Var.b;
        s8Var2.c = s8Var.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kh3)) {
            return false;
        }
        kh3 kh3Var = (kh3) obj;
        return Intrinsics.a(this.a, kh3Var.a) && Intrinsics.a(this.b, kh3Var.b) && Intrinsics.a(this.c, kh3Var.c) && Intrinsics.a(this.d, kh3Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TraceMetaSet(publisherRequestTraceMeta=" + this.a + ", internalRequestTraceMeta=" + this.b + ", renderTraceMeta=" + this.c + ", adTraceMeta=" + this.d + ")";
    }
}
