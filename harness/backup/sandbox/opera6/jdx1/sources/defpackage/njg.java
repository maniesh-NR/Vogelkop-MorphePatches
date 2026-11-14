package defpackage;

import android.content.Context;
import android.media.session.MediaSession;
import com.google.android.gms.cast.framework.CastContext;
import com.google.android.gms.cast.framework.CastSession;
import com.google.android.gms.cast.framework.Session;
import com.google.android.gms.cast.framework.SessionManager;

/* loaded from: classes.dex */
public final class njg extends lcp {
    public final CastSession s;
    public final SessionManager t;
    public final /* synthetic */ tjg u;

    public njg(tjg tjgVar, CastSession castSession) {
        this.u = tjgVar;
        this.s = castSession;
        SessionManager sessionManager = CastContext.getSharedInstance().getSessionManager();
        this.t = sessionManager;
        sessionManager.addSessionManagerListener(this, CastSession.class);
        dod.d(tjgVar.a);
        MediaSession mediaSession = ((xod) tjgVar.j.a.h.j.b).a;
        dod.b();
        ez9 ez9VarC = dod.c();
        g77 g77Var = null;
        cpd cpdVar = null;
        if (mediaSession != null) {
            Context context = ez9VarC.h;
            if (context != null) {
                yod yodVar = new yod(mediaSession);
                yodVar.e = mediaSession.getController().getSessionInfo();
                cpdVar = new cpd(context, yodVar);
            }
            g77Var = new g77(ez9VarC, cpdVar);
        }
        g77 g77Var2 = ez9VarC.E;
        if (g77Var2 != null) {
            g77Var2.g();
        }
        ez9VarC.E = g77Var;
        if (g77Var != null) {
            ez9VarC.o();
        }
    }

    public final void onSessionEnded(Session session, int i) {
        if (this.s != ((CastSession) session)) {
            return;
        }
        tjg tjgVar = this.u;
        dod.d(tjgVar.a);
        dod.k(null);
        fr3.i = null;
        vml.c(new ljg(tjgVar, (byte) 2));
    }
}
