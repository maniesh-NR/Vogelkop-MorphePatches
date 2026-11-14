package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class gme {
    public final long a;
    public final String b;

    public gme(long j, String str) {
        this.a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gme)) {
            return false;
        }
        gme gmeVar = (gme) obj;
        return this.a == gmeVar.a && Intrinsics.a(this.b, gmeVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "";
    }
}
