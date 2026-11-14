package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class oa3 {
    public final String a;
    public final String b;
    public final int c;
    public final int d;

    public oa3(String str, String str2, int i, int i2) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oa3)) {
            return false;
        }
        oa3 oa3Var = (oa3) obj;
        return this.c == oa3Var.c && this.d == oa3Var.d && Objects.equals(this.a, oa3Var.a) && Objects.equals(this.b, oa3Var.b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, Integer.valueOf(this.c), Integer.valueOf(this.d));
    }
}
