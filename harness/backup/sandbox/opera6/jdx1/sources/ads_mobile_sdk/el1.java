package ads_mobile_sdk;

import defpackage.bvo;
import java.util.Objects;

/* loaded from: classes.dex */
public final class el1 extends ku0 {
    private static final el1 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    private String functionName_ = "";
    private int numIsolates_;

    static {
        el1 el1Var = new el1();
        DEFAULT_INSTANCE = el1Var;
        ku0.a(el1.class, el1Var);
    }

    public static bvo o() {
        return (bvo) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i, ku0 ku0Var) {
        int iA = zwg.a(i);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new zq2(DEFAULT_INSTANCE, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0004", new Object[]{"functionName_", "numIsolates_"});
        }
        if (iA == 3) {
            return new el1();
        }
        if (iA == 4) {
            return new bvo(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(el1.class);
        }
        throw null;
    }

    public final void b(String str) {
        Objects.requireNonNull(str);
        this.functionName_ = str;
    }
}
