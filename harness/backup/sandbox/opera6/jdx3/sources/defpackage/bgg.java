package defpackage;

import J.N;
import android.content.Context;
import com.opera.android.OperaApplication;
import com.opera.android.browser.obml.Platform;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class bgg implements agg {
    public static void b() {
        Context context = Platform.a;
        String strO = aik.o((String) N.MQ$xB7I2("General", "Campaign"));
        if (strO != null) {
            Context context2 = Platform.a;
            String[] strArr = OperaApplication.K;
            x5f x5fVar = ((OperaApplication) context2.getApplicationContext()).L().d;
            zpa zpaVar = x5fVar.d;
            x56 x56VarF = zpa.F();
            x56VarF.M(zpaVar).x(1, strO);
            x5fVar.U0(x56VarF);
        }
    }

    public static void c() {
        String strC = Platform.c();
        Context context = Platform.a;
        String[] strArr = OperaApplication.K;
        x5f x5fVar = ((OperaApplication) context.getApplicationContext()).L().d;
        zpa zpaVar = x5fVar.d;
        x56 x56VarF = zpa.F();
        x56VarF.D(zpaVar).x(3, strC);
        x5fVar.U0(x56VarF);
        osf osfVar = ((OperaApplication) Platform.a.getApplicationContext()).L().f;
        psp pspVar = osfVar.b;
        t56 t56VarF = psp.f();
        byte b = 1;
        ((uf0) new yj0(pspVar, t56VarF).c.getValue()).a.x(1, strC);
        if (osfVar.e.c(t56VarF)) {
            return;
        }
        new rml(Unit.a, osfVar.a).a(new msf(osfVar, b)).m(osfVar.d);
    }

    @Override // defpackage.agg
    public final void a(String str, String str2) {
        String strV = sko.v(str, ".", str2);
        if ("Cookies.Client".equals(strV)) {
            c();
        } else if ("General.Campaign".equals(strV)) {
            b();
        }
    }
}
