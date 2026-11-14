package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a6k {
    public final k6k a;
    public final b6k b;

    public a6k(k6k k6kVar, b6k b6kVar) {
        this.a = k6kVar;
        this.b = b6kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a6k)) {
            return false;
        }
        a6k a6kVar = (a6k) obj;
        return this.a.equals(a6kVar.a) && Intrinsics.a(this.b, a6kVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        b6k b6kVar = this.b;
        return iHashCode + (b6kVar == null ? 0 : Integer.hashCode(b6kVar.a));
    }

    public final String toString() {
        return "";
    }
}
