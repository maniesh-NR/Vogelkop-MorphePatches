package defpackage;

/* loaded from: classes.dex */
public final class evl {
    public final boolean a;

    public evl(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof evl) && this.a == ((evl) obj).a;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return "";
    }
}
