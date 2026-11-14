package ads_mobile_sdk;

import defpackage.flp;
import defpackage.map;

/* loaded from: classes.dex */
public final class ym3 extends ku0 {
    private static final ym3 DEFAULT_INSTANCE;
    public static final int c = 1;
    private flp apiCompats_ = am2.e;

    static {
        ym3 ym3Var = new ym3();
        DEFAULT_INSTANCE = ym3Var;
        ku0.a(ym3.class, ym3Var);
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i, ku0 ku0Var) {
        int iA = zwg.a(i);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new zq2(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"apiCompats_", wm3.class});
        }
        if (iA == 3) {
            return new ym3();
        }
        if (iA == 4) {
            return new map(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(ym3.class);
        }
        throw null;
    }
}
