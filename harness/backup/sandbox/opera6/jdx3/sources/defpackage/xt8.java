package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.appsflyer.internal.j;
import com.opera.android.settings.SettingsManager;

/* loaded from: classes.dex */
public final class xt8 extends lim {
    public final rb a;
    public final ydn b;
    public final SettingsManager c;
    public final wt8 d = new wt8(this);

    public xt8(Context context, ydn ydnVar, SettingsManager settingsManager) {
        this.a = new rb(context);
        this.b = ydnVar;
        this.c = settingsManager;
    }

    public final void R(int i) {
        String str;
        rb rbVar = this.a;
        rbVar.getClass();
        if (i == 0) {
            str = "vpn";
        } else if (i == 1) {
            str = "night_mode";
        } else {
            if (i != 2) {
                qp2.o("Unknown feature");
                return;
            }
            str = "vpn_pro";
        }
        j.d((SharedPreferences) rbVar.a.get(), "feature_activated_".concat(str), true);
    }

    public final void S(int i) {
        String str;
        rb rbVar = this.a;
        rbVar.getClass();
        if (i == 0) {
            str = "vpn";
        } else if (i == 1) {
            str = "night_mode";
        } else {
            if (i != 2) {
                qp2.o("Unknown feature");
                return;
            }
            str = "vpn_pro";
        }
        j.d((SharedPreferences) rbVar.a.get(), "settings_fragment_shown_".concat(str), true);
    }

    @Override // defpackage.as6
    public final void W(ndc ndcVar) {
        ydn ydnVar = this.b;
        wt8 wt8Var = this.d;
        ydnVar.F(wt8Var);
        this.c.F(wt8Var);
        wt8Var.s();
        xt8 xt8Var = wt8Var.a;
        if (xt8Var.c.s() != 2) {
            xt8Var.R(1);
        }
    }

    @Override // defpackage.lim, defpackage.as6
    public final void onDestroy(ndc ndcVar) {
        ndcVar.getLifecycle().b(this);
        ydn ydnVar = this.b;
        wt8 wt8Var = this.d;
        ydnVar.H(wt8Var);
        this.c.H(wt8Var);
    }
}
