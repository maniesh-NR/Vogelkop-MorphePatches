package defpackage;

/* loaded from: classes.dex */
public final class t7g extends v7g {
    public final float c;

    public t7g(float f) {
        super(3);
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t7g) && Float.compare(this.c, ((t7g) obj).c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c);
    }

    public final String toString() {
        return "RelativeVerticalTo(dy=" + this.c + ")";
    }
}
