package ads_mobile_sdk;

import defpackage.dko;

/* loaded from: classes.dex */
public final class i92 extends ku0 {
    private static final i92 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    private int bitField0_;
    private hr encryptedProgram_ = hr.b;
    private k92 metadata_;

    static {
        i92 i92Var = new i92();
        DEFAULT_INSTANCE = i92Var;
        ku0.a(i92.class, i92Var);
    }

    public static i92 o() {
        return DEFAULT_INSTANCE;
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i, ku0 ku0Var) {
        int iA = zwg.a(i);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new zq2(DEFAULT_INSTANCE, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001", new Object[]{"bitField0_", "metadata_", "encryptedProgram_"});
        }
        if (iA == 3) {
            return new i92();
        }
        if (iA == 4) {
            return new dko(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(i92.class);
        }
        throw null;
    }

    public final hr p() {
        return this.encryptedProgram_;
    }

    public final k92 q() {
        k92 k92Var = this.metadata_;
        return k92Var == null ? k92.o() : k92Var;
    }

    public final boolean r() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean s() {
        return (this.bitField0_ & 1) != 0;
    }
}
