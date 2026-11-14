package ads_mobile_sdk;

import defpackage.xlp;

/* loaded from: classes.dex */
public final class z33 extends ku0 {
    private static final z33 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    private boolean cacheHit_;
    private int retryNumber_;
    private boolean thirdPartyCookiesEnabled_;
    private boolean wasLastSignalUsed_;

    static {
        z33 z33Var = new z33();
        DEFAULT_INSTANCE = z33Var;
        ku0.a(z33.class, z33Var);
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i, ku0 ku0Var) {
        int iA = zwg.a(i);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new zq2(DEFAULT_INSTANCE, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0004\u0002\u0007\u0003\u0007\u0004\u0007", new Object[]{"retryNumber_", "wasLastSignalUsed_", "thirdPartyCookiesEnabled_", "cacheHit_"});
        }
        if (iA == 3) {
            return new z33();
        }
        if (iA == 4) {
            return new xlp(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(z33.class);
        }
        throw null;
    }
}
