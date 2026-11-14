package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class hwj implements ez8 {
    public final oza a;
    public final String b;
    public final dd6 c;

    public hwj(oza ozaVar, String str, dd6 dd6Var) {
        this.a = ozaVar;
        this.b = str;
        this.c = dd6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hwj)) {
            return false;
        }
        hwj hwjVar = (hwj) obj;
        return Intrinsics.a(this.a, hwjVar.a) && Intrinsics.a(this.b, hwjVar.b) && this.c == hwjVar.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "SourceFetchResult(source=" + this.a + ", mimeType=" + this.b + ", dataSource=" + this.c + ")";
    }
}
