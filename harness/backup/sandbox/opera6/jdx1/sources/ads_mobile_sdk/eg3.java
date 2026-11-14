package ads_mobile_sdk;

import defpackage.flp;
import defpackage.quo;
import defpackage.y7h;

/* loaded from: classes.dex */
public final class eg3 extends ku0 {
    private static final eg3 DEFAULT_INSTANCE;
    public static final int c = 1;
    private flp androidTopics_ = am2.e;

    static {
        eg3 eg3Var = new eg3();
        DEFAULT_INSTANCE = eg3Var;
        ku0.a(eg3.class, eg3Var);
    }

    public static quo o() {
        return (quo) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i, ku0 ku0Var) {
        int iA = zwg.a(i);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new zq2(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"androidTopics_", cg3.class});
        }
        if (iA == 3) {
            return new eg3();
        }
        if (iA == 4) {
            return new quo(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(eg3.class);
        }
        throw null;
    }

    public final void a(cg3 cg3Var) {
        flp flpVarC = this.androidTopics_;
        if (!((j) flpVarC).a) {
            flpVarC = y7h.c(flpVarC);
            this.androidTopics_ = flpVarC;
        }
        flpVarC.add(cg3Var);
    }
}
