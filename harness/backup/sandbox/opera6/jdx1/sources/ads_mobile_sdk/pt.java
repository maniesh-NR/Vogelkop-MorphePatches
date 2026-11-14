package ads_mobile_sdk;

import defpackage.map;

/* loaded from: classes.dex */
public final class pt extends ku0 {
    private static final pt DEFAULT_INSTANCE;
    public static final int c = 1;
    private int bitField0_;
    private nt increment_;

    static {
        pt ptVar = new pt();
        DEFAULT_INSTANCE = ptVar;
        ku0.a(pt.class, ptVar);
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i, ku0 ku0Var) {
        int iA = zwg.a(i);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new zq2(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "increment_"});
        }
        if (iA == 3) {
            return new pt();
        }
        if (iA == 4) {
            return new map(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(pt.class);
        }
        throw null;
    }
}
