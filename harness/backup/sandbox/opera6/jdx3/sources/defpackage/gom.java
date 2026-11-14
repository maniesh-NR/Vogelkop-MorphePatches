package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class gom {
    public final lom a;
    public final kom b;
    public final Integer c;

    public gom(lom lomVar, kom komVar, Integer num) {
        this.a = lomVar;
        this.b = komVar;
        this.c = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gom)) {
            return false;
        }
        gom gomVar = (gom) obj;
        return this.a == gomVar.a && this.b == gomVar.b && Intrinsics.a(this.c, gomVar.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        Integer num = this.c;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "";
    }
}
