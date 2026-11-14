package ads_mobile_sdk;

import defpackage.xlp;

/* loaded from: classes.dex */
public final class c40 extends ku0 {
    private static final c40 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    private int bitField0_;
    private int tokenSource_;
    private long tokenTimeMsec_;
    private hr tokenValue_ = hr.b;

    static {
        c40 c40Var = new c40();
        DEFAULT_INSTANCE = c40Var;
        ku0.a(c40.class, c40Var);
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i, ku0 ku0Var) {
        int iA = zwg.a(i);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new zq2(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001\u0003ည\u0002", new Object[]{"bitField0_", "tokenSource_", ad.a$1, "tokenTimeMsec_", "tokenValue_"});
        }
        if (iA == 3) {
            return new c40();
        }
        if (iA == 4) {
            return new xlp(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(c40.class);
        }
        throw null;
    }
}
