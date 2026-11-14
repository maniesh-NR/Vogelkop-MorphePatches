package defpackage;

/* loaded from: classes.dex */
public final class k4l {
    public final dxh a;
    public final dxh b;

    public k4l(dxh dxhVar, dxh dxhVar2) {
        this.a = dxhVar;
        this.b = dxhVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k4l)) {
            return false;
        }
        k4l k4lVar = (k4l) obj;
        return this.a.equals(k4lVar.a) && this.b.equals(k4lVar.b);
    }

    public final int hashCode() {
        return Integer.hashCode(this.b.a) + (Integer.hashCode(this.a.a) * 31);
    }

    public final String toString() {
        return "";
    }
}
