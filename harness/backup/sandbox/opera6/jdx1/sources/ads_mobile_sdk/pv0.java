package ads_mobile_sdk;

import defpackage.kdp;

/* loaded from: classes.dex */
public final class pv0 extends ku0 {
    private static final pv0 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    private int count_;
    private int format_;

    static {
        pv0 pv0Var = new pv0();
        DEFAULT_INSTANCE = pv0Var;
        ku0.a(pv0.class, pv0Var);
    }

    public static kdp o() {
        return (kdp) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i, ku0 ku0Var) {
        int iA = zwg.a(i);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new zq2(DEFAULT_INSTANCE, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u0004", new Object[]{"format_", "count_"});
        }
        if (iA == 3) {
            return new pv0();
        }
        if (iA == 4) {
            return new kdp(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(pv0.class);
        }
        throw null;
    }
}
