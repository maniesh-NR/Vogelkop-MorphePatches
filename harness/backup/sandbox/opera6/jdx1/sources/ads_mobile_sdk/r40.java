package ads_mobile_sdk;

import defpackage.map;

/* loaded from: classes.dex */
public final class r40 extends ku0 {
    private static final r40 DEFAULT_INSTANCE;
    public static final int c = 1;
    private int bitField0_;
    private hr sha256_ = hr.b;

    static {
        r40 r40Var = new r40();
        DEFAULT_INSTANCE = r40Var;
        ku0.a(r40.class, r40Var);
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i, ku0 ku0Var) {
        int iA = zwg.a(i);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new zq2(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"bitField0_", "sha256_"});
        }
        if (iA == 3) {
            return new r40();
        }
        if (iA == 4) {
            return new map(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(r40.class);
        }
        throw null;
    }
}
