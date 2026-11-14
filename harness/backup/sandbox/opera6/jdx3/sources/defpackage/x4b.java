package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class x4b {
    public final String a;
    public final nf b;

    public x4b(String str, nf nfVar) {
        this.a = str;
        this.b = nfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x4b)) {
            return false;
        }
        x4b x4bVar = (x4b) obj;
        return Intrinsics.a(this.a, x4bVar.a) && Intrinsics.a(this.b, x4bVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        nf nfVar = this.b;
        return iHashCode + (nfVar == null ? 0 : nfVar.hashCode());
    }

    public final String toString() {
        return "";
    }
}
