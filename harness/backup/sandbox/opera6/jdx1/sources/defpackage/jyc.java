package defpackage;

/* loaded from: classes.dex */
public final class jyc {
    public final byte a;

    public final boolean equals(Object obj) {
        if (obj instanceof jyc) {
            return this.a == ((jyc) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return fki.r("Lock3ABehavior(value=", this.a, ')');
    }
}
