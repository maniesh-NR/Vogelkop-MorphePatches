package ads_mobile_sdk;

import defpackage.flp;
import defpackage.r1p;
import defpackage.y7h;

/* loaded from: classes.dex */
public final class h6 extends ku0 {
    private static final h6 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    private int bitField0_;
    private long lastAccessTimeMs_;
    private flp responses_ = am2.e;

    static {
        h6 h6Var = new h6();
        DEFAULT_INSTANCE = h6Var;
        ku0.a(h6.class, h6Var);
    }

    public static h6 o() {
        return DEFAULT_INSTANCE;
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i, ku0 ku0Var) {
        int iA = zwg.a(i);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new zq2(DEFAULT_INSTANCE, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဂ\u0000", new Object[]{"bitField0_", "responses_", c6.class, "lastAccessTimeMs_"});
        }
        if (iA == 3) {
            return new h6();
        }
        if (iA == 4) {
            return new r1p(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(h6.class);
        }
        throw null;
    }

    public final void a(int i, c6 c6Var) {
        flp flpVarC = this.responses_;
        if (!((j) flpVarC).a) {
            flpVarC = y7h.c(flpVarC);
            this.responses_ = flpVarC;
        }
        flpVarC.set(i, c6Var);
    }

    public final void a(c6 c6Var) {
        flp flpVarC = this.responses_;
        if (!((j) flpVarC).a) {
            flpVarC = y7h.c(flpVarC);
            this.responses_ = flpVarC;
        }
        flpVarC.add(c6Var);
    }

    public final long p() {
        return this.lastAccessTimeMs_;
    }

    public final int q() {
        return this.responses_.size();
    }

    public final flp r() {
        return this.responses_;
    }
}
