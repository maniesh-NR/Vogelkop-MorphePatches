package ads_mobile_sdk;

import java.io.IOException;

/* loaded from: classes.dex */
public final class cp3 implements f94 {
    public final /* synthetic */ nh4 a;

    public final void onFailure(v84 v84Var, IOException iOException) {
        this.a.x(new bv0(iOException, ae1.e, null, 4), new x11(v84Var, (byte) 0));
    }

    public final void onResponse(v84 v84Var, pzh pzhVar) {
        this.a.x(new hv0(pzhVar), new x11(v84Var, (byte) 1));
    }
}
