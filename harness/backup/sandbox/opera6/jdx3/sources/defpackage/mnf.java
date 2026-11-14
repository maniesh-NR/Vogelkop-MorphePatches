package defpackage;

/* loaded from: classes.dex */
public final class mnf {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public mnf(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mnf)) {
            return false;
        }
        mnf mnfVar = (mnf) obj;
        return this.a == mnfVar.a && this.b == mnfVar.b && this.c == mnfVar.c && this.d == mnfVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + rfp.c(this.c, rfp.c(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return "";
    }
}
