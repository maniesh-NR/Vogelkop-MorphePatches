package ads_mobile_sdk;

import defpackage.dko;

/* loaded from: classes.dex */
public final class je extends ku0 {
    private static final je DEFAULT_INSTANCE;
    public static final int c = 1;
    private int bitField0_;
    private String requestToken_ = "";

    static {
        je jeVar = new je();
        DEFAULT_INSTANCE = jeVar;
        ku0.a(je.class, jeVar);
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i, ku0 ku0Var) {
        int iA = zwg.a(i);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new zq2(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"bitField0_", "requestToken_"});
        }
        if (iA == 3) {
            return new je();
        }
        if (iA == 4) {
            return new dko(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(je.class);
        }
        throw null;
    }
}
