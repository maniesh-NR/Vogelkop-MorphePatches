package ads_mobile_sdk;

import defpackage.z1m;

/* loaded from: classes.dex */
public final class a42 {
    public final z32 a;
    public final z32 b;
    public final boolean c;

    public a42(z32 z32Var, z32 z32Var2, boolean z) {
        this.a = z32Var;
        this.b = z32Var2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a42)) {
            return false;
        }
        a42 a42Var = (a42) obj;
        return this.a == a42Var.a && this.b == a42Var.b && this.c == a42Var.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        boolean z = this.c;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return iHashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OfflineAdConfig(impressionPrerequisite=");
        sb.append(this.a);
        sb.append(", clickPrerequisite=");
        sb.append(this.b);
        sb.append(", notificationFlowEnabled=");
        return z1m.m(sb, this.c, ")");
    }
}
