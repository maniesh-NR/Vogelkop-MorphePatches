package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class xie extends qyn {
    public final long j;
    public final String k;

    public xie(long j, String str) {
        this.j = j;
        this.k = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xie)) {
            return false;
        }
        xie xieVar = (xie) obj;
        return this.j == xieVar.j && Intrinsics.a(this.k, xieVar.k);
    }

    public final int hashCode() {
        return this.k.hashCode() + (Long.hashCode(this.j) * 31);
    }

    public final String toString() {
        return "";
    }
}
