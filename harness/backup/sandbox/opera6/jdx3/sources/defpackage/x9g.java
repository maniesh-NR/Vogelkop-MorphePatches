package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class x9g {
    public final w9g a;
    public final b94 b;

    public x9g(w9g w9gVar, b94 b94Var) {
        this.a = w9gVar;
        this.b = b94Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && x9g.class == obj.getClass()) {
            x9g x9gVar = (x9g) obj;
            return this.a.equals(x9gVar.a) && this.b == x9gVar.b;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }
}
