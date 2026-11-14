package ads_mobile_sdk;

import defpackage.lpo;

/* loaded from: classes.dex */
public final class cg3 extends ku0 {
    private static final cg3 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    private long modelVersion_;
    private long taxonomyVersion_;
    private int topicId_;

    static {
        cg3 cg3Var = new cg3();
        DEFAULT_INSTANCE = cg3Var;
        ku0.a(cg3.class, cg3Var);
    }

    public static lpo o() {
        return (lpo) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i, ku0 ku0Var) {
        int iA = zwg.a(i);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new zq2(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0002\u0003\u0002", new Object[]{"topicId_", "modelVersion_", "taxonomyVersion_"});
        }
        if (iA == 3) {
            return new cg3();
        }
        if (iA == 4) {
            return new lpo(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(cg3.class);
        }
        throw null;
    }
}
