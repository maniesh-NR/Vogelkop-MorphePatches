package defpackage;

/* loaded from: classes.dex */
public final class mk4 {
    public final ok4 a;

    public mk4(ok4 ok4Var) {
        this.a = ok4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mk4) && this.a == ((mk4) obj).a;
    }

    public final int hashCode() {
        ok4 ok4Var = this.a;
        if (ok4Var == null) {
            return 0;
        }
        return ok4Var.hashCode();
    }

    public final String toString() {
        return "CardState(status=" + this.a + ")";
    }
}
