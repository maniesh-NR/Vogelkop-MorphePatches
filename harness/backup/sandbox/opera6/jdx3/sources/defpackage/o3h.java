package defpackage;

/* loaded from: classes.dex */
public final class o3h implements q3h {
    public final boolean a;
    public final op0 b;

    public o3h(boolean z, op0 op0Var) {
        this.a = z;
        this.b = op0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o3h) {
            o3h o3hVar = (o3h) obj;
            return this.a == o3hVar.a && this.b == o3hVar.b;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "";
    }
}
