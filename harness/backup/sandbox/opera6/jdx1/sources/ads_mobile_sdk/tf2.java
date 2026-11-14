package ads_mobile_sdk;

import defpackage.flp;
import defpackage.qgp;
import defpackage.y7h;

/* loaded from: classes.dex */
public final class tf2 extends ku0 {
    private static final tf2 DEFAULT_INSTANCE;
    public static final int c = 1;
    public static final int d = 2;
    private flp androidLifecycleEvents_ = am2.e;
    private long clickTimestampMs_;

    static {
        tf2 tf2Var = new tf2();
        DEFAULT_INSTANCE = tf2Var;
        ku0.a(tf2.class, tf2Var);
    }

    public static qgp o() {
        return (qgp) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.ku0
    public final Object a(int i, ku0 ku0Var) {
        int iA = zwg.a(i);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new zq2(DEFAULT_INSTANCE, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0002", new Object[]{"androidLifecycleEvents_", ue.class, "clickTimestampMs_"});
        }
        if (iA == 3) {
            return new tf2();
        }
        if (iA == 4) {
            return new qgp(DEFAULT_INSTANCE);
        }
        if (iA == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iA == 6) {
            return ku0.b(tf2.class);
        }
        throw null;
    }

    public final void a(ue ueVar) {
        flp flpVarC = this.androidLifecycleEvents_;
        if (!((j) flpVarC).a) {
            flpVarC = y7h.c(flpVarC);
            this.androidLifecycleEvents_ = flpVarC;
        }
        flpVarC.add(ueVar);
    }
}
