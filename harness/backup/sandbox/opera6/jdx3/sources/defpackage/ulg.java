package defpackage;

import java.io.IOException;
import okhttp3.internal.connection.RealCall;

/* loaded from: classes.dex */
public final class ulg implements f94 {
    public final ii a;
    public final bml b;
    public final m9c c;
    public final ji d;
    public final xt3 e;
    public RealCall f;

    public ulg(ii iiVar, bml bmlVar, m9c m9cVar, ji jiVar, xt3 xt3Var) {
        this.a = iiVar;
        this.b = bmlVar;
        this.c = m9cVar;
        this.d = jiVar;
        this.e = xt3Var;
    }

    public final void onFailure(v84 v84Var, IOException iOException) {
        String str = "I/O error: " + iOException.getMessage();
        this.f = null;
        vml.c(new q2g(this, str, (byte) 6));
    }

    public final void onResponse(v84 v84Var, pzh pzhVar) {
        int i = pzhVar.d;
        pzhVar.close();
        String string = i / 100 == 2 ? "Success" : Integer.toString(i);
        this.f = null;
        vml.c(new q2g(this, string, (byte) 6));
    }
}
