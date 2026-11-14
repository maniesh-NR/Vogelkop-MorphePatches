package ads_mobile_sdk;

import defpackage.dko;

/* loaded from: classes.dex */
public final class jh2 extends ku0 {
    private static final jh2 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    public static final int g = 5;
    public static final int h = 6;
    private boolean cacheHit_;
    private int maxBufferSize_;
    private int numPreloadedAds_;
    private boolean preloadInFlight_;
    private String preloadId_ = "";
    private String evictedAdId_ = "";

    static {
        jh2 jh2Var = new jh2();
        DEFAULT_INSTANCE = jh2Var;
        ku0.a(jh2.class, jh2Var);
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i, ku0 ku0Var) {
        int iA = zwg.a(i);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new zq2(DEFAULT_INSTANCE, "\u0004\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003\u0004\u0004\u0007\u0005Ȉ\u0006\u0007", new Object[]{"preloadId_", "maxBufferSize_", "numPreloadedAds_", "cacheHit_", "evictedAdId_", "preloadInFlight_"});
        }
        if (iA == 3) {
            return new jh2();
        }
        if (iA == 4) {
            return new dko(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(jh2.class);
        }
        throw null;
    }
}
