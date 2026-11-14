package ads_mobile_sdk;

import defpackage.flp;
import defpackage.xso;
import defpackage.y7h;

/* loaded from: classes.dex */
public final class sq extends ku0 {
    private static final sq DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    private flp thirdPartyJavascript_;
    private flp thirdPartySdk_;

    static {
        sq sqVar = new sq();
        DEFAULT_INSTANCE = sqVar;
        ku0.a(sq.class, sqVar);
    }

    public sq() {
        am2 am2Var = am2.e;
        this.thirdPartySdk_ = am2Var;
        this.thirdPartyJavascript_ = am2Var;
    }

    public static xso p() {
        return (xso) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i, ku0 ku0Var) {
        int iA = zwg.a(i);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new zq2(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"thirdPartySdk_", rq.class, "thirdPartyJavascript_", iq.class});
        }
        if (iA == 3) {
            return new sq();
        }
        if (iA == 4) {
            return new xso(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(sq.class);
        }
        throw null;
    }

    public final void a(rq rqVar) {
        flp flpVarC = this.thirdPartySdk_;
        if (!((j) flpVarC).a) {
            flpVarC = y7h.c(flpVarC);
            this.thirdPartySdk_ = flpVarC;
        }
        flpVarC.add(rqVar);
    }

    public final flp o() {
        return this.thirdPartySdk_;
    }
}
