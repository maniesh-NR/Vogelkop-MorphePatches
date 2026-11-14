package ads_mobile_sdk;

import defpackage.dko;

/* loaded from: classes.dex */
public final class id extends ku0 {
    private static final id DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    private int bitField0_;
    private long screenBrightness_ = -1;
    private long screenBrightnessMode_ = -1;
    private long screenOffTimeout_ = -1;

    static {
        id idVar = new id();
        DEFAULT_INSTANCE = idVar;
        ku0.a(id.class, idVar);
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i, ku0 ku0Var) {
        int iA = zwg.a(i);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new zq2(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"bitField0_", "screenBrightness_", "screenBrightnessMode_", "screenOffTimeout_"});
        }
        if (iA == 3) {
            return new id();
        }
        if (iA == 4) {
            return new dko(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(id.class);
        }
        throw null;
    }
}
