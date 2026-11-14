package defpackage;

/* loaded from: classes.dex */
public final class koc {
    public final joc a;
    public final boolean b;

    public koc(joc jocVar, boolean z) {
        this.a = jocVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof koc)) {
            return false;
        }
        koc kocVar = (koc) obj;
        return this.a.equals(kocVar.a) && this.b == kocVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "";
    }
}
