package ads_mobile_sdk;

import defpackage.dso;
import defpackage.flp;

/* loaded from: classes.dex */
public final class d9 extends ku0 {
    private static final d9 DEFAULT_INSTANCE;
    public static final int c = 1;
    private flp adUnitPatterns_ = am2.e;

    static {
        d9 d9Var = new d9();
        DEFAULT_INSTANCE = d9Var;
        ku0.a(d9.class, d9Var);
    }

    public static d9 p() {
        return DEFAULT_INSTANCE;
    }

    public static dso q() {
        return (dso) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i, ku0 ku0Var) {
        int iA = zwg.a(i);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new zq2(DEFAULT_INSTANCE, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"adUnitPatterns_", z8.class});
        }
        if (iA == 3) {
            return new d9();
        }
        if (iA == 4) {
            return new dso(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(d9.class);
        }
        throw null;
    }

    public final flp o() {
        return this.adUnitPatterns_;
    }
}
