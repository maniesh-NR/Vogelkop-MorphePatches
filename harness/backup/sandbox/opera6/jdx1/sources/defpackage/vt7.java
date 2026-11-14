package defpackage;

/* loaded from: classes.dex */
public final class vt7 {
    public final ut7 a;

    public vt7(ut7 ut7Var) {
        this.a = ut7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vt7) && this.a == ((vt7) obj).a;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + 1231;
    }

    public final String toString() {
        return "";
    }
}
