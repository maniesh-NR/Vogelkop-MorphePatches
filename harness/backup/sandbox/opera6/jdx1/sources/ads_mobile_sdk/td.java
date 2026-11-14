package ads_mobile_sdk;

import defpackage.lkp;
import defpackage.map;

/* loaded from: classes.dex */
public final class td extends ku0 {
    private static final td DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    private lkp labels_;
    private lkp reasons_;
    private int labelsMemoizedSerializedSize = -1;
    private int reasonsMemoizedSerializedSize = -1;

    static {
        td tdVar = new td();
        DEFAULT_INSTANCE = tdVar;
        ku0.a(td.class, tdVar);
    }

    public td() {
        wm1 wm1Var = wm1.e;
        this.labels_ = wm1Var;
        this.reasons_ = wm1Var;
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i, ku0 ku0Var) {
        int iA = zwg.a(i);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new zq2(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001%\u0002%", new Object[]{"labels_", "reasons_"});
        }
        if (iA == 3) {
            return new td();
        }
        if (iA == 4) {
            return new map(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(td.class);
        }
        throw null;
    }
}
