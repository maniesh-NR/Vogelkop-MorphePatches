package defpackage;

import com.opera.android.settings.SettingsManager;

/* loaded from: classes.dex */
public final class tpk implements mo7, p5j {
    public final xnh a;
    public final SettingsManager b;
    public final x5f c;

    public tpk(xnh xnhVar, SettingsManager settingsManager, x5f x5fVar) {
        this.a = xnhVar;
        this.b = settingsManager;
        this.c = x5fVar;
        xnhVar.F(this);
        settingsManager.F(this);
    }

    @Override // defpackage.p5j
    public final void M(String str) {
        if ("enable_suggested_speed_dials_on_start_page".equals(str) || "enable_frequently_visited_sites".equals(str)) {
            a();
        }
    }

    public final void a() {
        x5f x5fVar = this.c;
        zpa zpaVar = x5fVar.d;
        xnh xnhVar = this.a;
        if (xnhVar.j()) {
            boolean zA = ((wnh) xnhVar.i()).a(134217728);
            SettingsManager settingsManager = this.b;
            tq0 tq0Var = zA ? settingsManager.A(xnhVar) ? tq0.b : tq0.c : tq0.d;
            if (x5fVar.h) {
                x56 x56VarF = zpa.F();
                b66 b66VarF = x56VarF.F(zpaVar);
                b66VarF.getClass();
                b66VarF.q(53, 1, tq0Var);
                x5fVar.U0(x56VarF);
            }
            yk0 yk0Var = settingsManager.i("enable_frequently_visited_sites") ? yk0.b : yk0.c;
            if (x5fVar.h) {
                x56 x56VarF2 = zpa.F();
                b66 b66VarF2 = x56VarF2.F(zpaVar);
                b66VarF2.getClass();
                b66VarF2.q(54, 1, yk0Var);
                x5fVar.U0(x56VarF2);
            }
        }
    }

    @Override // defpackage.mo7
    public final void o(boolean z) {
        a();
    }
}
