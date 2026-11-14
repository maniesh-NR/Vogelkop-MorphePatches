package defpackage;

/* loaded from: classes.dex */
public final class gvl {
    public static final gvl e = new gvl(0, 0.0f, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final float d;

    public gvl(int i, float f, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = f;
    }

    public final boolean a() {
        if (this.a <= 0) {
            return (this.b > 0 || this.c > 0) && this.d > 0.0f;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gvl)) {
            return false;
        }
        gvl gvlVar = (gvl) obj;
        return this.a == gvlVar.a && this.b == gvlVar.b && this.c == gvlVar.c && Float.compare(this.d, gvlVar.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + rfp.c(this.c, rfp.c(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return "";
    }
}
