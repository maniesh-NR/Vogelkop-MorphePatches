package defpackage;

/* loaded from: classes.dex */
public final class h7g extends v7g {
    public final float c;
    public final float d;

    public h7g(float f, float f2) {
        super(3);
        this.c = f;
        this.d = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h7g)) {
            return false;
        }
        h7g h7gVar = (h7g) obj;
        return Float.compare(this.c, h7gVar.c) == 0 && Float.compare(this.d, h7gVar.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + (Float.hashCode(this.c) * 31);
    }

    public final String toString() {
        return "MoveTo(x=" + this.c + ", y=" + this.d + ")";
    }
}
