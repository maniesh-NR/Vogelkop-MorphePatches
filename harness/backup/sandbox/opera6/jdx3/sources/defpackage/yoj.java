package defpackage;

/* loaded from: classes.dex */
public final class yoj {
    public final boolean a;

    public yoj(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yoj) && this.a == ((yoj) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return "";
    }
}
