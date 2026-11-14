package ads_mobile_sdk;

import defpackage.dko;

/* loaded from: classes.dex */
public final class kd extends ku0 {
    private static final kd DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    private int bitField0_;
    private long mediaVolume_ = -1;
    private int isDndMode_ = 1000;

    static {
        kd kdVar = new kd();
        DEFAULT_INSTANCE = kdVar;
        ku0.a(kd.class, kdVar);
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i, ku0 ku0Var) {
        int iA = zwg.a(i);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new zq2(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002᠌\u0001", new Object[]{"bitField0_", "mediaVolume_", "isDndMode_", ad.a$2});
        }
        if (iA == 3) {
            return new kd();
        }
        if (iA == 4) {
            return new dko(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(kd.class);
        }
        throw null;
    }
}
