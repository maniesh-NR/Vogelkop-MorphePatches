package ads_mobile_sdk;

import defpackage.gip;
import defpackage.map;

/* loaded from: classes.dex */
public final class wm3 extends ku0 {
    private static final wm3 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    private int bitField0_;
    private String apiName_ = "";
    private gip compatibleSdks_ = qb1.e;

    static {
        wm3 wm3Var = new wm3();
        DEFAULT_INSTANCE = wm3Var;
        ku0.a(wm3.class, wm3Var);
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i, ku0 ku0Var) {
        int iA = zwg.a(i);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new zq2(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u0016", new Object[]{"bitField0_", "apiName_", "compatibleSdks_"});
        }
        if (iA == 3) {
            return new wm3();
        }
        if (iA == 4) {
            return new map(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(wm3.class);
        }
        throw null;
    }
}
