package ads_mobile_sdk;

import defpackage.dko;

/* loaded from: classes.dex */
public final class e70 extends ku0 {
    private static final e70 DEFAULT_INSTANCE;
    public static final int c = 1;
    private int bitField0_;
    private String url_ = "";

    static {
        e70 e70Var = new e70();
        DEFAULT_INSTANCE = e70Var;
        ku0.a(e70.class, e70Var);
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i, ku0 ku0Var) {
        int iA = zwg.a(i);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new zq2(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"bitField0_", "url_"});
        }
        if (iA == 3) {
            return new e70();
        }
        if (iA == 4) {
            return new dko(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(e70.class);
        }
        throw null;
    }
}
