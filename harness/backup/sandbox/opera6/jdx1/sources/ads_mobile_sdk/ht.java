package ads_mobile_sdk;

import defpackage.dko;

/* loaded from: classes.dex */
public final class ht extends ku0 {
    private static final ht DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    private int bitField0_;
    private String downloadPath_ = "";
    private boolean meteredAllowed_;
    private boolean roamingAllowed_;

    static {
        ht htVar = new ht();
        DEFAULT_INSTANCE = htVar;
        ku0.a(ht.class, htVar);
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i, ku0 ku0Var) {
        int iA = zwg.a(i);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new zq2(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002", new Object[]{"bitField0_", "downloadPath_", "meteredAllowed_", "roamingAllowed_"});
        }
        if (iA == 3) {
            return new ht();
        }
        if (iA == 4) {
            return new dko(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(ht.class);
        }
        throw null;
    }
}
