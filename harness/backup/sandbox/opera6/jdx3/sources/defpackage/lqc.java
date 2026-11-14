package defpackage;

/* loaded from: classes.dex */
public final class lqc extends tc2 {
    public final long b;

    public lqc(long j) {
        super(true);
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lqc) && this.b == ((lqc) obj).b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b);
    }

    public final String toString() {
        return "";
    }
}
