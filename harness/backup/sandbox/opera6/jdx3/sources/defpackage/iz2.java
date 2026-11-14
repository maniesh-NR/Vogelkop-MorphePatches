package defpackage;

/* loaded from: classes.dex */
public final class iz2 {
    public final float a;
    public final hz2 b;
    public final float c;
    public final float d;

    public iz2(float f, hz2 hz2Var, float f2, float f3) {
        this.a = f;
        this.b = hz2Var;
        this.c = f2;
        this.d = f3;
        if (0.0f > f || f > 1.0f) {
            qp2.o("The 'progress' argument must be between 0 and 1 (both inclusive)");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iz2)) {
            return false;
        }
        iz2 iz2Var = (iz2) obj;
        return Float.compare(this.a, iz2Var.a) == 0 && this.b == iz2Var.b && Float.compare(this.c, iz2Var.c) == 0 && Float.compare(this.d, iz2Var.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + sko.d(this.c, (this.b.hashCode() + (Float.hashCode(this.a) * 31)) * 31, 31);
    }

    public final String toString() {
        return "BackEvent(progress=" + this.a + ", swipeEdge=" + this.b + ", touchX=" + this.c + ", touchY=" + this.d + ')';
    }
}
