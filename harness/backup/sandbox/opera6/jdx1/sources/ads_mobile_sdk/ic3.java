package ads_mobile_sdk;

import defpackage.dko;

/* loaded from: classes.dex */
public final class ic3 extends ku0 {
    private static final ic3 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    private int requiredScreenHoldSec_;
    private int settleCount_;
    private boolean settleEndDueToAppBackground_;
    private int videoAutoplayStartTime_;

    static {
        ic3 ic3Var = new ic3();
        DEFAULT_INSTANCE = ic3Var;
        ku0.a(ic3.class, ic3Var);
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i, ku0 ku0Var) {
        int iA = zwg.a(i);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new zq2(DEFAULT_INSTANCE, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\f\u0004\u0007", new Object[]{"settleCount_", "requiredScreenHoldSec_", "videoAutoplayStartTime_", "settleEndDueToAppBackground_"});
        }
        if (iA == 3) {
            return new ic3();
        }
        if (iA == 4) {
            return new dko(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(ic3.class);
        }
        throw null;
    }
}
