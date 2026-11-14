package defpackage;

/* loaded from: classes.dex */
public final class fyh {
    public final uyg a;
    public final int b;
    public final int c;

    public fyh(uyg uygVar, int i, int i2) {
        this.a = uygVar;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fyh)) {
            return false;
        }
        fyh fyhVar = (fyh) obj;
        return this.a.equals(fyhVar.a) && this.b == fyhVar.b && this.c == fyhVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + rfp.c(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "";
    }
}
