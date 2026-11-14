package defpackage;

/* loaded from: classes.dex */
public final class f9b {
    public final i71 a;
    public final go9 b;

    public f9b(i71 i71Var, go9 go9Var) {
        this.a = i71Var;
        this.b = go9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f9b) {
            f9b f9bVar = (f9b) obj;
            if (this.a == f9bVar.a && this.b.equals(f9bVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "InputRequest(image=" + this.a + ", frameInfo=" + this.b + ')';
    }
}
