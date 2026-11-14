package ads_mobile_sdk;

import defpackage.gjp;

/* loaded from: classes.dex */
public final class vc extends ku0 {
    private static final vc DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    private int bitField0_;
    private long source_ = -1;
    private int isPhysicalInput_ = 1000;
    private int verified_ = 1000;

    static {
        vc vcVar = new vc();
        DEFAULT_INSTANCE = vcVar;
        ku0.a(vc.class, vcVar);
    }

    public static gjp o() {
        return (gjp) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i, ku0 ku0Var) {
        int iA = zwg.a(i);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            ad adVar = ad.a$2;
            return new zq2(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"bitField0_", "source_", "isPhysicalInput_", adVar, "verified_", adVar});
        }
        if (iA == 3) {
            return new vc();
        }
        if (iA == 4) {
            return new gjp(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(vc.class);
        }
        throw null;
    }
}
