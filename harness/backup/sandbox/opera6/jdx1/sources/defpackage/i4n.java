package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class i4n {
    public final String a;
    public final hn2 b;

    public i4n(String str, hn2 hn2Var) {
        this.a = str;
        this.b = hn2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i4n)) {
            return false;
        }
        i4n i4nVar = (i4n) obj;
        return Intrinsics.a(this.a, i4nVar.a) && Intrinsics.a(this.b, i4nVar.b);
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() * 31) - 1) * 31;
        hn2 hn2Var = this.b;
        return iHashCode + (hn2Var == null ? 0 : hn2Var.hashCode());
    }

    public final String toString() {
        return "VideoMimeInfo(mimeType=" + this.a + ", profile=-1, compatibleVideoProfile=" + this.b + ')';
    }
}
