package ads_mobile_sdk;

import defpackage.cip;
import defpackage.v9g;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class u23 extends ku0 {
    private static final u23 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    private int bitField0_;
    private boolean isInstallReferrerReported_;
    private int totalInflightAdLimit_;

    static {
        u23 u23Var = new u23();
        DEFAULT_INSTANCE = u23Var;
        ku0.a(u23.class, u23Var);
    }

    public static u23 a(InputStream inputStream) {
        ku0 ku0VarA = ku0.a(DEFAULT_INSTANCE, v9g.a(inputStream), ul0.a());
        ku0.a(ku0VarA);
        return (u23) ku0VarA;
    }

    public static u23 o() {
        return DEFAULT_INSTANCE;
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i, ku0 ku0Var) {
        int iA = zwg.a(i);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new zq2(DEFAULT_INSTANCE, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001", new Object[]{"bitField0_", "isInstallReferrerReported_", "totalInflightAdLimit_"});
        }
        if (iA == 3) {
            return new u23();
        }
        if (iA == 4) {
            return new cip(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(u23.class);
        }
        throw null;
    }

    public final boolean p() {
        return this.isInstallReferrerReported_;
    }

    public final int q() {
        return this.totalInflightAdLimit_;
    }
}
