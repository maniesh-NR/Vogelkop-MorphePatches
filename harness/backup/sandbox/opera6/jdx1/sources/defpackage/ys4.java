package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class ys4 extends oua {
    public final String b;
    public final int c;
    public final int d;
    public final long e;
    public final long f;
    public final oua[] g;

    public ys4(String str, int i, int i2, long j, long j2, oua[] ouaVarArr) {
        super("CHAP");
        this.b = str;
        this.c = i;
        this.d = i2;
        this.e = j;
        this.f = j2;
        this.g = ouaVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ys4.class != obj.getClass()) {
            return false;
        }
        ys4 ys4Var = (ys4) obj;
        return this.c == ys4Var.c && this.d == ys4Var.d && this.e == ys4Var.e && this.f == ys4Var.f && this.b.equals(ys4Var.b) && Arrays.equals(this.g, ys4Var.g);
    }

    public final int hashCode() {
        return this.b.hashCode() + ((((((((527 + this.c) * 31) + this.d) * 31) + ((int) this.e)) * 31) + ((int) this.f)) * 31);
    }
}
