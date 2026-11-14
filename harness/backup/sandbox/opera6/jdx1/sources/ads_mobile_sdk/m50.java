package ads_mobile_sdk;

import defpackage.dko;

/* loaded from: classes.dex */
public final class m50 extends ku0 {
    private static final m50 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    private int bitField0_;
    private long firstInteractionTimestampMsec_;
    private long lastInteractionTimestampMsec_;
    private int occurrenceCount_;
    private int securityInterstitialInteraction_;

    static {
        m50 m50Var = new m50();
        DEFAULT_INSTANCE = m50Var;
        ku0.a(m50.class, m50Var);
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i, ku0 ku0Var) {
        int iA = zwg.a(i);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new zq2(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"bitField0_", "securityInterstitialInteraction_", ad.a$18, "occurrenceCount_", "firstInteractionTimestampMsec_", "lastInteractionTimestampMsec_"});
        }
        if (iA == 3) {
            return new m50();
        }
        if (iA == 4) {
            return new dko(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(m50.class);
        }
        throw null;
    }
}
