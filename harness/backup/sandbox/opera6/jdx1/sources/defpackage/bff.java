package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class bff implements fff {
    public final long a;
    public final Integer b;

    public bff(long j, Integer num) {
        this.a = j;
        this.b = num;
    }

    @Override // defpackage.fff
    public final long a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bff)) {
            return false;
        }
        bff bffVar = (bff) obj;
        long j = bffVar.a;
        int i = u95.h;
        return jgm.a(this.a, j) && Intrinsics.a(this.b, bffVar.b);
    }

    public final int hashCode() {
        int i = u95.h;
        igm igmVar = jgm.b;
        int iHashCode = Long.hashCode(this.a) * 31;
        Integer num = this.b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "";
    }
}
