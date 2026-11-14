package ads_mobile_sdk;

import defpackage.dko;

/* loaded from: classes.dex */
public final class hq extends ku0 {
    private static final hq DEFAULT_INSTANCE;
    public static final int c = 1;
    private int bitField0_;
    private int errorType_;

    static {
        hq hqVar = new hq();
        DEFAULT_INSTANCE = hqVar;
        ku0.a(hq.class, hqVar);
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i, ku0 ku0Var) {
        int iA = zwg.a(i);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new zq2(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"bitField0_", "errorType_", ad.a$8});
        }
        if (iA == 3) {
            return new hq();
        }
        if (iA == 4) {
            return new dko(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(hq.class);
        }
        throw null;
    }
}
