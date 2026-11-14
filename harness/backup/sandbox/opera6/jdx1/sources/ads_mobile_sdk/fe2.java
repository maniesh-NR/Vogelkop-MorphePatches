package ads_mobile_sdk;

import defpackage.z1m;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class fe2 {
    public final String a;
    public final av2 b;
    public final String c;

    public fe2(String str, av2 av2Var, String str2) {
        this.a = str;
        this.b = av2Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fe2)) {
            return false;
        }
        fe2 fe2Var = (fe2) obj;
        return Intrinsics.a(this.a, fe2Var.a) && this.b == fe2Var.b && Intrinsics.a(this.c, fe2Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PersistentCacheToken(filename=");
        sb.append(this.a);
        sb.append(", adFormat=");
        sb.append(this.b);
        sb.append(", adRequest=");
        return z1m.l(sb, this.c, ")");
    }
}
