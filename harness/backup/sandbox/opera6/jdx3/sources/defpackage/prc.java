package defpackage;

/* loaded from: classes.dex */
public final class prc {
    public final orc a;

    public prc(orc orcVar) {
        this.a = orcVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof prc) && this.a == ((prc) obj).a;
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
