package defpackage;

import android.app.Activity;

/* loaded from: classes.dex */
public final class p2p implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ a3p b;

    public /* synthetic */ p2p(a3p a3pVar, byte b) {
        this.a = b;
        this.b = a3pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        a3p a3pVar = this.b;
        switch (b) {
            case 0:
                ito[] itoVarArr = ito.a;
                Activity activity = a3pVar.t;
                if (activity != null) {
                    int requestedOrientation = activity.getRequestedOrientation();
                    int i = a3pVar.W;
                    if (requestedOrientation != i) {
                        activity.setRequestedOrientation(i);
                    }
                }
                a3pVar.r();
                break;
            default:
                a3pVar.r();
                break;
        }
    }
}
