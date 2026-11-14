package ads_mobile_sdk;

import defpackage.dko;

/* loaded from: classes.dex */
public final class m60 extends ku0 {
    private static final m60 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    private int bitField0_;
    private int hashRealtimeThreatType_;
    private int urlRealtimeThreatType_;

    static {
        m60 m60Var = new m60();
        DEFAULT_INSTANCE = m60Var;
        ku0.a(m60.class, m60Var);
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i, ku0 ku0Var) {
        int iA = zwg.a(i);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            ad adVar = ad.a$19;
            return new zq2(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"bitField0_", "hashRealtimeThreatType_", adVar, "urlRealtimeThreatType_", adVar});
        }
        if (iA == 3) {
            return new m60();
        }
        if (iA == 4) {
            return new dko(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(m60.class);
        }
        throw null;
    }
}
