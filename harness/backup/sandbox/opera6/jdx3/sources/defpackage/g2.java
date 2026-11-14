package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g2 extends c2 {
    public final Integer d;

    public g2(Integer num) {
        super(num, "int");
        this.d = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g2) && Intrinsics.a(this.d, ((g2) obj).d);
    }

    public final int hashCode() {
        Integer num = this.d;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        return "Sint(size=" + this.d + ")";
    }
}
