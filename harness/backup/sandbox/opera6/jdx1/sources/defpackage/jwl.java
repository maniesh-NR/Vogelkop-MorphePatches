package defpackage;

/* loaded from: classes.dex */
public final class jwl {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof jwl) {
            return this.a == ((jwl) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return fki.r("TorchMode(value=", this.a, ')');
    }
}
