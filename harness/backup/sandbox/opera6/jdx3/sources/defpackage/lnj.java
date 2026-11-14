package defpackage;

/* loaded from: classes.dex */
public final class lnj {
    public final mnj a;
    public final long b;

    public lnj(mnj mnjVar, long j) {
        this.a = mnjVar;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lnj)) {
            return false;
        }
        lnj lnjVar = (lnj) obj;
        return this.a == lnjVar.a && this.b == lnjVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "";
    }
}
