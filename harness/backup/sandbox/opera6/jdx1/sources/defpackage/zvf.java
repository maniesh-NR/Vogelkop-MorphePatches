package defpackage;

/* loaded from: classes.dex */
public final class zvf implements xvf {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public zvf(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        if (!((f >= 0.0f) & (f2 >= 0.0f) & (f3 >= 0.0f)) || !(f4 >= 0.0f)) {
            y7b.a("Padding must be non-negative");
        }
    }

    @Override // defpackage.xvf
    public final float a() {
        return this.d;
    }

    @Override // defpackage.xvf
    public final float b(d2c d2cVar) {
        return d2cVar == d2c.a ? this.a : this.c;
    }

    @Override // defpackage.xvf
    public final float c(d2c d2cVar) {
        return d2cVar == d2c.a ? this.c : this.a;
    }

    @Override // defpackage.xvf
    public final float d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zvf)) {
            return false;
        }
        zvf zvfVar = (zvf) obj;
        return gh7.b(this.a, zvfVar.a) && gh7.b(this.b, zvfVar.b) && gh7.b(this.c, zvfVar.c) && gh7.b(this.d, zvfVar.d);
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + sko.d(this.c, sko.d(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        String strC = gh7.c(this.a);
        String strC2 = gh7.c(this.b);
        return sko.n(z1m.n("PaddingValues(start=", strC, ", top=", strC2, ", end="), gh7.c(this.c), ", bottom=", gh7.c(this.d), ")");
    }
}
