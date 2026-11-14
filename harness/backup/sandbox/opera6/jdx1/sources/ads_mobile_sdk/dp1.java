package ads_mobile_sdk;

import defpackage.flp;
import defpackage.vso;

/* loaded from: classes.dex */
public final class dp1 extends ku0 {
    private static final dp1 DEFAULT_INSTANCE;
    public static final int c = 1;
    private flp adNetworkInfo_ = am2.e;

    static {
        dp1 dp1Var = new dp1();
        DEFAULT_INSTANCE = dp1Var;
        ku0.a(dp1.class, dp1Var);
    }

    public static dp1 p() {
        return DEFAULT_INSTANCE;
    }

    public static vso q() {
        return (vso) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i, ku0 ku0Var) {
        int iA = zwg.a(i);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new zq2(DEFAULT_INSTANCE, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"adNetworkInfo_", yn1.class});
        }
        if (iA == 3) {
            return new dp1();
        }
        if (iA == 4) {
            return new vso(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(dp1.class);
        }
        throw null;
    }

    public final flp o() {
        return this.adNetworkInfo_;
    }
}
