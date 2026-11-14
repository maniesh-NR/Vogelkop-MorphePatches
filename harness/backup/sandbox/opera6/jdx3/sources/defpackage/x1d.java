package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@h2j
/* loaded from: classes.dex */
public final class x1d {

    @NotNull
    public static final w1d Companion = new w1d();
    public final String a;
    public final long b;

    public /* synthetic */ x1d(int i, long j, String str) {
        if (3 != (i & 3)) {
            x7d.I(i, 3, v1d.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x1d)) {
            return false;
        }
        x1d x1dVar = (x1d) obj;
        return Intrinsics.a(this.a, x1dVar.a) && this.b == x1dVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "LookupResponse(address=" + this.a + ", publishedOn=" + this.b + ")";
    }
}
