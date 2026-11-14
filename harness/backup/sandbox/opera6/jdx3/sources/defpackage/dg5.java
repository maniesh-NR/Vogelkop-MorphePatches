package defpackage;

/* loaded from: classes.dex */
public final class dg5 {
    public final int a;
    public final cg5 b;

    public /* synthetic */ dg5(int i) {
        this(i, cg5.a);
    }

    public dg5(int i, cg5 cg5Var) {
        this.a = i;
        this.b = cg5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dg5)) {
            return false;
        }
        dg5 dg5Var = (dg5) obj;
        return this.a == dg5Var.a && this.b == dg5Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "";
    }
}
