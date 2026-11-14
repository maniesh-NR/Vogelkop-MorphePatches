package defpackage;

/* loaded from: classes.dex */
public final class n2f {
    public final boolean a;
    public final boolean b;

    public n2f(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n2f)) {
            return false;
        }
        n2f n2fVar = (n2f) obj;
        return this.a == n2fVar.a && this.b == n2fVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "";
    }
}
