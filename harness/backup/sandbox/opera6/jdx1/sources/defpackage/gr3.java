package defpackage;

import android.graphics.Rect;

/* loaded from: classes.dex */
public final class gr3 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    static {
        new gr3(0, 0, 0, 0);
    }

    public gr3(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        if (i > i3) {
            bxl.d(sko.h(i, i3, "Left must be less than or equal to right, left: ", ", right: "));
            throw null;
        }
        if (i2 <= i4) {
            return;
        }
        bxl.d(sko.h(i2, i4, "top must be less than or equal to bottom, top: ", ", bottom: "));
        throw null;
    }

    public gr3(Rect rect) {
        this(rect.left, rect.top, rect.right, rect.bottom);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!gr3.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        gr3 gr3Var = (gr3) obj;
        return this.a == gr3Var.a && this.b == gr3Var.b && this.c == gr3Var.c && this.d == gr3Var.d;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(gr3.class.getSimpleName());
        sb.append(" { [");
        sb.append(this.a);
        sb.append(',');
        sb.append(this.b);
        sb.append(',');
        sb.append(this.c);
        sb.append(',');
        return p3p.k(this.d, "] }", sb);
    }
}
