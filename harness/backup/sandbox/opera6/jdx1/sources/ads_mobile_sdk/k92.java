package ads_mobile_sdk;

import defpackage.dko;

/* loaded from: classes.dex */
public final class k92 extends ku0 {
    private static final k92 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    private int bitField0_;
    private long expirationTimestampMs_;
    private long generationTimestampMs_;
    private hr signature_ = hr.b;
    private um3 vmId_;

    static {
        k92 k92Var = new k92();
        DEFAULT_INSTANCE = k92Var;
        ku0.a(k92.class, k92Var);
    }

    public static k92 o() {
        return DEFAULT_INSTANCE;
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i, ku0 ku0Var) {
        int iA = zwg.a(i);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new zq2(DEFAULT_INSTANCE, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"bitField0_", "vmId_", "signature_", "generationTimestampMs_", "expirationTimestampMs_"});
        }
        if (iA == 3) {
            return new k92();
        }
        if (iA == 4) {
            return new dko(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(k92.class);
        }
        throw null;
    }

    public final long p() {
        return this.expirationTimestampMs_;
    }

    public final hr q() {
        return this.signature_;
    }

    public final um3 r() {
        um3 um3Var = this.vmId_;
        return um3Var == null ? um3.o() : um3Var;
    }
}
