package defpackage;

/* loaded from: classes.dex */
public final class z1f {
    public final y1f a;
    public final int b;
    public final int c;

    public z1f(y1f y1fVar, int i, int i2) {
        this.a = y1fVar;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z1f)) {
            return false;
        }
        z1f z1fVar = (z1f) obj;
        return this.a == z1fVar.a && this.b == z1fVar.b && this.c == z1fVar.c;
    }

    public final int hashCode() {
        return vep.A(this.c) + ((vep.A(this.b) + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "";
    }
}
