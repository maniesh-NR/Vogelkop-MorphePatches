package defpackage;

/* loaded from: classes.dex */
public final class pn2 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public pn2(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof pn2)) {
            return false;
        }
        pn2 pn2Var = (pn2) obj;
        return this.a.equals(pn2Var.a) && this.b.equals(pn2Var.b) && this.c.equals(pn2Var.c) && this.d.equals(pn2Var.d);
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GraphicDeviceInfo{glVersion=");
        sb.append(this.a);
        sb.append(", eglVersion=");
        sb.append(this.b);
        sb.append(", glExtensions=");
        sb.append(this.c);
        sb.append(", eglExtensions=");
        return z1m.l(sb, this.d, "}");
    }
}
