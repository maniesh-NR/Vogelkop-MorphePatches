package defpackage;

import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class ot3 {
    public final nt3 a;
    public final LinkedHashSet b;

    public ot3(nt3 nt3Var, LinkedHashSet linkedHashSet) {
        this.a = nt3Var;
        this.b = linkedHashSet;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ot3)) {
            return false;
        }
        ot3 ot3Var = (ot3) obj;
        return this.a.equals(ot3Var.a) && this.b.equals(ot3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "";
    }
}
