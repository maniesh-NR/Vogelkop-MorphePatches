package defpackage;

/* loaded from: classes.dex */
public final class r52 {
    public final long a;
    public final boolean b;

    public r52(long j, boolean z) {
        this.a = j;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r52)) {
            return false;
        }
        r52 r52Var = (r52) obj;
        return this.a == r52Var.a && this.b == r52Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "";
    }
}
