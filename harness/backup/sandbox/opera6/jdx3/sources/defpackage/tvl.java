package defpackage;

/* loaded from: classes.dex */
public final class tvl {
    public final float a;
    public final float b;
    public final int c;
    public final int d;

    public tvl(float f, float f2, int i, int i2) {
        this.a = f;
        this.b = f2;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tvl)) {
            return false;
        }
        tvl tvlVar = (tvl) obj;
        return Float.compare(this.a, tvlVar.a) == 0 && Float.compare(this.b, tvlVar.b) == 0 && this.c == tvlVar.c && this.d == tvlVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + rfp.c(this.c, sko.d(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return "";
    }
}
