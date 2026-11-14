package ads_mobile_sdk;

import defpackage.dgh;
import defpackage.z1m;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class j82 {
    public final i82 a;
    public final z92 b;
    public final boolean c;
    public final String d;
    public final String e;

    public j82(i82 i82Var, z92 z92Var, boolean z, String str, String str2) {
        this.a = i82Var;
        this.b = z92Var;
        this.c = z;
        this.d = str;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j82)) {
            return false;
        }
        j82 j82Var = (j82) obj;
        return this.a == j82Var.a && this.b == j82Var.b && this.c == j82Var.c && Intrinsics.a(this.d, j82Var.d) && Intrinsics.a(this.e, j82Var.e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        boolean z = this.c;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return this.e.hashCode() + dgh.a(this.d, (iHashCode + i) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OmidSettings(mediaType=");
        sb.append(this.a);
        sb.append(", videoEventsOwner=");
        sb.append(this.b);
        sb.append(", javascriptSessionServiceEnabled=");
        z1m.u(sb, this.c, ", omidPartnerName=", this.d, ", omidHtml=");
        return z1m.l(sb, this.e, ")");
    }
}
