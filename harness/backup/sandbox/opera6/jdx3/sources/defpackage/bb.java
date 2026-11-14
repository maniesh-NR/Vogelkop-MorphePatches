package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.appsflyer.internal.j;
import com.opera.android.OperaApplication;
import com.opera.android.oauth2.OAuth2Account;

/* loaded from: classes.dex */
public final class bb implements Runnable {
    public final Context a;
    public final zwk b;
    public final rb c;
    public boolean d;
    public boolean e;
    public boolean f;
    public final /* synthetic */ db g;

    public bb(db dbVar, Context context, umi umiVar, zwk zwkVar) {
        this.g = dbVar;
        this.a = context;
        this.b = zwkVar;
        this.c = new rb(context, new b94(umiVar, new ya(this, (byte) 1), (byte) 0));
    }

    public final void a() {
        db dbVar = this.g;
        if (dbVar.c != null && this.d && this.e) {
            SharedPreferences sharedPreferences = (SharedPreferences) dbVar.b.get();
            boolean z = sharedPreferences.getBoolean("need_to_log_status", true);
            jh0 jh0Var = jh0.c;
            byte b = 0;
            if (z) {
                j.d(sharedPreferences, "need_to_log_status", false);
                String[] strArr = OperaApplication.K;
                ((OperaApplication) this.a.getApplicationContext()).L().c.b0(dbVar.c.b() ? jh0Var : jh0.b);
            }
            if (dbVar.f() && dbVar.b() == jh0Var) {
                ab abVar = new ab(dbVar, b);
                OAuth2Account oAuth2Account = dbVar.c;
                if (oAuth2Account == null) {
                    abVar.run(null);
                } else {
                    oAuth2Account.a(0, new qie(oAuth2Account, abVar));
                }
            }
            this.f = true;
            h7f h7fVar = dbVar.e;
            g7f g7fVarH = am2.h(h7fVar, h7fVar);
            while (g7fVarH.hasNext()) {
                ((cb) g7fVarH.next()).a();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context = this.a;
        db dbVar = this.g;
        dbVar.c = new OAuth2Account(this.c, this.b, new yqa(dbVar, context));
        a();
    }
}
