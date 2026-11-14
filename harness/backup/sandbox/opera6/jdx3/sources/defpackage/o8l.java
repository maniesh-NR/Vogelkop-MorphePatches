package defpackage;

/* loaded from: classes.dex */
public final class o8l extends uyg {
    public final int a;
    public final float b;

    public o8l(int i, float f) {
        this.a = i;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o8l)) {
            return false;
        }
        o8l o8lVar = (o8l) obj;
        return this.a == o8lVar.a && Float.compare(this.b, o8lVar.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "";
    }
}
