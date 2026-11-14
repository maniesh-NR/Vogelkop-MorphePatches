package defpackage;

/* loaded from: classes.dex */
public final class kbf {
    public final bl0 a;
    public final int b;

    public kbf(bl0 bl0Var, int i) {
        this.a = bl0Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof kbf) {
            kbf kbfVar = (kbf) obj;
            if (this.a == kbfVar.a && this.b == kbfVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "";
    }
}
