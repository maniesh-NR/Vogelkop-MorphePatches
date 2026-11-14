package ads_mobile_sdk;

import defpackage.z1m;

/* loaded from: classes.dex */
public final class h2 {
    public final int a;
    public final int b;
    public final boolean c;

    public h2(int i, int i2, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h2)) {
            return false;
        }
        h2 h2Var = (h2) obj;
        return this.a == h2Var.a && this.b == h2Var.b && this.c == h2Var.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int iA = n6h.a(this.b, Integer.hashCode(this.a) * 31);
        boolean z = this.c;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return iA + i;
    }

    public final String toString() {
        return z1m.m(sko.o(this.a, this.b, "AdDimensions(width=", ", height=", ", isFluidHeight="), this.c, ")");
    }
}
