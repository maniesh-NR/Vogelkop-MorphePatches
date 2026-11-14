package defpackage;

/* loaded from: classes.dex */
public final class tt7 {
    public final pt7 a;
    public final st7 b;
    public final vt7 c;
    public final qt7 d;

    public tt7(pt7 pt7Var, st7 st7Var, vt7 vt7Var, qt7 qt7Var) {
        this.a = pt7Var;
        this.b = st7Var;
        this.c = vt7Var;
        this.d = qt7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tt7)) {
            return false;
        }
        tt7 tt7Var = (tt7) obj;
        return this.a.equals(tt7Var.a) && this.b.equals(tt7Var.b) && this.c.equals(tt7Var.c) && this.d.equals(tt7Var.d);
    }

    public final int hashCode() {
        return ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31) - 519257556;
    }

    public final String toString() {
        return "";
    }
}
