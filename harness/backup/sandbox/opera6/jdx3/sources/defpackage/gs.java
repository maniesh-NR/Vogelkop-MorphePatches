package defpackage;

/* loaded from: classes.dex */
public final class gs extends js {
    public final rxh c;

    public gs(rxh rxhVar) {
        super(gt.f, ds.f);
        this.c = rxhVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof gs) && this.c.equals(((gs) obj).c);
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c.a);
    }

    public final String toString() {
        return "";
    }
}
