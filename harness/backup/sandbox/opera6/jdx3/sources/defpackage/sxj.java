package defpackage;

/* loaded from: classes.dex */
public final class sxj {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public sxj(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public sxj(int i, int i2, int i3, int i4, int i5) {
        i = (i4 & 1) != 0 ? 0 : i;
        i2 = (i4 & 2) != 0 ? 0 : i2;
        i3 = (i4 & 4) != 0 ? 0 : i3;
        this(i3, i, i3, i2);
    }

    public final int a(boolean z) {
        return z ? this.c : this.a;
    }

    public final int b(boolean z) {
        return z ? this.a : this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sxj)) {
            return false;
        }
        sxj sxjVar = (sxj) obj;
        return this.a == sxjVar.a && this.b == sxjVar.b && this.c == sxjVar.c && this.d == sxjVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + rfp.c(this.c, rfp.c(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return "";
    }
}
