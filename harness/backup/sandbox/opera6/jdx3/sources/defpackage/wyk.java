package defpackage;

import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public final class wyk {
    public final Set a;
    public final Set b;

    public wyk(Set set, Set set2) {
        this.a = set;
        this.b = set2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && wyk.class == obj.getClass()) {
            wyk wykVar = (wyk) obj;
            if (this.a.equals(wykVar.a) && this.b.equals(wykVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }
}
