package defpackage;

/* loaded from: classes.dex */
public final class qnj extends onj {
    public final String a;
    public final lnj b;

    public qnj(String str, lnj lnjVar) {
        this.a = str;
        this.b = lnjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qnj)) {
            return false;
        }
        qnj qnjVar = (qnj) obj;
        return this.a.equals(qnjVar.a) && this.b.equals(qnjVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "";
    }
}
