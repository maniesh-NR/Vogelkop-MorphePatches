package defpackage;

/* loaded from: classes.dex */
public final class p7g extends v7g {
    public final float c;
    public final float d;

    public p7g(float f, float f2) {
        super(3);
        this.c = f;
        this.d = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p7g)) {
            return false;
        }
        p7g p7gVar = (p7g) obj;
        return Float.compare(this.c, p7gVar.c) == 0 && Float.compare(this.d, p7gVar.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + (Float.hashCode(this.c) * 31);
    }

    public final String toString() {
        return "RelativeMoveTo(dx=" + this.c + ", dy=" + this.d + ")";
    }
}
