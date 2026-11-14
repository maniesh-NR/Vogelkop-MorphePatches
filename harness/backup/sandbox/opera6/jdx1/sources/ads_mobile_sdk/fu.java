package ads_mobile_sdk;

import defpackage.dko;

/* loaded from: classes.dex */
public final class fu extends ku0 {
    private static final fu DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    private int bitField0_;
    private int pluginIndex_;
    private String pluginName_ = "";
    private int pluginState_;

    static {
        fu fuVar = new fu();
        DEFAULT_INSTANCE = fuVar;
        ku0.a(fu.class, fuVar);
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i, ku0 ku0Var) {
        int iA = zwg.a(i);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new zq2(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003င\u0002", new Object[]{"bitField0_", "pluginName_", "pluginState_", ad.a$16, "pluginIndex_"});
        }
        if (iA == 3) {
            return new fu();
        }
        if (iA == 4) {
            return new dko(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(fu.class);
        }
        throw null;
    }
}
