package defpackage;

/* loaded from: classes.dex */
public final class ihf {
    public final boolean a;
    public final boolean b;

    public ihf(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ihf)) {
            return false;
        }
        ihf ihfVar = (ihf) obj;
        return this.a == ihfVar.a && this.b == ihfVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "";
    }
}
