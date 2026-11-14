package ads_mobile_sdk;

import defpackage.mcp;

/* loaded from: classes.dex */
public final class od extends ku0 {
    private static final od DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    public static final int g = 5;
    public static final int h = 6;
    public static final int i = 7;
    public static final int j = 8;
    private int bitField0_;
    private long percentAdOnScreen_ = -1;
    private long percentScreenCoveredByAd_ = -1;
    private long minAlphaSignal_ = -1;
    private long viewHeight_ = -1;
    private long viewWidth_ = -1;
    private long displayDensity_ = -1;
    private long estimatedOccludedSurface_ = -1;
    private long scaleFactor_ = -1;

    static {
        od odVar = new od();
        DEFAULT_INSTANCE = odVar;
        ku0.a(od.class, odVar);
    }

    public static mcp o() {
        return (mcp) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i2, ku0 ku0Var) {
        int iA = zwg.a(i2);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new zq2(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007", new Object[]{"bitField0_", "percentAdOnScreen_", "percentScreenCoveredByAd_", "minAlphaSignal_", "viewHeight_", "viewWidth_", "displayDensity_", "estimatedOccludedSurface_", "scaleFactor_"});
        }
        if (iA == 3) {
            return new od();
        }
        if (iA == 4) {
            return new mcp(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(od.class);
        }
        throw null;
    }
}
