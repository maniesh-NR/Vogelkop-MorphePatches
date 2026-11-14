package defpackage;

import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class rh9 {
    public String a;
    public String b;
    public List c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rh9)) {
            return false;
        }
        rh9 rh9Var = (rh9) obj;
        return Objects.equals(this.a, rh9Var.a) && Objects.equals(this.b, rh9Var.b) && Objects.equals(this.c, rh9Var.c);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }
}
