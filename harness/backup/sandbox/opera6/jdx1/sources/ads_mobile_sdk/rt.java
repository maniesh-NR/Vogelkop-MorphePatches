package ads_mobile_sdk;

import defpackage.gip;
import defpackage.map;

/* loaded from: classes.dex */
public final class rt extends ku0 {
    private static final rt DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    private int bitField0_;
    private String encodingVersion_ = "";
    private gip activeBlobIndex_ = qb1.e;

    static {
        rt rtVar = new rt();
        DEFAULT_INSTANCE = rtVar;
        ku0.a(rt.class, rtVar);
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i, ku0 ku0Var) {
        int iA = zwg.a(i);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new zq2(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u0016", new Object[]{"bitField0_", "encodingVersion_", "activeBlobIndex_"});
        }
        if (iA == 3) {
            return new rt();
        }
        if (iA == 4) {
            return new map(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(rt.class);
        }
        throw null;
    }
}
