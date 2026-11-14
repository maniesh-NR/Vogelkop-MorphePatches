package defpackage;

/* loaded from: classes.dex */
public final class g7g extends v7g {
    public final float c;
    public final float d;

    public g7g(float f, float f2) {
        super(3);
        this.c = f;
        this.d = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g7g)) {
            return false;
        }
        g7g g7gVar = (g7g) obj;
        return Float.compare(this.c, g7gVar.c) == 0 && Float.compare(this.d, g7gVar.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + (Float.hashCode(this.c) * 31);
    }

    public final String toString() {
        return "LineTo(x=" + this.c + ", y=" + this.d + ")";
    }
}
