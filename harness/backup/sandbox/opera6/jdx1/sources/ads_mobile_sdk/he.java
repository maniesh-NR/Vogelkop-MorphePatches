package ads_mobile_sdk;

import defpackage.dko;

/* loaded from: classes.dex */
public final class he extends ku0 {
    private static final he DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 3;
    public static final int e = 4;
    private int bitField0_;
    private long timestampMs_;
    private String keyIdentifier_ = "";
    private hr encryptedAdAttestationStatemement_ = hr.b;

    static {
        he heVar = new he();
        DEFAULT_INSTANCE = heVar;
        ku0.a(he.class, heVar);
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i, ku0 ku0Var) {
        int iA = zwg.a(i);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new zq2(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0003ဈ\u0001\u0004ည\u0002", new Object[]{"bitField0_", "timestampMs_", "keyIdentifier_", "encryptedAdAttestationStatemement_"});
        }
        if (iA == 3) {
            return new he();
        }
        if (iA == 4) {
            return new dko(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(he.class);
        }
        throw null;
    }

    public final hr o() {
        return this.encryptedAdAttestationStatemement_;
    }

    public final String p() {
        return this.keyIdentifier_;
    }

    public final long q() {
        return this.timestampMs_;
    }

    public final boolean r() {
        return (this.bitField0_ & 4) != 0;
    }

    public final boolean s() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean t() {
        return (this.bitField0_ & 1) != 0;
    }
}
