package defpackage;

/* loaded from: classes.dex */
public final class f7g extends v7g {
    public final float c;

    public f7g(float f) {
        super(3);
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f7g) && Float.compare(this.c, ((f7g) obj).c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c);
    }

    public final String toString() {
        return "HorizontalTo(x=" + this.c + ")";
    }
}
