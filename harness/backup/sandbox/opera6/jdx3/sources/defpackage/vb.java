package defpackage;

/* loaded from: classes.dex */
public final class vb extends zi4 {
    public final String x;
    public final String y;
    public final String z;

    public vb(String str, String str2, String str3) {
        this.x = str;
        this.y = str2;
        this.z = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vb)) {
            return false;
        }
        vb vbVar = (vb) obj;
        return this.x.equals(vbVar.x) && this.y.equals(vbVar.y) && this.z.equals(vbVar.z);
    }

    public final int hashCode() {
        return this.z.hashCode() + z1m.f(this.x.hashCode() * 31, 31, this.y);
    }

    public final String toString() {
        return "";
    }
}
