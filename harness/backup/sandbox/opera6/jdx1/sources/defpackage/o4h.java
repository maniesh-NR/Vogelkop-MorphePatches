package defpackage;

/* loaded from: classes.dex */
public final class o4h {
    public static final o4h c = new o4h(0.0f, new h65(0.0f));
    public final float a;
    public final h65 b;

    public o4h(float f, h65 h65Var) {
        this.a = f;
        this.b = h65Var;
        if (Float.isNaN(f)) {
            qp2.o("current must not be NaN");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o4h)) {
            return false;
        }
        o4h o4hVar = (o4h) obj;
        return this.a == o4hVar.a && this.b.equals(o4hVar.b);
    }

    public final int hashCode() {
        return (this.b.hashCode() + (Float.hashCode(this.a) * 31)) * 31;
    }

    public final String toString() {
        return "ProgressBarRangeInfo(current=" + this.a + ", range=" + this.b + ", steps=0)";
    }
}
