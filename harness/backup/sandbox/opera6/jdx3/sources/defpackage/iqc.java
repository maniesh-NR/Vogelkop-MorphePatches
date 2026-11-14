package defpackage;

/* loaded from: classes.dex */
public final class iqc extends tc2 {
    public final long b;

    public iqc(long j) {
        super(true);
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iqc) && this.b == ((iqc) obj).b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b);
    }

    public final String toString() {
        return "";
    }
}
