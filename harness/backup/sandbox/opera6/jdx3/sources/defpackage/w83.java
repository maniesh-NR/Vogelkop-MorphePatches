package defpackage;

/* loaded from: classes.dex */
public final class w83 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;

    public w83(float f, float f2, float f3, float f4, float f5) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w83)) {
            return false;
        }
        w83 w83Var = (w83) obj;
        return Float.compare(this.a, w83Var.a) == 0 && Float.compare(this.b, w83Var.b) == 0 && Float.compare(this.c, w83Var.c) == 0 && Float.compare(this.d, w83Var.d) == 0 && Float.compare(this.e, w83Var.e) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.e) + sko.d(this.d, sko.d(this.c, sko.d(this.b, Float.hashCode(this.a) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "";
    }
}
