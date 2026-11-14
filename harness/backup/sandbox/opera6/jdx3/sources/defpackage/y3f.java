package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class y3f {
    public final int a;
    public final Integer b;

    public y3f(int i, Integer num) {
        this.a = i;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y3f)) {
            return false;
        }
        y3f y3fVar = (y3f) obj;
        return this.a == y3fVar.a && Intrinsics.a(this.b, y3fVar.b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        Integer num = this.b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "";
    }
}
