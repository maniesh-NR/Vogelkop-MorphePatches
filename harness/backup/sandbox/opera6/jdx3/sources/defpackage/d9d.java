package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d9d extends oup {
    public final String f;
    public final long g;

    public d9d(String str, long j) {
        this.f = str;
        this.g = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d9d)) {
            return false;
        }
        d9d d9dVar = (d9d) obj;
        return Intrinsics.a(this.f, d9dVar.f) && this.g == d9dVar.g;
    }

    public final int hashCode() {
        return Long.hashCode(this.g) + (this.f.hashCode() * 31);
    }

    public final String toString() {
        return "";
    }
}
