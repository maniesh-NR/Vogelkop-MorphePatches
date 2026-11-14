package defpackage;

/* loaded from: classes.dex */
public final class d32 {
    public final e32 a;
    public pa b;
    public boolean c = false;

    public d32(e32 e32Var, pa paVar) {
        this.a = e32Var;
        this.b = paVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d32) {
            d32 d32Var = (d32) obj;
            if (this.a.equals(d32Var.a) && this.b == d32Var.b && this.c == d32Var.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "";
    }
}
