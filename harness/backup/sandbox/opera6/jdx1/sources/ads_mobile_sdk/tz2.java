package ads_mobile_sdk;

import defpackage.flp;
import defpackage.map;

/* loaded from: classes.dex */
public final class tz2 extends ku0 {
    private static final tz2 DEFAULT_INSTANCE;
    public static final int c = 1;
    private flp evictions_ = am2.e;

    static {
        tz2 tz2Var = new tz2();
        DEFAULT_INSTANCE = tz2Var;
        ku0.a(tz2.class, tz2Var);
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i, ku0 ku0Var) {
        int iA = zwg.a(i);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new zq2(DEFAULT_INSTANCE, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"evictions_", rz2.class});
        }
        if (iA == 3) {
            return new tz2();
        }
        if (iA == 4) {
            return new map(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(tz2.class);
        }
        throw null;
    }
}
