package defpackage;

/* loaded from: classes.dex */
public final class md2 implements nd2 {
    public final hyf a;
    public final xnk b;

    public md2(hyf hyfVar, xnk xnkVar) {
        this.a = hyfVar;
        this.b = xnkVar;
    }

    @Override // defpackage.nd2
    public final hyf a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof md2)) {
            return false;
        }
        md2 md2Var = (md2) obj;
        return this.a.equals(md2Var.a) && this.b.equals(md2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(painter=" + this.a + ", result=" + this.b + ")";
    }
}
