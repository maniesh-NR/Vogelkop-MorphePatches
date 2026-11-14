package defpackage;

/* loaded from: classes.dex */
public final class byj extends y7h {
    public final lxh d;
    public final cxh e;

    public byj(lxh lxhVar, cxh cxhVar) {
        this.d = lxhVar;
        this.e = cxhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof byj)) {
            return false;
        }
        byj byjVar = (byj) obj;
        return this.d.equals(byjVar.d) && this.e.equals(byjVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + (Integer.hashCode(this.d.a) * 31);
    }

    public final String toString() {
        return "";
    }
}
