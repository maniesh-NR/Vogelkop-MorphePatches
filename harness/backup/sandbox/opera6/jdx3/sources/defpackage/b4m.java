package defpackage;

import com.opera.android.settings.SettingsManager;
import java.util.Set;

/* loaded from: classes.dex */
public final class b4m implements p5j, mo7 {
    public final SettingsManager a;
    public final bvn b;
    public final v3m c;
    public final x5f d;

    public b4m(SettingsManager settingsManager, bvn bvnVar, v3m v3mVar, x5f x5fVar) {
        this.a = settingsManager;
        this.c = v3mVar;
        this.d = x5fVar;
        this.b = bvnVar;
        bvnVar.F(this);
    }

    @Override // defpackage.p5j
    public final void M(String str) {
        if ("translate_web_pages_enabled".equals(str) || "translate_web_pages_backup_translation_method_enabled".equals(str) || "translation_source".equals(str)) {
            a();
        }
    }

    public final void a() {
        ss0 ss0Var;
        x5f x5fVar = this.d;
        zpa zpaVar = x5fVar.d;
        v3m v3mVar = this.c;
        boolean zF = v3m.f(v3mVar.a);
        SettingsManager settingsManager = this.a;
        ns0 ns0Var = !zF ? ns0.d : v3mVar.b.E() == z4m.OPERA ? settingsManager.i("translate_web_pages_enabled") ? ns0.b : ns0.c : ns0.e;
        if (x5fVar.h) {
            x56 x56VarF = zpa.F();
            d66 d66VarC = x56VarF.F(zpaVar).C(zpaVar);
            d66VarC.getClass();
            d66VarC.q(0, 1, ns0Var);
            x5fVar.U0(x56VarF);
        }
        i80 i80Var = !v3m.f(v3mVar.a) ? i80.d : v3mVar.b.E() == z4m.OPERA ? settingsManager.i("translate_web_pages_backup_translation_method_enabled") ? i80.b : i80.c : i80.e;
        if (x5fVar.h) {
            x56 x56VarF2 = zpa.F();
            d66 d66VarC2 = x56VarF2.F(zpaVar).C(zpaVar);
            d66VarC2.getClass();
            d66VarC2.q(1, 1, i80Var);
            x5fVar.U0(x56VarF2);
        }
        long size = ((Set) ((ode) v3mVar.d.d).g()) != null ? r8.size() : 0L;
        if (x5fVar.h) {
            x56 x56VarF3 = zpa.F();
            x56VarF3.F(zpaVar).C(zpaVar).p(2, 1, size);
            x5fVar.U0(x56VarF3);
        }
        if (v3m.f(v3mVar.a)) {
            int iOrdinal = v3mVar.b.E().ordinal();
            ss0Var = (iOrdinal == 0 || iOrdinal != 1) ? ss0.b : ss0.c;
        } else {
            ss0Var = ss0.d;
        }
        if (x5fVar.h) {
            x56 x56VarF4 = zpa.F();
            d66 d66VarC3 = x56VarF4.F(zpaVar).C(zpaVar);
            d66VarC3.getClass();
            d66VarC3.q(3, 1, ss0Var);
            x5fVar.U0(x56VarF4);
        }
    }

    @Override // defpackage.mo7
    public final void o(boolean z) {
        SettingsManager settingsManager = this.a;
        if (z) {
            settingsManager.F(this);
            ((ode) this.c.d.d).k(new g9l(this, (byte) 7));
        }
        settingsManager.R((((avn) this.b.i()).a & 1) == 0 ? 0 : 1, "translate_web_pages_enabled");
        a();
    }
}
