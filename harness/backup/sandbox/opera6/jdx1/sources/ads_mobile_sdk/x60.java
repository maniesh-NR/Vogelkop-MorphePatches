package ads_mobile_sdk;

import defpackage.map;

/* loaded from: classes.dex */
public final class x60 extends ku0 {
    private static final x60 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    private int bitField0_;
    private String name_ = "";
    private String value_ = "";

    static {
        x60 x60Var = new x60();
        DEFAULT_INSTANCE = x60Var;
        ku0.a(x60.class, x60Var);
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i, ku0 ku0Var) {
        int iA = zwg.a(i);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new zq2(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"bitField0_", "name_", "value_"});
        }
        if (iA == 3) {
            return new x60();
        }
        if (iA == 4) {
            return new map(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(x60.class);
        }
        throw null;
    }
}
