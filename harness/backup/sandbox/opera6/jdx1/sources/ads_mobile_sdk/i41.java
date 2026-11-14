package ads_mobile_sdk;

/* loaded from: classes.dex */
public final class i41 {
    public volatile x77 a;

    public final x77 a() {
        ah3 ah3Var;
        x77 x77Var = this.a;
        if (x77Var == null) {
            xu0.b("InitializationConfig is requested but null. MobileAds.initialize() must be called first.", null);
            IllegalStateException illegalStateException = new IllegalStateException("InitializationConfig is requested but null. MobileAds.initialize() must be called first.");
            illegalStateException.printStackTrace();
            wq wqVar = vq.a;
            if (wqVar == wq.b || wqVar == wq.c) {
                throw illegalStateException;
            }
            if (wqVar == wq.a && (ah3Var = nw.a) != null) {
                ah3Var.a("InitializationConfig is requested but null. MobileAds.initialize() must be called first.", (Throwable) illegalStateException);
                return x77Var;
            }
        }
        return x77Var;
    }
}
