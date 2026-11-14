package defpackage;

import android.net.ConnectivityManager;

/* loaded from: classes.dex */
public final class moe implements go5 {
    public final ConnectivityManager a;

    public moe(ConnectivityManager connectivityManager) {
        this.a = connectivityManager;
    }

    @Override // defpackage.go5
    public final boolean a(h5o h5oVar) {
        if (!c(h5oVar)) {
            return false;
        }
        qp2.n("isCurrentlyConstrained() must never be called onNetworkRequestConstraintController. isCurrentlyConstrained() is called only on older platforms where NetworkRequest isn't supported");
        return false;
    }

    @Override // defpackage.go5
    public final j94 b(xo5 xo5Var) {
        return f03.g(new mz9(xo5Var, this, null, (byte) 12));
    }

    @Override // defpackage.go5
    public final boolean c(h5o h5oVar) {
        return h5oVar.j.b.a != null;
    }
}
