package defpackage;

import J.N;
import com.opera.android.webcore.WebcoreRpcBridge;
import org.chromium.net.NetworkChangeNotifier;

/* loaded from: classes.dex */
public final class rz implements as6 {
    public final /* synthetic */ byte a;
    public Object b;

    public /* synthetic */ rz() {
        this.a = (byte) 4;
    }

    public /* synthetic */ rz(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // defpackage.as6
    public final void onDestroy(ndc ndcVar) {
        switch (this.a) {
            case 0:
                ((wjh) this.b).A();
                break;
            case 1:
                uwh uwhVar = (uwh) this.b;
                NetworkChangeNotifier.removeConnectionTypeObserver(uwhVar.j.a);
                uwhVar.c();
                uwhVar.i.b(this);
                break;
            case 2:
                ndcVar.getLifecycle().b(this);
                WebcoreRpcBridge webcoreRpcBridge = (WebcoreRpcBridge) ((r9i) this.b).d;
                N.MVisE3We(webcoreRpcBridge.a);
                webcoreRpcBridge.a = 0L;
                break;
            case 3:
                ndcVar.getLifecycle().b(this);
                WebcoreRpcBridge webcoreRpcBridge2 = (WebcoreRpcBridge) ((s9i) this.b).d;
                N.MVisE3We(webcoreRpcBridge2.a);
                webcoreRpcBridge2.a = 0L;
                break;
            default:
                ndcVar.getLifecycle().b(this);
                this.b = null;
                break;
        }
    }
}
