package ads_mobile_sdk;

import defpackage.q3p;

/* loaded from: classes.dex */
public final class iq1 extends ku0 {
    private static final iq1 DEFAULT_INSTANCE;
    public static final int c = 1;
    private String action_ = "";

    static {
        iq1 iq1Var = new iq1();
        DEFAULT_INSTANCE = iq1Var;
        ku0.a(iq1.class, iq1Var);
    }

    public static q3p o() {
        return (q3p) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i, ku0 ku0Var) {
        int iA = zwg.a(i);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new zq2(DEFAULT_INSTANCE, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"action_"});
        }
        if (iA == 3) {
            return new iq1();
        }
        if (iA == 4) {
            return new q3p(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(iq1.class);
        }
        throw null;
    }

    public final void b(String str) {
        this.action_ = str;
    }
}
