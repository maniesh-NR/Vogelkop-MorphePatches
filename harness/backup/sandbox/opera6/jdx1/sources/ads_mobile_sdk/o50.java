package ads_mobile_sdk;

import defpackage.map;

/* loaded from: classes.dex */
public final class o50 extends ku0 {
    private static final o50 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    private int bitField0_;
    private long displayDurationSec_;
    private String origin_ = "";

    static {
        o50 o50Var = new o50();
        DEFAULT_INSTANCE = o50Var;
        ku0.a(o50.class, o50Var);
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i, ku0 ku0Var) {
        int iA = zwg.a(i);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new zq2(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"bitField0_", "origin_", "displayDurationSec_"});
        }
        if (iA == 3) {
            return new o50();
        }
        if (iA == 4) {
            return new map(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(o50.class);
        }
        throw null;
    }
}
