package defpackage;

import android.util.Size;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class xm2 {
    public rb4 b;
    public s0b c;
    public s0b d;
    public final Size f;
    public final int g;
    public final ArrayList h;
    public final boolean i;
    public final ms7 j;
    public final ms7 k;
    public rb4 a = new mi4();
    public final s0b e = null;

    public xm2(Size size, int i, ArrayList arrayList, boolean z, ms7 ms7Var, ms7 ms7Var2) {
        if (size == null) {
            t3p.q("Null size");
            throw null;
        }
        this.f = size;
        this.g = i;
        this.h = arrayList;
        this.i = z;
        this.j = ms7Var;
        this.k = ms7Var2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof xm2) {
            xm2 xm2Var = (xm2) obj;
            return this.f.equals(xm2Var.f) && this.g == xm2Var.g && this.h.equals(xm2Var.h) && this.i == xm2Var.i && this.j == xm2Var.j && this.k == xm2Var.k;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((this.f.hashCode() ^ 1000003) * 1000003) ^ this.g) * 1000003) ^ this.h.hashCode()) * 1000003) ^ (this.i ? 1231 : 1237)) * 583896283) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode();
    }

    public final String toString() {
        return "In{size=" + this.f + ", inputFormat=" + this.g + ", outputFormats=" + this.h + ", virtualCamera=" + this.i + ", imageReaderProxyProvider=null, postviewSettings=null, requestEdge=" + this.j + ", errorEdge=" + this.k + "}";
    }
}
