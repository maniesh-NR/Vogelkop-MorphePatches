package defpackage;

/* loaded from: classes.dex */
public final class u7g extends v7g {
    public final float c;

    public u7g(float f) {
        super(3);
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u7g) && Float.compare(this.c, ((u7g) obj).c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c);
    }

    public final String toString() {
        return "VerticalTo(y=" + this.c + ")";
    }
}
