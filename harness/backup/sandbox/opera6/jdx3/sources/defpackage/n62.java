package defpackage;

import J.N;
import com.opera.android.webcore.WebcoreRpcBridge;

/* loaded from: classes.dex */
public final class n62 extends lim {
    public final /* synthetic */ byte a;
    public final /* synthetic */ s62 b;

    public /* synthetic */ n62(s62 s62Var, byte b) {
        this.a = b;
        this.b = s62Var;
    }

    @Override // defpackage.lim, defpackage.as6
    public final void onDestroy(ndc ndcVar) {
        switch (this.a) {
            case 0:
                ndcVar.getLifecycle().b(this);
                s62 s62Var = this.b;
                ((d12) s62Var.l.b).d();
                WebcoreRpcBridge webcoreRpcBridge = (WebcoreRpcBridge) s62Var.w.d;
                N.MVisE3We(webcoreRpcBridge.a);
                webcoreRpcBridge.a = 0L;
                s62Var.m();
                break;
            default:
                super.onDestroy(ndcVar);
                break;
        }
    }

    @Override // defpackage.as6
    public final void onStop(ndc ndcVar) {
        switch (this.a) {
            case 1:
                this.b.f().f();
                break;
        }
    }
}
