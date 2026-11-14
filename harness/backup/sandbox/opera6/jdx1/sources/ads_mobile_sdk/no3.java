package ads_mobile_sdk;

import defpackage.flp;
import defpackage.mbp;

/* loaded from: classes.dex */
public final class no3 extends ku0 {
    private static final no3 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    public static final int g = 5;
    private flp blockedStartupLocations_;
    private long maxTimePerTaskInUiThreadMs_;
    private flp nonUiThreadBlockingStartupLocations_;
    private long totalTimeInUiThreadMs_;
    private flp uiThreadBlockingStartupLocations_;

    static {
        no3 no3Var = new no3();
        DEFAULT_INSTANCE = no3Var;
        ku0.a(no3.class, no3Var);
    }

    public no3() {
        am2 am2Var = am2.e;
        this.blockedStartupLocations_ = am2Var;
        this.nonUiThreadBlockingStartupLocations_ = am2Var;
        this.uiThreadBlockingStartupLocations_ = am2Var;
    }

    public static mbp o() {
        return (mbp) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i, ku0 ku0Var) {
        int iA = zwg.a(i);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new zq2(DEFAULT_INSTANCE, "\u0004\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0003\u0000\u0001\u0002\u0002\u0002\u0003Ț\u0004Ț\u0005Ț", new Object[]{"totalTimeInUiThreadMs_", "maxTimePerTaskInUiThreadMs_", "blockedStartupLocations_", "nonUiThreadBlockingStartupLocations_", "uiThreadBlockingStartupLocations_"});
        }
        if (iA == 3) {
            return new no3();
        }
        if (iA == 4) {
            return new mbp(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(no3.class);
        }
        throw null;
    }
}
