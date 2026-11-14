package ads_mobile_sdk;

import defpackage.dko;

/* loaded from: classes.dex */
public final class lc extends ku0 {
    private static final lc DEFAULT_INSTANCE;
    public static final int c = 1;
    private int bitField0_;
    private int function_;

    static {
        lc lcVar = new lc();
        DEFAULT_INSTANCE = lcVar;
        ku0.a(lc.class, lcVar);
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i, ku0 ku0Var) {
        int iA = zwg.a(i);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new zq2(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"bitField0_", "function_", ad.a$28});
        }
        if (iA == 3) {
            return new lc();
        }
        if (iA == 4) {
            return new dko(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(lc.class);
        }
        throw null;
    }
}
