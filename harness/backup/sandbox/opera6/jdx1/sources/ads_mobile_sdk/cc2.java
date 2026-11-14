package ads_mobile_sdk;

import defpackage.snp;

/* loaded from: classes.dex */
public final class cc2 extends ku0 {
    private static final cc2 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    private int bitField0_;
    private int clearReason_;
    private int fillDisabledReason_;
    private int numAdsCleared_;

    static {
        cc2 cc2Var = new cc2();
        DEFAULT_INSTANCE = cc2Var;
        ku0.a(cc2.class, cc2Var);
    }

    public static snp o() {
        return (snp) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i, ku0 ku0Var) {
        int iA = zwg.a(i);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new zq2(DEFAULT_INSTANCE, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001\u0003ဌ\u0002", new Object[]{"bitField0_", "clearReason_", "numAdsCleared_", "fillDisabledReason_"});
        }
        if (iA == 3) {
            return new cc2();
        }
        if (iA == 4) {
            return new snp(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(cc2.class);
        }
        throw null;
    }
}
