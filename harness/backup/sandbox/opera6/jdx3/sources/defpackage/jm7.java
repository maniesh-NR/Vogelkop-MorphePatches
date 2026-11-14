package defpackage;

/* loaded from: classes.dex */
public final class jm7 {
    public final boolean a;
    public final boolean b;

    /* JADX WARN: Multi-variable type inference failed */
    public jm7(boolean z, int i) {
        this.a = z;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jm7)) {
            return false;
        }
        jm7 jm7Var = (jm7) obj;
        return this.a == jm7Var.a && this.b == jm7Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b ? 1 : 0) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "";
    }
}
