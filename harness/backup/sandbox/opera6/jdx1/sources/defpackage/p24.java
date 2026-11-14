package defpackage;

import java.io.Serializable;
import java.util.Objects;

/* loaded from: classes.dex */
public final class p24 extends esf implements Serializable {
    public final xq9 a;
    public final esf b;

    public p24(xq9 xq9Var, esf esfVar) {
        this.a = xq9Var;
        this.b = esfVar;
    }

    public final int compare(Object obj, Object obj2) {
        xq9 xq9Var = this.a;
        return this.b.compare(xq9Var.apply(obj), xq9Var.apply(obj2));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p24)) {
            return false;
        }
        p24 p24Var = (p24) obj;
        return this.a.equals(p24Var.a) && this.b.equals(p24Var.b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public final String toString() {
        return this.b + ".onResultOf(" + this.a + ")";
    }
}
