package defpackage;

/* loaded from: classes.dex */
public final class czg {
    public final ign a;
    public final sj b;
    public final tyl c;
    public final j7j d;
    public final cgh e;
    public final int f;
    public final boolean g;
    public final kfo h;

    public czg(ign ignVar, sj sjVar, tyl tylVar, j7j j7jVar, cgh cghVar, int i, boolean z, kfo kfoVar) {
        this.a = ignVar;
        this.b = sjVar;
        this.c = tylVar;
        this.d = j7jVar;
        this.e = cghVar;
        this.f = i;
        this.g = z;
        this.h = kfoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof czg)) {
            return false;
        }
        czg czgVar = (czg) obj;
        return this.a.equals(czgVar.a) && this.b.equals(czgVar.b) && this.c.equals(czgVar.c) && this.d == czgVar.d && this.e.equals(czgVar.e) && this.f == czgVar.f && this.g == czgVar.g && this.h.equals(czgVar.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + fki.k(rfp.c(this.f, (this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31, 31), 31, this.g);
    }

    public final String toString() {
        return "";
    }
}
