package ads_mobile_sdk;

import defpackage.flp;
import defpackage.kcp;

/* loaded from: classes.dex */
public final class oa extends ku0 {
    private static final oa DEFAULT_INSTANCE;
    public static final int c = 1;
    private flp initializationData_ = am2.e;

    static {
        oa oaVar = new oa();
        DEFAULT_INSTANCE = oaVar;
        ku0.a(oa.class, oaVar);
    }

    public static oa o() {
        return DEFAULT_INSTANCE;
    }

    public static kcp q() {
        return (kcp) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i, ku0 ku0Var) {
        int iA = zwg.a(i);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new zq2(DEFAULT_INSTANCE, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"initializationData_", qa.class});
        }
        if (iA == 3) {
            return new oa();
        }
        if (iA == 4) {
            return new kcp(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(oa.class);
        }
        throw null;
    }

    public final flp p$1() {
        return this.initializationData_;
    }
}
