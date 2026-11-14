package ads_mobile_sdk;

import defpackage.dko;

/* loaded from: classes.dex */
public final class kl2 extends ku0 {
    private static final kl2 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    public static final int g = 5;
    private int bitField0_;
    private long downloadTimestampSecs_;
    private long expiredTimestampSecs_;
    private long expiryPeriodSecs_;
    private String vmChecksum_ = "";
    private String bytecodeChecksum_ = "";

    static {
        kl2 kl2Var = new kl2();
        DEFAULT_INSTANCE = kl2Var;
        ku0.a(kl2.class, kl2Var);
    }

    public static kl2 p() {
        return DEFAULT_INSTANCE;
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i, ku0 ku0Var) {
        int iA = zwg.a(i);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new zq2(DEFAULT_INSTANCE, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဃ\u0002\u0004ဃ\u0003\u0005ဃ\u0004", new Object[]{"bitField0_", "vmChecksum_", "bytecodeChecksum_", "expiredTimestampSecs_", "downloadTimestampSecs_", "expiryPeriodSecs_"});
        }
        if (iA == 3) {
            return new kl2();
        }
        if (iA == 4) {
            return new dko(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(kl2.class);
        }
        throw null;
    }

    public final String o() {
        return this.bytecodeChecksum_;
    }

    public final long q() {
        return this.expiredTimestampSecs_;
    }

    public final String r() {
        return this.vmChecksum_;
    }
}
