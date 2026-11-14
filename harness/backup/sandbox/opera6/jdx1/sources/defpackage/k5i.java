package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class k5i {
    public final long a;
    public final j5i b;

    public k5i(long j, j5i j5iVar) {
        this.a = j;
        this.b = j5iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k5i)) {
            return false;
        }
        k5i k5iVar = (k5i) obj;
        long j = k5iVar.a;
        int i = u95.h;
        return jgm.a(this.a, j) && Intrinsics.a(this.b, k5iVar.b);
    }

    public final int hashCode() {
        int i = u95.h;
        igm igmVar = jgm.b;
        int iHashCode = Long.hashCode(this.a) * 31;
        j5i j5iVar = this.b;
        return iHashCode + (j5iVar != null ? j5iVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RippleConfiguration(color=");
        u35.o(this.a, ", rippleAlpha=", sb);
        sb.append(this.b);
        sb.append(')');
        return sb.toString();
    }
}
