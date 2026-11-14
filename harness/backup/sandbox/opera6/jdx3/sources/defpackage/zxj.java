package defpackage;

/* loaded from: classes.dex */
public final class zxj {
    public final y7h a;
    public final gxh b;
    public final ixh c;

    public zxj(y7h y7hVar) {
        gxh gxhVar = new gxh(0);
        ixh ixhVar = new ixh(0.0f);
        this.a = y7hVar;
        this.b = gxhVar;
        this.c = ixhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zxj)) {
            return false;
        }
        zxj zxjVar = (zxj) obj;
        return this.a.equals(zxjVar.a) && this.b.equals(zxjVar.b) && this.c.equals(zxjVar.c);
    }

    public final int hashCode() {
        return Float.hashCode(this.c.d) + rfp.c(this.b.a, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "";
    }
}
