package defpackage;

/* loaded from: classes.dex */
public final class qp3 {
    public static final qp3 d = new qp3(0, 0, 0.0f);
    public final int a;
    public final int b;
    public final float c;

    public qp3(int i, int i2, float f) {
        this.a = i;
        this.b = i2;
        this.c = f;
    }

    public final boolean a() {
        return (this.a > 0 || this.b > 0) && this.c > 0.0f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qp3)) {
            return false;
        }
        qp3 qp3Var = (qp3) obj;
        return this.a == qp3Var.a && this.b == qp3Var.b && Float.compare(this.c, qp3Var.c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + rfp.c(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return "";
    }
}
