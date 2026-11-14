package defpackage;

/* loaded from: classes.dex */
public final class j5i {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public j5i(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j5i)) {
            return false;
        }
        j5i j5iVar = (j5i) obj;
        return this.a == j5iVar.a && this.b == j5iVar.b && this.c == j5iVar.c && this.d == j5iVar.d;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + sko.d(this.c, sko.d(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbP = am2.p("RippleAlpha(draggedAlpha=", this.a, ", focusedAlpha=", this.b, ", hoveredAlpha=");
        sbP.append(this.c);
        sbP.append(", pressedAlpha=");
        sbP.append(this.d);
        sbP.append(")");
        return sbP.toString();
    }
}
