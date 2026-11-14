package defpackage;

/* loaded from: classes.dex */
public final class nnn {
    public final wln a;
    public boolean b;
    public aln c;

    public nnn(wln wlnVar) {
        this.a = wlnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nnn) && this.a == ((nnn) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "";
    }
}
