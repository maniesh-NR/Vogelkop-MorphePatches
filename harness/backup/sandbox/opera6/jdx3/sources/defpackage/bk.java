package defpackage;

/* loaded from: classes.dex */
public final class bk extends c09 {
    public final rxh W;

    public bk(rxh rxhVar) {
        this.W = rxhVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof bk) && this.W.equals(((bk) obj).W);
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.W.a);
    }

    public final String toString() {
        return "";
    }
}
