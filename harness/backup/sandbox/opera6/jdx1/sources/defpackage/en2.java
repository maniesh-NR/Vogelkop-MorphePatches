package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class en2 {
    public final ntk a;
    public final ntk b;
    public final ArrayList c;

    public en2(ntk ntkVar, ntk ntkVar2, ArrayList arrayList) {
        if (ntkVar == null) {
            t3p.q("Null primarySurfaceEdge");
            throw null;
        }
        this.a = ntkVar;
        if (ntkVar2 == null) {
            t3p.q("Null secondarySurfaceEdge");
            throw null;
        }
        this.b = ntkVar2;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof en2)) {
            return false;
        }
        en2 en2Var = (en2) obj;
        return this.a.equals(en2Var.a) && this.b.equals(en2Var.b) && this.c.equals(en2Var.c);
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "In{primarySurfaceEdge=" + this.a + ", secondarySurfaceEdge=" + this.b + ", outConfigs=" + this.c + "}";
    }
}
