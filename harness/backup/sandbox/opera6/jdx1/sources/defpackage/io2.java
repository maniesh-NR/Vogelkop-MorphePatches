package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class io2 {
    public final ms7 a;
    public final ms7 b;
    public final int c;
    public final ArrayList d;

    public io2(ms7 ms7Var, ms7 ms7Var2, int i, ArrayList arrayList) {
        this.a = ms7Var;
        this.b = ms7Var2;
        this.c = i;
        this.d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof io2) {
            io2 io2Var = (io2) obj;
            if (this.a == io2Var.a && this.b == io2Var.b && this.c == io2Var.c && this.d.equals(io2Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        return "In{edge=" + this.a + ", postviewEdge=" + this.b + ", inputFormat=" + this.c + ", outputFormats=" + this.d + "}";
    }
}
