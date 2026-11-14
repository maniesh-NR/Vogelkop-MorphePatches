package defpackage;

/* loaded from: classes.dex */
public final class mlk {
    public final boolean a;
    public final boolean b;

    public mlk(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && mlk.class == obj.getClass()) {
            mlk mlkVar = (mlk) obj;
            if (this.a == mlkVar.a && this.b == mlkVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ? 1 : 0) * 31) + (this.b ? 1 : 0);
    }
}
