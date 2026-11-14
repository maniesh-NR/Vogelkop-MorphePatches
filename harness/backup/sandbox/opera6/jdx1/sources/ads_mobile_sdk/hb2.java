package ads_mobile_sdk;

import defpackage.flp;
import defpackage.u1p;

/* loaded from: classes.dex */
public final class hb2 extends ku0 {
    private static final hb2 DEFAULT_INSTANCE;
    public static final int c = 1;
    private flp rules_ = am2.e;

    static {
        hb2 hb2Var = new hb2();
        DEFAULT_INSTANCE = hb2Var;
        ku0.a(hb2.class, hb2Var);
    }

    public static hb2 a(byte[] bArr) throws bj1 {
        ku0 ku0VarA = ku0.a(DEFAULT_INSTANCE, bArr, bArr.length, ul0.a());
        ku0.a(ku0VarA);
        return (hb2) ku0VarA;
    }

    public static hb2 o() {
        return DEFAULT_INSTANCE;
    }

    public static u1p r() {
        return (u1p) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i, ku0 ku0Var) {
        int iA = zwg.a(i);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new zq2(DEFAULT_INSTANCE, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"rules_", fb2.class});
        }
        if (iA == 3) {
            return new hb2();
        }
        if (iA == 4) {
            return new u1p(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(hb2.class);
        }
        throw null;
    }

    public final int p() {
        return this.rules_.size();
    }

    public final flp q() {
        return this.rules_;
    }
}
