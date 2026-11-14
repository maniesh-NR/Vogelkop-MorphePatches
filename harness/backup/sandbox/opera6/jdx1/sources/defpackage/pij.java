package defpackage;

/* loaded from: classes.dex */
public final class pij {
    public final float a;
    public final float b;

    public pij(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pij)) {
            return false;
        }
        pij pijVar = (pij) obj;
        return gh7.b(this.a, pijVar.a) && gh7.b(this.b, pijVar.b);
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "";
    }
}
