package ads_mobile_sdk;

import defpackage.dko;
import defpackage.flp;

/* loaded from: classes.dex */
public final class bu extends ku0 {
    private static final bu DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    private int bitField0_;
    private int densityDpi_;
    private int heightPixels_;
    private flp supportedAbi_ = am2.e;
    private int widthPixels_;

    static {
        bu buVar = new bu();
        DEFAULT_INSTANCE = buVar;
        ku0.a(bu.class, buVar);
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i, ku0 ku0Var) {
        int iA = zwg.a(i);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new zq2(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004\u001a", new Object[]{"bitField0_", "densityDpi_", "widthPixels_", "heightPixels_", "supportedAbi_"});
        }
        if (iA == 3) {
            return new bu();
        }
        if (iA == 4) {
            return new dko(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(bu.class);
        }
        throw null;
    }
}
