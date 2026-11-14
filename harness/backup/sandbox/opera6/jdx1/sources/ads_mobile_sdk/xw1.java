package ads_mobile_sdk;

import defpackage.xkp;

/* loaded from: classes.dex */
public final class xw1 extends ku0 {
    private static final xw1 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    private int bitField0_;
    private int sccgDir_;
    private boolean sccgTap_;

    static {
        xw1 xw1Var = new xw1();
        DEFAULT_INSTANCE = xw1Var;
        ku0.a(xw1.class, xw1Var);
    }

    public static xkp o() {
        return (xkp) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i, ku0 ku0Var) {
        int iA = zwg.a(i);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new zq2(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001", new Object[]{"bitField0_", "sccgDir_", "sccgTap_"});
        }
        if (iA == 3) {
            return new xw1();
        }
        if (iA == 4) {
            return new xkp(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(xw1.class);
        }
        throw null;
    }
}
