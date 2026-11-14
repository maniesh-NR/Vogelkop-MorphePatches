package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.opera.android.OperaApplication;
import java.util.Collections;

/* loaded from: classes.dex */
public final class dac implements mo7, f7f, due {
    public final dj9 a;
    public final cac b;

    public dac(Context context, boolean z) {
        String[] strArr = OperaApplication.K;
        OperaApplication operaApplication = (OperaApplication) context.getApplicationContext();
        b59 b59VarL = w1h.l(context, vml.d, "c.o.a.lp_attributes", new bg1[0]);
        if (z) {
            ((SharedPreferences) b59VarL.get()).edit().clear().apply();
        }
        cac cacVar = new cac(context, new e84(b59VarL), operaApplication.t());
        this.b = cacVar;
        dj9 dj9VarT = dj9.t(context);
        this.a = dj9VarT;
        dj9VarT.F(this);
        operaApplication.z().b(this);
        ((x0f) operaApplication.r.l0.get()).a("com_appboy_default_notification_channel").k(this);
        he2.a(cacVar, new Void[0]);
        dnb dnbVar = new dnb(this, (byte) 7);
        avj avjVar = cak.d;
        avj.g(2, dnbVar);
    }

    @Override // defpackage.due
    public final void b(cue cueVar) {
        cac cacVar = this.b;
        cacVar.e = true;
        int iOrdinal = cueVar.ordinal();
        String str = iOrdinal != 0 ? iOrdinal != 1 ? "" : "newsfeed" : "none";
        if (cacVar.b.c("News backend", str)) {
            cacVar.b(Collections.singletonMap("News backend", str));
        }
    }

    public final void d0(Object obj) {
        v0f v0fVar = (v0f) obj;
        cac cacVar = this.b;
        cacVar.getClass();
        String strA = cac.a(v0fVar != v0f.b);
        if (cacVar.b.c("Notifications enabled", strA)) {
            cacVar.b(Collections.singletonMap("Notifications enabled", strA));
        }
    }

    @Override // defpackage.mo7
    public final void o(boolean z) {
        dj9 dj9Var = this.a;
        if (((cj9) dj9Var.i()).isEmpty()) {
            return;
        }
        String str = ((cj9) dj9Var.i()).a;
        cac cacVar = this.b;
        if (cacVar.b.c("Home country", str)) {
            cacVar.b(Collections.singletonMap("Home country", str));
        }
    }
}
