package ads_mobile_sdk;

import defpackage.map;

/* loaded from: classes.dex */
public final class tc extends ku0 {
    private static final tc DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    private int bitField0_;
    private int frontCamera_ = 1000;
    private int rearCamera_ = 1000;
    private int frontFlash_ = 1000;
    private int rearFlash_ = 1000;

    static {
        tc tcVar = new tc();
        DEFAULT_INSTANCE = tcVar;
        ku0.a(tc.class, tcVar);
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i, ku0 ku0Var) {
        int iA = zwg.a(i);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            ad adVar = ad.a$2;
            return new zq2(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004᠌\u0003", new Object[]{"bitField0_", "frontCamera_", adVar, "rearCamera_", adVar, "frontFlash_", adVar, "rearFlash_", adVar});
        }
        if (iA == 3) {
            return new tc();
        }
        if (iA == 4) {
            return new map(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(tc.class);
        }
        throw null;
    }
}
