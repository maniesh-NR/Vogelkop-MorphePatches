package ads_mobile_sdk;

import defpackage.cep;

/* loaded from: classes.dex */
public final class qq extends ku0 {
    private static final qq DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    private int bitField0_;
    private long major_;
    private long micro_;
    private long minor_;

    static {
        qq qqVar = new qq();
        DEFAULT_INSTANCE = qqVar;
        ku0.a(qq.class, qqVar);
    }

    public static cep o() {
        return (cep) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i, ku0 ku0Var) {
        int iA = zwg.a(i);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new zq2(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဃ\u0000\u0002ဃ\u0001\u0003ဃ\u0002", new Object[]{"bitField0_", "major_", "minor_", "micro_"});
        }
        if (iA == 3) {
            return new qq();
        }
        if (iA == 4) {
            return new cep(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(qq.class);
        }
        throw null;
    }
}
