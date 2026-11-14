package defpackage;

import android.content.SharedPreferences;
import com.leanplum.internal.Constants;
import com.opera.android.settings.SettingsManager;

/* loaded from: classes.dex */
public final class du5 implements p5j, ju5 {
    public final ku5 a;
    public final SettingsManager b;
    public final zyk c;
    public final tsd d;

    public du5(ndc ndcVar, ku5 ku5Var, SettingsManager settingsManager, zyk zykVar) {
        this.a = ku5Var;
        this.b = settingsManager;
        this.c = zykVar;
        tsd tsdVar = new tsd(new yt8(((ru9) zykVar.getValue()).a.getBoolean("startpage.continue_booking_shown", false), settingsManager.i("enable_continue_booking")));
        this.d = tsdVar;
        xf8.F0(tsdVar, new yt8(((ru9) zykVar.getValue()).a.getBoolean("startpage.continue_booking_shown", false), settingsManager.i("enable_continue_booking")));
        aib.B(settingsManager, ndcVar, this, new vme((byte) 19));
        aib.B(ku5Var, ndcVar, this, new vme((byte) 19));
    }

    @Override // defpackage.p5j
    public final void M(String str) {
        if (str.equals("enable_continue_booking")) {
            SettingsManager settingsManager = this.b;
            if (settingsManager.a.contains("enable_continue_booking")) {
                boolean zI = settingsManager.i("enable_continue_booking");
                boolean z = !zI;
                ku5 ku5Var = this.a;
                c5o c5oVar = ku5Var.a;
                if ((c5oVar.s() == lu5.d) != z) {
                    if (zI) {
                        c5oVar.A();
                        ku5Var.f(new gu5(ku5Var, (byte) 1));
                    } else {
                        ((SharedPreferences) ((b59) c5oVar.a).get()).edit().putString(Constants.Params.STATE, "dismissed").apply();
                        ku5Var.g();
                    }
                }
            }
            xf8.F0(this.d, new yt8(((ru9) this.c.getValue()).a.getBoolean("startpage.continue_booking_shown", false), settingsManager.i("enable_continue_booking")));
        }
    }

    @Override // defpackage.ju5
    public final void e(boolean z) {
        SettingsManager settingsManager = this.b;
        settingsManager.R(z ? 1 : 0, "enable_continue_booking");
        zyk zykVar = this.c;
        if (z) {
            nv6 nv6VarB = ((ru9) zykVar.getValue()).b();
            ((SharedPreferences.Editor) nv6VarB.a).putBoolean("startpage.continue_booking_shown", true);
            nv6VarB.w();
        }
        xf8.F0(this.d, new yt8(((ru9) zykVar.getValue()).a.getBoolean("startpage.continue_booking_shown", false), settingsManager.i("enable_continue_booking")));
    }

    @Override // defpackage.ju5
    public final void onDataChanged() {
    }
}
