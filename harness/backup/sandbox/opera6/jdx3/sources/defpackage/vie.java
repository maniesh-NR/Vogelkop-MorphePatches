package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class vie extends qyn {
    public final long j;
    public final String k;

    public vie(long j, String str) {
        this.j = j;
        this.k = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vie)) {
            return false;
        }
        vie vieVar = (vie) obj;
        return this.j == vieVar.j && Intrinsics.a(this.k, vieVar.k);
    }

    public final int hashCode() {
        return this.k.hashCode() + (Long.hashCode(this.j) * 31);
    }

    public final String toString() {
        return "";
    }
}
