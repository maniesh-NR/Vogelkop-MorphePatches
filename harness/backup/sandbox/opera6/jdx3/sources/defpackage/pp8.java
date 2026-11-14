package defpackage;

/* loaded from: classes.dex */
public final class pp8 {
    public final int a;
    public final int b;
    public final boolean c;

    public pp8(int i, int i2, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pp8)) {
            return false;
        }
        pp8 pp8Var = (pp8) obj;
        return this.a == pp8Var.a && this.b == pp8Var.b && this.c == pp8Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + rfp.c(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return "";
    }
}
