package ads_mobile_sdk;

import defpackage.z1m;

/* loaded from: classes.dex */
public final class pb2 {
    public final fz0 a;
    public final boolean b;
    public final boolean c;

    public pb2(fz0 fz0Var, boolean z, boolean z2) {
        this.a = fz0Var;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof pb2) {
            pb2 pb2Var = (pb2) obj;
            if (this.a == pb2Var.a && this.b == pb2Var.b && this.c == pb2Var.c) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        boolean z = this.b;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (iHashCode + i) * 31;
        boolean z2 = this.c;
        return i2 + (z2 ? 1 : z2 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PerAppIdV2(paidV2Info=");
        sb.append(this.a);
        sb.append(", pubOption=");
        sb.append(this.b);
        sb.append(", userOption=");
        return z1m.m(sb, this.c, ")");
    }
}
