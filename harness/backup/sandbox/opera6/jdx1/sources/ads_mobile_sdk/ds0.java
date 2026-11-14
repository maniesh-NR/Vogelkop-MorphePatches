package ads_mobile_sdk;

import defpackage.wpo;
import defpackage.yso;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class ds0 extends ku0 {
    private static final ds0 DEFAULT_INSTANCE;
    public static final int c = 1;
    private gn1 adResponseLists_ = gn1.b;

    static {
        ds0 ds0Var = new ds0();
        DEFAULT_INSTANCE = ds0Var;
        ku0.a(ds0.class, ds0Var);
    }

    public static ds0 p() {
        return DEFAULT_INSTANCE;
    }

    public static yso r() {
        return (yso) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i, ku0 ku0Var) {
        int iA = zwg.a(i);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new zq2(DEFAULT_INSTANCE, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"adResponseLists_", wpo.a});
        }
        if (iA == 3) {
            return new ds0();
        }
        if (iA == 4) {
            return new yso(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(ds0.class);
        }
        throw null;
    }

    public final Map o() {
        return Collections.unmodifiableMap(this.adResponseLists_);
    }

    public final gn1 q() {
        gn1 gn1Var = this.adResponseLists_;
        if (gn1Var.a) {
            return gn1Var;
        }
        gn1 gn1VarB = gn1Var.b();
        this.adResponseLists_ = gn1VarB;
        return gn1VarB;
    }
}
