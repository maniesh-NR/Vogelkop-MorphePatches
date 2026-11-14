package ads_mobile_sdk;

import defpackage.map;

/* loaded from: classes.dex */
public final class u60 extends ku0 {
    private static final u60 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    private int bitField0_;
    private String postData_ = "";
    private int warningType_;

    static {
        u60 u60Var = new u60();
        DEFAULT_INSTANCE = u60Var;
        ku0.a(u60.class, u60Var);
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i, ku0 ku0Var) {
        int iA = zwg.a(i);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new zq2(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"bitField0_", "warningType_", st.a$2, "postData_"});
        }
        if (iA == 3) {
            return new u60();
        }
        if (iA == 4) {
            return new map(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(u60.class);
        }
        throw null;
    }
}
