package defpackage;

import com.opera.android.settings.SettingsManager;
import java.util.Set;

/* loaded from: classes.dex */
public final class kcg implements u9j {
    public final SettingsManager a;
    public final db b;
    public final xb c;
    public final zwk d;
    public final rs2 e;
    public final v9j f = new v9j(this);
    public final Set g = e82.E(new String[]{"startup_mode", "tab_disposition"});
    public final s9 h = new s9(this, 28);
    public final d8d i = new d8d(this, 22);
    public final t53 j = new t53(this, (byte) 1);

    public kcg(SettingsManager settingsManager, db dbVar, xb xbVar, zwk zwkVar, rs2 rs2Var) {
        this.a = settingsManager;
        this.b = dbVar;
        this.c = xbVar;
        this.d = zwkVar;
        this.e = rs2Var;
    }

    public final void a(ipf ipfVar) {
        zi4 vbVar;
        int i;
        if (ipfVar instanceof fpf) {
            fpf fpfVar = (fpf) ipfVar;
            String str = fpfVar.b;
            String str2 = fpfVar.c;
            String str3 = str2.length() == 0 ? str : str2;
            if (str2.length() == 0) {
                str = "";
            }
            vbVar = new vb(str3, str, fpfVar.d);
        } else {
            vbVar = ub.x;
        }
        zi4 zi4Var = vbVar;
        zwk zwkVar = this.d;
        db dbVar = this.b;
        if (xgh.s(dbVar, zwkVar)) {
            i = 2132019232;
        } else {
            boolean zF = dbVar.f();
            SettingsManager settingsManager = this.a;
            i = (zF && settingsManager.i("enable_sync")) ? 2132021764 : (!dbVar.f() || settingsManager.i("enable_sync")) ? 2132021429 : 2132021763;
        }
        int i2 = i;
        rs2 rs2Var = this.e;
        this.f.r(new jcg(zi4Var, i2, rs2Var.f, rs2Var.h, rs2Var.g, rs2Var.i));
    }

    @Override // defpackage.u9j
    public final void j() {
        xb xbVar = this.c;
        a((ipf) xbVar.d.g());
        this.a.F(this.h);
        this.e.a.b(this.j);
        xbVar.e.k(this.i);
    }

    @Override // defpackage.u9j
    public final void onStopped() {
        this.a.H(this.h);
        this.e.a.c(this.j);
        this.c.e.p(this.i);
    }
}
