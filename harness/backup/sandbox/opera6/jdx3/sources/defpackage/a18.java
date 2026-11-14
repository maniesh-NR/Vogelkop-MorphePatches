package defpackage;

import com.google.android.gms.cast.framework.CastSession;
import com.google.android.gms.cast.framework.SessionManager;

/* loaded from: classes.dex */
public final /* synthetic */ class a18 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xn4 b;
    public final /* synthetic */ CastSession c;

    public /* synthetic */ a18(xn4 xn4Var, CastSession castSession, byte b) {
        this.a = b;
        this.b = xn4Var;
        this.c = castSession;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        CastSession castSession = this.c;
        xn4 xn4Var = this.b;
        switch (b) {
            case 0:
                xn4Var.P(castSession);
                yn4 yn4Var = xn4Var.t;
                SessionManager sessionManager = yn4Var.g;
                if (sessionManager != null && sessionManager.getCurrentCastSession() == castSession) {
                    yn4Var.g.endCurrentSession(true);
                    break;
                }
                break;
            default:
                xn4Var.P(castSession);
                yn4 yn4Var2 = xn4Var.t;
                SessionManager sessionManager2 = yn4Var2.g;
                if (sessionManager2 != null && sessionManager2.getCurrentCastSession() == castSession) {
                    yn4Var2.g.endCurrentSession(true);
                    break;
                }
                break;
        }
    }
}
