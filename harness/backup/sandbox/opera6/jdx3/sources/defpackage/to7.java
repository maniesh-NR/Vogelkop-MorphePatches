package defpackage;

/* loaded from: classes.dex */
public final class to7 {
    public final qo7 a;
    public final boolean b;

    public to7(qo7 qo7Var, boolean z) {
        this.a = qo7Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof to7)) {
            return false;
        }
        to7 to7Var = (to7) obj;
        return this.a.equals(to7Var.a) && this.b == to7Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "";
    }
}
