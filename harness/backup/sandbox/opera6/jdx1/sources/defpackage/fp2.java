package defpackage;

/* loaded from: classes.dex */
public final class fp2 {
    public static final fp2 d = new fp2(0, 0, 0);
    public static final fp2 e = new fp2(1, 3, 2);
    public static final fp2 f = new fp2(1, 3, 1);
    public static final fp2 g = new fp2(6, 7, 1);
    public static final fp2 h = new fp2(6, 6, 1);
    public final byte a;
    public final byte b;
    public final byte c;

    /* JADX WARN: Multi-variable type inference failed */
    public fp2(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fp2)) {
            return false;
        }
        fp2 fp2Var = (fp2) obj;
        return this.a == fp2Var.a && this.b == fp2Var.b && this.c == fp2Var.c;
    }

    public final int hashCode() {
        return ((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoEncoderDataSpace{standard=");
        sb.append((int) this.a);
        sb.append(", transfer=");
        sb.append((int) this.b);
        sb.append(", range=");
        return p3p.k(this.c, "}", sb);
    }
}
