package defpackage;

/* loaded from: classes.dex */
public final class h26 extends wxe {
    public final wz0 m;

    public h26(wz0 wz0Var) {
        this.m = wz0Var;
    }

    @Override // defpackage.wxe
    public final int g(int i, int i2, d2c d2cVar, ifg ifgVar, int i3) {
        int iW = ifgVar.W(this.m.a);
        if (iW == Integer.MIN_VALUE) {
            return 0;
        }
        int i4 = i3 - iW;
        return d2cVar == d2c.b ? (i - i2) - i4 : i4;
    }

    @Override // defpackage.wxe
    public final Integer i(ifg ifgVar) {
        return Integer.valueOf(ifgVar.W(this.m.a));
    }
}
