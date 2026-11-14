package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class vjh {
    public final ujh a;
    public final Integer b;

    public vjh(ujh ujhVar, Integer num) {
        this.a = ujhVar;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vjh)) {
            return false;
        }
        vjh vjhVar = (vjh) obj;
        return this.a == vjhVar.a && Intrinsics.a(this.b, vjhVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "";
    }
}
