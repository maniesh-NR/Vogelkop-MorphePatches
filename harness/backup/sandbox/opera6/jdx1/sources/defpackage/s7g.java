package defpackage;

/* loaded from: classes.dex */
public final class s7g extends v7g {
    public final float c;
    public final float d;

    public s7g(float f, float f2) {
        super(1);
        this.c = f;
        this.d = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s7g)) {
            return false;
        }
        s7g s7gVar = (s7g) obj;
        return Float.compare(this.c, s7gVar.c) == 0 && Float.compare(this.d, s7gVar.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + (Float.hashCode(this.c) * 31);
    }

    public final String toString() {
        return "RelativeReflectiveQuadTo(dx=" + this.c + ", dy=" + this.d + ")";
    }
}
