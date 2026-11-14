package defpackage;

/* loaded from: classes.dex */
public final class fz3 implements pil {
    public final haj a;
    public final float b;

    public fz3(haj hajVar, float f) {
        this.a = hajVar;
        this.b = f;
    }

    @Override // defpackage.pil
    public final long a() {
        int i = u95.h;
        return u95.g;
    }

    @Override // defpackage.pil
    public final float b() {
        return this.b;
    }

    @Override // defpackage.pil
    public final dz3 c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fz3)) {
            return false;
        }
        fz3 fz3Var = (fz3) obj;
        return this.a.equals(fz3Var.a) && Float.compare(this.b, fz3Var.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BrushStyle(value=" + this.a + ", alpha=" + this.b + ")";
    }
}
