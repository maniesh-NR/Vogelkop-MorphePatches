package defpackage;

/* loaded from: classes.dex */
public final class ap {
    public final int a;
    public final int b;
    public final double c;

    public ap(int i, int i2, double d) {
        this.a = i;
        this.b = i2;
        this.c = d;
    }

    public static ap a(double d) {
        return new ap((int) (100.0d * d), 0, d);
    }

    public static ap b(int i, int i2) {
        return new ap(i, i2, -1.0d);
    }

    public final float c() {
        double d = this.c;
        return d == -1.0d ? this.a / 100.0f : (float) d;
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == ap.class) {
            ap apVar = (ap) obj;
            if (apVar.a == this.a && apVar.b == this.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a + this.b;
    }

    public final String toString() {
        return "";
    }
}
