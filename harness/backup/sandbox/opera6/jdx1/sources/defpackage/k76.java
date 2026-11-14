package defpackage;

/* loaded from: classes.dex */
public final class k76 {
    public final qfh a;
    public final boolean b;

    public k76(qfh qfhVar, boolean z) {
        this.a = qfhVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k76) {
            k76 k76Var = (k76) obj;
            if (k76Var.a.equals(this.a) && k76Var.b == this.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.b).hashCode();
    }
}
