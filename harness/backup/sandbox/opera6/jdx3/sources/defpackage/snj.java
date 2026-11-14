package defpackage;

/* loaded from: classes.dex */
public final class snj extends onj {
    public final String a;
    public final lnj b;

    public snj(String str, lnj lnjVar) {
        this.a = str;
        this.b = lnjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof snj)) {
            return false;
        }
        snj snjVar = (snj) obj;
        return this.a.equals(snjVar.a) && this.b.equals(snjVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "";
    }
}
