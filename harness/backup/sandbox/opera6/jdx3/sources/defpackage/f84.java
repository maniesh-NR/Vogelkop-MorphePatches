package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final class f84 {
    public final esg a;
    public final ydp b;

    public f84(Context context, String str, umi umiVar, zsd zsdVar) {
        ydp ydpVar = new ydp((byte) 27);
        b59 b59VarL = w1h.l(context, umiVar, "caching_image_loader_prefs-account_profile_picture", new bg1[0]);
        d84 d84Var = new d84();
        zsdVar.a.add(d84Var);
        this.a = new esg(d84Var, new r9i(context, new e84(b59VarL), umiVar), str);
        this.b = ydpVar;
    }
}
