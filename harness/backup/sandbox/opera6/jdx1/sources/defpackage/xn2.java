package defpackage;

/* loaded from: classes.dex */
public final class xn2 {
    public final int a;
    public final td4 b;

    public xn2(int i, td4 td4Var) {
        this.a = i;
        this.b = td4Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof xn2)) {
            return false;
        }
        xn2 xn2Var = (xn2) obj;
        return this.a == xn2Var.a && this.b.equals(xn2Var.b);
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "Key{lifecycleOwnerHash=" + this.a + ", cameraIdentifier=" + this.b + "}";
    }
}
