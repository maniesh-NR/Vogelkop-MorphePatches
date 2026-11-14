package defpackage;

/* loaded from: classes.dex */
public final class cn2 {
    public final int a;
    public final int b;
    public final l94 c;

    public cn2(int i, int i2, l94 l94Var) {
        this.a = i;
        this.b = i2;
        this.c = l94Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cn2) {
            cn2 cn2Var = (cn2) obj;
            return this.a == cn2Var.a && this.b == cn2Var.b && this.c == cn2Var.c;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "PendingSnapshot{jpegQuality=" + this.a + ", rotationDegrees=" + this.b + ", completer=" + this.c + "}";
    }
}
