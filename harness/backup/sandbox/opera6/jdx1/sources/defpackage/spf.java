package defpackage;

/* loaded from: classes.dex */
public final class spf {
    public final uga a;
    public final l2n b;
    public final boolean c;

    public spf(uga ugaVar, l2n l2nVar, boolean z) {
        this.a = ugaVar;
        this.b = l2nVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof spf)) {
            return false;
        }
        spf spfVar = (spf) obj;
        return this.a == spfVar.a && this.b == spfVar.b && this.c == spfVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "";
    }
}
