package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class i38 {
    public final jva a;
    public final boolean b;
    public final dd6 c;
    public final String d;

    public i38(jva jvaVar, boolean z, dd6 dd6Var, String str) {
        this.a = jvaVar;
        this.b = z;
        this.c = dd6Var;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i38)) {
            return false;
        }
        i38 i38Var = (i38) obj;
        return this.a.equals(i38Var.a) && this.b == i38Var.b && this.c == i38Var.c && Intrinsics.a(this.d, i38Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + fki.k(this.a.hashCode() * 31, 31, this.b)) * 31;
        String str = this.d;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "ExecuteResult(image=" + this.a + ", isSampled=" + this.b + ", dataSource=" + this.c + ", diskCacheKey=" + this.d + ")";
    }
}
