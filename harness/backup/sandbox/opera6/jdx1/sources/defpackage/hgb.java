package defpackage;

/* loaded from: classes.dex */
public final class hgb extends oua {
    public final String b;
    public final String c;
    public final String d;

    public hgb(String str, String str2, String str3) {
        super("----");
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || hgb.class != obj.getClass()) {
            return false;
        }
        hgb hgbVar = (hgb) obj;
        return this.c.equals(hgbVar.c) && this.b.equals(hgbVar.b) && this.d.equals(hgbVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + z1m.f(z1m.f(527, 31, this.b), 31, this.c);
    }

    @Override // defpackage.oua
    public final String toString() {
        return this.a + ": domain=" + this.b + ", description=" + this.c;
    }
}
