package defpackage;

/* loaded from: classes.dex */
public final class kqc extends tc2 {
    public final long b;
    public final boolean c;

    public kqc(long j, boolean z) {
        super(false);
        this.b = j;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kqc)) {
            return false;
        }
        kqc kqcVar = (kqc) obj;
        return this.b == kqcVar.b && this.c == kqcVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + (Long.hashCode(this.b) * 31);
    }

    public final String toString() {
        return "";
    }
}
