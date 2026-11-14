package defpackage;

/* loaded from: classes.dex */
public final class go3 {
    public final float a;
    public final nvj b;

    public go3(float f, nvj nvjVar) {
        this.a = f;
        this.b = nvjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof go3)) {
            return false;
        }
        go3 go3Var = (go3) obj;
        return gh7.b(this.a, go3Var.a) && this.b.equals(go3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "BorderStroke(width=" + gh7.c(this.a) + ", brush=" + this.b + ")";
    }
}
