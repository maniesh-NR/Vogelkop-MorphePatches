package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class wo2 {
    public final ntk a;
    public final List b;

    public wo2(ntk ntkVar, List list) {
        if (ntkVar == null) {
            t3p.q("Null surfaceEdge");
            throw null;
        }
        this.a = ntkVar;
        if (list != null) {
            this.b = list;
        } else {
            t3p.q("Null outConfigs");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof wo2) {
            wo2 wo2Var = (wo2) obj;
            if (this.a.equals(wo2Var.a) && this.b.equals(wo2Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "In{surfaceEdge=" + this.a + ", outConfigs=" + this.b + "}";
    }
}
