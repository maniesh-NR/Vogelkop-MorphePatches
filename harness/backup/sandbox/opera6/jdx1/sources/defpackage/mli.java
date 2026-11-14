package defpackage;

/* loaded from: classes.dex */
public final class mli {
    public final float a;
    public final long b;
    public final e8m c;

    public mli(float f, long j, e8m e8mVar) {
        this.a = f;
        this.b = j;
        this.c = e8mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mli)) {
            return false;
        }
        mli mliVar = (mli) obj;
        return Float.compare(this.a, mliVar.a) == 0 && a2m.a(this.b, mliVar.b) && this.c.equals(mliVar.c);
    }

    public final int hashCode() {
        int iHashCode = Float.hashCode(this.a) * 31;
        int i = a2m.c;
        return this.c.hashCode() + z1m.e(iHashCode, 31, this.b);
    }

    public final String toString() {
        return "Scale(scale=" + this.a + ", transformOrigin=" + a2m.b(this.b) + ", animationSpec=" + this.c + ")";
    }
}
