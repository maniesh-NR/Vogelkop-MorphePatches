package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class iz9 {
    public final int a;
    public final int b;

    public iz9(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof iz9)) {
            return false;
        }
        iz9 iz9Var = (iz9) obj;
        return this.a == iz9Var.a && this.b == iz9Var.b;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), Integer.valueOf(this.b));
    }
}
