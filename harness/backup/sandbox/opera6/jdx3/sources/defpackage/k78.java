package defpackage;

/* loaded from: classes.dex */
public final class k78 implements m78 {
    public final rxh a;
    public final pxh b;
    public final rxh c;
    public final sxh d;
    public final rxh e;

    public k78(rxh rxhVar, pxh pxhVar, rxh rxhVar2, sxh sxhVar, rxh rxhVar3) {
        this.a = rxhVar;
        this.b = pxhVar;
        this.c = rxhVar2;
        this.d = sxhVar;
        this.e = rxhVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k78)) {
            return false;
        }
        k78 k78Var = (k78) obj;
        return this.a.equals(k78Var.a) && this.b.equals(k78Var.b) && this.c.equals(k78Var.c) && this.d.equals(k78Var.d) && this.e.equals(k78Var.e);
    }

    public final int hashCode() {
        return Integer.hashCode(this.e.a) + ((this.d.hashCode() + rfp.c(this.c.a, (this.b.hashCode() + (Integer.hashCode(this.a.a) * 31)) * 31, 31)) * 31);
    }

    public final String toString() {
        return "";
    }
}
