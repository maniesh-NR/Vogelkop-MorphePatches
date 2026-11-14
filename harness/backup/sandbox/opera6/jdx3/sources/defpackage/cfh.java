package defpackage;

/* loaded from: classes.dex */
public final class cfh implements gfh {
    public final bfh a;

    public cfh(bfh bfhVar) {
        this.a = bfhVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof cfh) && this.a.equals(((cfh) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "";
    }
}
