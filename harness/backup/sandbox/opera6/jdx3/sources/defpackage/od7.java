package defpackage;

/* loaded from: classes.dex */
public final class od7 {
    public final long a;

    public od7(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof od7) && this.a == ((od7) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return "";
    }
}
