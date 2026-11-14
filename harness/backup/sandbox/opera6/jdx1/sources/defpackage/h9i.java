package defpackage;

import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class h9i {
    public final List a;
    public final boolean b;

    public h9i(mi9 mi9Var) {
        this.a = mi9Var.b;
        this.b = mi9Var.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h9i)) {
            return false;
        }
        h9i h9iVar = (h9i) obj;
        return this.a.equals(h9iVar.a) && this.b == h9iVar.b;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Boolean.valueOf(this.b), null);
    }
}
