package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class loj {
    public final String a;
    public final lag b;

    public loj(String str, lag lagVar) {
        this.a = str;
        this.b = lagVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof loj)) {
            return false;
        }
        loj lojVar = (loj) obj;
        return Intrinsics.a(this.a, lojVar.a) && this.b == lojVar.b;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        lag lagVar = this.b;
        return iHashCode + (lagVar == null ? 0 : lagVar.hashCode());
    }

    public final String toString() {
        return "";
    }
}
