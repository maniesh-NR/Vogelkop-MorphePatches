package defpackage;

/* loaded from: classes.dex */
public final class o7g extends v7g {
    public final float c;
    public final float d;

    public o7g(float f, float f2) {
        super(3);
        this.c = f;
        this.d = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o7g)) {
            return false;
        }
        o7g o7gVar = (o7g) obj;
        return Float.compare(this.c, o7gVar.c) == 0 && Float.compare(this.d, o7gVar.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + (Float.hashCode(this.c) * 31);
    }

    public final String toString() {
        return "RelativeLineTo(dx=" + this.c + ", dy=" + this.d + ")";
    }
}
