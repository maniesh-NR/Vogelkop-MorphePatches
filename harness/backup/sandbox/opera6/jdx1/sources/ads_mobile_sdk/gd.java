package ads_mobile_sdk;

import defpackage.dko;

/* loaded from: classes.dex */
public final class gd extends ku0 {
    private static final gd DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    private int bitField0_;
    private long counter_ = -1;
    private int deviceIdType_;

    static {
        gd gdVar = new gd();
        DEFAULT_INSTANCE = gdVar;
        ku0.a(gd.class, gdVar);
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i, ku0 ku0Var) {
        int iA = zwg.a(i);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new zq2(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001", new Object[]{"bitField0_", "deviceIdType_", ad.a$23, "counter_"});
        }
        if (iA == 3) {
            return new gd();
        }
        if (iA == 4) {
            return new dko(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(gd.class);
        }
        throw null;
    }
}
