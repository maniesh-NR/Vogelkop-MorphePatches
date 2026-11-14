package ads_mobile_sdk;

import defpackage.gip;
import defpackage.pbp;

/* loaded from: classes.dex */
public final class ns extends ku0 {
    private static final ns DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 3;
    private gip triggerVariationId_;
    private gip variationId_;

    static {
        ns nsVar = new ns();
        DEFAULT_INSTANCE = nsVar;
        ku0.a(ns.class, nsVar);
    }

    public ns() {
        qb1 qb1Var = qb1.e;
        this.variationId_ = qb1Var;
        this.triggerVariationId_ = qb1Var;
    }

    public static ns a(byte[] bArr) throws bj1 {
        ku0 ku0VarA = ku0.a(DEFAULT_INSTANCE, bArr, bArr.length, ul0.a());
        ku0.a(ku0VarA);
        return (ns) ku0VarA;
    }

    public static pbp o() {
        return (pbp) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i, ku0 ku0Var) {
        int iA = zwg.a(i);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new zq2(DEFAULT_INSTANCE, "\u0004\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0002\u0000\u0001\u0016\u0003\u0016", new Object[]{"variationId_", "triggerVariationId_"});
        }
        if (iA == 3) {
            return new ns();
        }
        if (iA == 4) {
            return new pbp(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(ns.class);
        }
        throw null;
    }
}
