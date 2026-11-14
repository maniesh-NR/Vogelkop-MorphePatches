package ads_mobile_sdk;

import com.google.common.util.concurrent.ListenableFuture;
import defpackage.edp;
import defpackage.qua;
import defpackage.xfp;

/* loaded from: classes.dex */
public final class q83 implements dd2 {
    public final /* synthetic */ r83 a;

    public q83(r83 r83Var) {
        this.a = r83Var;
    }

    public final ListenableFuture apply(Object obj) {
        edp edpVar = (edp) obj;
        if (edpVar != null) {
            return yr9.c(edpVar);
        }
        r83 r83Var = this.a;
        r83Var.e.b(fl0.EVENT_ID_INIT_FALLBACK_TO_DEFAULT_COLLECTOR);
        return g7.j(ef9.h(yr9.e(new qua(r83Var, r83Var.f, (byte) 2), r83Var.d)), new xfp(), m97.a);
    }
}
