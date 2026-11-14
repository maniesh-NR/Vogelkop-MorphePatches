package ads_mobile_sdk;

import defpackage.flp;
import defpackage.map;

/* loaded from: classes.dex */
public final class pl0 extends ku0 {
    private static final pl0 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 4;
    public static final int e = 2;
    public static final int f = 3;
    private int bitField0_;
    private boolean usersMatch_;
    private hr clearBlob_ = hr.b;
    private String clearBlobJs_ = "";
    private flp encryptedBlob_ = am2.e;

    static {
        pl0 pl0Var = new pl0();
        DEFAULT_INSTANCE = pl0Var;
        ku0.a(pl0.class, pl0Var);
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i, ku0 ku0Var) {
        int iA = zwg.a(i);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new zq2(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ည\u0000\u0002\u001c\u0003ဇ\u0002\u0004ဈ\u0001", new Object[]{"bitField0_", "clearBlob_", "encryptedBlob_", "usersMatch_", "clearBlobJs_"});
        }
        if (iA == 3) {
            return new pl0();
        }
        if (iA == 4) {
            return new map(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(pl0.class);
        }
        throw null;
    }
}
