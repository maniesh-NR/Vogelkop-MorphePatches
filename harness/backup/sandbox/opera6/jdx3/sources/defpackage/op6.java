package defpackage;

/* loaded from: classes.dex */
public final class op6 {
    public final boolean a;

    public op6(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof op6) && this.a == ((op6) obj).a;
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
