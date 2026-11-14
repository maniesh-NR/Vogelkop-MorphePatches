package defpackage;

/* loaded from: classes.dex */
public final class nt3 implements Comparable {
    public final int a;
    public final int b;
    public final int c;

    public nt3(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        nt3 nt3Var = (nt3) obj;
        int i = nt3Var.a;
        int i2 = this.a;
        if (i2 < i) {
            return -1;
        }
        if (i2 > i) {
            return 1;
        }
        int i3 = nt3Var.b;
        int i4 = this.b;
        if (i4 < i3) {
            return -1;
        }
        if (i4 > i3) {
            return 1;
        }
        int i5 = nt3Var.c;
        int i6 = this.c;
        if (i6 < i5) {
            return -1;
        }
        return i6 > i5 ? 1 : 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nt3)) {
            return false;
        }
        nt3 nt3Var = (nt3) obj;
        return this.a == nt3Var.a && this.b == nt3Var.b && this.c == nt3Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + rfp.c(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return "";
    }
}
