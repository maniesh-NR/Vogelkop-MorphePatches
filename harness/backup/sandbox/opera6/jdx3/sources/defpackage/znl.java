package defpackage;

/* loaded from: classes.dex */
public final class znl extends bwg {
    public final eol a;

    public znl(eol eolVar) {
        this.a = eolVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof znl) && this.a == ((znl) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "";
    }
}
