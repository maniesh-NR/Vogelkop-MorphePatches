package ads_mobile_sdk;

import defpackage.ecp;
import java.util.Objects;

/* loaded from: classes.dex */
public final class o40 extends ku0 {
    private static final o40 DEFAULT_INSTANCE;
    public static final int c = 1;
    private int bitField0_;
    private String clickString_ = "";

    static {
        o40 o40Var = new o40();
        DEFAULT_INSTANCE = o40Var;
        ku0.a(o40.class, o40Var);
    }

    public static ecp o() {
        return (ecp) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i, ku0 ku0Var) {
        int iA = zwg.a(i);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new zq2(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"bitField0_", "clickString_"});
        }
        if (iA == 3) {
            return new o40();
        }
        if (iA == 4) {
            return new ecp(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(o40.class);
        }
        throw null;
    }

    public final void b(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.clickString_ = str;
    }
}
