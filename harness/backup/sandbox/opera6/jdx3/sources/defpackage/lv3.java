package defpackage;

import android.content.SharedPreferences;
import com.leanplum.internal.Clock;
import com.opera.android.BrowserActivity;
import com.opera.android.OperaApplication;

/* loaded from: classes.dex */
public final class lv3 {
    public final /* synthetic */ BrowserActivity a;

    public /* synthetic */ lv3(BrowserActivity browserActivity) {
        this.a = browserActivity;
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [android.app.Activity, com.opera.android.BrowserActivity] */
    public final void a(boolean z) {
        ?? r10 = this.a;
        tw3 tw3Var = r10.y;
        e7k e7kVar = (e7k) tw3Var.G0.get();
        if (e7kVar.f != z) {
            e7kVar.f = z;
            if (z) {
                za9 za9Var = e7kVar.e;
                ru9 ru9Var = (ru9) e7kVar.a.invoke();
                za9Var.a = true;
                za9Var.d(ru9Var);
            }
        }
        if (z) {
            String[] strArr = OperaApplication.K;
            if (((OperaApplication) r10.getApplication()).D().b() && r10.X0()) {
                men menVar = (men) tw3Var.U.get();
                ru9 ru9Var2 = menVar.c.a;
                if (menVar.d.i("feedback_in_app_notification") && ru9Var2.a.getInt("vpn.vpnpro.feedback_dialog_shown_count", 0) < 1 && ((Boolean) menVar.a.invoke()).booleanValue()) {
                    long j = ru9Var2.a.getLong("vpn.vpnpro_first_enable_timestamp", -1L);
                    if (j != -1 && (System.currentTimeMillis() - j) / Clock.DAY_MILLIS >= 6) {
                        nv6 nv6VarB = ru9Var2.b();
                        ((SharedPreferences.Editor) nv6VarB.a).putInt("vpn.vpnpro.feedback_dialog_shown_count", ru9Var2.a.getInt("vpn.vpnpro.feedback_dialog_shown_count", 0) + 1);
                        nv6VarB.w();
                        ben benVar = menVar.b;
                        qim qimVar = (qim) benVar.c.get();
                        z77 z77Var = qimVar.c;
                        x5f x5fVar = ((OperaApplication) benVar.a.getApplicationContext()).L().d;
                        wtm wtmVar = new wtm();
                        wtmVar.a = x5fVar;
                        kze kzeVar = new kze(oen.d);
                        wtmVar.c = kzeVar;
                        h42 h42Var = new h42();
                        h42Var.s(kzeVar, new glm(new x9e(h42Var, wtmVar, (byte) 1), (byte) 3));
                        wtmVar.b = b8h.d(h42Var);
                        nen nenVar = new nen(wtmVar, qimVar.e);
                        z77Var.getClass();
                        z77Var.b(nenVar, ijm.b);
                    }
                }
            }
            r10.b1();
        }
    }
}
