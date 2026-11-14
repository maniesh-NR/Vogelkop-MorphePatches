package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class rf1 {
    public final Object a;
    public final int b;
    public final int c;
    public final String d;

    public rf1(Object obj, int i, int i2) {
        this("", i, i2, obj);
    }

    public rf1(String str, int i, int i2, Object obj) {
        this.a = obj;
        this.b = i;
        this.c = i2;
        this.d = str;
        if (i <= i2) {
            return;
        }
        b8b.a("Reversed range is not supported");
    }

    public static rf1 a(rf1 rf1Var, of1 of1Var, int i, int i2) {
        Object obj = of1Var;
        if ((i2 & 1) != 0) {
            obj = rf1Var.a;
        }
        int i3 = rf1Var.b;
        if ((i2 & 4) != 0) {
            i = rf1Var.c;
        }
        return new rf1(rf1Var.d, i3, i, obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rf1)) {
            return false;
        }
        rf1 rf1Var = (rf1) obj;
        return Intrinsics.a(this.a, rf1Var.a) && this.b == rf1Var.b && this.c == rf1Var.c && Intrinsics.a(this.d, rf1Var.d);
    }

    public final int hashCode() {
        Object obj = this.a;
        return this.d.hashCode() + rfp.c(this.c, rfp.c(this.b, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        return "Range(item=" + this.a + ", start=" + this.b + ", end=" + this.c + ", tag=" + this.d + ")";
    }
}
