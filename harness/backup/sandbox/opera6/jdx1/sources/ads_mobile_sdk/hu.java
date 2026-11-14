package ads_mobile_sdk;

import defpackage.dko;
import defpackage.flp;

/* loaded from: classes.dex */
public final class hu extends ku0 {
    private static final hu DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    private int bitField0_;
    private String releaseVersion_ = "";
    private flp plugins_ = am2.e;

    static {
        hu huVar = new hu();
        DEFAULT_INSTANCE = huVar;
        ku0.a(hu.class, huVar);
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i, ku0 ku0Var) {
        int iA = zwg.a(i);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new zq2(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"bitField0_", "releaseVersion_", "plugins_", fu.class});
        }
        if (iA == 3) {
            return new hu();
        }
        if (iA == 4) {
            return new dko(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(hu.class);
        }
        throw null;
    }
}
