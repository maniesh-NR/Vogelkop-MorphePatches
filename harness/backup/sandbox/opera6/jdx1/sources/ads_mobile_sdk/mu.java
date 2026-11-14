package ads_mobile_sdk;

import defpackage.gip;
import defpackage.qap;

/* loaded from: classes.dex */
public final class mu extends ku0 {
    private static final mu DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    private int binaryName_;
    private int selectedExperimentIdsMemoizedSerializedSize = -1;
    private String versionNumber_ = "";
    private gip selectedExperimentIds_ = qb1.e;

    static {
        mu muVar = new mu();
        DEFAULT_INSTANCE = muVar;
        ku0.a(mu.class, muVar);
    }

    public static qap o() {
        return (qap) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i, ku0 ku0Var) {
        int iA = zwg.a(i);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new zq2(DEFAULT_INSTANCE, "\u0004\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\f\u0002Ȉ\u0003'", new Object[]{"binaryName_", "versionNumber_", "selectedExperimentIds_"});
        }
        if (iA == 3) {
            return new mu();
        }
        if (iA == 4) {
            return new qap(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(mu.class);
        }
        throw null;
    }
}
