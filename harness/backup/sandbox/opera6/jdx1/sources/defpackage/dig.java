package defpackage;

/* loaded from: classes.dex */
public final class dig {
    public final w69 a;

    public dig(w69 w69Var) {
        this.a = w69Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof dig) {
            return this.a.equals(((dig) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }
}
