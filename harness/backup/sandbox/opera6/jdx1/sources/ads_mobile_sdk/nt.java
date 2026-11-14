package ads_mobile_sdk;

import defpackage.map;

/* loaded from: classes.dex */
public final class nt extends ku0 {
    private static final nt DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    private String baseId_ = "";
    private int bitField0_;
    private int type_;

    static {
        nt ntVar = new nt();
        DEFAULT_INSTANCE = ntVar;
        ku0.a(nt.class, ntVar);
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i, ku0 ku0Var) {
        int iA = zwg.a(i);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new zq2(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001", new Object[]{"bitField0_", "baseId_", "type_", ad.a$6});
        }
        if (iA == 3) {
            return new nt();
        }
        if (iA == 4) {
            return new map(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(nt.class);
        }
        throw null;
    }
}
