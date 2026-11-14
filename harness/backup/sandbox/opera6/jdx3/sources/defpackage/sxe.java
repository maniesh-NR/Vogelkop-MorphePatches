package defpackage;

import com.opera.android.settings.SettingsManager;

/* loaded from: classes.dex */
public final class sxe extends lim implements nwe, p5j {
    public final x5f a;
    public final SettingsManager b;

    public sxe(x5f x5fVar, SettingsManager settingsManager) {
        this.a = x5fVar;
        this.b = settingsManager;
    }

    @Override // defpackage.p5j
    public final void M(String str) {
        if ("darken_websites".equals(str) || "night_mode_dimming".equals(str) || "night_mode_overlay_keyboard".equals(str) || "night_mode_schedule".equals(str) || "night_mode".equals(str) || "night_mode_switch_theme".equals(str) || "night_mode_temperature".equals(str)) {
            R();
        }
    }

    public final void R() {
        boolean z;
        SettingsManager settingsManager = this.b;
        y9j y9jVar = settingsManager.a;
        int iA = vep.A(settingsManager.s());
        cb0 cb0Var = cb0.b;
        if (iA == 0) {
            z = true;
        } else if (iA == 2) {
            z = owe.c.a.get();
            cb0Var = cb0.c;
        } else if (iA != 3) {
            z = false;
        } else {
            z = owe.c.a.get();
            cb0Var = cb0.d;
        }
        int iN = y9jVar.contains("night_mode_temperature") ? settingsManager.n("night_mode_temperature") : -1;
        int iN2 = y9jVar.contains("night_mode_dimming") ? settingsManager.n("night_mode_dimming") : -1;
        boolean zI = settingsManager.i("night_mode_switch_theme");
        boolean zI2 = settingsManager.i("darken_websites");
        boolean zI3 = settingsManager.i("night_mode_overlay_keyboard");
        x5f x5fVar = this.a;
        if (x5fVar.h) {
            zpa zpaVar = x5fVar.d;
            x56 x56VarF = zpa.F();
            db0 db0VarY = x56VarF.F(zpaVar).y(zpaVar);
            db0VarY.r(1, 1, z);
            db0VarY.q(6, 1, cb0Var);
            db0VarY.p(0, 1, iN);
            db0VarY.p(5, 1, iN2);
            db0VarY.r(2, 1, zI);
            db0VarY.r(3, 1, zI2);
            db0VarY.r(4, 1, zI3);
            x5fVar.U0(x56VarF);
        }
    }

    @Override // defpackage.as6
    public final void W(ndc ndcVar) {
        owe.c.F(this);
        this.b.F(this);
        R();
    }

    @Override // defpackage.lim, defpackage.as6
    public final void onDestroy(ndc ndcVar) {
        ndcVar.getLifecycle().b(this);
        owe.c.H(this);
        this.b.H(this);
    }

    @Override // defpackage.nwe
    public final void y(boolean z) {
        x5f x5fVar = this.a;
        if (x5fVar.h) {
            zpa zpaVar = x5fVar.d;
            x56 x56VarF = zpa.F();
            x56VarF.F(zpaVar).y(zpaVar).r(1, 1, z);
            x5fVar.U0(x56VarF);
        }
    }
}
