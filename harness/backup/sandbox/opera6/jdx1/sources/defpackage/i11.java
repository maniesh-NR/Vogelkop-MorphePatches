package defpackage;

/* loaded from: classes.dex */
public final class i11 implements iud {
    public final rd3 a;
    public final rd3 b;

    public i11(rd3 rd3Var, rd3 rd3Var2) {
        this.a = rd3Var;
        this.b = rd3Var2;
    }

    @Override // defpackage.iud
    public final int a(ccb ccbVar, long j, int i, d2c d2cVar) {
        int iA = this.b.a(0, ccbVar.d(), d2cVar);
        int i2 = -this.a.a(0, i, d2cVar);
        d2c d2cVar2 = d2c.a;
        return ccbVar.a + iA + i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i11)) {
            return false;
        }
        i11 i11Var = (i11) obj;
        return this.a.equals(i11Var.a) && this.b.equals(i11Var.b);
    }

    public final int hashCode() {
        return sko.d(this.b.a, Float.hashCode(this.a.a) * 31, 31);
    }

    public final String toString() {
        return "Horizontal(menuAlignment=" + this.a + ", anchorAlignment=" + this.b + ", offset=0)";
    }
}
