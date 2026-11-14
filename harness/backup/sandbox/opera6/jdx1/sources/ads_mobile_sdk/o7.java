package ads_mobile_sdk;

import defpackage.gip;
import defpackage.hcp;

/* loaded from: classes.dex */
public final class o7 extends ku0 {
    private static final o7 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    private int binaryName_;
    private int bitField0_;
    private int selectedExperimentIdsMemoizedSerializedSize = -1;
    private String versionNumber_ = "";
    private gip selectedExperimentIds_ = qb1.e;

    static {
        o7 o7Var = new o7();
        DEFAULT_INSTANCE = o7Var;
        ku0.a(o7.class, o7Var);
    }

    public static hcp o() {
        return (hcp) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i, ku0 ku0Var) {
        int iA = zwg.a(i);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new zq2(DEFAULT_INSTANCE, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဌ\u0000\u0002ለ\u0001\u0003'", new Object[]{"bitField0_", "binaryName_", "versionNumber_", "selectedExperimentIds_"});
        }
        if (iA == 3) {
            return new o7();
        }
        if (iA == 4) {
            return new hcp(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(o7.class);
        }
        throw null;
    }
}
