package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class k2 extends c2 {
    public final Integer d;

    public k2(Integer num) {
        super(num, "uint");
        this.d = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k2) && Intrinsics.a(this.d, ((k2) obj).d);
    }

    public final int hashCode() {
        Integer num = this.d;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        return "Uint(size=" + this.d + ")";
    }
}
