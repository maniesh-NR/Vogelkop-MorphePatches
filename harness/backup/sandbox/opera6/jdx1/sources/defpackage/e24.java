package defpackage;

/* loaded from: classes.dex */
public final class e24 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public e24(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof e24)) {
            return false;
        }
        e24 e24Var = (e24) obj;
        return gh7.b(this.a, e24Var.a) && gh7.b(this.b, e24Var.b) && gh7.b(this.c, e24Var.c) && gh7.b(this.d, e24Var.d) && gh7.b(0.0f, 0.0f);
    }

    public final int hashCode() {
        return sko.d(this.d, sko.d(this.c, sko.d(this.b, Float.hashCode(this.a) * 31, 31), 31), 31);
    }
}
