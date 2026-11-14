package defpackage;

/* loaded from: classes.dex */
public final class yt8 {
    public final boolean a;
    public final boolean b;

    public yt8(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yt8)) {
            return false;
        }
        yt8 yt8Var = (yt8) obj;
        return this.a == yt8Var.a && this.b == yt8Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "";
    }
}
