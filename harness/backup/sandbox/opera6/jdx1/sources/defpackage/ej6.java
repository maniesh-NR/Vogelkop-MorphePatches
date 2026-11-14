package defpackage;

/* loaded from: classes.dex */
public final class ej6 {
    public final jva a;
    public final boolean b;

    public ej6(jva jvaVar, boolean z) {
        this.a = jvaVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ej6)) {
            return false;
        }
        ej6 ej6Var = (ej6) obj;
        return this.a.equals(ej6Var.a) && this.b == ej6Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DecodeResult(image=" + this.a + ", isSampled=" + this.b + ")";
    }
}
