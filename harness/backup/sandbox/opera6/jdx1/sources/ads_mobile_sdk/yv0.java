package ads_mobile_sdk;

import defpackage.nlp;
import java.util.Objects;

/* loaded from: classes.dex */
public final class yv0 extends ku0 {
    private static final yv0 DEFAULT_INSTANCE;
    public static final int c = 14;
    private int bitField0_;
    private tv0 gmaSdkExceptionMessage_;

    static {
        yv0 yv0Var = new yv0();
        DEFAULT_INSTANCE = yv0Var;
        ku0.a(yv0.class, yv0Var);
    }

    public static nlp o() {
        return (nlp) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i, ku0 ku0Var) {
        int iA = zwg.a(i);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new zq2(DEFAULT_INSTANCE, "\u0004\u0001\u0000\u0001\u000e\u000e\u0001\u0000\u0000\u0000\u000eဉ\u0000", new Object[]{"bitField0_", "gmaSdkExceptionMessage_"});
        }
        if (iA == 3) {
            return new yv0();
        }
        if (iA == 4) {
            return new nlp(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(yv0.class);
        }
        throw null;
    }

    public final void a(tv0 tv0Var) {
        Objects.requireNonNull(tv0Var);
        this.gmaSdkExceptionMessage_ = tv0Var;
        this.bitField0_ |= 1;
    }
}
