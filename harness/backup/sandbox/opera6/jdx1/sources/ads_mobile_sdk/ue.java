package ads_mobile_sdk;

import defpackage.pgp;

/* loaded from: classes.dex */
public final class ue extends ku0 {
    private static final ue DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    private int eventType_;
    private long timestampMs_;

    static {
        ue ueVar = new ue();
        DEFAULT_INSTANCE = ueVar;
        ku0.a(ue.class, ueVar);
    }

    public static pgp o() {
        return (pgp) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i, ku0 ku0Var) {
        int iA = zwg.a(i);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new zq2(DEFAULT_INSTANCE, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u0002", new Object[]{"eventType_", "timestampMs_"});
        }
        if (iA == 3) {
            return new ue();
        }
        if (iA == 4) {
            return new pgp(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(ue.class);
        }
        throw null;
    }
}
