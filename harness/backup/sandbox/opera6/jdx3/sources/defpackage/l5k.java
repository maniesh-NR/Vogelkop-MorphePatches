package defpackage;

/* loaded from: classes.dex */
public final class l5k {
    public final int a;
    public final int b;

    public l5k(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l5k)) {
            return false;
        }
        l5k l5kVar = (l5k) obj;
        return this.a == l5kVar.a && this.b == l5kVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "";
    }
}
