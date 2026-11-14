package ads_mobile_sdk;

import defpackage.zmp;

/* loaded from: classes.dex */
public final class zw1 extends ku0 {
    private static final zw1 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    private int bitField0_;
    private boolean clickToExpandRequested_;
    private boolean customControlsRequested_;
    private boolean startMuted_;

    static {
        zw1 zw1Var = new zw1();
        DEFAULT_INSTANCE = zw1Var;
        ku0.a(zw1.class, zw1Var);
    }

    public static zmp o() {
        return (zmp) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i, ku0 ku0Var) {
        int iA = zwg.a(i);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new zq2(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002", new Object[]{"bitField0_", "startMuted_", "clickToExpandRequested_", "customControlsRequested_"});
        }
        if (iA == 3) {
            return new zw1();
        }
        if (iA == 4) {
            return new zmp(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(zw1.class);
        }
        throw null;
    }
}
